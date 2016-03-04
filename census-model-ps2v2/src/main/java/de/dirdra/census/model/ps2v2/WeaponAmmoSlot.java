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
 * <p>Java-Klasse für weapon_ammo_slot complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="weapon_ammo_slot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}weapon_id"/&gt;
 *       &lt;attribute name="weapon_slot_index" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="clip_size" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="capacity" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="refill_ammo_rate" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="refill_ammo_delay_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weapon_ammo_slot")
public class WeaponAmmoSlot {

    @XmlAttribute(name = "weapon_id")
    protected Integer weaponId;
    @XmlAttribute(name = "weapon_slot_index")
    protected Integer weaponSlotIndex;
    @XmlAttribute(name = "clip_size")
    protected Integer clipSize;
    @XmlAttribute(name = "capacity")
    protected Integer capacity;
    @XmlAttribute(name = "refill_ammo_rate")
    protected Integer refillAmmoRate;
    @XmlAttribute(name = "refill_ammo_delay_ms")
    protected Integer refillAmmoDelayMs;

    /**
     * Ruft den Wert der weaponId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeaponId() {
        return weaponId;
    }

    /**
     * Legt den Wert der weaponId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeaponId(Integer value) {
        this.weaponId = value;
    }

    /**
     * Ruft den Wert der weaponSlotIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeaponSlotIndex() {
        return weaponSlotIndex;
    }

    /**
     * Legt den Wert der weaponSlotIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeaponSlotIndex(Integer value) {
        this.weaponSlotIndex = value;
    }

    /**
     * Ruft den Wert der clipSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClipSize() {
        return clipSize;
    }

    /**
     * Legt den Wert der clipSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClipSize(Integer value) {
        this.clipSize = value;
    }

    /**
     * Ruft den Wert der capacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * Legt den Wert der capacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapacity(Integer value) {
        this.capacity = value;
    }

    /**
     * Ruft den Wert der refillAmmoRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefillAmmoRate() {
        return refillAmmoRate;
    }

    /**
     * Legt den Wert der refillAmmoRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefillAmmoRate(Integer value) {
        this.refillAmmoRate = value;
    }

    /**
     * Ruft den Wert der refillAmmoDelayMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefillAmmoDelayMs() {
        return refillAmmoDelayMs;
    }

    /**
     * Legt den Wert der refillAmmoDelayMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefillAmmoDelayMs(Integer value) {
        this.refillAmmoDelayMs = value;
    }

}
