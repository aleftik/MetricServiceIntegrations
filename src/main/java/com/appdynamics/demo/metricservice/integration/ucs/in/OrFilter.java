//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.27 at 10:49:34 AM PDT 
//


package com.appdynamics.demo.metricservice.integration.ucs.in;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}abstractFilter" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orFilter", propOrder = {
    "abstractFilter"
})
public class OrFilter {

    @XmlElementRef(name = "abstractFilter", type = JAXBElement.class)
    protected List<JAXBElement<?>> abstractFilter;

    /**
     * Gets the value of the abstractFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link LtFilter }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link OrFilter }{@code >}
     * {@link JAXBElement }{@code <}{@link AndFilter }{@code >}
     * {@link JAXBElement }{@code <}{@link GtFilter }{@code >}
     * {@link JAXBElement }{@code <}{@link LtFilter }{@code >}
     * {@link JAXBElement }{@code <}{@link EqFilter }{@code >}
     * {@link JAXBElement }{@code <}{@link NeqFilter }{@code >}
     * {@link JAXBElement }{@code <}{@link NotFilter }{@code >}
     * {@link JAXBElement }{@code <}{@link GteFilter }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAbstractFilter() {
        if (abstractFilter == null) {
            abstractFilter = new ArrayList<JAXBElement<?>>();
        }
        return this.abstractFilter;
    }

}
