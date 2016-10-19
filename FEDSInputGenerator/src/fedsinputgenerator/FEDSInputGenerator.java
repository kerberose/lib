/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fedsinputgenerator;

import FEDServiceLib.DocumentSearchRequest;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author alheat
 */
public class FEDSInputGenerator {

    private static final String DELIMITER = ",";
    private static final String DOC_SEARCH_REGEX = "<DocumentSearchRequest(.*?)<\\/DocumentSearchRequest>";
    private static boolean includeDups;
    private static ArrayList<String> valueCache;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputFile = args[0];
        String outputFile = args[1];
        if (inputFile == null) {
            System.out.println("Please provide input file path as first argument");
        }
        if (outputFile == null) {
            System.out.println("Please provide output file path as second argument");
        }

        includeDups = args[2].equalsIgnoreCase(("Y"));

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            StringBuilder columnHeaders = new StringBuilder();
            JAXBContext cardsContext = JAXBContext.newInstance(DocumentSearchRequest.class);
            Unmarshaller unmarshaller = cardsContext.createUnmarshaller();
            //add column headers to output file
            for (int i = 3; i < args.length; i++) {
                if (i == args.length - 1) {
                    columnHeaders.append(args[i]);
                } else {
                    columnHeaders.append(args[i]).append(DELIMITER);
                }
            }
            ArrayList<String> criteriaList = new ArrayList<>();
            for (int i = 3; i < args.length; i++) {
                criteriaList.add(args[i]);
            }
            valueCache = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                Pattern pattern = Pattern.compile(DOC_SEARCH_REGEX);
                Matcher matcher = pattern.matcher(line);
                if (!matcher.find()) {
                    continue;
                }
                String requestStr = matcher.group(0);
                //was complaining about first character so replace with proper "<"
                requestStr = requestStr.trim().replaceFirst("^([\\W]+)<", "<");
                //fedservicelib namespace url is surrounded by two sest of double quotes in the logs for some reason.. 
                requestStr = requestStr.replace("\"\"", "\"");
                StringReader reader = new StringReader(requestStr);
                DocumentSearchRequest dsRequest = (DocumentSearchRequest) unmarshaller.unmarshal(reader);
                Map<String, String> criteriaMap = new HashMap<>();
                dsRequest.getCriteria().stream().forEach((criteria) -> {
                    criteriaMap.put(criteria.getName(), criteria.getValue());
                });
                int count = 0;
                StringBuilder outputLine = new StringBuilder();
                for (String criteriaName : criteriaList) {
                    if (count == criteriaList.size() - 1) {
                        outputLine.append(getCriteriaValue(criteriaMap.get(criteriaName), ""));
                    } else {
                        outputLine.append(getCriteriaValue(criteriaMap.get(criteriaName), DELIMITER));
                    }
                    count++;
                }
                if (includeDups) {
                    valueCache.add(outputLine.toString());
                } else if (!valueCache.contains(outputLine.toString())) {
                    valueCache.add(outputLine.toString());
                }

            }

            try (PrintWriter out = new PrintWriter(outputFile)) {
                System.out.println("Writing file " + outputFile);
                out.println(columnHeaders.toString());
                for (String outLine : valueCache) {
                    out.println(outLine);
                }
            }
        } catch (IOException | JAXBException ex) {
            System.out.println(ex);
        }

    }

    private static String getCriteriaValue(String criteriaValue, String terminator) {
        StringBuilder sb = new StringBuilder();
        if (criteriaValue == null) {
            criteriaValue = "*";
        }
        sb.append(criteriaValue).append(terminator);
        return sb.toString();
    }

}
