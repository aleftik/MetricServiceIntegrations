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
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for memoryArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="memoryArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}faultInst"/>
 *         &lt;element ref="{}memoryArrayEnvStats"/>
 *         &lt;element ref="{}memoryUnit"/>
 *       &lt;/choice>
 *       &lt;attribute name="cpuId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="currCapacity">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedInt">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="unspecified"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="errorCorrection">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="undiscovered"/>
 *             &lt;enumeration value="other"/>
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="parity"/>
 *             &lt;enumeration value="single-bit-ECC"/>
 *             &lt;enumeration value="multi-bit-ECC"/>
 *             &lt;enumeration value="CRC"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="id">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *             &lt;minInclusive value="1"/>
 *             &lt;maxInclusive value="8"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="maxCapacity">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedInt">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="unspecified"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="maxDevices">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedShort">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="unspecified"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="populated">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedShort">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="unspecified"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="operState">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="operable"/>
 *             &lt;enumeration value="inoperable"/>
 *             &lt;enumeration value="degraded"/>
 *             &lt;enumeration value="powered-off"/>
 *             &lt;enumeration value="power-problem"/>
 *             &lt;enumeration value="removed"/>
 *             &lt;enumeration value="voltage-problem"/>
 *             &lt;enumeration value="thermal-problem"/>
 *             &lt;enumeration value="performance-problem"/>
 *             &lt;enumeration value="accessibility-problem"/>
 *             &lt;enumeration value="identity-unestablishable"/>
 *             &lt;enumeration value="bios-post-timeout"/>
 *             &lt;enumeration value="disabled"/>
 *             &lt;enumeration value="fabric-conn-problem"/>
 *             &lt;enumeration value="fabric-unsupported-conn"/>
 *             &lt;enumeration value="config"/>
 *             &lt;enumeration value="equipment-problem"/>
 *             &lt;enumeration value="decomissioning"/>
 *             &lt;enumeration value="chassis-limit-exceeded"/>
 *             &lt;enumeration value="not-supported"/>
 *             &lt;enumeration value="discovery"/>
 *             &lt;enumeration value="discovery-failed"/>
 *             &lt;enumeration value="identify"/>
 *             &lt;enumeration value="post-failure"/>
 *             &lt;enumeration value="upgrade-problem"/>
 *             &lt;enumeration value="peer-comm-problem"/>
 *             &lt;enumeration value="auto-upgrade"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="operability">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="operable"/>
 *             &lt;enumeration value="inoperable"/>
 *             &lt;enumeration value="degraded"/>
 *             &lt;enumeration value="powered-off"/>
 *             &lt;enumeration value="power-problem"/>
 *             &lt;enumeration value="removed"/>
 *             &lt;enumeration value="voltage-problem"/>
 *             &lt;enumeration value="thermal-problem"/>
 *             &lt;enumeration value="performance-problem"/>
 *             &lt;enumeration value="accessibility-problem"/>
 *             &lt;enumeration value="identity-unestablishable"/>
 *             &lt;enumeration value="bios-post-timeout"/>
 *             &lt;enumeration value="disabled"/>
 *             &lt;enumeration value="fabric-conn-problem"/>
 *             &lt;enumeration value="fabric-unsupported-conn"/>
 *             &lt;enumeration value="config"/>
 *             &lt;enumeration value="equipment-problem"/>
 *             &lt;enumeration value="decomissioning"/>
 *             &lt;enumeration value="chassis-limit-exceeded"/>
 *             &lt;enumeration value="not-supported"/>
 *             &lt;enumeration value="discovery"/>
 *             &lt;enumeration value="discovery-failed"/>
 *             &lt;enumeration value="identify"/>
 *             &lt;enumeration value="post-failure"/>
 *             &lt;enumeration value="upgrade-problem"/>
 *             &lt;enumeration value="peer-comm-problem"/>
 *             &lt;enumeration value="auto-upgrade"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="perf">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="ok"/>
 *             &lt;enumeration value="upper-non-recoverable"/>
 *             &lt;enumeration value="upper-critical"/>
 *             &lt;enumeration value="upper-non-critical"/>
 *             &lt;enumeration value="lower-non-critical"/>
 *             &lt;enumeration value="lower-critical"/>
 *             &lt;enumeration value="lower-non-recoverable"/>
 *             &lt;enumeration value="not-supported"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="power">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="on"/>
 *             &lt;enumeration value="test"/>
 *             &lt;enumeration value="off"/>
 *             &lt;enumeration value="online"/>
 *             &lt;enumeration value="offline"/>
 *             &lt;enumeration value="offduty"/>
 *             &lt;enumeration value="degraded"/>
 *             &lt;enumeration value="power-save"/>
 *             &lt;enumeration value="error"/>
 *             &lt;enumeration value="not-supported"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="presence">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="empty"/>
 *             &lt;enumeration value="equipped"/>
 *             &lt;enumeration value="missing"/>
 *             &lt;enumeration value="mismatch"/>
 *             &lt;enumeration value="equipped-not-primary"/>
 *             &lt;enumeration value="equipped-identity-unestablishable"/>
 *             &lt;enumeration value="mismatch-identity-unestablishable"/>
 *             &lt;enumeration value="inaccessible"/>
 *             &lt;enumeration value="unauthorized"/>
 *             &lt;enumeration value="not-supported"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="thermal">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="ok"/>
 *             &lt;enumeration value="upper-non-recoverable"/>
 *             &lt;enumeration value="upper-critical"/>
 *             &lt;enumeration value="upper-non-critical"/>
 *             &lt;enumeration value="lower-non-critical"/>
 *             &lt;enumeration value="lower-critical"/>
 *             &lt;enumeration value="lower-non-recoverable"/>
 *             &lt;enumeration value="not-supported"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="voltage">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="ok"/>
 *             &lt;enumeration value="upper-non-recoverable"/>
 *             &lt;enumeration value="upper-critical"/>
 *             &lt;enumeration value="upper-non-critical"/>
 *             &lt;enumeration value="lower-non-critical"/>
 *             &lt;enumeration value="lower-critical"/>
 *             &lt;enumeration value="lower-non-recoverable"/>
 *             &lt;enumeration value="not-supported"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="model">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="510"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="revision">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="510"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="serial">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="510"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="vendor">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="510"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
