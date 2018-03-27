//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.27 at 10:49:34 AM PDT 
//


package com.appdynamics.demo.metricservice.integration.ucs.in;

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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extmgmtIfMonPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extmgmtIfMonPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}extmgmtArpTargets"/>
 *         &lt;element ref="{}extmgmtGatewayPing"/>
 *         &lt;element ref="{}extmgmtMiiStatus"/>
 *       &lt;/choice>
 *       &lt;attribute name="adminState">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="enabled"/>
 *             &lt;enumeration value="disabled"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="enableHAFailover">
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
 *       &lt;attribute name="maxFailReportCount">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                 &lt;minInclusive value="2"/>
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
 *       &lt;attribute name="monitorMechanism" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pollInterval">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                 &lt;minInclusive value="90"/>
 *                 &lt;maxInclusive value="300"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
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
@XmlType(name = "extmgmtIfMonPolicy", propOrder = {
    "content"
})
public class ExtmgmtIfMonPolicy {

    @XmlElementRefs({
        @XmlElementRef(name = "extmgmtArpTargets", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extmgmtGatewayPing", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extmgmtMiiStatus", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "adminState")
    protected String adminState;
    @XmlAttribute(name = "enableHAFailover")
    protected String enableHAFailover;
    @XmlAttribute(name = "maxFailReportCount")
    protected String maxFailReportCount;
    @XmlAttribute(name = "monitorMechanism")
    protected String monitorMechanism;
    @XmlAttribute(name = "pollInterval")
    protected String pollInterval;
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
     * {@link JAXBElement }{@code <}{@link ExtmgmtArpTargets }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link ExtmgmtGatewayPing }{@code >}
     * {@link JAXBElement }{@code <}{@link ExtmgmtMiiStatus }{@code >}
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
     * Gets the value of the enableHAFailover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableHAFailover() {
        return enableHAFailover;
    }

    /**
     * Sets the value of the enableHAFailover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableHAFailover(String value) {
        this.enableHAFailover = value;
    }

    /**
     * Gets the value of the maxFailReportCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxFailReportCount() {
        return maxFailReportCount;
    }

    /**
     * Sets the value of the maxFailReportCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxFailReportCount(String value) {
        this.maxFailReportCount = value;
    }

    /**
     * Gets the value of the monitorMechanism property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitorMechanism() {
        return monitorMechanism;
    }

    /**
     * Sets the value of the monitorMechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitorMechanism(String value) {
        this.monitorMechanism = value;
    }

    /**
     * Gets the value of the pollInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPollInterval() {
        return pollInterval;
    }

    /**
     * Sets the value of the pollInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPollInterval(String value) {
        this.pollInterval = value;
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
