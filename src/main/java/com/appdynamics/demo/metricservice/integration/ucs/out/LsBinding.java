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
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lsBinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lsBinding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}faultInst"/>
 *       &lt;/choice>
 *       &lt;attribute name="name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[\-\.:_a-zA-Z0-9]{0,16}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pnDn" type="{}referenceObject" />
 *       &lt;attribute name="assignedToDn" type="{}referenceObject" />
 *       &lt;attribute name="computeEpDn" type="{}referenceObject" />
 *       &lt;attribute name="issues">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="((defaultValue|not-applicable|boot-order-pxe|wwnn-derivation-from-vhba|migration|wwnn-assignment|processor-requirement|physical-requirement|hostimg-policy-invalid|incompatible-number-of-local-disks|mac-derivation-virtualized-port|switch-virtual-if-capacity|invalid-wwn|insufficient-resources|compute-undiscovered|boot-configuration-invalid|incompatible-bios-image|system-uuid-assignment|server-position-requirement|destructive-local-disk-config|imgsec-policy-invalid|vnic-capacity|adaptor-requirement|mac-address-assignment|qos-policy-invalid|insufficient-power-budget|adaptor-protected-eth-capability|connection-placement|incompatible-disk-types|vhba-capacity|boot-order-san-image-path|compute-unavailable|power-group-requirement|provsrv-policy-invalid|wwpn-assignment|memory-requirement|vlan-port-capacity|bootip-policy-invalid|adaptor-fcoe-capability|wwpn-derivation-virtualized-port|incompatible-raid-level|fcoe-capacity),){0,41}(defaultValue|not-applicable|boot-order-pxe|wwnn-derivation-from-vhba|migration|wwnn-assignment|processor-requirement|physical-requirement|hostimg-policy-invalid|incompatible-number-of-local-disks|mac-derivation-virtualized-port|switch-virtual-if-capacity|invalid-wwn|insufficient-resources|compute-undiscovered|boot-configuration-invalid|incompatible-bios-image|system-uuid-assignment|server-position-requirement|destructive-local-disk-config|imgsec-policy-invalid|vnic-capacity|adaptor-requirement|mac-address-assignment|qos-policy-invalid|insufficient-power-budget|adaptor-protected-eth-capability|connection-placement|incompatible-disk-types|vhba-capacity|boot-order-san-image-path|compute-unavailable|power-group-requirement|provsrv-policy-invalid|wwpn-assignment|memory-requirement|vlan-port-capacity|bootip-policy-invalid|adaptor-fcoe-capability|wwpn-derivation-virtualized-port|incompatible-raid-level|fcoe-capacity){0,1}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="operState">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unused"/>
 *             &lt;enumeration value="used"/>
 *             &lt;enumeration value="failed-to-apply"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="restrictMigration">
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
@XmlType(name = "lsBinding", propOrder = {
    "content"
})
public class LsBinding {

    @XmlElementRef(name = "faultInst", type = JAXBElement.class, required = false)
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "pnDn")
    protected String pnDn;
    @XmlAttribute(name = "assignedToDn")
    protected String assignedToDn;
    @XmlAttribute(name = "computeEpDn")
    protected String computeEpDn;
    @XmlAttribute(name = "issues")
    protected String issues;
    @XmlAttribute(name = "operState")
    protected String operState;
    @XmlAttribute(name = "restrictMigration")
    protected String restrictMigration;
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
     * {@link String }
     * {@link JAXBElement }{@code <}{@link FaultInst }{@code >}
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
     * Gets the value of the pnDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnDn() {
        return pnDn;
    }

    /**
     * Sets the value of the pnDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnDn(String value) {
        this.pnDn = value;
    }

    /**
     * Gets the value of the assignedToDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedToDn() {
        return assignedToDn;
    }

    /**
     * Sets the value of the assignedToDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedToDn(String value) {
        this.assignedToDn = value;
    }

    /**
     * Gets the value of the computeEpDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComputeEpDn() {
        return computeEpDn;
    }

    /**
     * Sets the value of the computeEpDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComputeEpDn(String value) {
        this.computeEpDn = value;
    }

    /**
     * Gets the value of the issues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssues() {
        return issues;
    }

    /**
     * Sets the value of the issues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssues(String value) {
        this.issues = value;
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
     * Gets the value of the restrictMigration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictMigration() {
        return restrictMigration;
    }

    /**
     * Sets the value of the restrictMigration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictMigration(String value) {
        this.restrictMigration = value;
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
