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
 * <p>Java class for etherRxStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etherRxStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}etherRxStatsHist"/>
 *       &lt;/choice>
 *       &lt;attribute name="broadcastPackets" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="broadcastPacketsDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="broadcastPacketsDeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="broadcastPacketsDeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="broadcastPacketsDeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="jumboPackets" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="jumboPacketsDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="jumboPacketsDeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="jumboPacketsDeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="jumboPacketsDeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="multicastPackets" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="multicastPacketsDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="multicastPacketsDeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="multicastPacketsDeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="multicastPacketsDeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="thresholded" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="totalBytes" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="totalBytesDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="totalBytesDeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="totalBytesDeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="totalBytesDeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="totalPackets" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="totalPacketsDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="totalPacketsDeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="totalPacketsDeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="totalPacketsDeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="unicastPackets" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="unicastPacketsDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="unicastPacketsDeltaAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="unicastPacketsDeltaMax" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="unicastPacketsDeltaMin" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
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
@XmlType(name = "etherRxStats", propOrder = {
    "content"
})
public class EtherRxStats {

    @XmlElementRef(name = "etherRxStatsHist", type = JAXBElement.class, required = false)
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "broadcastPackets")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger broadcastPackets;
    @XmlAttribute(name = "broadcastPacketsDelta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger broadcastPacketsDelta;
    @XmlAttribute(name = "broadcastPacketsDeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger broadcastPacketsDeltaAvg;
    @XmlAttribute(name = "broadcastPacketsDeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger broadcastPacketsDeltaMax;
    @XmlAttribute(name = "broadcastPacketsDeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger broadcastPacketsDeltaMin;
    @XmlAttribute(name = "jumboPackets")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger jumboPackets;
    @XmlAttribute(name = "jumboPacketsDelta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger jumboPacketsDelta;
    @XmlAttribute(name = "jumboPacketsDeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger jumboPacketsDeltaAvg;
    @XmlAttribute(name = "jumboPacketsDeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger jumboPacketsDeltaMax;
    @XmlAttribute(name = "jumboPacketsDeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger jumboPacketsDeltaMin;
    @XmlAttribute(name = "multicastPackets")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger multicastPackets;
    @XmlAttribute(name = "multicastPacketsDelta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger multicastPacketsDelta;
    @XmlAttribute(name = "multicastPacketsDeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger multicastPacketsDeltaAvg;
    @XmlAttribute(name = "multicastPacketsDeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger multicastPacketsDeltaMax;
    @XmlAttribute(name = "multicastPacketsDeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger multicastPacketsDeltaMin;
    @XmlAttribute(name = "thresholded")
    protected String thresholded;
    @XmlAttribute(name = "totalBytes")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalBytes;
    @XmlAttribute(name = "totalBytesDelta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalBytesDelta;
    @XmlAttribute(name = "totalBytesDeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalBytesDeltaAvg;
    @XmlAttribute(name = "totalBytesDeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalBytesDeltaMax;
    @XmlAttribute(name = "totalBytesDeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalBytesDeltaMin;
    @XmlAttribute(name = "totalPackets")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalPackets;
    @XmlAttribute(name = "totalPacketsDelta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalPacketsDelta;
    @XmlAttribute(name = "totalPacketsDeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalPacketsDeltaAvg;
    @XmlAttribute(name = "totalPacketsDeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalPacketsDeltaMax;
    @XmlAttribute(name = "totalPacketsDeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalPacketsDeltaMin;
    @XmlAttribute(name = "unicastPackets")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger unicastPackets;
    @XmlAttribute(name = "unicastPacketsDelta")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger unicastPacketsDelta;
    @XmlAttribute(name = "unicastPacketsDeltaAvg")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger unicastPacketsDeltaAvg;
    @XmlAttribute(name = "unicastPacketsDeltaMax")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger unicastPacketsDeltaMax;
    @XmlAttribute(name = "unicastPacketsDeltaMin")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger unicastPacketsDeltaMin;
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
     * {@link JAXBElement }{@code <}{@link EtherRxStatsHist }{@code >}
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
     * Gets the value of the broadcastPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBroadcastPackets() {
        return broadcastPackets;
    }

    /**
     * Sets the value of the broadcastPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBroadcastPackets(BigInteger value) {
        this.broadcastPackets = value;
    }

    /**
     * Gets the value of the broadcastPacketsDelta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBroadcastPacketsDelta() {
        return broadcastPacketsDelta;
    }

    /**
     * Sets the value of the broadcastPacketsDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBroadcastPacketsDelta(BigInteger value) {
        this.broadcastPacketsDelta = value;
    }

    /**
     * Gets the value of the broadcastPacketsDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBroadcastPacketsDeltaAvg() {
        return broadcastPacketsDeltaAvg;
    }

    /**
     * Sets the value of the broadcastPacketsDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBroadcastPacketsDeltaAvg(BigInteger value) {
        this.broadcastPacketsDeltaAvg = value;
    }

    /**
     * Gets the value of the broadcastPacketsDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBroadcastPacketsDeltaMax() {
        return broadcastPacketsDeltaMax;
    }

    /**
     * Sets the value of the broadcastPacketsDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBroadcastPacketsDeltaMax(BigInteger value) {
        this.broadcastPacketsDeltaMax = value;
    }

    /**
     * Gets the value of the broadcastPacketsDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBroadcastPacketsDeltaMin() {
        return broadcastPacketsDeltaMin;
    }

    /**
     * Sets the value of the broadcastPacketsDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBroadcastPacketsDeltaMin(BigInteger value) {
        this.broadcastPacketsDeltaMin = value;
    }

    /**
     * Gets the value of the jumboPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJumboPackets() {
        return jumboPackets;
    }

    /**
     * Sets the value of the jumboPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJumboPackets(BigInteger value) {
        this.jumboPackets = value;
    }

    /**
     * Gets the value of the jumboPacketsDelta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJumboPacketsDelta() {
        return jumboPacketsDelta;
    }

    /**
     * Sets the value of the jumboPacketsDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJumboPacketsDelta(BigInteger value) {
        this.jumboPacketsDelta = value;
    }

    /**
     * Gets the value of the jumboPacketsDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJumboPacketsDeltaAvg() {
        return jumboPacketsDeltaAvg;
    }

    /**
     * Sets the value of the jumboPacketsDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJumboPacketsDeltaAvg(BigInteger value) {
        this.jumboPacketsDeltaAvg = value;
    }

    /**
     * Gets the value of the jumboPacketsDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJumboPacketsDeltaMax() {
        return jumboPacketsDeltaMax;
    }

    /**
     * Sets the value of the jumboPacketsDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJumboPacketsDeltaMax(BigInteger value) {
        this.jumboPacketsDeltaMax = value;
    }

    /**
     * Gets the value of the jumboPacketsDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJumboPacketsDeltaMin() {
        return jumboPacketsDeltaMin;
    }

    /**
     * Sets the value of the jumboPacketsDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJumboPacketsDeltaMin(BigInteger value) {
        this.jumboPacketsDeltaMin = value;
    }

    /**
     * Gets the value of the multicastPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMulticastPackets() {
        return multicastPackets;
    }

    /**
     * Sets the value of the multicastPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMulticastPackets(BigInteger value) {
        this.multicastPackets = value;
    }

    /**
     * Gets the value of the multicastPacketsDelta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMulticastPacketsDelta() {
        return multicastPacketsDelta;
    }

    /**
     * Sets the value of the multicastPacketsDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMulticastPacketsDelta(BigInteger value) {
        this.multicastPacketsDelta = value;
    }

    /**
     * Gets the value of the multicastPacketsDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMulticastPacketsDeltaAvg() {
        return multicastPacketsDeltaAvg;
    }

    /**
     * Sets the value of the multicastPacketsDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMulticastPacketsDeltaAvg(BigInteger value) {
        this.multicastPacketsDeltaAvg = value;
    }

    /**
     * Gets the value of the multicastPacketsDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMulticastPacketsDeltaMax() {
        return multicastPacketsDeltaMax;
    }

    /**
     * Sets the value of the multicastPacketsDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMulticastPacketsDeltaMax(BigInteger value) {
        this.multicastPacketsDeltaMax = value;
    }

    /**
     * Gets the value of the multicastPacketsDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMulticastPacketsDeltaMin() {
        return multicastPacketsDeltaMin;
    }

    /**
     * Sets the value of the multicastPacketsDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMulticastPacketsDeltaMin(BigInteger value) {
        this.multicastPacketsDeltaMin = value;
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
     * Gets the value of the totalBytes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalBytes() {
        return totalBytes;
    }

    /**
     * Sets the value of the totalBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalBytes(BigInteger value) {
        this.totalBytes = value;
    }

    /**
     * Gets the value of the totalBytesDelta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalBytesDelta() {
        return totalBytesDelta;
    }

    /**
     * Sets the value of the totalBytesDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalBytesDelta(BigInteger value) {
        this.totalBytesDelta = value;
    }

    /**
     * Gets the value of the totalBytesDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalBytesDeltaAvg() {
        return totalBytesDeltaAvg;
    }

    /**
     * Sets the value of the totalBytesDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalBytesDeltaAvg(BigInteger value) {
        this.totalBytesDeltaAvg = value;
    }

    /**
     * Gets the value of the totalBytesDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalBytesDeltaMax() {
        return totalBytesDeltaMax;
    }

    /**
     * Sets the value of the totalBytesDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalBytesDeltaMax(BigInteger value) {
        this.totalBytesDeltaMax = value;
    }

    /**
     * Gets the value of the totalBytesDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalBytesDeltaMin() {
        return totalBytesDeltaMin;
    }

    /**
     * Sets the value of the totalBytesDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalBytesDeltaMin(BigInteger value) {
        this.totalBytesDeltaMin = value;
    }

    /**
     * Gets the value of the totalPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPackets() {
        return totalPackets;
    }

    /**
     * Sets the value of the totalPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPackets(BigInteger value) {
        this.totalPackets = value;
    }

    /**
     * Gets the value of the totalPacketsDelta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPacketsDelta() {
        return totalPacketsDelta;
    }

    /**
     * Sets the value of the totalPacketsDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPacketsDelta(BigInteger value) {
        this.totalPacketsDelta = value;
    }

    /**
     * Gets the value of the totalPacketsDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPacketsDeltaAvg() {
        return totalPacketsDeltaAvg;
    }

    /**
     * Sets the value of the totalPacketsDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPacketsDeltaAvg(BigInteger value) {
        this.totalPacketsDeltaAvg = value;
    }

    /**
     * Gets the value of the totalPacketsDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPacketsDeltaMax() {
        return totalPacketsDeltaMax;
    }

    /**
     * Sets the value of the totalPacketsDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPacketsDeltaMax(BigInteger value) {
        this.totalPacketsDeltaMax = value;
    }

    /**
     * Gets the value of the totalPacketsDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPacketsDeltaMin() {
        return totalPacketsDeltaMin;
    }

    /**
     * Sets the value of the totalPacketsDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPacketsDeltaMin(BigInteger value) {
        this.totalPacketsDeltaMin = value;
    }

    /**
     * Gets the value of the unicastPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnicastPackets() {
        return unicastPackets;
    }

    /**
     * Sets the value of the unicastPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnicastPackets(BigInteger value) {
        this.unicastPackets = value;
    }

    /**
     * Gets the value of the unicastPacketsDelta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnicastPacketsDelta() {
        return unicastPacketsDelta;
    }

    /**
     * Sets the value of the unicastPacketsDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnicastPacketsDelta(BigInteger value) {
        this.unicastPacketsDelta = value;
    }

    /**
     * Gets the value of the unicastPacketsDeltaAvg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnicastPacketsDeltaAvg() {
        return unicastPacketsDeltaAvg;
    }

    /**
     * Sets the value of the unicastPacketsDeltaAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnicastPacketsDeltaAvg(BigInteger value) {
        this.unicastPacketsDeltaAvg = value;
    }

    /**
     * Gets the value of the unicastPacketsDeltaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnicastPacketsDeltaMax() {
        return unicastPacketsDeltaMax;
    }

    /**
     * Sets the value of the unicastPacketsDeltaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnicastPacketsDeltaMax(BigInteger value) {
        this.unicastPacketsDeltaMax = value;
    }

    /**
     * Gets the value of the unicastPacketsDeltaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnicastPacketsDeltaMin() {
        return unicastPacketsDeltaMin;
    }

    /**
     * Sets the value of the unicastPacketsDeltaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnicastPacketsDeltaMin(BigInteger value) {
        this.unicastPacketsDeltaMin = value;
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