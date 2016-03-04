//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.04 um 03:33:06 PM CET 
//


package de.dirdra.census.model.ps2v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für times_type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="times_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="creation" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="creation_date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="last_login" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="last_login_date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="last_save" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="last_save_date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="login_count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="minutes_played" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "times_type")
public class TimesType {

    @XmlAttribute(name = "creation")
    protected Integer creation;
    @XmlAttribute(name = "creation_date")
    protected String creationDate;
    @XmlAttribute(name = "last_login")
    protected Integer lastLogin;
    @XmlAttribute(name = "last_login_date")
    protected String lastLoginDate;
    @XmlAttribute(name = "last_save")
    protected Integer lastSave;
    @XmlAttribute(name = "last_save_date")
    protected String lastSaveDate;
    @XmlAttribute(name = "login_count")
    protected Integer loginCount;
    @XmlAttribute(name = "minutes_played")
    protected Integer minutesPlayed;

    /**
     * Ruft den Wert der creation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreation() {
        return creation;
    }

    /**
     * Legt den Wert der creation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreation(Integer value) {
        this.creation = value;
    }

    /**
     * Ruft den Wert der creationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * Legt den Wert der creationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDate(String value) {
        this.creationDate = value;
    }

    /**
     * Ruft den Wert der lastLogin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastLogin() {
        return lastLogin;
    }

    /**
     * Legt den Wert der lastLogin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastLogin(Integer value) {
        this.lastLogin = value;
    }

    /**
     * Ruft den Wert der lastLoginDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * Legt den Wert der lastLoginDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLoginDate(String value) {
        this.lastLoginDate = value;
    }

    /**
     * Ruft den Wert der lastSave-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastSave() {
        return lastSave;
    }

    /**
     * Legt den Wert der lastSave-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastSave(Integer value) {
        this.lastSave = value;
    }

    /**
     * Ruft den Wert der lastSaveDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSaveDate() {
        return lastSaveDate;
    }

    /**
     * Legt den Wert der lastSaveDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSaveDate(String value) {
        this.lastSaveDate = value;
    }

    /**
     * Ruft den Wert der loginCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * Legt den Wert der loginCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoginCount(Integer value) {
        this.loginCount = value;
    }

    /**
     * Ruft den Wert der minutesPlayed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinutesPlayed() {
        return minutesPlayed;
    }

    /**
     * Legt den Wert der minutesPlayed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinutesPlayed(Integer value) {
        this.minutesPlayed = value;
    }

}
