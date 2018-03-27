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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for topSystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="topSystem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}aaaAuthRealm"/>
 *         &lt;element ref="{}aaaLdapEp"/>
 *         &lt;element ref="{}aaaRadiusEp"/>
 *         &lt;element ref="{}aaaTacacsPlusEp"/>
 *         &lt;element ref="{}aaaUserEp"/>
 *         &lt;element ref="{}commSvcEp"/>
 *         &lt;element ref="{}computeRackUnit"/>
 *         &lt;element ref="{}equipmentChassis"/>
 *         &lt;element ref="{}equipmentFex"/>
 *         &lt;element ref="{}extmgmtIfMonPolicy"/>
 *         &lt;element ref="{}extvmmEp"/>
 *         &lt;element ref="{}firmwareCatalogue"/>
 *         &lt;element ref="{}licenseEp"/>
 *         &lt;element ref="{}mgmtAccessPolicy"/>
 *         &lt;element ref="{}mgmtBackup"/>
 *         &lt;element ref="{}mgmtController"/>
 *         &lt;element ref="{}mgmtEntity"/>
 *         &lt;element ref="{}mgmtImporter"/>
 *         &lt;element ref="{}mgmtIntAuthPolicy"/>
 *         &lt;element ref="{}networkElement"/>
 *         &lt;element ref="{}pkiEp"/>
 *         &lt;element ref="{}powerEp"/>
 *         &lt;element ref="{}swatInjection"/>
 *         &lt;element ref="{}syntheticDirectory"/>
 *         &lt;element ref="{}syntheticFsObj"/>
 *         &lt;element ref="{}sysdebugCoreFileRepository"/>
 *         &lt;element ref="{}sysdebugEp"/>
 *         &lt;element ref="{}sysdebugTechSupFileRepository"/>
 *         &lt;element ref="{}trigMeta"/>
 *         &lt;element ref="{}trigSched"/>
 *       &lt;/choice>
 *       &lt;attribute name="address" type="{}addressIPv4" />
 *       &lt;attribute name="currentTime" type="{}dateTime" />
 *       &lt;attribute name="mode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unspecified"/>
 *             &lt;enumeration value="stand-alone"/>
 *             &lt;enumeration value="cluster"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[a-zA-Z][a-zA-Z0-9-]{0,29}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="systemUpTime" type="{}timeInSeconds" />
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
@XmlType(name = "topSystem", propOrder = {
    "content"
})
public class TopSystem {

    @XmlElementRefs({
        @XmlElementRef(name = "syntheticFsObj", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commSvcEp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentChassis", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "aaaUserEp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mgmtAccessPolicy", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "trigSched", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "networkElement", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "syntheticDirectory", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "licenseEp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mgmtImporter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "firmwareCatalogue", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "aaaRadiusEp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "computeRackUnit", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sysdebugEp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mgmtController", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mgmtIntAuthPolicy", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "trigMeta", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pkiEp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "swatInjection", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "aaaAuthRealm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extvmmEp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentFex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "aaaTacacsPlusEp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "powerEp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sysdebugCoreFileRepository", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sysdebugTechSupFileRepository", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mgmtEntity", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "aaaLdapEp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extmgmtIfMonPolicy", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mgmtBackup", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "address")
    protected String address;
    @XmlAttribute(name = "currentTime")
    protected String currentTime;
    @XmlAttribute(name = "mode")
    protected String mode;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "systemUpTime")
    protected String systemUpTime;
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
     * {@link JAXBElement }{@code <}{@link SyntheticFsObj }{@code >}
     * {@link JAXBElement }{@code <}{@link CommSvcEp }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentChassis }{@code >}
     * {@link JAXBElement }{@code <}{@link AaaUserEp }{@code >}
     * {@link JAXBElement }{@code <}{@link MgmtAccessPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link TrigSched }{@code >}
     * {@link JAXBElement }{@code <}{@link NetworkElement }{@code >}
     * {@link JAXBElement }{@code <}{@link SyntheticDirectory }{@code >}
     * {@link JAXBElement }{@code <}{@link LicenseEp }{@code >}
     * {@link JAXBElement }{@code <}{@link MgmtImporter }{@code >}
     * {@link JAXBElement }{@code <}{@link FirmwareCatalogue }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link AaaRadiusEp }{@code >}
     * {@link JAXBElement }{@code <}{@link ComputeRackUnit }{@code >}
     * {@link JAXBElement }{@code <}{@link SysdebugEp }{@code >}
     * {@link JAXBElement }{@code <}{@link MgmtController }{@code >}
     * {@link JAXBElement }{@code <}{@link MgmtIntAuthPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link TrigMeta }{@code >}
     * {@link JAXBElement }{@code <}{@link PkiEp }{@code >}
     * {@link JAXBElement }{@code <}{@link SwatInjection }{@code >}
     * {@link JAXBElement }{@code <}{@link AaaAuthRealm }{@code >}
     * {@link JAXBElement }{@code <}{@link ExtvmmEp }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentFex }{@code >}
     * {@link JAXBElement }{@code <}{@link AaaTacacsPlusEp }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerEp }{@code >}
     * {@link JAXBElement }{@code <}{@link SysdebugCoreFileRepository }{@code >}
     * {@link JAXBElement }{@code <}{@link SysdebugTechSupFileRepository }{@code >}
     * {@link JAXBElement }{@code <}{@link MgmtEntity }{@code >}
     * {@link JAXBElement }{@code <}{@link AaaLdapEp }{@code >}
     * {@link JAXBElement }{@code <}{@link ExtmgmtIfMonPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link MgmtBackup }{@code >}
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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the currentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentTime() {
        return currentTime;
    }

    /**
     * Sets the value of the currentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentTime(String value) {
        this.currentTime = value;
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
     * Gets the value of the systemUpTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemUpTime() {
        return systemUpTime;
    }

    /**
     * Sets the value of the systemUpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemUpTime(String value) {
        this.systemUpTime = value;
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