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
 * <p>Java class for fabricEthVlanPortEp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fabricEthVlanPortEp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="isNative">
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
 *       &lt;attribute name="portId">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                 &lt;minInclusive value="1"/>
 *                 &lt;maxInclusive value="40"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="slotId">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                 &lt;minInclusive value="1"/>
 *                 &lt;maxInclusive value="5"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="switchId">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="NONE"/>
 *             &lt;enumeration value="A"/>
 *             &lt;enumeration value="B"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="transport">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="((defaultValue|unknown|ether|dce|fc),){0,4}(defaultValue|unknown|ether|dce|fc){0,1}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ifRole">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="network"/>
 *             &lt;enumeration value="server"/>
 *             &lt;enumeration value="mgmt"/>
 *             &lt;enumeration value="diag"/>
 *             &lt;enumeration value="storage"/>
 *             &lt;enumeration value="monitor"/>
 *             &lt;enumeration value="fcoe-storage"/>
 *             &lt;enumeration value="nas-storage"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="((defaultValue|unknown|lan|san|ipc),){0,4}(defaultValue|unknown|lan|san|ipc){0,1}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="adminState">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="enabled"/>
 *             &lt;enumeration value="disabled"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="locale">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="((defaultValue|unknown|server|chassis|internal|external),){0,5}(defaultValue|unknown|server|chassis|internal|external){0,1}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="epDn" type="{}referenceObject" />
 *       &lt;attribute name="ifType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="physical"/>
 *             &lt;enumeration value="aggregation"/>
 *             &lt;enumeration value="virtual"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="licGP" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="licState">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="license-ok"/>
 *             &lt;enumeration value="license-insufficient"/>
 *             &lt;enumeration value="license-graceperiod"/>
 *             &lt;enumeration value="license-expired"/>
 *             &lt;enumeration value="license-not-licensed"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="chassisId">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                 &lt;minInclusive value="0"/>
 *                 &lt;maxInclusive value="255"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="N/A"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="peerChassisId">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                 &lt;minInclusive value="0"/>
 *                 &lt;maxInclusive value="255"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="N/A"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="peerPortId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="peerSlotId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="peerDn" type="{}referenceObject" />
 *       &lt;attribute name="name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[\-\.:_a-zA-Z0-9]{0,16}"/>
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
@XmlType(name = "fabricEthVlanPortEp", propOrder = {
    "content"
})
public class FabricEthVlanPortEp {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "isNative")
    protected String isNative;
    @XmlAttribute(name = "portId")
    protected String portId;
    @XmlAttribute(name = "slotId")
    protected String slotId;
    @XmlAttribute(name = "switchId")
    protected String switchId;
    @XmlAttribute(name = "transport")
    protected String transport;
    @XmlAttribute(name = "ifRole")
    protected String ifRole;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "adminState")
    protected String adminState;
    @XmlAttribute(name = "locale")
    protected String locale;
    @XmlAttribute(name = "epDn")
    protected String epDn;
    @XmlAttribute(name = "ifType")
    protected String ifType;
    @XmlAttribute(name = "licGP")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger licGP;
    @XmlAttribute(name = "licState")
    protected String licState;
    @XmlAttribute(name = "chassisId")
    protected String chassisId;
    @XmlAttribute(name = "peerChassisId")
    protected String peerChassisId;
    @XmlAttribute(name = "peerPortId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long peerPortId;
    @XmlAttribute(name = "peerSlotId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long peerSlotId;
    @XmlAttribute(name = "peerDn")
    protected String peerDn;
    @XmlAttribute(name = "name")
    protected String name;
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
     * Gets the value of the isNative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsNative() {
        return isNative;
    }

    /**
     * Sets the value of the isNative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsNative(String value) {
        this.isNative = value;
    }

    /**
     * Gets the value of the portId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortId() {
        return portId;
    }

    /**
     * Sets the value of the portId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortId(String value) {
        this.portId = value;
    }

    /**
     * Gets the value of the slotId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotId() {
        return slotId;
    }

    /**
     * Sets the value of the slotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotId(String value) {
        this.slotId = value;
    }

    /**
     * Gets the value of the switchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchId() {
        return switchId;
    }

    /**
     * Sets the value of the switchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchId(String value) {
        this.switchId = value;
    }

    /**
     * Gets the value of the transport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransport(String value) {
        this.transport = value;
    }

    /**
     * Gets the value of the ifRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfRole() {
        return ifRole;
    }

    /**
     * Sets the value of the ifRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfRole(String value) {
        this.ifRole = value;
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
     * Gets the value of the adminState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminState() {
        return adminState;
    }

    /**
     * Sets the value of the adminState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminState(String value) {
        this.adminState = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the epDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpDn() {
        return epDn;
    }

    /**
     * Sets the value of the epDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpDn(String value) {
        this.epDn = value;
    }

    /**
     * Gets the value of the ifType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfType() {
        return ifType;
    }

    /**
     * Sets the value of the ifType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfType(String value) {
        this.ifType = value;
    }

    /**
     * Gets the value of the licGP property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLicGP() {
        return licGP;
    }

    /**
     * Sets the value of the licGP property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLicGP(BigInteger value) {
        this.licGP = value;
    }

    /**
     * Gets the value of the licState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicState() {
        return licState;
    }

    /**
     * Sets the value of the licState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicState(String value) {
        this.licState = value;
    }

    /**
     * Gets the value of the chassisId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassisId() {
        return chassisId;
    }

    /**
     * Sets the value of the chassisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassisId(String value) {
        this.chassisId = value;
    }

    /**
     * Gets the value of the peerChassisId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeerChassisId() {
        return peerChassisId;
    }

    /**
     * Sets the value of the peerChassisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeerChassisId(String value) {
        this.peerChassisId = value;
    }

    /**
     * Gets the value of the peerPortId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeerPortId() {
        return peerPortId;
    }

    /**
     * Sets the value of the peerPortId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeerPortId(Long value) {
        this.peerPortId = value;
    }

    /**
     * Gets the value of the peerSlotId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeerSlotId() {
        return peerSlotId;
    }

    /**
     * Sets the value of the peerSlotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeerSlotId(Long value) {
        this.peerSlotId = value;
    }

    /**
     * Gets the value of the peerDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeerDn() {
        return peerDn;
    }

    /**
     * Sets the value of the peerDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeerDn(String value) {
        this.peerDn = value;
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
