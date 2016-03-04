//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.04 um 03:33:06 PM CET 
//


package de.dirdra.census.model.ps2v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für stats complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="stats"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stat_list" type="{}stat_list"/&gt;
 *         &lt;element name="stat_by_faction_list" type="{}stat_by_faction_list"/&gt;
 *         &lt;element name="stat_history" type="{}stat_history"/&gt;
 *         &lt;element name="weapon_stat_list" type="{}weapon_stat_list"/&gt;
 *         &lt;element name="weapon_stat_by_faction_list" type="{}weapon_stat_by_faction_list"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stats", propOrder = {
    "statList",
    "statByFactionList",
    "statHistory",
    "weaponStatList",
    "weaponStatByFactionList"
})
public class Stats {

    @XmlElement(name = "stat_list", required = true)
    protected StatList statList;
    @XmlElement(name = "stat_by_faction_list", required = true)
    protected StatByFactionList statByFactionList;
    @XmlElement(name = "stat_history", required = true)
    protected StatHistory statHistory;
    @XmlElement(name = "weapon_stat_list", required = true)
    protected WeaponStatList weaponStatList;
    @XmlElement(name = "weapon_stat_by_faction_list", required = true)
    protected WeaponStatByFactionList weaponStatByFactionList;

    /**
     * Ruft den Wert der statList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatList }
     *     
     */
    public StatList getStatList() {
        return statList;
    }

    /**
     * Legt den Wert der statList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatList }
     *     
     */
    public void setStatList(StatList value) {
        this.statList = value;
    }

    /**
     * Ruft den Wert der statByFactionList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatByFactionList }
     *     
     */
    public StatByFactionList getStatByFactionList() {
        return statByFactionList;
    }

    /**
     * Legt den Wert der statByFactionList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatByFactionList }
     *     
     */
    public void setStatByFactionList(StatByFactionList value) {
        this.statByFactionList = value;
    }

    /**
     * Ruft den Wert der statHistory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatHistory }
     *     
     */
    public StatHistory getStatHistory() {
        return statHistory;
    }

    /**
     * Legt den Wert der statHistory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatHistory }
     *     
     */
    public void setStatHistory(StatHistory value) {
        this.statHistory = value;
    }

    /**
     * Ruft den Wert der weaponStatList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WeaponStatList }
     *     
     */
    public WeaponStatList getWeaponStatList() {
        return weaponStatList;
    }

    /**
     * Legt den Wert der weaponStatList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WeaponStatList }
     *     
     */
    public void setWeaponStatList(WeaponStatList value) {
        this.weaponStatList = value;
    }

    /**
     * Ruft den Wert der weaponStatByFactionList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WeaponStatByFactionList }
     *     
     */
    public WeaponStatByFactionList getWeaponStatByFactionList() {
        return weaponStatByFactionList;
    }

    /**
     * Legt den Wert der weaponStatByFactionList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WeaponStatByFactionList }
     *     
     */
    public void setWeaponStatByFactionList(WeaponStatByFactionList value) {
        this.weaponStatByFactionList = value;
    }

}
