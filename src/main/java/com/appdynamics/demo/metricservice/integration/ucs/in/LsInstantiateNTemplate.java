//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.27 at 10:49:34 AM PDT 
//


package com.appdynamics.demo.metricservice.integration.ucs.in;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for lsInstantiateNTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lsInstantiateNTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="inTargetOrg" type="{}referenceObject" />
 *       &lt;attribute name="inServerNamePrefixOrEmpty">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[\-\.:_a-zA-Z0-9]{0,16}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="inNumberOf" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="inHierarchical">
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
 *       &lt;attribute name="cookie" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="response" type="{}YesOrNo" />
 *       &lt;attribute name="dn" type="{}referenceObject" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lsInstantiateNTemplate", propOrder = {
    "content"
})
public class LsInstantiateNTemplate {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "inTargetOrg")
    protected String inTargetOrg;
    @XmlAttribute(name = "inServerNamePrefixOrEmpty")
    protected String inServerNamePrefixOrEmpty;
    @XmlAttribute(name = "inNumberOf")
    @XmlSchemaType(name = "unsignedByte")
    protected Short inNumberOf;
    @XmlAttribute(name = "inHierarchical")
    protected String inHierarchical;
    @XmlAttribute(name = "cookie")
    protected String cookie;
    @XmlAttribute(name = "response")
    protected String response;
    @XmlAttribute(name = "dn")
    protected String dn;

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
     * Gets the value of the inTargetOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTargetOrg() {
        return inTargetOrg;
    }

    /**
     * Sets the value of the inTargetOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTargetOrg(String value) {
        this.inTargetOrg = value;
    }

    /**
     * Gets the value of the inServerNamePrefixOrEmpty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInServerNamePrefixOrEmpty() {
        return inServerNamePrefixOrEmpty;
    }

    /**
     * Sets the value of the inServerNamePrefixOrEmpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInServerNamePrefixOrEmpty(String value) {
        this.inServerNamePrefixOrEmpty = value;
    }

    /**
     * Gets the value of the inNumberOf property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getInNumberOf() {
        return inNumberOf;
    }

    /**
     * Sets the value of the inNumberOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setInNumberOf(Short value) {
        this.inNumberOf = value;
    }

    /**
     * Gets the value of the inHierarchical property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHierarchical() {
        return inHierarchical;
    }

    /**
     * Sets the value of the inHierarchical property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHierarchical(String value) {
        this.inHierarchical = value;
    }

    /**
     * Gets the value of the cookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCookie() {
        return cookie;
    }

    /**
     * Sets the value of the cookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCookie(String value) {
        this.cookie = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
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

}