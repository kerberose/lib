//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.04 at 11:09:25 AM CDT 
//


package FEDServiceLib;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentClipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentClipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrontSide" type="{http://feds.fiserv.com/FEDServiceLib}Binary_Type" minOccurs="0"/>
 *         &lt;element name="BackSide" type="{http://feds.fiserv.com/FEDServiceLib}Binary_Type" minOccurs="0"/>
 *         &lt;element name="AllSides" type="{http://feds.fiserv.com/FEDServiceLib}Binary_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentClipType", propOrder = {
    "frontSide",
    "backSide",
    "allSides"
})
public class DocumentClipType {

    @XmlElement(name = "FrontSide")
    protected BinaryType frontSide;
    @XmlElement(name = "BackSide")
    protected BinaryType backSide;
    @XmlElement(name = "AllSides")
    protected BinaryType allSides;

    /**
     * Gets the value of the frontSide property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryType }
     *     
     */
    public BinaryType getFrontSide() {
        return frontSide;
    }

    /**
     * Sets the value of the frontSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryType }
     *     
     */
    public void setFrontSide(BinaryType value) {
        this.frontSide = value;
    }

    /**
     * Gets the value of the backSide property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryType }
     *     
     */
    public BinaryType getBackSide() {
        return backSide;
    }

    /**
     * Sets the value of the backSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryType }
     *     
     */
    public void setBackSide(BinaryType value) {
        this.backSide = value;
    }

    /**
     * Gets the value of the allSides property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryType }
     *     
     */
    public BinaryType getAllSides() {
        return allSides;
    }

    /**
     * Sets the value of the allSides property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryType }
     *     
     */
    public void setAllSides(BinaryType value) {
        this.allSides = value;
    }

}
