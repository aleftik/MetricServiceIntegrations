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
 * <p>Java class for adaptorEthPortBySizeLargeStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adaptorEthPortBySizeLargeStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}adaptorEthPortBySizeLargeStatsHist"/>
 *       &lt;/choice>
 *       &lt;attribute name="greaterThanOrEqualTo9216" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="greaterThanOrEqualTo9216Delta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="greaterThanOrEqualTo9216DeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="greaterThanOrEqualTo9216DeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="greaterThanOrEqualTo9216DeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan2048" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan2048Delta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan2048DeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan2048DeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan2048DeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan4096" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan4096Delta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan4096DeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan4096DeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan4096DeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan8192" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan8192Delta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan8192DeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan8192DeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan8192DeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan9216" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan9216Delta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan9216DeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan9216DeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThan9216DeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThanOrEqualTo1518" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThanOrEqualTo1518Delta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThanOrEqualTo1518DeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThanOrEqualTo1518DeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="lessThanOrEqualTo1518DeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="noBreakdownGreaterThan1518" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="noBreakdownGreaterThan1518Delta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="noBreakdownGreaterThan1518DeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="noBreakdownGreaterThan1518DeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="noBreakdownGreaterThan1518DeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="thresholded" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="trafficDirection">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="tx"/>
 *             &lt;enumeration value="rx"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
@XmlType(name = "adaptorEthPortBySizeLargeStats", propOrder = {
    "content"
})
public class AdaptorEthPortBySizeLargeStats {

