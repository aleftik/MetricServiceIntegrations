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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for firmwareImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="firmwareImage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}eventInst"/>
 *         &lt;element ref="{}faultInst"/>
 *         &lt;element ref="{}firmwareImageFsmTask"/>
 *         &lt;element ref="{}firmwareInstallable"/>
 *       &lt;/choice>
 *       &lt;attribute name="adminState">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="active"/>
 *             &lt;enumeration value="deleted"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="checksum">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="510"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="downloadDate" type="{}dateTime" />
 *       &lt;attribute name="fsmDescr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fsmPrev">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="nop"/>
 *             &lt;enumeration value="DeleteBegin"/>
 *             &lt;enumeration value="DeleteLocal"/>
 *             &lt;enumeration value="DeleteRemote"/>
 *             &lt;enumeration value="DeleteFail"/>
 *             &lt;enumeration value="DeleteSuccess"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fsmProgr">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *                 &lt;minInclusive value="0"/>
 *                 &lt;maxInclusive value="100"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fsmRmtInvErrCode">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}unsignedInt">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="none"/>
 *                 &lt;enumeration value="ERR-MO-illegal-iterator-state"/>
 *                 &lt;enumeration value="ERR-MO-illegal-object-lifecycle-transition"/>
 *                 &lt;enumeration value="ERR-MO-object-not-found"/>
 *                 &lt;enumeration value="ERR-MO-duplicate-object"/>
 *                 &lt;enumeration value="ERR-MO-naming-rule-violation"/>
 *                 &lt;enumeration value="ERR-MO-illegal-creation"/>
 *                 &lt;enumeration value="ERR-MO-illegal-containment"/>
 *                 &lt;enumeration value="ERR-MO-deletion-rule-violation"/>
 *                 &lt;enumeration value="ERR-MO-PROPERTY-value-out-of-range"/>
 *                 &lt;enumeration value="ERR-MO-PROPERTY-no-such-property"/>
 *                 &lt;enumeration value="ERR-MO-META-no-such-object-class"/>
 *                 &lt;enumeration value="ERR-MO-CONFIG-child-object-cant-be-configured"/>
 *                 &lt;enumeration value="ERR-FILTER-illegal-format"/>
 *                 &lt;enumeration value="ERR-MO-resource-allocation"/>
 *                 &lt;enumeration value="ERR-FSM-no-such-state"/>
 *                 &lt;enumeration value="ERR-MO-access-denied"/>
 *                 &lt;enumeration value="ERR-test-error-1"/>
 *                 &lt;enumeration value="ERR-test-error-2"/>
 *                 &lt;enumeration value="ERR-HOST-fru-identity-mismatch"/>
 *                 &lt;enumeration value="ERR-IBMC-connect-error"/>
 *                 &lt;enumeration value="ERR-IBMC-fru-retrieval-error"/>
 *                 &lt;enumeration value="ERR-IBMC-invalid-end-point-config"/>
 *                 &lt;enumeration value="ERR-SWITCH-invalid-if-config"/>
 *                 &lt;enumeration value="ERR-DNLD-authentication-failure"/>
 *                 &lt;enumeration value="ERR-DNLD-invalid-image"/>
 *                 &lt;enumeration value="ERR-DNLD-no-space"/>
 *                 &lt;enumeration value="ERR-DNLD-no-file"/>
 *                 &lt;enumeration value="ERR-radius-group-set-error"/>
 *                 &lt;enumeration value="ERR-ldap-group-set-error"/>
 *                 &lt;enumeration value="ERR-tacacs-group-set-error"/>
 *                 &lt;enumeration value="ERR-tacacs-enable-error"/>
 *                 &lt;enumeration value="ERR-radius-set-error"/>
 *                 &lt;enumeration value="ERR-radius-global-set-error"/>
 *                 &lt;enumeration value="ERR-tacacs-set-error"/>
 *                 &lt;enumeration value="ERR-tacacs-global-set-error"/>
 *                 &lt;enumeration value="ERR-ldap-get-error"/>
 *                 &lt;enumeration value="ERR-ldap-delete-error"/>
 *                 &lt;enumeration value="ERR-ldap-set-error"/>
 *                 &lt;enumeration value="ERR-acct-realm-set-error"/>
 *                 &lt;enumeration value="ERR-auth-realm-set-error"/>
 *                 &lt;enumeration value="ERR-role-set-error"/>
 *                 &lt;enumeration value="ERR-locale-set-error"/>
 *                 &lt;enumeration value="ERR-user-set-error"/>
 *                 &lt;enumeration value="ERR-NTP-set-error"/>
 *                 &lt;enumeration value="ERR-NTP-get-error"/>
 *                 &lt;enumeration value="ERR-NTP-delete-error"/>
 *                 &lt;enumeration value="ERR-DNS-set-error"/>
 *                 &lt;enumeration value="ERR-DNS-get-error"/>
 *                 &lt;enumeration value="ERR-DNS-delete-error"/>
 *                 &lt;enumeration value="ERR-UPDATE-in-progress"/>
 *                 &lt;enumeration value="ERR-UPDATE-failed"/>
 *                 &lt;enumeration value="ERR-UPDATE-retry"/>
 *                 &lt;enumeration value="ERR-admin-passwd-set"/>
 *                 &lt;enumeration value="ERR-delete-user"/>
 *                 &lt;enumeration value="ERR-create-user"/>
 *                 &lt;enumeration value="ERR-modify-user"/>
 *                 &lt;enumeration value="ERR-modify-role"/>
 *                 &lt;enumeration value="ERR-modify-locale"/>
 *                 &lt;enumeration value="ERR-modify-user-role"/>
 *                 &lt;enumeration value="ERR-modify-user-locale"/>
 *                 &lt;enumeration value="ERR-HTTP-set-error"/>
 *                 &lt;enumeration value="ERR-HTTPS-set-error"/>
 *                 &lt;enumeration value="ERR-timezone-set-error"/>
 *                 &lt;enumeration value="ERR-set-network"/>
 *                 &lt;enumeration value="ERR-set-port-channel"/>
 *                 &lt;enumeration value="ERR-BIOS-network-boot-order-not-found"/>
 *                 &lt;enumeration value="ERR-authentication"/>
 *                 &lt;enumeration value="ERR-authorization-required"/>
 *                 &lt;enumeration value="ERR-user-account-expired"/>
 *                 &lt;enumeration value="ERR-session-cache-full"/>
 *                 &lt;enumeration value="ERR-session-not-found"/>
 *                 &lt;enumeration value="ERR-service-not-ready"/>
 *                 &lt;enumeration value="ERR-internal-error"/>
 *                 &lt;enumeration value="ERR-create-role"/>
 *                 &lt;enumeration value="ERR-create-locale"/>
 *                 &lt;enumeration value="ERR-Diagnostics-in-progress"/>
 *                 &lt;enumeration value="ERR-Diagnostics-memtest-in-progress"/>
 *                 &lt;enumeration value="ERR-Diagnostics-network-in-progress"/>
 *                 &lt;enumeration value="ERR-delete-role"/>
 *                 &lt;enumeration value="ERR-delete-locale"/>
 *                 &lt;enumeration value="ERR-efi-Diagnostics--in-progress"/>
 *                 &lt;enumeration value="ERR-delete-session"/>
 *                 &lt;enumeration value="ERR-DNLD-hostkey-mismatch"/>
 *                 &lt;enumeration value="ERR-IBMC-results-not-ready"/>
 *                 &lt;enumeration value="ERR-IBMC-analyze-results"/>
 *                 &lt;enumeration value="ERR-create-keyring"/>
 *                 &lt;enumeration value="ERR-insufficiently-equipped"/>
 *                 &lt;enumeration value="ERR-max-userid-sessions-reached"/>
 *                 &lt;enumeration value="ERR-set-password-strength-check"/>
 *                 &lt;enumeration value="ERR-BOARDCTRLUPDATE-ignore"/>
 *                 &lt;enumeration value="ERR-DIAG-test-failed"/>
 *                 &lt;enumeration value="ERR-DIAG-cancelled"/>
 *                 &lt;enumeration value="ERR-DIAG-fsm-restarted"/>
 *                 &lt;enumeration value="ERR-UNABLE-TO-FETCH-BIOS-SETTINGS"/>
 *                 &lt;enumeration value="ERR-BIOS-TOKENS-OLD-BIOS"/>
 *                 &lt;enumeration value="ERR-BIOS-TOKENS-OLD-CIMC"/>
 *                 &lt;enumeration value="ERR-POWER-CAP-UNSUPPORTED"/>
 *                 &lt;enumeration value="ERR-provider-group-set-error"/>
 *                 &lt;enumeration value="ERR-ldap-group-modify-error"/>
 *                 &lt;enumeration value="ERR-provider-group-modify-error"/>
 *                 &lt;enumeration value="ERR-aaa-config-modify-error"/>
 *                 &lt;enumeration value="ERR-get-max-http-user-sessions"/>
 *                 &lt;enumeration value="ERR-SERVER-mis-connect"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fsmRmtInvErrDescr">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="510"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fsmRmtInvRslt">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="((defaultValue|not-applicable|resource-unavailable|service-unavailable|intermittent-error|sw-defect|service-not-implemented-ignore|extend-timeout|capability-not-implemented-failure|illegal-fru|end-point-unavailable|failure|resource-capacity-exceeded|service-protocol-error|fw-defect|service-not-implemented-fail|task-reset|unidentified-fail|capability-not-supported|end-point-failed|fru-state-indeterminate|resource-dependency|fru-identity-indeterminate|internal-error|hw-defect|service-not-supported|fru-not-supported|end-point-protocol-error|capability-unavailable|fru-not-ready|capability-not-implemented-ignore|fru-info-malformed|timeout),){0,32}(defaultValue|not-applicable|resource-unavailable|service-unavailable|intermittent-error|sw-defect|service-not-implemented-ignore|extend-timeout|capability-not-implemented-failure|illegal-fru|end-point-unavailable|failure|resource-capacity-exceeded|service-protocol-error|fw-defect|service-not-implemented-fail|task-reset|unidentified-fail|capability-not-supported|end-point-failed|fru-state-indeterminate|resource-dependency|fru-identity-indeterminate|internal-error|hw-defect|service-not-supported|fru-not-supported|end-point-protocol-error|capability-unavailable|fru-not-ready|capability-not-implemented-ignore|fru-info-malformed|timeout){0,1}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fsmStageDescr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fsmStamp">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {}dateTime">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="never"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fsmStatus">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="nop"/>
 *             &lt;enumeration value="DeleteBegin"/>
 *             &lt;enumeration value="DeleteLocal"/>
 *             &lt;enumeration value="DeleteRemote"/>
 *             &lt;enumeration value="DeleteFail"/>
 *             &lt;enumeration value="DeleteSuccess"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fsmTry" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="imagePresence">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="((defaultValue|unknown|A|B),){0,3}(defaultValue|unknown|A|B){0,1}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="invTag">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="510"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isoname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="unspecified"/>
 *             &lt;enumeration value="switch-kernel"/>
 *             &lt;enumeration value="switch-software"/>
 *             &lt;enumeration value="system"/>
 *             &lt;enumeration value="blade-controller"/>
 *             &lt;enumeration value="iocard"/>
 *             &lt;enumeration value="blade-bios"/>
 *             &lt;enumeration value="fex"/>
 *             &lt;enumeration value="adaptor"/>
 *             &lt;enumeration value="storage-controller"/>
 *             &lt;enumeration value="host-nic"/>
 *             &lt;enumeration value="host-hba"/>
 *             &lt;enumeration value="host-hba-optionrom"/>
 *             &lt;enumeration value="host-nic-optionrom"/>
 *             &lt;enumeration value="board-controller"/>
 *             &lt;enumeration value="local-disk"/>
 *             &lt;enumeration value="diag"/>
 *             &lt;enumeration value="catalog"/>
 *             &lt;enumeration value="mgmt-ext"/>
 *             &lt;enumeration value="debug-plug-in"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="version">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="510"/>
 *           &lt;/restriction>
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
@XmlType(name = "firmwareImage", propOrder = {
    "content"
})
public class FirmwareImage {

