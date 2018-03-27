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
 * <p>Java class for memoryRuntimeHist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="memoryRuntimeHist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="available" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="availableAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="availableMax" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="availableMin" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="cached" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="cachedAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="cachedMax" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="cachedMin" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="thresholded" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="totalAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="totalMax" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="totalMin" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
@XmlType(name = "memoryRuntimeHist", propOrder = {
    "content"
})
public class MemoryRuntimeHist {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "available")
    @XmlSchemaType(name = "unsignedInt")
    protected Long available;
    @XmlAttribute(name = "availableAvg")
    @XmlSchemaType(name = "unsignedInt")
    protected Long availableAvg;
    @XmlAttribute(name = "availableMax")
    @XmlSchemaType(name = "unsignedInt")
    protected Long availableMax;
    @XmlAttribute(name = "availableMin")
    @XmlSchemaType(name = "unsignedInt")
    protected Long availableMin;
    @XmlAttribute(name = "cached")
    @XmlSchemaType(name = "unsignedInt")
    protected Long cached;
    @XmlAttribute(name = "cachedAvg")
    @XmlSchemaType(name = "unsignedInt")
    protected Long cachedAvg;
    @XmlAttribute(name = "cachedMax")
    @XmlSchemaType(name = "unsignedInt")
    protected Long cachedMax;
    @XmlAttribute(name = "cachedMin")
    @XmlSchemaType(name = "unsignedInt")
    protected Long cachedMin;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger id;
    @XmlAttribute(name = "thresholded")
    protected String thresholded;
    @XmlAttribute(name = "total")
    @XmlSchemaType(name = "unsignedInt")
    protected Long total;
    @XmlAttribute(name = "totalAvg")
    @XmlSchemaType(name = "unsignedInt")
    protected Long totalAvg;
    @XmlAttribute(name = "totalMax")
    @XmlSchemaType(name = "unsignedInt")
    protected Long totalMax;
    @XmlAttribute(name = "totalMin")
    @XmlSchemaType(name = "unsignedInt")
    protected Long totalMin;
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
     * Gets the value of the available property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailable(Long value) {
        this.available = value;
    }

    /**
     * Gets the value of the availableAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailableAvg() {
        return availableAvg;
    }

    /**
     * Sets the value of the availableAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailableAvg(Long value) {
        this.availableAvg = value;
    }

    /**
     * Gets the value of the availableMax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailableMax() {
        return availableMax;
    }

    /**
     * Sets the value of the availableMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailableMax(Long value) {
        this.availableMax = value;
    }

    /**
     * Gets the value of the availableMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailableMin() {
        return availableMin;
    }

    /**
     * Sets the value of the availableMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailableMin(Long value) {
        this.availableMin = value;
    }

    /**
     * Gets the value of the cached property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCached() {
        return cached;
    }

    /**
     * Sets the value of the cached property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCached(Long value) {
        this.cached = value;
    }

    /**
     * Gets the value of the cachedAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCachedAvg() {
        return cachedAvg;
    }

    /**
     * Sets the value of the cachedAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCachedAvg(Long value) {
        this.cachedAvg = value;
    }

    /**
     * Gets the value of the cachedMax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCachedMax() {
        return cachedMax;
    }

    /**
     * Sets the value of the cachedMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCachedMax(Long value) {
        this.cachedMax = value;
    }

    /**
     * Gets the value of the cachedMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCachedMin() {
        return cachedMin;
    }

    /**
     * Sets the value of the cachedMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCachedMin(Long value) {
        this.cachedMin = value;
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
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotal(Long value) {
        this.total = value;
    }

    /**
     * Gets the value of the totalAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalAvg() {
        return totalAvg;
    }

    /**
     * Sets the value of the totalAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalAvg(Long value) {
        this.totalAvg = value;
    }

    /**
     * Gets the value of the totalMax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalMax() {
        return totalMax;
    }

    /**
     * Sets the value of the totalMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalMax(Long value) {
        this.totalMax = value;
    }

    /**
     * Gets the value of the totalMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalMin() {
        return totalMin;
    }

    /**
     * Sets the value of the totalMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalMin(Long value) {
        this.totalMin = value;
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