//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.27 at 10:50:09 AM PDT 
//


package com.appdynamics.demo.metricservice.integration.ucs.out;

import java.io.Serializable;
import java.math.BigInteger;
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
 * <p>Java class for vnicFc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vnicFc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}fabricEthMonSrcEp"/>
 *         &lt;element ref="{}fabricFcMonSrcEp"/>
 *         &lt;element ref="{}faultInst"/>
 *         &lt;element ref="{}vnicBootTarget"/>
 *         &lt;element ref="{}vnicFcIf"/>
 *       &lt;/choice>
 *       &lt;attribute name="fltAggr" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[\-\.:_a-zA-Z0-9]{1,16}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="persBindClear">
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
 *       &lt;attribute name="adaptorProfileName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[\-\.:_a-zA-Z0-9]{0,16}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="addr">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {}addressWWN">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="derived"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="identPoolName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxDataFieldSize">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                 &lt;minInclusive value="256"/>
 *                 &lt;maxInclusive value="2112"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="nodeAddr">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {}addressWWN">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="vnic-derived"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="nwTemplName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[\-\.:_a-zA-Z0-9]{0,16}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="operAdaptorProfileName" type="{}referenceObject" />
 *       &lt;attribute name="operIdentPoolName" type="{}referenceObject" />
 *       &lt;attribute name="operNwTemplName" type="{}referenceObject" />
 *       &lt;attribute name="operQosPolicyName" type="{}referenceObject" />
 *       &lt;attribute name="persBind" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="qosPolicyName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[\-\.:_a-zA-Z0-9]{0,16}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="ether"/>
 *             &lt;enumeration value="fc"/>
 *             &lt;enumeration value="scsi"/>
 *             &lt;enumeration value="ipc"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="adminVcon">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="any"/>
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *             &lt;enumeration value="4"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="bootDev" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="configState">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="not-applied"/>
 *             &lt;enumeration value="applying"/>
 *             &lt;enumeration value="failed-to-apply"/>
 *             &lt;enumeration value="applied"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="equipmentDn" type="{}referenceObject" />
 *       &lt;attribute name="instType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="manual"/>
 *             &lt;enumeration value="default"/>
 *             &lt;enumeration value="dynamic"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="operOrder">
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
 *       &lt;attribute name="operSpeed">
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
 *       &lt;attribute name="operStatsPolicyName" type="{}referenceObject" />
 *       &lt;attribute name="operVcon">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="any"/>
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *             &lt;enumeration value="4"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="order">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *                 &lt;minInclusive value="0"/>
 *                 &lt;maxInclusive value="128"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="unspecified"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pinToGroupName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[\-\.:_a-zA-Z0-9]{0,16}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="statsPolicyName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[\-\.:_a-zA-Z0-9]{0,16}"/>
 *           &lt;/restriction>
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
 *       &lt;attribute name="owner">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="physical"/>
 *             &lt;enumeration value="policy"/>
 *             &lt;enumeration value="logical"/>
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
@XmlType(name = "vnicFc", propOrder = {
    "content"
})
public class VnicFc {