    @XmlElementRefs({
        @XmlElementRef(name = "faultInst", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "firmwareImageFsmTask", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "firmwareInstallable", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "eventInst", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "adminState")
    protected String adminState;
    @XmlAttribute(name = "checksum")
    protected String checksum;
    @XmlAttribute(name = "downloadDate")
    protected String downloadDate;
    @XmlAttribute(name = "fsmDescr")
    protected String fsmDescr;
    @XmlAttribute(name = "fsmPrev")
    protected String fsmPrev;
    @XmlAttribute(name = "fsmProgr")
    protected String fsmProgr;
    @XmlAttribute(name = "fsmRmtInvErrCode")
    protected String fsmRmtInvErrCode;
    @XmlAttribute(name = "fsmRmtInvErrDescr")
    protected String fsmRmtInvErrDescr;
    @XmlAttribute(name = "fsmRmtInvRslt")
    protected String fsmRmtInvRslt;
    @XmlAttribute(name = "fsmStageDescr")
    protected String fsmStageDescr;
    @XmlAttribute(name = "fsmStamp")
    protected String fsmStamp;
    @XmlAttribute(name = "fsmStatus")
    protected String fsmStatus;
    @XmlAttribute(name = "fsmTry")
    @XmlSchemaType(name = "unsignedByte")
    protected Short fsmTry;
    @XmlAttribute(name = "imagePresence")
    protected String imagePresence;
    @XmlAttribute(name = "invTag")
    protected String invTag;
    @XmlAttribute(name = "isoname")
    protected String isoname;
    @XmlAttribute(name = "location")
    protected String location;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "size")
    @XmlSchemaType(name = "unsignedInt")
    protected Long size;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "version")
    protected String version;
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
     * {@link JAXBElement }{@code <}{@link FirmwareImageFsmTask }{@code >}
     * {@link JAXBElement }{@code <}{@link FaultInst }{@code >}
     * {@link JAXBElement }{@code <}{@link FirmwareInstallable }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link EventInst }{@code >}
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
     * Gets the value of the adminState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminState() {
        return adminState;
    }

    /**
     * Sets the value of the adminState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminState(String value) {
        this.adminState = value;
    }

    /**
     * Gets the value of the checksum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksum(String value) {
        this.checksum = value;
    }

    /**
     * Gets the value of the downloadDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadDate() {
        return downloadDate;
    }

    /**
     * Sets the value of the downloadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadDate(String value) {
        this.downloadDate = value;
    }

    /**
     * Gets the value of the fsmDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsmDescr() {
        return fsmDescr;
    }

    /**
     * Sets the value of the fsmDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsmDescr(String value) {
        this.fsmDescr = value;
    }

    /**
     * Gets the value of the fsmPrev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsmPrev() {
        return fsmPrev;
    }

    /**
     * Sets the value of the fsmPrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsmPrev(String value) {
        this.fsmPrev = value;
    }

    /**
     * Gets the value of the fsmProgr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsmProgr() {
        return fsmProgr;
    }

    /**
     * Sets the value of the fsmProgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsmProgr(String value) {
        this.fsmProgr = value;
    }

    /**
     * Gets the value of the fsmRmtInvErrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsmRmtInvErrCode() {
        return fsmRmtInvErrCode;
    }

    /**
     * Sets the value of the fsmRmtInvErrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsmRmtInvErrCode(String value) {
        this.fsmRmtInvErrCode = value;
    }

    /**
     * Gets the value of the fsmRmtInvErrDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsmRmtInvErrDescr() {
        return fsmRmtInvErrDescr;
    }

    /**
     * Sets the value of the fsmRmtInvErrDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsmRmtInvErrDescr(String value) {
        this.fsmRmtInvErrDescr = value;
    }

    /**
     * Gets the value of the fsmRmtInvRslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsmRmtInvRslt() {
        return fsmRmtInvRslt;
    }

    /**
     * Sets the value of the fsmRmtInvRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsmRmtInvRslt(String value) {
        this.fsmRmtInvRslt = value;
    }

    /**
     * Gets the value of the fsmStageDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsmStageDescr() {
        return fsmStageDescr;
    }

    /**
     * Sets the value of the fsmStageDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsmStageDescr(String value) {
        this.fsmStageDescr = value;
    }

    /**
     * Gets the value of the fsmStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsmStamp() {
        return fsmStamp;
    }

    /**
     * Sets the value of the fsmStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsmStamp(String value) {
        this.fsmStamp = value;
    }

    /**
     * Gets the value of the fsmStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsmStatus() {
        return fsmStatus;
    }

    /**
     * Sets the value of the fsmStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsmStatus(String value) {
        this.fsmStatus = value;
    }

    /**
     * Gets the value of the fsmTry property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFsmTry() {
        return fsmTry;
    }

    /**
     * Sets the value of the fsmTry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFsmTry(Short value) {
        this.fsmTry = value;
    }

    /**
     * Gets the value of the imagePresence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePresence() {
        return imagePresence;
    }

    /**
     * Sets the value of the imagePresence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePresence(String value) {
        this.imagePresence = value;
    }

    /**
     * Gets the value of the invTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvTag() {
        return invTag;
    }

    /**
     * Sets the value of the invTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvTag(String value) {
        this.invTag = value;
    }

    /**
     * Gets the value of the isoname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoname() {
        return isoname;
    }

    /**
     * Sets the value of the isoname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoname(String value) {
        this.isoname = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
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
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSize(Long value) {
        this.size = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
