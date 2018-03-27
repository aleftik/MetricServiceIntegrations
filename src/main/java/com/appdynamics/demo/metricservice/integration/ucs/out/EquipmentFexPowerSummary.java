//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.27 at 10:50:09 AM PDT 
//


package com.appdynamics.demo.metricservice.integration.ucs.out;

import java.io.Serializable;
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
 * <p>Java class for equipmentFexPowerSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="equipmentFexPowerSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}equipmentFexPowerSummaryHist"/>
 *       &lt;/choice>
 *       &lt;attribute name="ModulePower" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ModulePowerAvg" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ModulePowerMax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ModulePowerMin" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="availablePower" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="availablePowerAvg" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="availablePowerMax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="availablePowerMin" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="reservedPower" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="reservedPowerAvg" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="reservedPowerMax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="reservedPowerMin" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="thresholded" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="totalPower" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="totalPowerAvg" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="totalPowerMax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="totalPowerMin" type="{http://www.w3.org/2001/XMLSchema}float" />
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
@XmlType(name = "equipmentFexPowerSummary", propOrder = {
    "content"
})
public class EquipmentFexPowerSummary {

    @XmlElementRef(name = "equipmentFexPowerSummaryHist", type = JAXBElement.class, required = false)
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "ModulePower")
    protected Float modulePower;
    @XmlAttribute(name = "ModulePowerAvg")
    protected Float modulePowerAvg;
    @XmlAttribute(name = "ModulePowerMax")
    protected Float modulePowerMax;
    @XmlAttribute(name = "ModulePowerMin")
    protected Float modulePowerMin;
    @XmlAttribute(name = "availablePower")
    protected Float availablePower;
    @XmlAttribute(name = "availablePowerAvg")
    protected Float availablePowerAvg;
    @XmlAttribute(name = "availablePowerMax")
    protected Float availablePowerMax;
    @XmlAttribute(name = "availablePowerMin")
    protected Float availablePowerMin;
    @XmlAttribute(name = "reservedPower")
    protected Float reservedPower;
    @XmlAttribute(name = "reservedPowerAvg")
    protected Float reservedPowerAvg;
    @XmlAttribute(name = "reservedPowerMax")
    protected Float reservedPowerMax;
    @XmlAttribute(name = "reservedPowerMin")
    protected Float reservedPowerMin;
    @XmlAttribute(name = "thresholded")
    protected String thresholded;
    @XmlAttribute(name = "totalPower")
    protected Float totalPower;
    @XmlAttribute(name = "totalPowerAvg")
    protected Float totalPowerAvg;
    @XmlAttribute(name = "totalPowerMax")
    protected Float totalPowerMax;
    @XmlAttribute(name = "totalPowerMin")
    protected Float totalPowerMin;
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
     * {@link String }
     * {@link JAXBElement }{@code <}{@link EquipmentFexPowerSummaryHist }{@code >}
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
     * Gets the value of the modulePower property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getModulePower() {
        return modulePower;
    }

    /**
     * Sets the value of the modulePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setModulePower(Float value) {
        this.modulePower = value;
    }

    /**
     * Gets the value of the modulePowerAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getModulePowerAvg() {
        return modulePowerAvg;
    }

    /**
     * Sets the value of the modulePowerAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setModulePowerAvg(Float value) {
        this.modulePowerAvg = value;
    }

    /**
     * Gets the value of the modulePowerMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getModulePowerMax() {
        return modulePowerMax;
    }

    /**
     * Sets the value of the modulePowerMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setModulePowerMax(Float value) {
        this.modulePowerMax = value;
    }

    /**
     * Gets the value of the modulePowerMin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getModulePowerMin() {
        return modulePowerMin;
    }

    /**
     * Sets the value of the modulePowerMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setModulePowerMin(Float value) {
        this.modulePowerMin = value;
    }

    /**
     * Gets the value of the availablePower property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAvailablePower() {
        return availablePower;
    }

    /**
     * Sets the value of the availablePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAvailablePower(Float value) {
        this.availablePower = value;
    }

    /**
     * Gets the value of the availablePowerAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAvailablePowerAvg() {
        return availablePowerAvg;
    }

    /**
     * Sets the value of the availablePowerAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAvailablePowerAvg(Float value) {
        this.availablePowerAvg = value;
    }

    /**
     * Gets the value of the availablePowerMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAvailablePowerMax() {
        return availablePowerMax;
    }

    /**
     * Sets the value of the availablePowerMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAvailablePowerMax(Float value) {
        this.availablePowerMax = value;
    }

    /**
     * Gets the value of the availablePowerMin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAvailablePowerMin() {
        return availablePowerMin;
    }

    /**
     * Sets the value of the availablePowerMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAvailablePowerMin(Float value) {
        this.availablePowerMin = value;
    }

    /**
     * Gets the value of the reservedPower property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getReservedPower() {
        return reservedPower;
    }

    /**
     * Sets the value of the reservedPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setReservedPower(Float value) {
        this.reservedPower = value;
    }

    /**
     * Gets the value of the reservedPowerAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getReservedPowerAvg() {
        return reservedPowerAvg;
    }

    /**
     * Sets the value of the reservedPowerAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setReservedPowerAvg(Float value) {
        this.reservedPowerAvg = value;
    }

    /**
     * Gets the value of the reservedPowerMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getReservedPowerMax() {
        return reservedPowerMax;
    }

    /**
     * Sets the value of the reservedPowerMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setReservedPowerMax(Float value) {
        this.reservedPowerMax = value;
    }

    /**
     * Gets the value of the reservedPowerMin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getReservedPowerMin() {
        return reservedPowerMin;
    }

    /**
     * Sets the value of the reservedPowerMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setReservedPowerMin(Float value) {
        this.reservedPowerMin = value;
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
     * Gets the value of the totalPower property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalPower() {
        return totalPower;
    }

    /**
     * Sets the value of the totalPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalPower(Float value) {
        this.totalPower = value;
    }

    /**
     * Gets the value of the totalPowerAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalPowerAvg() {
        return totalPowerAvg;
    }

    /**
     * Sets the value of the totalPowerAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalPowerAvg(Float value) {
        this.totalPowerAvg = value;
    }

    /**
     * Gets the value of the totalPowerMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalPowerMax() {
        return totalPowerMax;
    }

    /**
     * Sets the value of the totalPowerMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalPowerMax(Float value) {
        this.totalPowerMax = value;
    }

    /**
     * Gets the value of the totalPowerMin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalPowerMin() {
        return totalPowerMin;
    }

    /**
     * Sets the value of the totalPowerMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalPowerMin(Float value) {
        this.totalPowerMin = value;
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