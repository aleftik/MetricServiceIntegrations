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
 * <p>Java class for capabilityCatalogue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capabilityCatalogue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}adaptorFruCapProvider"/>
 *         &lt;element ref="{}capabilityEp"/>
 *         &lt;element ref="{}diagSrvCapProvider"/>
 *         &lt;element ref="{}equipmentBaseBoardCapProvider"/>
 *         &lt;element ref="{}equipmentBladeBiosCapProvider"/>
 *         &lt;element ref="{}equipmentBladeCapProvider"/>
 *         &lt;element ref="{}equipmentCatalogCapProvider"/>
 *         &lt;element ref="{}equipmentChassisCapProvider"/>
 *         &lt;element ref="{}equipmentDbgPluginCapProvider"/>
 *         &lt;element ref="{}equipmentFanModuleCapProvider"/>
 *         &lt;element ref="{}equipmentFexCapProvider"/>
 *         &lt;element ref="{}equipmentGemCapProvider"/>
 *         &lt;element ref="{}equipmentHostIfCapProvider"/>
 *         &lt;element ref="{}equipmentIOCardCapProvider"/>
 *         &lt;element ref="{}equipmentLocalDiskCapProvider"/>
 *         &lt;element ref="{}equipmentLocalDiskControllerCapProvider"/>
 *         &lt;element ref="{}equipmentMemoryUnitCapProvider"/>
 *         &lt;element ref="{}equipmentMgmtCapProvider"/>
 *         &lt;element ref="{}equipmentMgmtExtCapProvider"/>
 *         &lt;element ref="{}equipmentPOSTCodeReporter"/>
 *         &lt;element ref="{}equipmentPOSTCodeTemplate"/>
 *         &lt;element ref="{}equipmentProcessorUnitCapProvider"/>
 *         &lt;element ref="{}equipmentPsuCapProvider"/>
 *         &lt;element ref="{}equipmentRackUnitCapProvider"/>
 *         &lt;element ref="{}equipmentSwitchCapProvider"/>
 *         &lt;element ref="{}firmwareBootDefinition"/>
 *         &lt;element ref="{}firmwareBundleTypeCapProvider"/>
 *         &lt;element ref="{}firmwareRunning"/>
 *         &lt;element ref="{}licenseFeatureCapProvider"/>
 *       &lt;/choice>
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
@XmlType(name = "capabilityCatalogue", propOrder = {
    "content"
})
public class CapabilityCatalogue {

    @XmlElementRefs({
        @XmlElementRef(name = "firmwareBootDefinition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentBaseBoardCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "adaptorFruCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentProcessorUnitCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentHostIfCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentChassisCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "capabilityEp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentLocalDiskControllerCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentPsuCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentBladeBiosCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "diagSrvCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "firmwareBundleTypeCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "licenseFeatureCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentLocalDiskCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentMgmtCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentPOSTCodeReporter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentDbgPluginCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentBladeCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentCatalogCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentIOCardCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentMgmtExtCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentFanModuleCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentGemCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentSwitchCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "firmwareRunning", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentFexCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentRackUnitCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentMemoryUnitCapProvider", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentPOSTCodeTemplate", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
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
     * {@link JAXBElement }{@code <}{@link FirmwareBootDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentBaseBoardCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link AdaptorFruCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentProcessorUnitCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentHostIfCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentChassisCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link CapabilityEp }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentLocalDiskControllerCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentPsuCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentBladeBiosCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link DiagSrvCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link FirmwareBundleTypeCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link LicenseFeatureCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentLocalDiskCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentMgmtCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentPOSTCodeReporter }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentDbgPluginCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentBladeCapProvider }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link EquipmentCatalogCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentIOCardCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentMgmtExtCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentFanModuleCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentGemCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentSwitchCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link FirmwareRunning }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentFexCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentRackUnitCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentMemoryUnitCapProvider }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentPOSTCodeTemplate }{@code >}
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