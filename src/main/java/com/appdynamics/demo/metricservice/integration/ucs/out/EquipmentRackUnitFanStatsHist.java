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
 * <p>Java class for equipmentRackUnitFanStatsHist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="equipmentRackUnitFanStatsHist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="speed" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="speedAvg" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="speedMax" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="speedMin" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
@XmlType(name = "equipmentRackUnitFanStatsHist", propOrder = {
    "content"
})
public class EquipmentRackUnitFanStatsHist {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger id;
    @XmlAttribute(name = "speed")
    @XmlSchemaType(name = "unsignedInt")
    protected Long speed;
    @XmlAttribute(name = "speedAvg")
    @XmlSchemaType(name = "unsignedInt")
    protected Long speedAvg;
    @XmlAttribute(name = "speedMax")
    @XmlSchemaType(name = "unsignedInt")
    protected Long speedMax;
    @XmlAttribute(name = "speedMin")
    @XmlSchemaType(name = "unsignedInt")
    protected Long speedMin;
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
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpeed(Long value) {
        this.speed = value;
    }

    /**
     * Gets the value of the speedAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpeedAvg() {
        return speedAvg;
    }

    /**
     * Sets the value of the speedAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpeedAvg(Long value) {
        this.speedAvg = value;
    }

    /**
     * Gets the value of the speedMax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpeedMax() {
        return speedMax;
    }

    /**
     * Sets the value of the speedMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpeedMax(Long value) {
        this.speedMax = value;
    }

    /**
     * Gets the value of the speedMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpeedMin() {
        return speedMin;
    }

    /**
     * Sets the value of the speedMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpeedMin(Long value) {
        this.speedMin = value;
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
