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
 * <p>Java class for computePsuControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="computePsuControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="clusterState">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="slot-1-master"/>
 *             &lt;enumeration value="slot-2-master"/>
 *             &lt;enumeration value="not-clustered"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="inputPowerState">
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
 *       &lt;attribute name="name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[\-\.:_a-zA-Z0-9]{0,16}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="operQualifier">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="((defaultValue|ok|redundancy-lost|redundancy-degraded|non-redundant-sufficient-resources|non-redundant-insufficient-resources),){0,5}(defaultValue|ok|redundancy-lost|redundancy-degraded|non-redundant-sufficient-resources|non-redundant-insufficient-resources){0,1}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="operState">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="ok"/>
 *             &lt;enumeration value="failed"/>
 *             &lt;enumeration value="degraded"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="outputPowerState">
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
 *       &lt;attribute name="redundancy">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unknown"/>
 *             &lt;enumeration value="non-redundant"/>
 *             &lt;enumeration value="n+1"/>
 *             &lt;enumeration value="grid"/>
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
@XmlType(name = "computePsuControl", propOrder = {
    "content"
})
public class ComputePsuControl {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "clusterState")
    protected String clusterState;
    @XmlAttribute(name = "inputPowerState")
    protected String inputPowerState;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "operQualifier")
    protected String operQualifier;
    @XmlAttribute(name = "operState")
    protected String operState;
    @XmlAttribute(name = "outputPowerState")
    protected String outputPowerState;
    @XmlAttribute(name = "redundancy")
    protected String redundancy;
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
     * Gets the value of the clusterState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterState() {
        return clusterState;
    }

    /**
     * Sets the value of the clusterState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterState(String value) {
        this.clusterState = value;
    }

    /**
     * Gets the value of the inputPowerState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputPowerState() {
        return inputPowerState;
    }

    /**
     * Sets the value of the inputPowerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputPowerState(String value) {
        this.inputPowerState = value;
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
     * Gets the value of the operQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperQualifier() {
        return operQualifier;
    }

    /**
     * Sets the value of the operQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperQualifier(String value) {
        this.operQualifier = value;
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
     * Gets the value of the outputPowerState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputPowerState() {
        return outputPowerState;
    }

    /**
     * Sets the value of the outputPowerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputPowerState(String value) {
        this.outputPowerState = value;
    }

    /**
     * Gets the value of the redundancy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedundancy() {
        return redundancy;
    }

    /**
     * Sets the value of the redundancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedundancy(String value) {
        this.redundancy = value;
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