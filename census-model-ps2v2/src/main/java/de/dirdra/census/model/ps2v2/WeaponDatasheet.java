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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für weapon_datasheet complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="weapon_datasheet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="range" type="{}multi_language_description_type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{}item_id"/&gt;
 *       &lt;attribute name="damage" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="damage_min" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="damage_max" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="direct_damage" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="indirect_damage" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="fire_cone" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="fire_cone_min" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="fire_cone_max" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="fire_rate_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="fire_rate_ms_min" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="fire_rate_mx_max" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="reload_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="reload_ms_min" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="reload_ms_max" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="clip_size" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="capacity" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="show_clip_size" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *       &lt;attribute name="show_fire_modes" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *       &lt;attribute name="show_range" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weapon_datasheet", propOrder = {
    "range"
})
public class WeaponDatasheet {

    @XmlElement(required = true)
    protected MultiLanguageDescriptionType range;
    @XmlAttribute(name = "item_id")
    protected Integer itemId;
    @XmlAttribute(name = "damage")
    protected Integer damage;
    @XmlAttribute(name = "damage_min")
    protected Integer damageMin;
    @XmlAttribute(name = "damage_max")
    protected Integer damageMax;
    @XmlAttribute(name = "direct_damage")
    protected Integer directDamage;
    @XmlAttribute(name = "indirect_damage")
    protected Integer indirectDamage;
    @XmlAttribute(name = "fire_cone")
    protected Double fireCone;
    @XmlAttribute(name = "fire_cone_min")
    protected Double fireConeMin;
    @XmlAttribute(name = "fire_cone_max")
    protected Double fireConeMax;
    @XmlAttribute(name = "fire_rate_ms")
    protected Integer fireRateMs;
    @XmlAttribute(name = "fire_rate_ms_min")
    protected Integer fireRateMsMin;
    @XmlAttribute(name = "fire_rate_mx_max")
    protected Integer fireRateMxMax;
    @XmlAttribute(name = "reload_ms")
    protected Integer reloadMs;
    @XmlAttribute(name = "reload_ms_min")
    protected Integer reloadMsMin;
    @XmlAttribute(name = "reload_ms_max")
    protected Integer reloadMsMax;
    @XmlAttribute(name = "clip_size")
    protected Integer clipSize;
    @XmlAttribute(name = "capacity")
    protected Integer capacity;
    @XmlAttribute(name = "show_clip_size")
    protected Short showClipSize;
    @XmlAttribute(name = "show_fire_modes")
    protected Short showFireModes;
    @XmlAttribute(name = "show_range")
    protected Short showRange;

    /**
     * Ruft den Wert der range-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiLanguageDescriptionType }
     *     
     */
    public MultiLanguageDescriptionType getRange() {
        return range;
    }

    /**
     * Legt den Wert der range-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLanguageDescriptionType }
     *     
     */
    public void setRange(MultiLanguageDescriptionType value) {
        this.range = value;
    }

    /**
     * Ruft den Wert der itemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * Legt den Wert der itemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemId(Integer value) {
        this.itemId = value;
    }

    /**
     * Ruft den Wert der damage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDamage() {
        return damage;
    }

    /**
     * Legt den Wert der damage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDamage(Integer value) {
        this.damage = value;
    }

    /**
     * Ruft den Wert der damageMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDamageMin() {
        return damageMin;
    }

    /**
     * Legt den Wert der damageMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDamageMin(Integer value) {
        this.damageMin = value;
    }

    /**
     * Ruft den Wert der damageMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDamageMax() {
        return damageMax;
    }

    /**
     * Legt den Wert der damageMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDamageMax(Integer value) {
        this.damageMax = value;
    }

    /**
     * Ruft den Wert der directDamage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirectDamage() {
        return directDamage;
    }

    /**
     * Legt den Wert der directDamage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirectDamage(Integer value) {
        this.directDamage = value;
    }

    /**
     * Ruft den Wert der indirectDamage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndirectDamage() {
        return indirectDamage;
    }

    /**
     * Legt den Wert der indirectDamage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndirectDamage(Integer value) {
        this.indirectDamage = value;
    }

    /**
     * Ruft den Wert der fireCone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFireCone() {
        return fireCone;
    }

    /**
     * Legt den Wert der fireCone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFireCone(Double value) {
        this.fireCone = value;
    }

    /**
     * Ruft den Wert der fireConeMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFireConeMin() {
        return fireConeMin;
    }

    /**
     * Legt den Wert der fireConeMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFireConeMin(Double value) {
        this.fireConeMin = value;
    }

    /**
     * Ruft den Wert der fireConeMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFireConeMax() {
        return fireConeMax;
    }

    /**
     * Legt den Wert der fireConeMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFireConeMax(Double value) {
        this.fireConeMax = value;
    }

    /**
     * Ruft den Wert der fireRateMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireRateMs() {
        return fireRateMs;
    }

    /**
     * Legt den Wert der fireRateMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireRateMs(Integer value) {
        this.fireRateMs = value;
    }

    /**
     * Ruft den Wert der fireRateMsMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireRateMsMin() {
        return fireRateMsMin;
    }

    /**
     * Legt den Wert der fireRateMsMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireRateMsMin(Integer value) {
        this.fireRateMsMin = value;
    }

    /**
     * Ruft den Wert der fireRateMxMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireRateMxMax() {
        return fireRateMxMax;
    }

    /**
     * Legt den Wert der fireRateMxMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireRateMxMax(Integer value) {
        this.fireRateMxMax = value;
    }

    /**
     * Ruft den Wert der reloadMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReloadMs() {
        return reloadMs;
    }

    /**
     * Legt den Wert der reloadMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReloadMs(Integer value) {
        this.reloadMs = value;
    }

    /**
     * Ruft den Wert der reloadMsMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReloadMsMin() {
        return reloadMsMin;
    }

    /**
     * Legt den Wert der reloadMsMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReloadMsMin(Integer value) {
        this.reloadMsMin = value;
    }

    /**
     * Ruft den Wert der reloadMsMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReloadMsMax() {
        return reloadMsMax;
    }

    /**
     * Legt den Wert der reloadMsMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReloadMsMax(Integer value) {
        this.reloadMsMax = value;
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
     * Ruft den Wert der showClipSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getShowClipSize() {
        return showClipSize;
    }

    /**
     * Legt den Wert der showClipSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setShowClipSize(Short value) {
        this.showClipSize = value;
    }

    /**
     * Ruft den Wert der showFireModes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getShowFireModes() {
        return showFireModes;
    }

    /**
     * Legt den Wert der showFireModes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setShowFireModes(Short value) {
        this.showFireModes = value;
    }

    /**
     * Ruft den Wert der showRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getShowRange() {
        return showRange;
    }

    /**
     * Legt den Wert der showRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setShowRange(Short value) {
        this.showRange = value;
    }

}
