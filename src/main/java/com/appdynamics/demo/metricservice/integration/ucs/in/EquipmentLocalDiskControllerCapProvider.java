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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for equipmentLocalDiskControllerCapProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="equipmentLocalDiskControllerCapProvider">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}equipmentLocalDiskControllerDef"/>
 *         &lt;element ref="{}equipmentManufacturingDef"/>
 *         &lt;element ref="{}equipmentPciDef"/>
 *         &lt;element ref="{}equipmentPhysicalDef"/>
 *         &lt;element ref="{}equipmentPicture"/>
 *         &lt;element ref="{}equipmentRaidDef"/>
 *         &lt;element ref="{}equipmentServiceDef"/>
 *         &lt;element ref="{}equipmentSlotArrayRef"/>
 *         &lt;element ref="{}firmwareType"/>
 *       &lt;/choice>
 *       &lt;attribute name="model">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="510"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="revision">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="510"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="vendor">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="510"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="promCardType" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
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
@XmlType(name = "equipmentLocalDiskControllerCapProvider", propOrder = {
    "content"
})
public class EquipmentLocalDiskControllerCapProvider {

    @XmlElementRefs({
        @XmlElementRef(name = "equipmentPciDef", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "firmwareType", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentSlotArrayRef", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentLocalDiskControllerDef", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentManufacturingDef", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentPhysicalDef", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentPicture", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentServiceDef", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equipmentRaidDef", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "model")
    protected String model;
    @XmlAttribute(name = "revision")
    protected String revision;
    @XmlAttribute(name = "vendor")
    protected String vendor;
    @XmlAttribute(name = "promCardType")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer promCardType;
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
     * {@link JAXBElement }{@code <}{@link EquipmentPciDef }{@code >}
     * {@link JAXBElement }{@code <}{@link FirmwareType }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentSlotArrayRef }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link EquipmentLocalDiskControllerDef }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentManufacturingDef }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentPhysicalDef }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentPicture }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentServiceDef }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentRaidDef }{@code >}
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
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the promCardType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPromCardType() {
        return promCardType;
    }

    /**
     * Sets the value of the promCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPromCardType(Integer value) {
        this.promCardType = value;
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
