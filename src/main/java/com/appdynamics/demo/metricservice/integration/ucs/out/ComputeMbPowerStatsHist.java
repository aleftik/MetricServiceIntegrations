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
 * <p>Java class for computeMbPowerStatsHist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="computeMbPowerStatsHist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="consumedPower" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="consumedPowerAvg" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="consumedPowerMax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="consumedPowerMin" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="inputCurrent" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="inputCurrentAvg" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="inputCurrentMax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="inputCurrentMin" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="inputVoltage" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="inputVoltageAvg" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="inputVoltageMax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="inputVoltageMin" type="{http://www.w3.org/2001/XMLSchema}float" />
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
@XmlType(name = "computeMbPowerStatsHist", propOrder = {
    "content"
})
public class ComputeMbPowerStatsHist {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "consumedPower")
    protected Float consumedPower;
    @XmlAttribute(name = "consumedPowerAvg")
    protected Float consumedPowerAvg;
    @XmlAttribute(name = "consumedPowerMax")
    protected Float consumedPowerMax;
    @XmlAttribute(name = "consumedPowerMin")
    protected Float consumedPowerMin;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger id;
    @XmlAttribute(name = "inputCurrent")
    protected Float inputCurrent;
    @XmlAttribute(name = "inputCurrentAvg")
    protected Float inputCurrentAvg;
    @XmlAttribute(name = "inputCurrentMax")
    protected Float inputCurrentMax;
    @XmlAttribute(name = "inputCurrentMin")
    protected Float inputCurrentMin;
    @XmlAttribute(name = "inputVoltage")
    protected Float inputVoltage;
    @XmlAttribute(name = "inputVoltageAvg")
    protected Float inputVoltageAvg;
    @XmlAttribute(name = "inputVoltageMax")
    protected Float inputVoltageMax;
    @XmlAttribute(name = "inputVoltageMin")
    protected Float inputVoltageMin;
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
     * Gets the value of the consumedPower property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConsumedPower() {
        return consumedPower;
    }

    /**
     * Sets the value of the consumedPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConsumedPower(Float value) {
        this.consumedPower = value;
    }

    /**
     * Gets the value of the consumedPowerAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConsumedPowerAvg() {
        return consumedPowerAvg;
    }

    /**
     * Sets the value of the consumedPowerAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConsumedPowerAvg(Float value) {
        this.consumedPowerAvg = value;
    }

    /**
     * Gets the value of the consumedPowerMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConsumedPowerMax() {
        return consumedPowerMax;
    }

    /**
     * Sets the value of the consumedPowerMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConsumedPowerMax(Float value) {
        this.consumedPowerMax = value;
    }

    /**
     * Gets the value of the consumedPowerMin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConsumedPowerMin() {
        return consumedPowerMin;
    }

    /**
     * Sets the value of the consumedPowerMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConsumedPowerMin(Float value) {
        this.consumedPowerMin = value;
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
     * Gets the value of the inputCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInputCurrent() {
        return inputCurrent;
    }

    /**
     * Sets the value of the inputCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInputCurrent(Float value) {
        this.inputCurrent = value;
    }

    /**
     * Gets the value of the inputCurrentAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInputCurrentAvg() {
        return inputCurrentAvg;
    }

    /**
     * Sets the value of the inputCurrentAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInputCurrentAvg(Float value) {
        this.inputCurrentAvg = value;
    }

    /**
     * Gets the value of the inputCurrentMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInputCurrentMax() {
        return inputCurrentMax;
    }

    /**
     * Sets the value of the inputCurrentMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInputCurrentMax(Float value) {
        this.inputCurrentMax = value;
    }

    /**
     * Gets the value of the inputCurrentMin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInputCurrentMin() {
        return inputCurrentMin;
    }

    /**
     * Sets the value of the inputCurrentMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInputCurrentMin(Float value) {
        this.inputCurrentMin = value;
    }

    /**
     * Gets the value of the inputVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInputVoltage() {
        return inputVoltage;
    }

    /**
     * Sets the value of the inputVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInputVoltage(Float value) {
        this.inputVoltage = value;
    }

    /**
     * Gets the value of the inputVoltageAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInputVoltageAvg() {
        return inputVoltageAvg;
    }

    /**
     * Sets the value of the inputVoltageAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInputVoltageAvg(Float value) {
        this.inputVoltageAvg = value;
    }

    /**
     * Gets the value of the inputVoltageMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInputVoltageMax() {
        return inputVoltageMax;
    }

    /**
     * Sets the value of the inputVoltageMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInputVoltageMax(Float value) {
        this.inputVoltageMax = value;
    }

    /**
     * Gets the value of the inputVoltageMin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInputVoltageMin() {
        return inputVoltageMin;
    }

    /**
     * Sets the value of the inputVoltageMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInputVoltageMin(Float value) {
        this.inputVoltageMin = value;
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
