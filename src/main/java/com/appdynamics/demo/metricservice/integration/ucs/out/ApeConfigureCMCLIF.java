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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for apeConfigureCMCLIF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apeConfigureCMCLIF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="cookie" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="response" type="{}YesOrNo" />
 *       &lt;attribute name="errorCode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="errorDescr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="invocationResult" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apeConfigureCMCLIF", propOrder = {
    "content"
})
public class ApeConfigureCMCLIF {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "cookie")
    protected String cookie;
    @XmlAttribute(name = "response")
    protected String response;
    @XmlAttribute(name = "errorCode")
    @XmlSchemaType(name = "unsignedInt")
    protected Long errorCode;
    @XmlAttribute(name = "errorDescr")
    protected String errorDescr;
    @XmlAttribute(name = "invocationResult")
    protected String invocationResult;

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
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescr() {
        return errorDescr;
    }

    /**
     * Sets the value of the errorDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescr(String value) {
        this.errorDescr = value;
    }

    /**
     * Gets the value of the invocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvocationResult() {
        return invocationResult;
    }

    /**
     * Sets the value of the invocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvocationResult(String value) {
        this.invocationResult = value;
    }

}
