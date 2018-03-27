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
 * <p>Java class for adaptorMenloBaseErrorStatsHist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adaptorMenloBaseErrorStatsHist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="correctableErrors" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="correctableErrorsDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="correctableErrorsDeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="correctableErrorsDeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="correctableErrorsDeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="thresholded" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uncorrectableErrors" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="uncorrectableErrorsDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="uncorrectableErrorsDeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="uncorrectableErrorsDeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="uncorrectableErrorsDeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
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
@XmlType(name = "adaptorMenloBaseErrorStatsHist", propOrder = {
    "content"
})
public class AdaptorMenloBaseErrorStatsHist {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "correctableErrors")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger correctableErrors;
    @XmlAttribute(name = "correctableErrorsDelta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger correctableErrorsDelta;
    @XmlAttribute(name = "correctableErrorsDeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger correctableErrorsDeltaAvg;
    @XmlAttribute(name = "correctableErrorsDeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger correctableErrorsDeltaMax;
    @XmlAttribute(name = "correctableErrorsDeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger correctableErrorsDeltaMin;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger id;
    @XmlAttribute(name = "thresholded")
    protected String thresholded;
    @XmlAttribute(name = "uncorrectableErrors")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger uncorrectableErrors;
    @XmlAttribute(name = "uncorrectableErrorsDelta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger uncorrectableErrorsDelta;
    @XmlAttribute(name = "uncorrectableErrorsDeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger uncorrectableErrorsDeltaAvg;
    @XmlAttribute(name = "uncorrectableErrorsDeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger uncorrectableErrorsDeltaMax;
    @XmlAttribute(name = "uncorrectableErrorsDeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger uncorrectableErrorsDeltaMin;
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
     * Gets the value of the correctableErrors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCorrectableErrors() {
        return correctableErrors;
    }

    /**
     * Sets the value of the correctableErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCorrectableErrors(BigInteger value) {
        this.correctableErrors = value;
    }

    /**
     * Gets the value of the correctableErrorsDelta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCorrectableErrorsDelta() {
        return correctableErrorsDelta;
    }

    /**
     * Sets the value of the correctableErrorsDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCorrectableErrorsDelta(BigInteger value) {
        this.correctableErrorsDelta = value;
    }

    /**
     * Gets the value of the correctableErrorsDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCorrectableErrorsDeltaAvg() {
        return correctableErrorsDeltaAvg;
    }

    /**
     * Sets the value of the correctableErrorsDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCorrectableErrorsDeltaAvg(BigInteger value) {
        this.correctableErrorsDeltaAvg = value;
    }

    /**
     * Gets the value of the correctableErrorsDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCorrectableErrorsDeltaMax() {
        return correctableErrorsDeltaMax;
    }

    /**
     * Sets the value of the correctableErrorsDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCorrectableErrorsDeltaMax(BigInteger value) {
        this.correctableErrorsDeltaMax = value;
    }

    /**
     * Gets the value of the correctableErrorsDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCorrectableErrorsDeltaMin() {
        return correctableErrorsDeltaMin;
    }

    /**
     * Sets the value of the correctableErrorsDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCorrectableErrorsDeltaMin(BigInteger value) {
        this.correctableErrorsDeltaMin = value;
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
     * Gets the value of the uncorrectableErrors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUncorrectableErrors() {
        return uncorrectableErrors;
    }

    /**
     * Sets the value of the uncorrectableErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUncorrectableErrors(BigInteger value) {
        this.uncorrectableErrors = value;
    }

    /**
     * Gets the value of the uncorrectableErrorsDelta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUncorrectableErrorsDelta() {
        return uncorrectableErrorsDelta;
    }

    /**
     * Sets the value of the uncorrectableErrorsDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUncorrectableErrorsDelta(BigInteger value) {
        this.uncorrectableErrorsDelta = value;
    }

    /**
     * Gets the value of the uncorrectableErrorsDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUncorrectableErrorsDeltaAvg() {
        return uncorrectableErrorsDeltaAvg;
    }

    /**
     * Sets the value of the uncorrectableErrorsDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUncorrectableErrorsDeltaAvg(BigInteger value) {
        this.uncorrectableErrorsDeltaAvg = value;
    }

    /**
     * Gets the value of the uncorrectableErrorsDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUncorrectableErrorsDeltaMax() {
        return uncorrectableErrorsDeltaMax;
    }

    /**
     * Sets the value of the uncorrectableErrorsDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUncorrectableErrorsDeltaMax(BigInteger value) {
        this.uncorrectableErrorsDeltaMax = value;
    }

    /**
     * Gets the value of the uncorrectableErrorsDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUncorrectableErrorsDeltaMin() {
        return uncorrectableErrorsDeltaMin;
    }

    /**
     * Sets the value of the uncorrectableErrorsDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUncorrectableErrorsDeltaMin(BigInteger value) {
        this.uncorrectableErrorsDeltaMin = value;
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
