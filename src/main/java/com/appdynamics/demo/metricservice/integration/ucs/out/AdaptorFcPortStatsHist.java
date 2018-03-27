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
 * <p>Java class for adaptorFcPortStatsHist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adaptorFcPortStatsHist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="rxBadFrames" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="rxBadFramesDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="rxBadFramesDeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="rxBadFramesDeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="rxBadFramesDeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="rxFrames" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="rxFramesDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="rxFramesDeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="rxFramesDeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="rxFramesDeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="thresholded" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="txBadFrames" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="txBadFramesDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="txBadFramesDeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="txBadFramesDeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="txBadFramesDeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="txFrames" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="txFramesDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="txFramesDeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="txFramesDeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="txFramesDeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
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
@XmlType(name = "adaptorFcPortStatsHist", propOrder = {
    "content"
})
public class AdaptorFcPortStatsHist {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger id;
    @XmlAttribute(name = "rxBadFrames")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger rxBadFrames;
    @XmlAttribute(name = "rxBadFramesDelta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger rxBadFramesDelta;
    @XmlAttribute(name = "rxBadFramesDeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger rxBadFramesDeltaAvg;
    @XmlAttribute(name = "rxBadFramesDeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger rxBadFramesDeltaMax;
    @XmlAttribute(name = "rxBadFramesDeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger rxBadFramesDeltaMin;
    @XmlAttribute(name = "rxFrames")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger rxFrames;
    @XmlAttribute(name = "rxFramesDelta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger rxFramesDelta;
    @XmlAttribute(name = "rxFramesDeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger rxFramesDeltaAvg;
    @XmlAttribute(name = "rxFramesDeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger rxFramesDeltaMax;
    @XmlAttribute(name = "rxFramesDeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger rxFramesDeltaMin;
    @XmlAttribute(name = "thresholded")
    protected String thresholded;
    @XmlAttribute(name = "txBadFrames")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger txBadFrames;
    @XmlAttribute(name = "txBadFramesDelta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger txBadFramesDelta;
    @XmlAttribute(name = "txBadFramesDeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger txBadFramesDeltaAvg;
    @XmlAttribute(name = "txBadFramesDeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger txBadFramesDeltaMax;
    @XmlAttribute(name = "txBadFramesDeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger txBadFramesDeltaMin;
    @XmlAttribute(name = "txFrames")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger txFrames;
    @XmlAttribute(name = "txFramesDelta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger txFramesDelta;
    @XmlAttribute(name = "txFramesDeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger txFramesDeltaAvg;
    @XmlAttribute(name = "txFramesDeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger txFramesDeltaMax;
    @XmlAttribute(name = "txFramesDeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger txFramesDeltaMin;
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
     * Gets the value of the rxBadFrames property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxBadFrames() {
        return rxBadFrames;
    }

    /**
     * Sets the value of the rxBadFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxBadFrames(BigInteger value) {
        this.rxBadFrames = value;
    }

    /**
     * Gets the value of the rxBadFramesDelta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxBadFramesDelta() {
        return rxBadFramesDelta;
    }

    /**
     * Sets the value of the rxBadFramesDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxBadFramesDelta(BigInteger value) {
        this.rxBadFramesDelta = value;
    }

    /**
     * Gets the value of the rxBadFramesDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxBadFramesDeltaAvg() {
        return rxBadFramesDeltaAvg;
    }

    /**
     * Sets the value of the rxBadFramesDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxBadFramesDeltaAvg(BigInteger value) {
        this.rxBadFramesDeltaAvg = value;
    }

    /**
     * Gets the value of the rxBadFramesDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxBadFramesDeltaMax() {
        return rxBadFramesDeltaMax;
    }

    /**
     * Sets the value of the rxBadFramesDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxBadFramesDeltaMax(BigInteger value) {
        this.rxBadFramesDeltaMax = value;
    }

    /**
     * Gets the value of the rxBadFramesDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxBadFramesDeltaMin() {
        return rxBadFramesDeltaMin;
    }

    /**
     * Sets the value of the rxBadFramesDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxBadFramesDeltaMin(BigInteger value) {
        this.rxBadFramesDeltaMin = value;
    }

    /**
     * Gets the value of the rxFrames property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxFrames() {
        return rxFrames;
    }

    /**
     * Sets the value of the rxFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxFrames(BigInteger value) {
        this.rxFrames = value;
    }

    /**
     * Gets the value of the rxFramesDelta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxFramesDelta() {
        return rxFramesDelta;
    }

    /**
     * Sets the value of the rxFramesDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxFramesDelta(BigInteger value) {
        this.rxFramesDelta = value;
    }

    /**
     * Gets the value of the rxFramesDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxFramesDeltaAvg() {
        return rxFramesDeltaAvg;
    }

    /**
     * Sets the value of the rxFramesDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxFramesDeltaAvg(BigInteger value) {
        this.rxFramesDeltaAvg = value;
    }

    /**
     * Gets the value of the rxFramesDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxFramesDeltaMax() {
        return rxFramesDeltaMax;
    }

    /**
     * Sets the value of the rxFramesDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxFramesDeltaMax(BigInteger value) {
        this.rxFramesDeltaMax = value;
    }

    /**
     * Gets the value of the rxFramesDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxFramesDeltaMin() {
        return rxFramesDeltaMin;
    }

    /**
     * Sets the value of the rxFramesDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxFramesDeltaMin(BigInteger value) {
        this.rxFramesDeltaMin = value;
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
     * Gets the value of the txBadFrames property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxBadFrames() {
        return txBadFrames;
    }

    /**
     * Sets the value of the txBadFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxBadFrames(BigInteger value) {
        this.txBadFrames = value;
    }

    /**
     * Gets the value of the txBadFramesDelta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxBadFramesDelta() {
        return txBadFramesDelta;
    }

    /**
     * Sets the value of the txBadFramesDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxBadFramesDelta(BigInteger value) {
        this.txBadFramesDelta = value;
    }

    /**
     * Gets the value of the txBadFramesDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxBadFramesDeltaAvg() {
        return txBadFramesDeltaAvg;
    }

    /**
     * Sets the value of the txBadFramesDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxBadFramesDeltaAvg(BigInteger value) {
        this.txBadFramesDeltaAvg = value;
    }

    /**
     * Gets the value of the txBadFramesDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxBadFramesDeltaMax() {
        return txBadFramesDeltaMax;
    }

    /**
     * Sets the value of the txBadFramesDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxBadFramesDeltaMax(BigInteger value) {
        this.txBadFramesDeltaMax = value;
    }

    /**
     * Gets the value of the txBadFramesDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxBadFramesDeltaMin() {
        return txBadFramesDeltaMin;
    }

    /**
     * Sets the value of the txBadFramesDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxBadFramesDeltaMin(BigInteger value) {
        this.txBadFramesDeltaMin = value;
    }

    /**
     * Gets the value of the txFrames property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxFrames() {
        return txFrames;
    }

    /**
     * Sets the value of the txFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxFrames(BigInteger value) {
        this.txFrames = value;
    }

    /**
     * Gets the value of the txFramesDelta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxFramesDelta() {
        return txFramesDelta;
    }

    /**
     * Sets the value of the txFramesDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxFramesDelta(BigInteger value) {
        this.txFramesDelta = value;
    }

    /**
     * Gets the value of the txFramesDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxFramesDeltaAvg() {
        return txFramesDeltaAvg;
    }

    /**
     * Sets the value of the txFramesDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxFramesDeltaAvg(BigInteger value) {
        this.txFramesDeltaAvg = value;
    }

    /**
     * Gets the value of the txFramesDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxFramesDeltaMax() {
        return txFramesDeltaMax;
    }

    /**
     * Sets the value of the txFramesDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxFramesDeltaMax(BigInteger value) {
        this.txFramesDeltaMax = value;
    }

    /**
     * Gets the value of the txFramesDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxFramesDeltaMin() {
        return txFramesDeltaMin;
    }

    /**
     * Sets the value of the txFramesDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxFramesDeltaMin(BigInteger value) {
        this.txFramesDeltaMin = value;
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
