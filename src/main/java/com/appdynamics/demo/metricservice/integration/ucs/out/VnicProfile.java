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
 * <p>Java class for vnicProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vnicProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}faultInst"/>
 *         &lt;element ref="{}vmVnicProfCl"/>
 *         &lt;element ref="{}vnicEtherIf"/>
 *         &lt;element ref="{}vnicProfileAlias"/>
 *       &lt;/choice>
 *       &lt;attribute name="burst">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                 &lt;minInclusive value="0"/>
 *                 &lt;maxInclusive value="65535"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="cdp">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="disabled"/>
 *             &lt;enumeration value="enabled"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="cos">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *                 &lt;minInclusive value="0"/>
 *                 &lt;maxInclusive value="6"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *                 &lt;minInclusive value="255"/>
 *                 &lt;maxInclusive value="255"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="any"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="forgeMac">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="allow"/>
 *             &lt;enumeration value="deny"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="hostNwIOPerf">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="high-perf-reqd"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="maxPorts">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *                 &lt;minInclusive value="1"/>
 *                 &lt;maxInclusive value="4096"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[\-\.:_a-zA-Z0-9]{1,31}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="nwCtrlPolicyName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[\-\.:_a-zA-Z0-9]{0,16}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="operNwCtrlPolicyName" type="{}referenceObject" />
 *       &lt;attribute name="operQosPolicyName" type="{}referenceObject" />
 *       &lt;attribute name="pinToGroupName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[\-\.:_a-zA-Z0-9]{0,16}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="primaryVlanId">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                 &lt;minInclusive value="1"/>
 *                 &lt;maxInclusive value="4093"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="qosPolicyId">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedInt">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="none"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="qosPolicyName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[\-\.:_a-zA-Z0-9]{0,16}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rate">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                 &lt;minInclusive value="0"/>
 *                 &lt;maxInclusive value="10000000"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="line-rate"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="swABorderPort" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="swABorderSlot" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="swBBorderPort" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="swBBorderSlot" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="uplinkFailAction">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="link-down"/>
 *             &lt;enumeration value="warning"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="descr">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[ !#$%&amp;\(\)\*\+,\-\./:;\?@\[\]_\{\|\}~a-zA-Z0-9]{0,256}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="intId">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedInt">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="none"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
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
@XmlType(name = "vnicProfile", propOrder = {
    "content"
})
public class VnicProfile {

    @XmlElementRefs({
        @XmlElementRef(name = "vmVnicProfCl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "faultInst", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "vnicProfileAlias", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "vnicEtherIf", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "burst")
    protected String burst;
    @XmlAttribute(name = "cdp")
    protected String cdp;
    @XmlAttribute(name = "cos")
    protected String cos;
    @XmlAttribute(name = "forgeMac")
    protected String forgeMac;
    @XmlAttribute(name = "hostNwIOPerf")
    protected String hostNwIOPerf;
    @XmlAttribute(name = "maxPorts")
    protected String maxPorts;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "nwCtrlPolicyName")
    protected String nwCtrlPolicyName;
    @XmlAttribute(name = "operNwCtrlPolicyName")
    protected String operNwCtrlPolicyName;
    @XmlAttribute(name = "operQosPolicyName")
    protected String operQosPolicyName;
    @XmlAttribute(name = "pinToGroupName")
    protected String pinToGroupName;
    @XmlAttribute(name = "primaryVlanId")
    protected String primaryVlanId;
    @XmlAttribute(name = "qosPolicyId")
    protected String qosPolicyId;
    @XmlAttribute(name = "qosPolicyName")
    protected String qosPolicyName;
    @XmlAttribute(name = "rate")
    protected String rate;
    @XmlAttribute(name = "swABorderPort")
    @XmlSchemaType(name = "unsignedInt")
    protected Long swABorderPort;
    @XmlAttribute(name = "swABorderSlot")
    @XmlSchemaType(name = "unsignedInt")
    protected Long swABorderSlot;
    @XmlAttribute(name = "swBBorderPort")
    @XmlSchemaType(name = "unsignedInt")
    protected Long swBBorderPort;
    @XmlAttribute(name = "swBBorderSlot")
    @XmlSchemaType(name = "unsignedInt")
    protected Long swBBorderSlot;
    @XmlAttribute(name = "uplinkFailAction")
    protected String uplinkFailAction;
    @XmlAttribute(name = "descr")
    protected String descr;
    @XmlAttribute(name = "intId")
    protected String intId;
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
     * {@link JAXBElement }{@code <}{@link VmVnicProfCl }{@code >}
     * {@link JAXBElement }{@code <}{@link FaultInst }{@code >}
     * {@link JAXBElement }{@code <}{@link VnicProfileAlias }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link VnicEtherIf }{@code >}
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
     * Gets the value of the burst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBurst() {
        return burst;
    }

    /**
     * Sets the value of the burst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBurst(String value) {
        this.burst = value;
    }

    /**
     * Gets the value of the cdp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdp() {
        return cdp;
    }

    /**
     * Sets the value of the cdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdp(String value) {
        this.cdp = value;
    }

    /**
     * Gets the value of the cos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCos() {
        return cos;
    }

    /**
     * Sets the value of the cos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCos(String value) {
        this.cos = value;
    }

    /**
     * Gets the value of the forgeMac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForgeMac() {
        return forgeMac;
    }

    /**
     * Sets the value of the forgeMac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForgeMac(String value) {
        this.forgeMac = value;
    }

    /**
     * Gets the value of the hostNwIOPerf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostNwIOPerf() {
        return hostNwIOPerf;
    }

    /**
     * Sets the value of the hostNwIOPerf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostNwIOPerf(String value) {
        this.hostNwIOPerf = value;
    }

    /**
     * Gets the value of the maxPorts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPorts() {
        return maxPorts;
    }

    /**
     * Sets the value of the maxPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPorts(String value) {
        this.maxPorts = value;
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
     * Gets the value of the nwCtrlPolicyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNwCtrlPolicyName() {
        return nwCtrlPolicyName;
    }

    /**
     * Sets the value of the nwCtrlPolicyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNwCtrlPolicyName(String value) {
        this.nwCtrlPolicyName = value;
    }

    /**
     * Gets the value of the operNwCtrlPolicyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperNwCtrlPolicyName() {
        return operNwCtrlPolicyName;
    }

    /**
     * Sets the value of the operNwCtrlPolicyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperNwCtrlPolicyName(String value) {
        this.operNwCtrlPolicyName = value;
    }

    /**
     * Gets the value of the operQosPolicyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperQosPolicyName() {
        return operQosPolicyName;
    }

    /**
     * Sets the value of the operQosPolicyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperQosPolicyName(String value) {
        this.operQosPolicyName = value;
    }

    /**
     * Gets the value of the pinToGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinToGroupName() {
        return pinToGroupName;
    }

    /**
     * Sets the value of the pinToGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinToGroupName(String value) {
        this.pinToGroupName = value;
    }

    /**
     * Gets the value of the primaryVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryVlanId() {
        return primaryVlanId;
    }

    /**
     * Sets the value of the primaryVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryVlanId(String value) {
        this.primaryVlanId = value;
    }

    /**
     * Gets the value of the qosPolicyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQosPolicyId() {
        return qosPolicyId;
    }

    /**
     * Sets the value of the qosPolicyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQosPolicyId(String value) {
        this.qosPolicyId = value;
    }

    /**
     * Gets the value of the qosPolicyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQosPolicyName() {
        return qosPolicyName;
    }

    /**
     * Sets the value of the qosPolicyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQosPolicyName(String value) {
        this.qosPolicyName = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * Gets the value of the swABorderPort property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSwABorderPort() {
        return swABorderPort;
    }

    /**
     * Sets the value of the swABorderPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSwABorderPort(Long value) {
        this.swABorderPort = value;
    }

    /**
     * Gets the value of the swABorderSlot property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSwABorderSlot() {
        return swABorderSlot;
    }

    /**
     * Sets the value of the swABorderSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSwABorderSlot(Long value) {
        this.swABorderSlot = value;
    }

    /**
     * Gets the value of the swBBorderPort property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSwBBorderPort() {
        return swBBorderPort;
    }

    /**
     * Sets the value of the swBBorderPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSwBBorderPort(Long value) {
        this.swBBorderPort = value;
    }

    /**
     * Gets the value of the swBBorderSlot property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSwBBorderSlot() {
        return swBBorderSlot;
    }

    /**
     * Sets the value of the swBBorderSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSwBBorderSlot(Long value) {
        this.swBBorderSlot = value;
    }

    /**
     * Gets the value of the uplinkFailAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUplinkFailAction() {
        return uplinkFailAction;
    }

    /**
     * Sets the value of the uplinkFailAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUplinkFailAction(String value) {
        this.uplinkFailAction = value;
    }

    /**
     * Gets the value of the descr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescr() {
        return descr;
    }

    /**
     * Sets the value of the descr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescr(String value) {
        this.descr = value;
    }

    /**
     * Gets the value of the intId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntId() {
        return intId;
    }

    /**
     * Sets the value of the intId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntId(String value) {
        this.intId = value;
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