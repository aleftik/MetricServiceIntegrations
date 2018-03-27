//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.27 at 10:50:09 AM PDT 
//


package com.appdynamics.demo.metricservice.integration.ucs.out;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for equipmentChassisStatsHist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="equipmentChassisStatsHist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="inputPower" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="inputPowerAvg" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="inputPowerMax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="inputPowerMin" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="outputPower" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="outputPowerAvg" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="outputPowerMax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="outputPowerMin" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="thresholded" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mostRecent">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}boolean">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="no"/>
 *                 &lt;enumeration value="yes"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="suspect">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}boolean">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="no"/>
 *                 &lt;enumeration value="yes"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="timeCollected" type="{}dateTime" />
 *       &lt;attribute name="childAction">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="((deleteAll|ignore|deleteNonPresent),){0,2}(deleteAll|ignore|deleteNonPresent){0,1}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="dn" type="{}referenceObject" />
 *       &lt;attribute name="rn" type="{}referenceRn" />
 *       &lt;attribute name="status">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="((removed|created|modified|deleted),){0,3}(removed|created|modified|deleted){0,1}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equipmentChassisStatsHist", propOrder = {
    "content"
})
public class EquipmentChassisStatsHist {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger id;
    @XmlAttribute(name = "inputPower")
    protected Float inputPower;
    @XmlAttribute(name = "inputPowerAvg")
    protected Float inputPowerAvg;
    @XmlAttribute(name = "inputPowerMax")
    protected Float inputPowerMax;
    @XmlAttribute(name = "inputPowerMin")
    protected Float inputPowerMin;
    @XmlAttribute(name = "outputPower")
    protected Float outputPower;
    @XmlAttribute(name = "outputPowerAvg")
    protected Float outputPowerAvg;
    @XmlAttribute(name = "outputPowerMax")
    protected Float outputPowerMax;
    @XmlAttribute(name = "outputPowerMin")
    protected Float outputPowerMin;
    @XmlAttribute(name = "thresholded")
    protected String thresholded;
    @XmlAttribute(name = "mostRecent")
    protected String mostRecent;
    @XmlAttribute(name = "suspect")
    protected String suspect;
    @XmlAttribute(name = "timeCollected")
    protected String timeCollected;
    @XmlAttribute(name = "childAction")
    protected String childAction;
    @XmlAttribute(name = "dn")
    protected String dn;
    @XmlAttribute(name = "rn")
    protected String rn;
    @XmlAttribute(name = "status")
    protected String status;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the inputPower property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInputPower() {
        return inputPower;
    }

    /**
     * Sets the value of the inputPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInputPower(Float value) {
        this.inputPower = value;
    }

    /**
     * Gets the value of the inputPowerAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInputPowerAvg() {
        return inputPowerAvg;
    }

    /**
     * Sets the value of the inputPowerAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInputPowerAvg(Float value) {
        this.inputPowerAvg = value;
    }

    /**
     * Gets the value of the inputPowerMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInputPowerMax() {
        return inputPowerMax;
    }

    /**
     * Sets the value of the inputPowerMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInputPowerMax(Float value) {
        this.inputPowerMax = value;
    }

    /**
     * Gets the value of the inputPowerMin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInputPowerMin() {
        return inputPowerMin;
    }

    /**
     * Sets the value of the inputPowerMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInputPowerMin(Float value) {
        this.inputPowerMin = value;
    }

    /**
     * Gets the value of the outputPower property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOutputPower() {
        return outputPower;
    }

    /**
     * Sets the value of the outputPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOutputPower(Float value) {
        this.outputPower = value;
    }

    /**
     * Gets the value of the outputPowerAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOutputPowerAvg() {
        return outputPowerAvg;
    }

    /**
     * Sets the value of the outputPowerAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOutputPowerAvg(Float value) {
        this.outputPowerAvg = value;
    }

    /**
     * Gets the value of the outputPowerMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOutputPowerMax() {
        return outputPowerMax;
    }

    /**
     * Sets the value of the outputPowerMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOutputPowerMax(Float value) {
        this.outputPowerMax = value;
    }

    /**
     * Gets the value of the outputPowerMin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOutputPowerMin() {
        return outputPowerMin;
    }

    /**
     * Sets the value of the outputPowerMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOutputPowerMin(Float value) {
        this.outputPowerMin = value;
    }

    /**
     * Gets the value of the thresholded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThresholded() {
        return thresholded;
    }

    /**
     * Sets the value of the thresholded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThresholded(String value) {
        this.thresholded = value;
    }

    /**
     * Gets the value of the mostRecent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMostRecent() {
        return mostRecent;
    }

    /**
     * Sets the value of the mostRecent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMostRecent(String value) {
        this.mostRecent = value;
    }

    /**
     * Gets the value of the suspect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspect() {
        return suspect;
    }

    /**
     * Sets the value of the suspect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspect(String value) {
        this.suspect = value;
    }

    /**
     * Gets the value of the timeCollected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeCollected() {
        return timeCollected;
    }

    /**
     * Sets the value of the timeCollected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeCollected(String value) {
        this.timeCollected = value;
    }

    /**
     * Gets the value of the childAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildAction() {
        return childAction;
    }

    /**
     * Sets the value of the childAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildAction(String value) {
        this.childAction = value;
    }

    /**
     * Gets the value of the dn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDn() {
        return dn;
    }

    /**
     * Sets the value of the dn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDn(String value) {
        this.dn = value;
    }

    /**
     * Gets the value of the rn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRn() {
        return rn;
    }

    /**
     * Sets the value of the rn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRn(String value) {
        this.rn = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