    @XmlElementRef(name = "adaptorEthPortBySizeLargeStatsHist", type = JAXBElement.class, required = false)
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "greaterThanOrEqualTo9216")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger greaterThanOrEqualTo9216;
    @XmlAttribute(name = "greaterThanOrEqualTo9216Delta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger greaterThanOrEqualTo9216Delta;
    @XmlAttribute(name = "greaterThanOrEqualTo9216DeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger greaterThanOrEqualTo9216DeltaAvg;
    @XmlAttribute(name = "greaterThanOrEqualTo9216DeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger greaterThanOrEqualTo9216DeltaMax;
    @XmlAttribute(name = "greaterThanOrEqualTo9216DeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger greaterThanOrEqualTo9216DeltaMin;
    @XmlAttribute(name = "lessThan2048")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan2048;
    @XmlAttribute(name = "lessThan2048Delta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan2048Delta;
    @XmlAttribute(name = "lessThan2048DeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan2048DeltaAvg;
    @XmlAttribute(name = "lessThan2048DeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan2048DeltaMax;
    @XmlAttribute(name = "lessThan2048DeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan2048DeltaMin;
    @XmlAttribute(name = "lessThan4096")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan4096;
    @XmlAttribute(name = "lessThan4096Delta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan4096Delta;
    @XmlAttribute(name = "lessThan4096DeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan4096DeltaAvg;
    @XmlAttribute(name = "lessThan4096DeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan4096DeltaMax;
    @XmlAttribute(name = "lessThan4096DeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan4096DeltaMin;
    @XmlAttribute(name = "lessThan8192")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan8192;
    @XmlAttribute(name = "lessThan8192Delta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan8192Delta;
    @XmlAttribute(name = "lessThan8192DeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan8192DeltaAvg;
    @XmlAttribute(name = "lessThan8192DeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan8192DeltaMax;
    @XmlAttribute(name = "lessThan8192DeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan8192DeltaMin;
    @XmlAttribute(name = "lessThan9216")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan9216;
    @XmlAttribute(name = "lessThan9216Delta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan9216Delta;
    @XmlAttribute(name = "lessThan9216DeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan9216DeltaAvg;
    @XmlAttribute(name = "lessThan9216DeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan9216DeltaMax;
    @XmlAttribute(name = "lessThan9216DeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThan9216DeltaMin;
    @XmlAttribute(name = "lessThanOrEqualTo1518")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThanOrEqualTo1518;
    @XmlAttribute(name = "lessThanOrEqualTo1518Delta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThanOrEqualTo1518Delta;
    @XmlAttribute(name = "lessThanOrEqualTo1518DeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThanOrEqualTo1518DeltaAvg;
    @XmlAttribute(name = "lessThanOrEqualTo1518DeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThanOrEqualTo1518DeltaMax;
    @XmlAttribute(name = "lessThanOrEqualTo1518DeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lessThanOrEqualTo1518DeltaMin;
    @XmlAttribute(name = "noBreakdownGreaterThan1518")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger noBreakdownGreaterThan1518;
    @XmlAttribute(name = "noBreakdownGreaterThan1518Delta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger noBreakdownGreaterThan1518Delta;
    @XmlAttribute(name = "noBreakdownGreaterThan1518DeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger noBreakdownGreaterThan1518DeltaAvg;
    @XmlAttribute(name = "noBreakdownGreaterThan1518DeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger noBreakdownGreaterThan1518DeltaMax;
    @XmlAttribute(name = "noBreakdownGreaterThan1518DeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger noBreakdownGreaterThan1518DeltaMin;
    @XmlAttribute(name = "thresholded")
    protected String thresholded;
    @XmlAttribute(name = "trafficDirection")
    protected String trafficDirection;
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
     * {@link JAXBElement }{@code <}{@link AdaptorEthPortBySizeLargeStatsHist }{@code >}
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
     * Gets the value of the greaterThanOrEqualTo9216 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGreaterThanOrEqualTo9216() {
        return greaterThanOrEqualTo9216;
    }

    /**
     * Sets the value of the greaterThanOrEqualTo9216 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGreaterThanOrEqualTo9216(BigInteger value) {
        this.greaterThanOrEqualTo9216 = value;
    }

    /**
     * Gets the value of the greaterThanOrEqualTo9216Delta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGreaterThanOrEqualTo9216Delta() {
        return greaterThanOrEqualTo9216Delta;
    }

    /**
     * Sets the value of the greaterThanOrEqualTo9216Delta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGreaterThanOrEqualTo9216Delta(BigInteger value) {
        this.greaterThanOrEqualTo9216Delta = value;
    }

    /**
     * Gets the value of the greaterThanOrEqualTo9216DeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGreaterThanOrEqualTo9216DeltaAvg() {
        return greaterThanOrEqualTo9216DeltaAvg;
    }

    /**
     * Sets the value of the greaterThanOrEqualTo9216DeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGreaterThanOrEqualTo9216DeltaAvg(BigInteger value) {
        this.greaterThanOrEqualTo9216DeltaAvg = value;
    }

    /**
     * Gets the value of the greaterThanOrEqualTo9216DeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGreaterThanOrEqualTo9216DeltaMax() {
        return greaterThanOrEqualTo9216DeltaMax;
    }

    /**
     * Sets the value of the greaterThanOrEqualTo9216DeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGreaterThanOrEqualTo9216DeltaMax(BigInteger value) {
        this.greaterThanOrEqualTo9216DeltaMax = value;
    }

    /**
     * Gets the value of the greaterThanOrEqualTo9216DeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGreaterThanOrEqualTo9216DeltaMin() {
        return greaterThanOrEqualTo9216DeltaMin;
    }

    /**
     * Sets the value of the greaterThanOrEqualTo9216DeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGreaterThanOrEqualTo9216DeltaMin(BigInteger value) {
        this.greaterThanOrEqualTo9216DeltaMin = value;
    }

    /**
     * Gets the value of the lessThan2048 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan2048() {
        return lessThan2048;
    }

    /**
     * Sets the value of the lessThan2048 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan2048(BigInteger value) {
        this.lessThan2048 = value;
    }

    /**
     * Gets the value of the lessThan2048Delta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan2048Delta() {
        return lessThan2048Delta;
    }

    /**
     * Sets the value of the lessThan2048Delta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan2048Delta(BigInteger value) {
        this.lessThan2048Delta = value;
    }

    /**
     * Gets the value of the lessThan2048DeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan2048DeltaAvg() {
        return lessThan2048DeltaAvg;
    }

    /**
     * Sets the value of the lessThan2048DeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan2048DeltaAvg(BigInteger value) {
        this.lessThan2048DeltaAvg = value;
    }

    /**
     * Gets the value of the lessThan2048DeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan2048DeltaMax() {
        return lessThan2048DeltaMax;
    }

    /**
     * Sets the value of the lessThan2048DeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan2048DeltaMax(BigInteger value) {
        this.lessThan2048DeltaMax = value;
    }

    /**
     * Gets the value of the lessThan2048DeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan2048DeltaMin() {
        return lessThan2048DeltaMin;
    }

    /**
     * Sets the value of the lessThan2048DeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan2048DeltaMin(BigInteger value) {
        this.lessThan2048DeltaMin = value;
    }

    /**
     * Gets the value of the lessThan4096 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan4096() {
        return lessThan4096;
    }

    /**
     * Sets the value of the lessThan4096 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan4096(BigInteger value) {
        this.lessThan4096 = value;
    }

    /**
     * Gets the value of the lessThan4096Delta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan4096Delta() {
        return lessThan4096Delta;
    }

    /**
     * Sets the value of the lessThan4096Delta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan4096Delta(BigInteger value) {
        this.lessThan4096Delta = value;
    }

    /**
     * Gets the value of the lessThan4096DeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan4096DeltaAvg() {
        return lessThan4096DeltaAvg;
    }

    /**
     * Sets the value of the lessThan4096DeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan4096DeltaAvg(BigInteger value) {
        this.lessThan4096DeltaAvg = value;
    }

    /**
     * Gets the value of the lessThan4096DeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan4096DeltaMax() {
        return lessThan4096DeltaMax;
    }

    /**
     * Sets the value of the lessThan4096DeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan4096DeltaMax(BigInteger value) {
        this.lessThan4096DeltaMax = value;
    }

    /**
     * Gets the value of the lessThan4096DeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan4096DeltaMin() {
        return lessThan4096DeltaMin;
    }

    /**
     * Sets the value of the lessThan4096DeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan4096DeltaMin(BigInteger value) {
        this.lessThan4096DeltaMin = value;
    }

    /**
     * Gets the value of the lessThan8192 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan8192() {
        return lessThan8192;
    }

    /**
     * Sets the value of the lessThan8192 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan8192(BigInteger value) {
        this.lessThan8192 = value;
    }

    /**
     * Gets the value of the lessThan8192Delta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan8192Delta() {
        return lessThan8192Delta;
    }

    /**
     * Sets the value of the lessThan8192Delta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan8192Delta(BigInteger value) {
        this.lessThan8192Delta = value;
    }

    /**
     * Gets the value of the lessThan8192DeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan8192DeltaAvg() {
        return lessThan8192DeltaAvg;
    }

    /**
     * Sets the value of the lessThan8192DeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan8192DeltaAvg(BigInteger value) {
        this.lessThan8192DeltaAvg = value;
    }

    /**
     * Gets the value of the lessThan8192DeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan8192DeltaMax() {
        return lessThan8192DeltaMax;
    }

    /**
     * Sets the value of the lessThan8192DeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan8192DeltaMax(BigInteger value) {
        this.lessThan8192DeltaMax = value;
    }

    /**
     * Gets the value of the lessThan8192DeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan8192DeltaMin() {
        return lessThan8192DeltaMin;
    }

    /**
     * Sets the value of the lessThan8192DeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan8192DeltaMin(BigInteger value) {
        this.lessThan8192DeltaMin = value;
    }

    /**
     * Gets the value of the lessThan9216 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan9216() {
        return lessThan9216;
    }

    /**
     * Sets the value of the lessThan9216 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan9216(BigInteger value) {
        this.lessThan9216 = value;
    }

    /**
     * Gets the value of the lessThan9216Delta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan9216Delta() {
        return lessThan9216Delta;
    }

    /**
     * Sets the value of the lessThan9216Delta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan9216Delta(BigInteger value) {
        this.lessThan9216Delta = value;
    }

    /**
     * Gets the value of the lessThan9216DeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan9216DeltaAvg() {
        return lessThan9216DeltaAvg;
    }

    /**
     * Sets the value of the lessThan9216DeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan9216DeltaAvg(BigInteger value) {
        this.lessThan9216DeltaAvg = value;
    }

    /**
     * Gets the value of the lessThan9216DeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan9216DeltaMax() {
        return lessThan9216DeltaMax;
    }

    /**
     * Sets the value of the lessThan9216DeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan9216DeltaMax(BigInteger value) {
        this.lessThan9216DeltaMax = value;
    }

    /**
     * Gets the value of the lessThan9216DeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThan9216DeltaMin() {
        return lessThan9216DeltaMin;
    }

    /**
     * Sets the value of the lessThan9216DeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThan9216DeltaMin(BigInteger value) {
        this.lessThan9216DeltaMin = value;
    }

    /**
     * Gets the value of the lessThanOrEqualTo1518 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThanOrEqualTo1518() {
        return lessThanOrEqualTo1518;
    }

    /**
     * Sets the value of the lessThanOrEqualTo1518 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThanOrEqualTo1518(BigInteger value) {
        this.lessThanOrEqualTo1518 = value;
    }

    /**
     * Gets the value of the lessThanOrEqualTo1518Delta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThanOrEqualTo1518Delta() {
        return lessThanOrEqualTo1518Delta;
    }

    /**
     * Sets the value of the lessThanOrEqualTo1518Delta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThanOrEqualTo1518Delta(BigInteger value) {
        this.lessThanOrEqualTo1518Delta = value;
    }

    /**
     * Gets the value of the lessThanOrEqualTo1518DeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThanOrEqualTo1518DeltaAvg() {
        return lessThanOrEqualTo1518DeltaAvg;
    }

    /**
     * Sets the value of the lessThanOrEqualTo1518DeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThanOrEqualTo1518DeltaAvg(BigInteger value) {
        this.lessThanOrEqualTo1518DeltaAvg = value;
    }

    /**
     * Gets the value of the lessThanOrEqualTo1518DeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThanOrEqualTo1518DeltaMax() {
        return lessThanOrEqualTo1518DeltaMax;
    }

    /**
     * Sets the value of the lessThanOrEqualTo1518DeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThanOrEqualTo1518DeltaMax(BigInteger value) {
        this.lessThanOrEqualTo1518DeltaMax = value;
    }

    /**
     * Gets the value of the lessThanOrEqualTo1518DeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLessThanOrEqualTo1518DeltaMin() {
        return lessThanOrEqualTo1518DeltaMin;
    }

    /**
     * Sets the value of the lessThanOrEqualTo1518DeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLessThanOrEqualTo1518DeltaMin(BigInteger value) {
        this.lessThanOrEqualTo1518DeltaMin = value;
    }

    /**
     * Gets the value of the noBreakdownGreaterThan1518 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoBreakdownGreaterThan1518() {
        return noBreakdownGreaterThan1518;
    }

    /**
     * Sets the value of the noBreakdownGreaterThan1518 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoBreakdownGreaterThan1518(BigInteger value) {
        this.noBreakdownGreaterThan1518 = value;
    }

    /**
     * Gets the value of the noBreakdownGreaterThan1518Delta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoBreakdownGreaterThan1518Delta() {
        return noBreakdownGreaterThan1518Delta;
    }

    /**
     * Sets the value of the noBreakdownGreaterThan1518Delta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoBreakdownGreaterThan1518Delta(BigInteger value) {
        this.noBreakdownGreaterThan1518Delta = value;
    }

    /**
     * Gets the value of the noBreakdownGreaterThan1518DeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoBreakdownGreaterThan1518DeltaAvg() {
        return noBreakdownGreaterThan1518DeltaAvg;
    }

    /**
     * Sets the value of the noBreakdownGreaterThan1518DeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoBreakdownGreaterThan1518DeltaAvg(BigInteger value) {
        this.noBreakdownGreaterThan1518DeltaAvg = value;
    }

    /**
     * Gets the value of the noBreakdownGreaterThan1518DeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoBreakdownGreaterThan1518DeltaMax() {
        return noBreakdownGreaterThan1518DeltaMax;
    }

    /**
     * Sets the value of the noBreakdownGreaterThan1518DeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoBreakdownGreaterThan1518DeltaMax(BigInteger value) {
        this.noBreakdownGreaterThan1518DeltaMax = value;
    }

    /**
     * Gets the value of the noBreakdownGreaterThan1518DeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoBreakdownGreaterThan1518DeltaMin() {
        return noBreakdownGreaterThan1518DeltaMin;
    }

    /**
     * Sets the value of the noBreakdownGreaterThan1518DeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoBreakdownGreaterThan1518DeltaMin(BigInteger value) {
        this.noBreakdownGreaterThan1518DeltaMin = value;
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
     * Gets the value of the trafficDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafficDirection() {
        return trafficDirection;
    }

    /**
     * Sets the value of the trafficDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafficDirection(String value) {
        this.trafficDirection = value;
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
