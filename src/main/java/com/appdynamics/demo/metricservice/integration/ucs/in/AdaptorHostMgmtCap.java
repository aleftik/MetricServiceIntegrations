//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.27 at 10:49:34 AM PDT 
//


package com.appdynamics.demo.metricservice.integration.ucs.in;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for adaptorHostMgmtCap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adaptorHostMgmtCap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="preboot" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operPowerRequirement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rebootActionOnDestructive" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "adaptorHostMgmtCap", propOrder = {
    "content"
})
public class AdaptorHostMgmtCap {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "preboot")
    protected String preboot;
    @XmlAttribute(name = "mode")
    protected String mode;
    @XmlAttribute(name = "operPowerRequirement")
    protected String operPowerRequirement;
    @XmlAttribute(name = "rebootActionOnDestructive")
    protected String rebootActionOnDestructive;
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
     * Gets the value of the preboot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreboot() {
        return preboot;
    }

    /**
     * Sets the value of the preboot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreboot(String value) {
        this.preboot = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the operPowerRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperPowerRequirement() {
        return operPowerRequirement;
    }

    /**
     * Sets the value of the operPowerRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperPowerRequirement(String value) {
        this.operPowerRequirement = value;
    }

    /**
     * Gets the value of the rebootActionOnDestructive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebootActionOnDestructive() {
        return rebootActionOnDestructive;
    }

    /**
     * Sets the value of the rebootActionOnDestructive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebootActionOnDestructive(String value) {
        this.rebootActionOnDestructive = value;
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