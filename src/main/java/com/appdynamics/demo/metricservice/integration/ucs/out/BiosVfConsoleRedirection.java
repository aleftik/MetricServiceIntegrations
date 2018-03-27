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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for biosVfConsoleRedirection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="biosVfConsoleRedirection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="vpBaudRate">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="platform-recommended"/>
 *             &lt;enumeration value="9600"/>
 *             &lt;enumeration value="19200"/>
 *             &lt;enumeration value="38400"/>
 *             &lt;enumeration value="57600"/>
 *             &lt;enumeration value="115200"/>
 *             &lt;enumeration value="platform-default"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="vpConsoleRedirection">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="platform-recommended"/>
 *             &lt;enumeration value="serial-port-b"/>
 *             &lt;enumeration value="platform-default"/>
 *             &lt;enumeration value="disabled"/>
 *             &lt;enumeration value="serial-port-a"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="vpFlowControl">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="platform-recommended"/>
 *             &lt;enumeration value="platform-default"/>
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="rts-cts"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="vpLegacyOSRedirection">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="platform-recommended"/>
 *             &lt;enumeration value="platform-default"/>
 *             &lt;enumeration value="disabled"/>
 *             &lt;enumeration value="enabled"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="vpTerminalType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="platform-recommended"/>
 *             &lt;enumeration value="platform-default"/>
 *             &lt;enumeration value="pc-ansi"/>
 *             &lt;enumeration value="vt100"/>
 *             &lt;enumeration value="vt100-plus"/>
 *             &lt;enumeration value="vt-utf8"/>
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
@XmlType(name = "biosVfConsoleRedirection", propOrder = {
    "content"
})
public class BiosVfConsoleRedirection {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "vpBaudRate")
    protected String vpBaudRate;
    @XmlAttribute(name = "vpConsoleRedirection")
    protected String vpConsoleRedirection;
    @XmlAttribute(name = "vpFlowControl")
    protected String vpFlowControl;
    @XmlAttribute(name = "vpLegacyOSRedirection")
    protected String vpLegacyOSRedirection;
    @XmlAttribute(name = "vpTerminalType")
    protected String vpTerminalType;
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
     * Gets the value of the vpBaudRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpBaudRate() {
        return vpBaudRate;
    }

    /**
     * Sets the value of the vpBaudRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpBaudRate(String value) {
        this.vpBaudRate = value;
    }

    /**
     * Gets the value of the vpConsoleRedirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpConsoleRedirection() {
        return vpConsoleRedirection;
    }

    /**
     * Sets the value of the vpConsoleRedirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpConsoleRedirection(String value) {
        this.vpConsoleRedirection = value;
    }

    /**
     * Gets the value of the vpFlowControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpFlowControl() {
        return vpFlowControl;
    }

    /**
     * Sets the value of the vpFlowControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpFlowControl(String value) {
        this.vpFlowControl = value;
    }

    /**
     * Gets the value of the vpLegacyOSRedirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpLegacyOSRedirection() {
        return vpLegacyOSRedirection;
    }

    /**
     * Sets the value of the vpLegacyOSRedirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpLegacyOSRedirection(String value) {
        this.vpLegacyOSRedirection = value;
    }

    /**
     * Gets the value of the vpTerminalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpTerminalType() {
        return vpTerminalType;
    }

    /**
     * Sets the value of the vpTerminalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpTerminalType(String value) {
        this.vpTerminalType = value;
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