    @XmlElementRefs({
        @XmlElementRef(name = "fabricFcMonSrcEp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "faultInst", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "vnicBootTarget", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fabricEthMonSrcEp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "vnicFcIf", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "fltAggr")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger fltAggr;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "persBindClear")
    protected String persBindClear;
    @XmlAttribute(name = "adaptorProfileName")
    protected String adaptorProfileName;
    @XmlAttribute(name = "addr")
    protected String addr;
    @XmlAttribute(name = "identPoolName")
    protected String identPoolName;
    @XmlAttribute(name = "maxDataFieldSize")
    protected String maxDataFieldSize;
    @XmlAttribute(name = "nodeAddr")
    protected String nodeAddr;
    @XmlAttribute(name = "nwTemplName")
    protected String nwTemplName;
    @XmlAttribute(name = "operAdaptorProfileName")
    protected String operAdaptorProfileName;
    @XmlAttribute(name = "operIdentPoolName")
    protected String operIdentPoolName;
    @XmlAttribute(name = "operNwTemplName")
    protected String operNwTemplName;
    @XmlAttribute(name = "operQosPolicyName")
    protected String operQosPolicyName;
    @XmlAttribute(name = "persBind")
    protected String persBind;
    @XmlAttribute(name = "qosPolicyName")
    protected String qosPolicyName;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "adminVcon")
    protected String adminVcon;
    @XmlAttribute(name = "bootDev")
    protected String bootDev;
    @XmlAttribute(name = "configState")
    protected String configState;
    @XmlAttribute(name = "equipmentDn")
    protected String equipmentDn;
    @XmlAttribute(name = "instType")
    protected String instType;
    @XmlAttribute(name = "operOrder")
    protected String operOrder;
    @XmlAttribute(name = "operSpeed")
    protected String operSpeed;
    @XmlAttribute(name = "operStatsPolicyName")
    protected String operStatsPolicyName;
    @XmlAttribute(name = "operVcon")
    protected String operVcon;
    @XmlAttribute(name = "order")
    protected String order;
    @XmlAttribute(name = "pinToGroupName")
    protected String pinToGroupName;
    @XmlAttribute(name = "statsPolicyName")
    protected String statsPolicyName;
    @XmlAttribute(name = "switchId")
    protected String switchId;
    @XmlAttribute(name = "owner")
    protected String owner;
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
     * {@link JAXBElement }{@code <}{@link VnicBootTarget }{@code >}
     * {@link JAXBElement }{@code <}{@link FabricEthMonSrcEp }{@code >}
     * {@link JAXBElement }{@code <}{@link FabricFcMonSrcEp }{@code >}
     * {@link JAXBElement }{@code <}{@link FaultInst }{@code >}
     * {@link JAXBElement }{@code <}{@link VnicFcIf }{@code >}
     * {@link String }
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
     * Gets the value of the fltAggr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFltAggr() {
        return fltAggr;
    }

    /**
     * Sets the value of the fltAggr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFltAggr(BigInteger value) {
        this.fltAggr = value;
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
     * Gets the value of the persBindClear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersBindClear() {
        return persBindClear;
    }

    /**
     * Sets the value of the persBindClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersBindClear(String value) {
        this.persBindClear = value;
    }

    /**
     * Gets the value of the adaptorProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdaptorProfileName() {
        return adaptorProfileName;
    }

    /**
     * Sets the value of the adaptorProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdaptorProfileName(String value) {
        this.adaptorProfileName = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr(String value) {
        this.addr = value;
    }

    /**
     * Gets the value of the identPoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentPoolName() {
        return identPoolName;
    }

    /**
     * Sets the value of the identPoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentPoolName(String value) {
        this.identPoolName = value;
    }

    /**
     * Gets the value of the maxDataFieldSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDataFieldSize() {
        return maxDataFieldSize;
    }

    /**
     * Sets the value of the maxDataFieldSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDataFieldSize(String value) {
        this.maxDataFieldSize = value;
    }

    /**
     * Gets the value of the nodeAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeAddr() {
        return nodeAddr;
    }

    /**
     * Sets the value of the nodeAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeAddr(String value) {
        this.nodeAddr = value;
    }

    /**
     * Gets the value of the nwTemplName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNwTemplName() {
        return nwTemplName;
    }

    /**
     * Sets the value of the nwTemplName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNwTemplName(String value) {
        this.nwTemplName = value;
    }

    /**
     * Gets the value of the operAdaptorProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperAdaptorProfileName() {
        return operAdaptorProfileName;
    }

    /**
     * Sets the value of the operAdaptorProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperAdaptorProfileName(String value) {
        this.operAdaptorProfileName = value;
    }

    /**
     * Gets the value of the operIdentPoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperIdentPoolName() {
        return operIdentPoolName;
    }

    /**
     * Sets the value of the operIdentPoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperIdentPoolName(String value) {
        this.operIdentPoolName = value;
    }

    /**
     * Gets the value of the operNwTemplName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperNwTemplName() {
        return operNwTemplName;
    }

    /**
     * Sets the value of the operNwTemplName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperNwTemplName(String value) {
        this.operNwTemplName = value;
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
     * Gets the value of the persBind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersBind() {
        return persBind;
    }

    /**
     * Sets the value of the persBind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersBind(String value) {
        this.persBind = value;
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
     * Gets the value of the adminVcon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminVcon() {
        return adminVcon;
    }

    /**
     * Sets the value of the adminVcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminVcon(String value) {
        this.adminVcon = value;
    }

    /**
     * Gets the value of the bootDev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBootDev() {
        return bootDev;
    }

    /**
     * Sets the value of the bootDev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBootDev(String value) {
        this.bootDev = value;
    }

    /**
     * Gets the value of the configState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigState() {
        return configState;
    }

    /**
     * Sets the value of the configState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigState(String value) {
        this.configState = value;
    }

    /**
     * Gets the value of the equipmentDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentDn() {
        return equipmentDn;
    }

    /**
     * Sets the value of the equipmentDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentDn(String value) {
        this.equipmentDn = value;
    }

    /**
     * Gets the value of the instType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstType() {
        return instType;
    }

    /**
     * Sets the value of the instType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstType(String value) {
        this.instType = value;
    }

    /**
     * Gets the value of the operOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperOrder() {
        return operOrder;
    }

    /**
     * Sets the value of the operOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperOrder(String value) {
        this.operOrder = value;
    }

    /**
     * Gets the value of the operSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperSpeed() {
        return operSpeed;
    }

    /**
     * Sets the value of the operSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperSpeed(String value) {
        this.operSpeed = value;
    }

    /**
     * Gets the value of the operStatsPolicyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperStatsPolicyName() {
        return operStatsPolicyName;
    }

    /**
     * Sets the value of the operStatsPolicyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperStatsPolicyName(String value) {
        this.operStatsPolicyName = value;
    }

    /**
     * Gets the value of the operVcon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperVcon() {
        return operVcon;
    }

    /**
     * Sets the value of the operVcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperVcon(String value) {
        this.operVcon = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
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
     * Gets the value of the statsPolicyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatsPolicyName() {
        return statsPolicyName;
    }

    /**
     * Sets the value of the statsPolicyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatsPolicyName(String value) {
        this.statsPolicyName = value;
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
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
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
