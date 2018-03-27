//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.27 at 10:50:09 AM PDT 
//


package com.appdynamics.demo.metricservice.integration.ucs.out;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for apeSdr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apeSdr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="entityType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="UNSPECIFIED"/>
 *             &lt;enumeration value="OTHER"/>
 *             &lt;enumeration value="UNKNOWN"/>
 *             &lt;enumeration value="PROCESSOR"/>
 *             &lt;enumeration value="DISK"/>
 *             &lt;enumeration value="PERIPHERAL"/>
 *             &lt;enumeration value="SYSTEM_MANAGEMENT_MODULE"/>
 *             &lt;enumeration value="SYSTEM_BOARD"/>
 *             &lt;enumeration value="MEMORY_MODULE"/>
 *             &lt;enumeration value="PROCESSOR_MODULE"/>
 *             &lt;enumeration value="POWER_SUPPLY"/>
 *             &lt;enumeration value="ADD_IN_CARD"/>
 *             &lt;enumeration value="FRONT_PANEL_BOARD"/>
 *             &lt;enumeration value="BACK_PANEL_BOARD"/>
 *             &lt;enumeration value="POWER_SYSTEM_BOARD"/>
 *             &lt;enumeration value="DRIVE_BACKPLANE"/>
 *             &lt;enumeration value="SYSTEM_INTERNAL_EXPANSION_BOARD"/>
 *             &lt;enumeration value="OTHER_SYSTEM_BOARD"/>
 *             &lt;enumeration value="PROCESSOR_BOARD"/>
 *             &lt;enumeration value="POWER_UNIT"/>
 *             &lt;enumeration value="POWER_MODULE"/>
 *             &lt;enumeration value="POWER_MANAGEMENT_BOARD"/>
 *             &lt;enumeration value="CHASSIS_BACK_PANEL_BOARD"/>
 *             &lt;enumeration value="SYSTEM_CHASSIS"/>
 *             &lt;enumeration value="SUB_CHASSIS"/>
 *             &lt;enumeration value="OTHER_CHASSIS_BOARD"/>
 *             &lt;enumeration value="DISK_DRIVE_BAY"/>
 *             &lt;enumeration value="PERIPHERAL_BAY"/>
 *             &lt;enumeration value="DEVICE_BAY"/>
 *             &lt;enumeration value="FAN_COOLING"/>
 *             &lt;enumeration value="COOLING_UNIT"/>
 *             &lt;enumeration value="CABLE_INTERCONNECT"/>
 *             &lt;enumeration value="MEMORY_DEVICE"/>
 *             &lt;enumeration value="SYSTEM_MANAGEMENT_SOFTWARE"/>
 *             &lt;enumeration value="BIOS"/>
 *             &lt;enumeration value="OPERATING_SYSTEM"/>
 *             &lt;enumeration value="SYSTEM_BUS"/>
 *             &lt;enumeration value="GROUP"/>
 *             &lt;enumeration value="REMOTE_MGMT_COMM_DEVICE"/>
 *             &lt;enumeration value="EXTERNAL_ENVIRONMENT"/>
 *             &lt;enumeration value="BATTERY"/>
 *             &lt;enumeration value="PROCESSING_BLADE"/>
 *             &lt;enumeration value="CONNECTIVITY_SWITCH"/>
 *             &lt;enumeration value="PROCESSOR_MEMORY_MODULE"/>
 *             &lt;enumeration value="IO_MODULE"/>
 *             &lt;enumeration value="PROCESSOR_IO_MODULE"/>
 *             &lt;enumeration value="MGMT_CONTROLLER_FIRMWARE"/>
 *             &lt;enumeration value="IPMI_CHANNEL"/>
 *             &lt;enumeration value="PCI_BUS"/>
 *             &lt;enumeration value="PCI_EXPRESS_BUS"/>
 *             &lt;enumeration value="SCSI_BUS"/>
 *             &lt;enumeration value="SATA_SAS_BUS"/>
 *             &lt;enumeration value="PROCESSOR_FRONT_SIDE_BUS"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="eventReadingType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hysterisisDown">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="510"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="hysterisisUp">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="510"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="instance" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="510"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="sensorId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="sensorType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="thresholdLc" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="thresholdLnc" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="thresholdLnr" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="thresholdUc" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="thresholdUnc" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="thresholdUnr" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "apeSdr", propOrder = {
    "content"
})
public class ApeSdr {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "entityType")
    protected String entityType;
    @XmlAttribute(name = "eventReadingType")
    protected String eventReadingType;
    @XmlAttribute(name = "hysterisisDown")
    protected String hysterisisDown;
    @XmlAttribute(name = "hysterisisUp")
    protected String hysterisisUp;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long id;
    @XmlAttribute(name = "instance")
    @XmlSchemaType(name = "unsignedInt")
    protected Long instance;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "sensorId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long sensorId;
    @XmlAttribute(name = "sensorType")
    protected String sensorType;
    @XmlAttribute(name = "thresholdLc")
    protected Float thresholdLc;
    @XmlAttribute(name = "thresholdLnc")
    protected Float thresholdLnc;
    @XmlAttribute(name = "thresholdLnr")
    protected Float thresholdLnr;
    @XmlAttribute(name = "thresholdUc")
    protected Float thresholdUc;
    @XmlAttribute(name = "thresholdUnc")
    protected Float thresholdUnc;
    @XmlAttribute(name = "thresholdUnr")
    protected Float thresholdUnr;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "units")
    protected String units;
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
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the eventReadingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventReadingType() {
        return eventReadingType;
    }

    /**
     * Sets the value of the eventReadingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventReadingType(String value) {
        this.eventReadingType = value;
    }

    /**
     * Gets the value of the hysterisisDown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHysterisisDown() {
        return hysterisisDown;
    }

    /**
     * Sets the value of the hysterisisDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHysterisisDown(String value) {
        this.hysterisisDown = value;
    }

    /**
     * Gets the value of the hysterisisUp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHysterisisUp() {
        return hysterisisUp;
    }

    /**
     * Sets the value of the hysterisisUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHysterisisUp(String value) {
        this.hysterisisUp = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInstance() {
        return instance;
    }

    /**
     * Sets the value of the instance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInstance(Long value) {
        this.instance = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the sensorId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSensorId() {
        return sensorId;
    }

    /**
     * Sets the value of the sensorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSensorId(Long value) {
        this.sensorId = value;
    }

    /**
     * Gets the value of the sensorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorType() {
        return sensorType;
    }

    /**
     * Sets the value of the sensorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorType(String value) {
        this.sensorType = value;
    }

    /**
     * Gets the value of the thresholdLc property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThresholdLc() {
        return thresholdLc;
    }

    /**
     * Sets the value of the thresholdLc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThresholdLc(Float value) {
        this.thresholdLc = value;
    }

    /**
     * Gets the value of the thresholdLnc property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThresholdLnc() {
        return thresholdLnc;
    }

    /**
     * Sets the value of the thresholdLnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThresholdLnc(Float value) {
        this.thresholdLnc = value;
    }

    /**
     * Gets the value of the thresholdLnr property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThresholdLnr() {
        return thresholdLnr;
    }

    /**
     * Sets the value of the thresholdLnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThresholdLnr(Float value) {
        this.thresholdLnr = value;
    }

    /**
     * Gets the value of the thresholdUc property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThresholdUc() {
        return thresholdUc;
    }

    /**
     * Sets the value of the thresholdUc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThresholdUc(Float value) {
        this.thresholdUc = value;
    }

    /**
     * Gets the value of the thresholdUnc property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThresholdUnc() {
        return thresholdUnc;
    }

    /**
     * Sets the value of the thresholdUnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThresholdUnc(Float value) {
        this.thresholdUnc = value;
    }

    /**
     * Gets the value of the thresholdUnr property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThresholdUnr() {
        return thresholdUnr;
    }

    /**
     * Sets the value of the thresholdUnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThresholdUnr(Float value) {
        this.thresholdUnr = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
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
