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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for apeMcGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apeMcGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="inMcAddress" type="{}addressIPv4" />
 *       &lt;attribute name="cookie" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="response" type="{}YesOrNo" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apeMcGet", propOrder = {
    "content"
})
public class ApeMcGet {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "inMcAddress")
    protected String inMcAddress;
    @XmlAttribute(name = "cookie")
    protected String cookie;
    @XmlAttribute(name = "response")
    protected String response;

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
     * Gets the value of the inMcAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMcAddress() {
        return inMcAddress;
    }

    /**
     * Sets the value of the inMcAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMcAddress(String value) {
        this.inMcAddress = value;
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

}
