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
 * <p>Java class for commSvcEp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commSvcEp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}commCimxml"/>
 *         &lt;element ref="{}commDateTime"/>
 *         &lt;element ref="{}commDns"/>
 *         &lt;element ref="{}commEvtChannel"/>
 *         &lt;element ref="{}commHttp"/>
 *         &lt;element ref="{}commHttps"/>
 *         &lt;element ref="{}commSmashCLP"/>
 *         &lt;element ref="{}commSnmp"/>
 *         &lt;element ref="{}commSsh"/>
 *         &lt;element ref="{}commSyslog"/>
 *         &lt;element ref="{}commTelnet"/>
 *         &lt;element ref="{}commWebChannel"/>
 *         &lt;element ref="{}commWsman"/>
 *         &lt;element ref="{}commXmlClConnPolicy"/>
 *       &lt;/choice>
 *       &lt;attribute name="name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[\-\.:_a-zA-Z0-9]{0,16}"/>
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
@XmlType(name = "commSvcEp", propOrder = {
    "content"
})
public class CommSvcEp {

    @XmlElementRefs({
        @XmlElementRef(name = "commHttps", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commXmlClConnPolicy", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commWsman", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commHttp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commSnmp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commTelnet", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commCimxml", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commWebChannel", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commDns", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commEvtChannel", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commDateTime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commSmashCLP", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commSyslog", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commSsh", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "descr")
    protected String descr;
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
     * {@link JAXBElement }{@code <}{@link CommHttps }{@code >}
     * {@link JAXBElement }{@code <}{@link CommXmlClConnPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link CommWsman }{@code >}
     * {@link JAXBElement }{@code <}{@link CommHttp }{@code >}
     * {@link JAXBElement }{@code <}{@link CommSnmp }{@code >}
     * {@link JAXBElement }{@code <}{@link CommTelnet }{@code >}
     * {@link JAXBElement }{@code <}{@link CommCimxml }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link CommWebChannel }{@code >}
     * {@link JAXBElement }{@code <}{@link CommDns }{@code >}
     * {@link JAXBElement }{@code <}{@link CommEvtChannel }{@code >}
     * {@link JAXBElement }{@code <}{@link CommDateTime }{@code >}
     * {@link JAXBElement }{@code <}{@link CommSmashCLP }{@code >}
     * {@link JAXBElement }{@code <}{@link CommSyslog }{@code >}
     * {@link JAXBElement }{@code <}{@link CommSsh }{@code >}
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
