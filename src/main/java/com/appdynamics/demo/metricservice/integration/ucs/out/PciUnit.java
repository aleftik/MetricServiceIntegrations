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
 * <p>Java class for pciUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pciUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="pciAddr">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="510"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pciSlot">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="510"/>
 *           &lt;/restriction>
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
@XmlType(name = "pciUnit", propOrder = {
    "content"
})
public class PciUnit {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long id;
    @XmlAttribute(name = "pciAddr")
    protected String pciAddr;
    @XmlAttribute(name = "pciSlot")
    protected String pciSlot;
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
     * Gets the value of the pciAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPciAddr() {
        return pciAddr;
    }

    /**
     * Sets the value of the pciAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPciAddr(String value) {
        this.pciAddr = value;
    }

    /**
     * Gets the value of the pciSlot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPciSlot() {
        return pciSlot;
    }

    /**
     * Sets the value of the pciSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPciSlot(String value) {
        this.pciSlot = value;
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
