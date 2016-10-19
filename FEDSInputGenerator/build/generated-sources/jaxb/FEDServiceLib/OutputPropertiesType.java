//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.04 at 11:09:25 AM CDT 
//


package FEDServiceLib;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for OutputPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutputType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ImageSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="ClipPortion">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                   &lt;attribute name="SeparatePdfPages" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                   &lt;attribute name="SamePdfPage" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="AllPages" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="HitPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="Page" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="PageRange">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="StartPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="EndPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputPropertiesType", propOrder = {
    "outputType",
    "imageSize",
    "clipPortion",
    "allPages",
    "hitPage",
    "page",
    "pageRange"
})
public class OutputPropertiesType {

    @XmlElement(name = "OutputType", required = true)
    protected String outputType;
    @XmlElement(name = "ImageSize", defaultValue = "100")
    protected String imageSize;
    @XmlElement(name = "ClipPortion")
    protected OutputPropertiesType.ClipPortion clipPortion;
    @XmlElement(name = "AllPages")
    protected Boolean allPages;
    @XmlElement(name = "HitPage")
    protected Boolean hitPage;
    @XmlElement(name = "Page")
    protected String page;
    @XmlElement(name = "PageRange")
    protected OutputPropertiesType.PageRange pageRange;

    /**
     * Gets the value of the outputType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputType() {
        return outputType;
    }

    /**
     * Sets the value of the outputType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputType(String value) {
        this.outputType = value;
    }

    /**
     * Gets the value of the imageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageSize() {
        return imageSize;
    }

    /**
     * Sets the value of the imageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageSize(String value) {
        this.imageSize = value;
    }

    /**
     * Gets the value of the clipPortion property.
     * 
     * @return
     *     possible object is
     *     {@link OutputPropertiesType.ClipPortion }
     *     
     */
    public OutputPropertiesType.ClipPortion getClipPortion() {
        return clipPortion;
    }

    /**
     * Sets the value of the clipPortion property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputPropertiesType.ClipPortion }
     *     
     */
    public void setClipPortion(OutputPropertiesType.ClipPortion value) {
        this.clipPortion = value;
    }

    /**
     * Gets the value of the allPages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllPages() {
        return allPages;
    }

    /**
     * Sets the value of the allPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllPages(Boolean value) {
        this.allPages = value;
    }

    /**
     * Gets the value of the hitPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHitPage() {
        return hitPage;
    }

    /**
     * Sets the value of the hitPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHitPage(Boolean value) {
        this.hitPage = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPage(String value) {
        this.page = value;
    }

    /**
     * Gets the value of the pageRange property.
     * 
     * @return
     *     possible object is
     *     {@link OutputPropertiesType.PageRange }
     *     
     */
    public OutputPropertiesType.PageRange getPageRange() {
        return pageRange;
    }

    /**
     * Sets the value of the pageRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputPropertiesType.PageRange }
     *     
     */
    public void setPageRange(OutputPropertiesType.PageRange value) {
        this.pageRange = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="SeparatePdfPages" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="SamePdfPage" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ClipPortion {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "SeparatePdfPages")
        protected Boolean separatePdfPages;
        @XmlAttribute(name = "SamePdfPage")
        protected Boolean samePdfPage;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the separatePdfPages property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isSeparatePdfPages() {
            if (separatePdfPages == null) {
                return false;
            } else {
                return separatePdfPages;
            }
        }

        /**
         * Sets the value of the separatePdfPages property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSeparatePdfPages(Boolean value) {
            this.separatePdfPages = value;
        }

        /**
         * Gets the value of the samePdfPage property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isSamePdfPage() {
            if (samePdfPage == null) {
                return false;
            } else {
                return samePdfPage;
            }
        }

        /**
         * Sets the value of the samePdfPage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSamePdfPage(Boolean value) {
            this.samePdfPage = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="StartPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EndPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "startPage",
        "endPage"
    })
    public static class PageRange {

        @XmlElement(name = "StartPage")
        protected String startPage;
        @XmlElement(name = "EndPage")
        protected String endPage;

        /**
         * Gets the value of the startPage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartPage() {
            return startPage;
        }

        /**
         * Sets the value of the startPage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartPage(String value) {
            this.startPage = value;
        }

        /**
         * Gets the value of the endPage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndPage() {
            return endPage;
        }

        /**
         * Sets the value of the endPage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndPage(String value) {
            this.endPage = value;
        }

    }

}
