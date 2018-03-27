//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.27 at 10:50:09 AM PDT 
//


package com.appdynamics.demo.metricservice.integration.ucs.out;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adaptorMenloMcpuErrorStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adaptorMenloMcpuErrorStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}adaptorMenloMcpuErrorStatsHist"/>
 *       &lt;/choice>
 *       &lt;attribute name="correctableErrors" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="correctableErrorsDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="correctableErrorsDeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="correctableErrorsDeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="correctableErrorsDeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="menloMcpuIndex">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="0_A"/>
 *             &lt;enumeration value="0_B"/>
 *             &lt;enumeration value="1_A"/>
 *             &lt;enumeration value="1_B"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="popErrors" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="popErrorsDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="popErrorsDeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="popErrorsDeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="popErrorsDeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="pushErrors" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="pushErrorsDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="pushErrorsDeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="pushErrorsDeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="pushErrorsDeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="thresholded" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uncorrectableErrors" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="uncorrectableErrorsDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="uncorrectableErrorsDeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="uncorrectableErrorsDeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="uncorrectableErrorsDeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="intervals" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="update" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
@XmlType(name = "adaptorMenloMcpuErrorStats", propOrder = {
    "content"
})
public class AdaptorMenloMcpuErrorStats {

    @XmlElementRef(name = "adaptorMenloMcpuErrorStatsHist", type = JAXBElement.class, required = false)
    @XmlMixed
    protected List<Serializable> content;
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
    @XmlAttribute(name = "menloMcpuIndex")
    protected String menloMcpuIndex;
    @XmlAttribute(name = "popErrors")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger popErrors;
    @XmlAttribute(name = "popErrorsDelta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger popErrorsDelta;
    @XmlAttribute(name = "popErrorsDeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger popErrorsDeltaAvg;
    @XmlAttribute(name = "popErrorsDeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger popErrorsDeltaMax;
    @XmlAttribute(name = "popErrorsDeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger popErrorsDeltaMin;
    @XmlAttribute(name = "pushErrors")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger pushErrors;
    @XmlAttribute(name = "pushErrorsDelta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger pushErrorsDelta;
    @XmlAttribute(name = "pushErrorsDeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger pushErrorsDeltaAvg;
    @XmlAttribute(name = "pushErrorsDeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger pushErrorsDeltaMax;
    @XmlAttribute(name = "pushErrorsDeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger pushErrorsDeltaMin;
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
    @XmlAttribute(name = "intervals")
    @XmlSchemaType(name = "unsignedInt")
    protected Long intervals;
    @XmlAttribute(name = "update")
    @XmlSchemaType(name = "unsignedInt")
    protected Long update;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AdaptorMenloMcpuErrorStatsHist }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
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
     * Gets the value of the menloMcpuIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenloMcpuIndex() {
        return menloMcpuIndex;
    }

    /**
     * Sets the value of the menloMcpuIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenloMcpuIndex(String value) {
        this.menloMcpuIndex = value;
    }

    /**
     * Gets the value of the popErrors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPopErrors() {
        return popErrors;
    }

    /**
     * Sets the value of the popErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPopErrors(BigInteger value) {
        this.popErrors = value;
    }

    /**
     * Gets the value of the popErrorsDelta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPopErrorsDelta() {
        return popErrorsDelta;
    }

    /**
     * Sets the value of the popErrorsDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPopErrorsDelta(BigInteger value) {
        this.popErrorsDelta = value;
    }

    /**
     * Gets the value of the popErrorsDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPopErrorsDeltaAvg() {
        return popErrorsDeltaAvg;
    }

    /**
     * Sets the value of the popErrorsDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPopErrorsDeltaAvg(BigInteger value) {
        this.popErrorsDeltaAvg = value;
    }

    /**
     * Gets the value of the popErrorsDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPopErrorsDeltaMax() {
        return popErrorsDeltaMax;
    }

    /**
     * Sets the value of the popErrorsDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPopErrorsDeltaMax(BigInteger value) {
        this.popErrorsDeltaMax = value;
    }

    /**
     * Gets the value of the popErrorsDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPopErrorsDeltaMin() {
        return popErrorsDeltaMin;
    }

    /**
     * Sets the value of the popErrorsDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPopErrorsDeltaMin(BigInteger value) {
        this.popErrorsDeltaMin = value;
    }

    /**
     * Gets the value of the pushErrors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPushErrors() {
        return pushErrors;
    }

    /**
     * Sets the value of the pushErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPushErrors(BigInteger value) {
        this.pushErrors = value;
    }

    /**
     * Gets the value of the pushErrorsDelta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPushErrorsDelta() {
        return pushErrorsDelta;
    }

    /**
     * Sets the value of the pushErrorsDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPushErrorsDelta(BigInteger value) {
        this.pushErrorsDelta = value;
    }

    /**
     * Gets the value of the pushErrorsDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPushErrorsDeltaAvg() {
        return pushErrorsDeltaAvg;
    }

    /**
     * Sets the value of the pushErrorsDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPushErrorsDeltaAvg(BigInteger value) {
        this.pushErrorsDeltaAvg = value;
    }

    /**
     * Gets the value of the pushErrorsDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPushErrorsDeltaMax() {
        return pushErrorsDeltaMax;
    }

    /**
     * Sets the value of the pushErrorsDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPushErrorsDeltaMax(BigInteger value) {
        this.pushErrorsDeltaMax = value;
    }

    /**
     * Gets the value of the pushErrorsDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPushErrorsDeltaMin() {
        return pushErrorsDeltaMin;
    }

    /**
     * Sets the value of the pushErrorsDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPushErrorsDeltaMin(BigInteger value) {
        this.pushErrorsDeltaMin = value;
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
     * Gets the value of the intervals property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIntervals() {
        return intervals;
    }

    /**
     * Sets the value of the intervals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIntervals(Long value) {
        this.intervals = value;
    }

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpdate() {
        return update;
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdate(Long value) {
        this.update = value;
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
