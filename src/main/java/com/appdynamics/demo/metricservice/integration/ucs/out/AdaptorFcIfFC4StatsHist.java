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
 * <p>Java class for adaptorFcIfFC4StatsHist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adaptorFcIfFC4StatsHist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="controlRequests">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="controlRequestsDelta">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="controlRequestsDeltaAvg">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="controlRequestsDeltaMax">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="controlRequestsDeltaMin">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="inputMegabytes">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="inputMegabytesDelta">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="inputMegabytesDeltaAvg">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="inputMegabytesDeltaMax">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="inputMegabytesDeltaMin">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="inputRequests">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="inputRequestsDelta">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="inputRequestsDeltaAvg">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="inputRequestsDeltaMax">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="inputRequestsDeltaMin">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="outputMegabytes">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="outputMegabytesDelta">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="outputMegabytesDeltaAvg">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="outputMegabytesDeltaMax">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="outputMegabytesDeltaMin">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="outputRequests">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="outputRequestsDelta">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="outputRequestsDeltaAvg">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="outputRequestsDeltaMax">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="outputRequestsDeltaMin">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="NA"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
@XmlType(name = "adaptorFcIfFC4StatsHist", propOrder = {
    "content"
})
public class AdaptorFcIfFC4StatsHist {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "controlRequests")
    protected String controlRequests;
    @XmlAttribute(name = "controlRequestsDelta")
    protected String controlRequestsDelta;
    @XmlAttribute(name = "controlRequestsDeltaAvg")
    protected String controlRequestsDeltaAvg;
    @XmlAttribute(name = "controlRequestsDeltaMax")
    protected String controlRequestsDeltaMax;
    @XmlAttribute(name = "controlRequestsDeltaMin")
    protected String controlRequestsDeltaMin;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger id;
    @XmlAttribute(name = "inputMegabytes")
    protected String inputMegabytes;
    @XmlAttribute(name = "inputMegabytesDelta")
    protected String inputMegabytesDelta;
    @XmlAttribute(name = "inputMegabytesDeltaAvg")
    protected String inputMegabytesDeltaAvg;
    @XmlAttribute(name = "inputMegabytesDeltaMax")
    protected String inputMegabytesDeltaMax;
    @XmlAttribute(name = "inputMegabytesDeltaMin")
    protected String inputMegabytesDeltaMin;
    @XmlAttribute(name = "inputRequests")
    protected String inputRequests;
    @XmlAttribute(name = "inputRequestsDelta")
    protected String inputRequestsDelta;
    @XmlAttribute(name = "inputRequestsDeltaAvg")
    protected String inputRequestsDeltaAvg;
    @XmlAttribute(name = "inputRequestsDeltaMax")
    protected String inputRequestsDeltaMax;
    @XmlAttribute(name = "inputRequestsDeltaMin")
    protected String inputRequestsDeltaMin;
    @XmlAttribute(name = "outputMegabytes")
    protected String outputMegabytes;
    @XmlAttribute(name = "outputMegabytesDelta")
    protected String outputMegabytesDelta;
    @XmlAttribute(name = "outputMegabytesDeltaAvg")
    protected String outputMegabytesDeltaAvg;
    @XmlAttribute(name = "outputMegabytesDeltaMax")
    protected String outputMegabytesDeltaMax;
    @XmlAttribute(name = "outputMegabytesDeltaMin")
    protected String outputMegabytesDeltaMin;
    @XmlAttribute(name = "outputRequests")
    protected String outputRequests;
    @XmlAttribute(name = "outputRequestsDelta")
    protected String outputRequestsDelta;
    @XmlAttribute(name = "outputRequestsDeltaAvg")
    protected String outputRequestsDeltaAvg;
    @XmlAttribute(name = "outputRequestsDeltaMax")
    protected String outputRequestsDeltaMax;
    @XmlAttribute(name = "outputRequestsDeltaMin")
    protected String outputRequestsDeltaMin;
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
     * Gets the value of the controlRequests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlRequests() {
        return controlRequests;
    }

    /**
     * Sets the value of the controlRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlRequests(String value) {
        this.controlRequests = value;
    }

    /**
     * Gets the value of the controlRequestsDelta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlRequestsDelta() {
        return controlRequestsDelta;
    }

    /**
     * Sets the value of the controlRequestsDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlRequestsDelta(String value) {
        this.controlRequestsDelta = value;
    }

    /**
     * Gets the value of the controlRequestsDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlRequestsDeltaAvg() {
        return controlRequestsDeltaAvg;
    }

    /**
     * Sets the value of the controlRequestsDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlRequestsDeltaAvg(String value) {
        this.controlRequestsDeltaAvg = value;
    }

    /**
     * Gets the value of the controlRequestsDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlRequestsDeltaMax() {
        return controlRequestsDeltaMax;
    }

    /**
     * Sets the value of the controlRequestsDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlRequestsDeltaMax(String value) {
        this.controlRequestsDeltaMax = value;
    }

    /**
     * Gets the value of the controlRequestsDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlRequestsDeltaMin() {
        return controlRequestsDeltaMin;
    }

    /**
     * Sets the value of the controlRequestsDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlRequestsDeltaMin(String value) {
        this.controlRequestsDeltaMin = value;
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
     * Gets the value of the inputMegabytes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputMegabytes() {
        return inputMegabytes;
    }

    /**
     * Sets the value of the inputMegabytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputMegabytes(String value) {
        this.inputMegabytes = value;
    }

    /**
     * Gets the value of the inputMegabytesDelta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputMegabytesDelta() {
        return inputMegabytesDelta;
    }

    /**
     * Sets the value of the inputMegabytesDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputMegabytesDelta(String value) {
        this.inputMegabytesDelta = value;
    }

    /**
     * Gets the value of the inputMegabytesDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputMegabytesDeltaAvg() {
        return inputMegabytesDeltaAvg;
    }

    /**
     * Sets the value of the inputMegabytesDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputMegabytesDeltaAvg(String value) {
        this.inputMegabytesDeltaAvg = value;
    }

    /**
     * Gets the value of the inputMegabytesDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputMegabytesDeltaMax() {
        return inputMegabytesDeltaMax;
    }

    /**
     * Sets the value of the inputMegabytesDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputMegabytesDeltaMax(String value) {
        this.inputMegabytesDeltaMax = value;
    }

    /**
     * Gets the value of the inputMegabytesDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputMegabytesDeltaMin() {
        return inputMegabytesDeltaMin;
    }

    /**
     * Sets the value of the inputMegabytesDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputMegabytesDeltaMin(String value) {
        this.inputMegabytesDeltaMin = value;
    }

    /**
     * Gets the value of the inputRequests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputRequests() {
        return inputRequests;
    }

    /**
     * Sets the value of the inputRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputRequests(String value) {
        this.inputRequests = value;
    }

    /**
     * Gets the value of the inputRequestsDelta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputRequestsDelta() {
        return inputRequestsDelta;
    }

    /**
     * Sets the value of the inputRequestsDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputRequestsDelta(String value) {
        this.inputRequestsDelta = value;
    }

    /**
     * Gets the value of the inputRequestsDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputRequestsDeltaAvg() {
        return inputRequestsDeltaAvg;
    }

    /**
     * Sets the value of the inputRequestsDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputRequestsDeltaAvg(String value) {
        this.inputRequestsDeltaAvg = value;
    }

    /**
     * Gets the value of the inputRequestsDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputRequestsDeltaMax() {
        return inputRequestsDeltaMax;
    }

    /**
     * Sets the value of the inputRequestsDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputRequestsDeltaMax(String value) {
        this.inputRequestsDeltaMax = value;
    }

    /**
     * Gets the value of the inputRequestsDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputRequestsDeltaMin() {
        return inputRequestsDeltaMin;
    }

    /**
     * Sets the value of the inputRequestsDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputRequestsDeltaMin(String value) {
        this.inputRequestsDeltaMin = value;
    }

    /**
     * Gets the value of the outputMegabytes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputMegabytes() {
        return outputMegabytes;
    }

    /**
     * Sets the value of the outputMegabytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputMegabytes(String value) {
        this.outputMegabytes = value;
    }

    /**
     * Gets the value of the outputMegabytesDelta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputMegabytesDelta() {
        return outputMegabytesDelta;
    }

    /**
     * Sets the value of the outputMegabytesDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputMegabytesDelta(String value) {
        this.outputMegabytesDelta = value;
    }

    /**
     * Gets the value of the outputMegabytesDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputMegabytesDeltaAvg() {
        return outputMegabytesDeltaAvg;
    }

    /**
     * Sets the value of the outputMegabytesDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputMegabytesDeltaAvg(String value) {
        this.outputMegabytesDeltaAvg = value;
    }

    /**
     * Gets the value of the outputMegabytesDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputMegabytesDeltaMax() {
        return outputMegabytesDeltaMax;
    }

    /**
     * Sets the value of the outputMegabytesDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputMegabytesDeltaMax(String value) {
        this.outputMegabytesDeltaMax = value;
    }

    /**
     * Gets the value of the outputMegabytesDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputMegabytesDeltaMin() {
        return outputMegabytesDeltaMin;
    }

    /**
     * Sets the value of the outputMegabytesDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputMegabytesDeltaMin(String value) {
        this.outputMegabytesDeltaMin = value;
    }

    /**
     * Gets the value of the outputRequests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputRequests() {
        return outputRequests;
    }

    /**
     * Sets the value of the outputRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputRequests(String value) {
        this.outputRequests = value;
    }

    /**
     * Gets the value of the outputRequestsDelta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputRequestsDelta() {
        return outputRequestsDelta;
    }

    /**
     * Sets the value of the outputRequestsDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputRequestsDelta(String value) {
        this.outputRequestsDelta = value;
    }

    /**
     * Gets the value of the outputRequestsDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputRequestsDeltaAvg() {
        return outputRequestsDeltaAvg;
    }

    /**
     * Sets the value of the outputRequestsDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputRequestsDeltaAvg(String value) {
        this.outputRequestsDeltaAvg = value;
    }

    /**
     * Gets the value of the outputRequestsDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputRequestsDeltaMax() {
        return outputRequestsDeltaMax;
    }

    /**
     * Sets the value of the outputRequestsDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputRequestsDeltaMax(String value) {
        this.outputRequestsDeltaMax = value;
    }

    /**
     * Gets the value of the outputRequestsDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputRequestsDeltaMin() {
        return outputRequestsDeltaMin;
    }

    /**
     * Sets the value of the outputRequestsDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputRequestsDeltaMin(String value) {
        this.outputRequestsDeltaMin = value;
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