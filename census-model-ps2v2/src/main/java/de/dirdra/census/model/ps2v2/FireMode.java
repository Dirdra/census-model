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
 * <p>Java-Klasse für fire_mode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fire_mode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{}multi_language_description_type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="cof_recoil" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="damage" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="damage_max" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="damage_max_range" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="damage_min" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="damage_min_range" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="damage_radius" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="damage_resist_type" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="damage_target_type" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="damage_type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="default_zoom" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute ref="{}fire_mode_id"/&gt;
 *       &lt;attribute name="indirect_damage_max" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="indirect_damage_max_range" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="indirect_damage_min" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="indirect_damage_min_range" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="indirect_damage_resist_type" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="indirect_damage_target_type" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}item_id"/&gt;
 *       &lt;attribute name="max_speed" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="muzzle_velocity" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="pellet_spread" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="pellets_per_shot" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}player_state_group_id"/&gt;
 *       &lt;attribute name="projectile_description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="reload_chamber_time_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="reload_time_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="speed" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fire_mode", propOrder = {
    "description"
})
public class FireMode {

    @XmlElement(required = true)
    protected MultiLanguageDescriptionType description;
    @XmlAttribute(name = "cof_recoil")
    protected Double cofRecoil;
    @XmlAttribute(name = "damage")
    protected Integer damage;
    @XmlAttribute(name = "damage_max")
    protected Integer damageMax;
    @XmlAttribute(name = "damage_max_range")
    protected Integer damageMaxRange;
    @XmlAttribute(name = "damage_min")
    protected Integer damageMin;
    @XmlAttribute(name = "damage_min_range")
    protected Integer damageMinRange;
    @XmlAttribute(name = "damage_radius")
    protected Integer damageRadius;
    @XmlAttribute(name = "damage_resist_type")
    protected Integer damageResistType;
    @XmlAttribute(name = "damage_target_type")
    protected Integer damageTargetType;
    @XmlAttribute(name = "damage_type")
    protected String damageType;
    @XmlAttribute(name = "default_zoom")
    protected Double defaultZoom;
    @XmlAttribute(name = "fire_mode_id")
    protected Integer fireModeId;
    @XmlAttribute(name = "indirect_damage_max")
    protected Integer indirectDamageMax;
    @XmlAttribute(name = "indirect_damage_max_range")
    protected Integer indirectDamageMaxRange;
    @XmlAttribute(name = "indirect_damage_min")
    protected Integer indirectDamageMin;
    @XmlAttribute(name = "indirect_damage_min_range")
    protected Integer indirectDamageMinRange;
    @XmlAttribute(name = "indirect_damage_resist_type")
    protected Integer indirectDamageResistType;
    @XmlAttribute(name = "indirect_damage_target_type")
    protected Integer indirectDamageTargetType;
    @XmlAttribute(name = "item_id")
    protected Integer itemId;
    @XmlAttribute(name = "max_speed")
    protected Integer maxSpeed;
    @XmlAttribute(name = "muzzle_velocity")
    protected Integer muzzleVelocity;
    @XmlAttribute(name = "pellet_spread")
    protected Integer pelletSpread;
    @XmlAttribute(name = "pellets_per_shot")
    protected Integer pelletsPerShot;
    @XmlAttribute(name = "player_state_group_id")
    protected Integer playerStateGroupId;
    @XmlAttribute(name = "projectile_description")
    protected String projectileDescription;
    @XmlAttribute(name = "reload_chamber_time_ms")
    protected Integer reloadChamberTimeMs;
    @XmlAttribute(name = "reload_time_ms")
    protected Integer reloadTimeMs;
    @XmlAttribute(name = "speed")
    protected Integer speed;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiLanguageDescriptionType }
     *     
     */
    public MultiLanguageDescriptionType getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLanguageDescriptionType }
     *     
     */
    public void setDescription(MultiLanguageDescriptionType value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der cofRecoil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCofRecoil() {
        return cofRecoil;
    }

    /**
     * Legt den Wert der cofRecoil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCofRecoil(Double value) {
        this.cofRecoil = value;
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
     * Ruft den Wert der damageMaxRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDamageMaxRange() {
        return damageMaxRange;
    }

    /**
     * Legt den Wert der damageMaxRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDamageMaxRange(Integer value) {
        this.damageMaxRange = value;
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
     * Ruft den Wert der damageMinRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDamageMinRange() {
        return damageMinRange;
    }

    /**
     * Legt den Wert der damageMinRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDamageMinRange(Integer value) {
        this.damageMinRange = value;
    }

    /**
     * Ruft den Wert der damageRadius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDamageRadius() {
        return damageRadius;
    }

    /**
     * Legt den Wert der damageRadius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDamageRadius(Integer value) {
        this.damageRadius = value;
    }

    /**
     * Ruft den Wert der damageResistType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDamageResistType() {
        return damageResistType;
    }

    /**
     * Legt den Wert der damageResistType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDamageResistType(Integer value) {
        this.damageResistType = value;
    }

    /**
     * Ruft den Wert der damageTargetType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDamageTargetType() {
        return damageTargetType;
    }

    /**
     * Legt den Wert der damageTargetType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDamageTargetType(Integer value) {
        this.damageTargetType = value;
    }

    /**
     * Ruft den Wert der damageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDamageType() {
        return damageType;
    }

    /**
     * Legt den Wert der damageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDamageType(String value) {
        this.damageType = value;
    }

    /**
     * Ruft den Wert der defaultZoom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDefaultZoom() {
        return defaultZoom;
    }

    /**
     * Legt den Wert der defaultZoom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultZoom(Double value) {
        this.defaultZoom = value;
    }

    /**
     * Ruft den Wert der fireModeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireModeId() {
        return fireModeId;
    }

    /**
     * Legt den Wert der fireModeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireModeId(Integer value) {
        this.fireModeId = value;
    }

    /**
     * Ruft den Wert der indirectDamageMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndirectDamageMax() {
        return indirectDamageMax;
    }

    /**
     * Legt den Wert der indirectDamageMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndirectDamageMax(Integer value) {
        this.indirectDamageMax = value;
    }

    /**
     * Ruft den Wert der indirectDamageMaxRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndirectDamageMaxRange() {
        return indirectDamageMaxRange;
    }

    /**
     * Legt den Wert der indirectDamageMaxRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndirectDamageMaxRange(Integer value) {
        this.indirectDamageMaxRange = value;
    }

    /**
     * Ruft den Wert der indirectDamageMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndirectDamageMin() {
        return indirectDamageMin;
    }

    /**
     * Legt den Wert der indirectDamageMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndirectDamageMin(Integer value) {
        this.indirectDamageMin = value;
    }

    /**
     * Ruft den Wert der indirectDamageMinRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndirectDamageMinRange() {
        return indirectDamageMinRange;
    }

    /**
     * Legt den Wert der indirectDamageMinRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndirectDamageMinRange(Integer value) {
        this.indirectDamageMinRange = value;
    }

    /**
     * Ruft den Wert der indirectDamageResistType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndirectDamageResistType() {
        return indirectDamageResistType;
    }

    /**
     * Legt den Wert der indirectDamageResistType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndirectDamageResistType(Integer value) {
        this.indirectDamageResistType = value;
    }

    /**
     * Ruft den Wert der indirectDamageTargetType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndirectDamageTargetType() {
        return indirectDamageTargetType;
    }

    /**
     * Legt den Wert der indirectDamageTargetType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndirectDamageTargetType(Integer value) {
        this.indirectDamageTargetType = value;
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
     * Ruft den Wert der maxSpeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Legt den Wert der maxSpeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSpeed(Integer value) {
        this.maxSpeed = value;
    }

    /**
     * Ruft den Wert der muzzleVelocity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMuzzleVelocity() {
        return muzzleVelocity;
    }

    /**
     * Legt den Wert der muzzleVelocity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMuzzleVelocity(Integer value) {
        this.muzzleVelocity = value;
    }

    /**
     * Ruft den Wert der pelletSpread-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPelletSpread() {
        return pelletSpread;
    }

    /**
     * Legt den Wert der pelletSpread-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPelletSpread(Integer value) {
        this.pelletSpread = value;
    }

    /**
     * Ruft den Wert der pelletsPerShot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPelletsPerShot() {
        return pelletsPerShot;
    }

    /**
     * Legt den Wert der pelletsPerShot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPelletsPerShot(Integer value) {
        this.pelletsPerShot = value;
    }

    /**
     * Ruft den Wert der playerStateGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlayerStateGroupId() {
        return playerStateGroupId;
    }

    /**
     * Legt den Wert der playerStateGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlayerStateGroupId(Integer value) {
        this.playerStateGroupId = value;
    }

    /**
     * Ruft den Wert der projectileDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectileDescription() {
        return projectileDescription;
    }

    /**
     * Legt den Wert der projectileDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectileDescription(String value) {
        this.projectileDescription = value;
    }

    /**
     * Ruft den Wert der reloadChamberTimeMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReloadChamberTimeMs() {
        return reloadChamberTimeMs;
    }

    /**
     * Legt den Wert der reloadChamberTimeMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReloadChamberTimeMs(Integer value) {
        this.reloadChamberTimeMs = value;
    }

    /**
     * Ruft den Wert der reloadTimeMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReloadTimeMs() {
        return reloadTimeMs;
    }

    /**
     * Legt den Wert der reloadTimeMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReloadTimeMs(Integer value) {
        this.reloadTimeMs = value;
    }

    /**
     * Ruft den Wert der speed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * Legt den Wert der speed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpeed(Integer value) {
        this.speed = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
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
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