@XmlType(name = "memoryArray", propOrder = {
    "content"
})
public class MemoryArray {

    @XmlElementRefs({
        @XmlElementRef(name = "faultInst", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "memoryArrayEnvStats", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "memoryUnit", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "cpuId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long cpuId;
    @XmlAttribute(name = "currCapacity")
    protected String currCapacity;
    @XmlAttribute(name = "errorCorrection")
    protected String errorCorrection;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "maxCapacity")
    protected String maxCapacity;
    @XmlAttribute(name = "maxDevices")
    protected String maxDevices;
    @XmlAttribute(name = "populated")
    protected String populated;
    @XmlAttribute(name = "operState")
    protected String operState;
    @XmlAttribute(name = "operability")
    protected String operability;
    @XmlAttribute(name = "perf")
    protected String perf;
    @XmlAttribute(name = "power")
    protected String power;
    @XmlAttribute(name = "presence")
    protected String presence;
    @XmlAttribute(name = "thermal")
    protected String thermal;
    @XmlAttribute(name = "voltage")
    protected String voltage;
    @XmlAttribute(name = "model")
    protected String model;
    @XmlAttribute(name = "revision")
    protected String revision;
    @XmlAttribute(name = "serial")
    protected String serial;
    @XmlAttribute(name = "vendor")
    protected String vendor;
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
     * {@link JAXBElement }{@code <}{@link FaultInst }{@code >}
     * {@link JAXBElement }{@code <}{@link MemoryArrayEnvStats }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link MemoryUnit }{@code >}
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
     * Gets the value of the cpuId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCpuId() {
        return cpuId;
    }

    /**
     * Sets the value of the cpuId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCpuId(Long value) {
        this.cpuId = value;
    }

    /**
     * Gets the value of the currCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrCapacity() {
        return currCapacity;
    }

    /**
     * Sets the value of the currCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrCapacity(String value) {
        this.currCapacity = value;
    }

    /**
     * Gets the value of the errorCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCorrection() {
        return errorCorrection;
    }

    /**
     * Sets the value of the errorCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCorrection(String value) {
        this.errorCorrection = value;
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
     * Gets the value of the maxCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Sets the value of the maxCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCapacity(String value) {
        this.maxCapacity = value;
    }

    /**
     * Gets the value of the maxDevices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDevices() {
        return maxDevices;
    }

    /**
     * Sets the value of the maxDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDevices(String value) {
        this.maxDevices = value;
    }

    /**
     * Gets the value of the populated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopulated() {
        return populated;
    }

    /**
     * Sets the value of the populated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopulated(String value) {
        this.populated = value;
    }

    /**
     * Gets the value of the operState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperState() {
        return operState;
    }

    /**
     * Sets the value of the operState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperState(String value) {
        this.operState = value;
    }

    /**
     * Gets the value of the operability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperability() {
        return operability;
    }

    /**
     * Sets the value of the operability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperability(String value) {
        this.operability = value;
    }

    /**
     * Gets the value of the perf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerf() {
        return perf;
    }

    /**
     * Sets the value of the perf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerf(String value) {
        this.perf = value;
    }

    /**
     * Gets the value of the power property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPower() {
        return power;
    }

    /**
     * Sets the value of the power property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPower(String value) {
        this.power = value;
    }

    /**
     * Gets the value of the presence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresence() {
        return presence;
    }

    /**
     * Sets the value of the presence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresence(String value) {
        this.presence = value;
    }

    /**
     * Gets the value of the thermal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThermal() {
        return thermal;
    }

    /**
     * Sets the value of the thermal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThermal(String value) {
        this.thermal = value;
    }

    /**
     * Gets the value of the voltage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoltage(String value) {
        this.voltage = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the serial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerial() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerial(String value) {
        this.serial = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
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
