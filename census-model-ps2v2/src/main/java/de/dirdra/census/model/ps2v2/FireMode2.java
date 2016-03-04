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
 * <p>Java-Klasse für fire_mode_2 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fire_mode_2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{}multi_language_description_type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{}ability_id"/&gt;
 *       &lt;attribute name="ammo_slot" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="armor_penetration" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="automatic" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="cof_override" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="cof_pellet_spread" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="cof_range" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="cof_recoil" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="cof_scalar" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="cof_scalar_moving" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}damage_direct_effect_id"/&gt;
 *       &lt;attribute name="damage_head_multiplier" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute ref="{}damage_indirect_effect_id"/&gt;
 *       &lt;attribute name="damage_legs_multiplier" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="fire_ammo_per_shot" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="fire_auto_fire_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="fire_burst_count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="fire_charge_up_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="fire_delay_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="fire_detect_range" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="fire_duration_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}fire_mode_id"/&gt;
 *       &lt;attribute ref="{}fire_mode_type_id"/&gt;
 *       &lt;attribute name="fire_pellets_per_shot" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="fire_refire_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="grief_immune" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="heat_per_shot" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="heat_recovery_delay_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="heat_threshold" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="iron_sights" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="laser_guided" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="lockon_acquire_close_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="lockon_acquire_far_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="lockon_acquire_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="lockon_angle" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="lockon_lose_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="lockon_maintain" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="lockon_radius" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="lockon_range" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="lockon_range_close" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="lockon_range_far" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="lockon_required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="max_damage" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="max_damage_ind" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="max_damage_ind_radius" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="max_damage_range" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="min_damage" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="min_damage_ind" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="min_damage_ind_radius" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="min_damage_range" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="move_modifier" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute ref="{}player_state_group_id"/&gt;
 *       &lt;attribute name="projectile_speed_override" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="recoil_angle_max" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="recoil_angle_min" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="recoil_first_shot_modifier" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="recoil_horizontal_max" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="recoil_horizontal_max_increase" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="recoil_horizontal_min" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="recoil_horizontal_min_increase" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="recoil_horizontal_tolerance" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="recoil_increase" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="recoil_increase_crouched" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="recoil_magnitude_max" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="recoil_magnitude_min" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="recoil_max_total_magnitude" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="recoil_recovery_acceleration" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="recoil_recovery_delay_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="recoil_recovery_rate" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="recoil_shots_at_min_magnitude" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="reload_ammo_fill_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="reload_block_auto" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="reload_chamber_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="reload_continuous" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="reload_loop_end_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="reload_loop_start_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="reload_time_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="shield_bypass_pct" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="sprint_fire" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="sway_amplitude_x" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="sway_amplitude_y" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="sway_can_steady" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="sway_period_x" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="sway_period_y" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="turn_modifier" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="use_in_water" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="zoom_default" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fire_mode_2", propOrder = {
    "description"
})
public class FireMode2 {

    @XmlElement(required = true)
    protected MultiLanguageDescriptionType description;
    @XmlAttribute(name = "ability_id")
    protected Integer abilityId;
    @XmlAttribute(name = "ammo_slot")
    protected Integer ammoSlot;
    @XmlAttribute(name = "armor_penetration")
    protected Integer armorPenetration;
    @XmlAttribute(name = "automatic")
    protected Integer automatic;
    @XmlAttribute(name = "cof_override")
    protected Boolean cofOverride;
    @XmlAttribute(name = "cof_pellet_spread")
    protected Float cofPelletSpread;
    @XmlAttribute(name = "cof_range")
    protected Integer cofRange;
    @XmlAttribute(name = "cof_recoil")
    protected Float cofRecoil;
    @XmlAttribute(name = "cof_scalar")
    protected Integer cofScalar;
    @XmlAttribute(name = "cof_scalar_moving")
    protected Integer cofScalarMoving;
    @XmlAttribute(name = "damage_direct_effect_id")
    protected Integer damageDirectEffectId;
    @XmlAttribute(name = "damage_head_multiplier")
    protected Float damageHeadMultiplier;
    @XmlAttribute(name = "damage_indirect_effect_id")
    protected Integer damageIndirectEffectId;
    @XmlAttribute(name = "damage_legs_multiplier")
    protected Float damageLegsMultiplier;
    @XmlAttribute(name = "fire_ammo_per_shot")
    protected Integer fireAmmoPerShot;
    @XmlAttribute(name = "fire_auto_fire_ms")
    protected Integer fireAutoFireMs;
    @XmlAttribute(name = "fire_burst_count")
    protected Integer fireBurstCount;
    @XmlAttribute(name = "fire_charge_up_ms")
    protected Integer fireChargeUpMs;
    @XmlAttribute(name = "fire_delay_ms")
    protected Integer fireDelayMs;
    @XmlAttribute(name = "fire_detect_range")
    protected Integer fireDetectRange;
    @XmlAttribute(name = "fire_duration_ms")
    protected Integer fireDurationMs;
    @XmlAttribute(name = "fire_mode_id")
    protected Integer fireModeId;
    @XmlAttribute(name = "fire_mode_type_id")
    protected Integer fireModeTypeId;
    @XmlAttribute(name = "fire_pellets_per_shot")
    protected Integer firePelletsPerShot;
    @XmlAttribute(name = "fire_refire_ms")
    protected Integer fireRefireMs;
    @XmlAttribute(name = "grief_immune")
    protected Integer griefImmune;
    @XmlAttribute(name = "heat_per_shot")
    protected Integer heatPerShot;
    @XmlAttribute(name = "heat_recovery_delay_ms")
    protected Integer heatRecoveryDelayMs;
    @XmlAttribute(name = "heat_threshold")
    protected Integer heatThreshold;
    @XmlAttribute(name = "iron_sights")
    protected Boolean ironSights;
    @XmlAttribute(name = "laser_guided")
    protected Boolean laserGuided;
    @XmlAttribute(name = "lockon_acquire_close_ms")
    protected Integer lockonAcquireCloseMs;
    @XmlAttribute(name = "lockon_acquire_far_ms")
    protected Integer lockonAcquireFarMs;
    @XmlAttribute(name = "lockon_acquire_ms")
    protected Integer lockonAcquireMs;
    @XmlAttribute(name = "lockon_angle")
    protected Boolean lockonAngle;
    @XmlAttribute(name = "lockon_lose_ms")
    protected Integer lockonLoseMs;
    @XmlAttribute(name = "lockon_maintain")
    protected Boolean lockonMaintain;
    @XmlAttribute(name = "lockon_radius")
    protected Float lockonRadius;
    @XmlAttribute(name = "lockon_range")
    protected Integer lockonRange;
    @XmlAttribute(name = "lockon_range_close")
    protected Integer lockonRangeClose;
    @XmlAttribute(name = "lockon_range_far")
    protected Integer lockonRangeFar;
    @XmlAttribute(name = "lockon_required")
    protected Boolean lockonRequired;
    @XmlAttribute(name = "max_damage")
    protected Integer maxDamage;
    @XmlAttribute(name = "max_damage_ind")
    protected Integer maxDamageInd;
    @XmlAttribute(name = "max_damage_ind_radius")
    protected Integer maxDamageIndRadius;
    @XmlAttribute(name = "max_damage_range")
    protected Integer maxDamageRange;
    @XmlAttribute(name = "min_damage")
    protected Integer minDamage;
    @XmlAttribute(name = "min_damage_ind")
    protected Integer minDamageInd;
    @XmlAttribute(name = "min_damage_ind_radius")
    protected Integer minDamageIndRadius;
    @XmlAttribute(name = "min_damage_range")
    protected Integer minDamageRange;
    @XmlAttribute(name = "move_modifier")
    protected Double moveModifier;
    @XmlAttribute(name = "player_state_group_id")
    protected Integer playerStateGroupId;
    @XmlAttribute(name = "projectile_speed_override")
    protected Boolean projectileSpeedOverride;
    @XmlAttribute(name = "recoil_angle_max")
    protected Integer recoilAngleMax;
    @XmlAttribute(name = "recoil_angle_min")
    protected Integer recoilAngleMin;
    @XmlAttribute(name = "recoil_first_shot_modifier")
    protected Double recoilFirstShotModifier;
    @XmlAttribute(name = "recoil_horizontal_max")
    protected Float recoilHorizontalMax;
    @XmlAttribute(name = "recoil_horizontal_max_increase")
    protected Integer recoilHorizontalMaxIncrease;
    @XmlAttribute(name = "recoil_horizontal_min")
    protected Float recoilHorizontalMin;
    @XmlAttribute(name = "recoil_horizontal_min_increase")
    protected Integer recoilHorizontalMinIncrease;
    @XmlAttribute(name = "recoil_horizontal_tolerance")
    protected Double recoilHorizontalTolerance;
    @XmlAttribute(name = "recoil_increase")
    protected Float recoilIncrease;
    @XmlAttribute(name = "recoil_increase_crouched")
    protected Float recoilIncreaseCrouched;
    @XmlAttribute(name = "recoil_magnitude_max")
    protected Double recoilMagnitudeMax;
    @XmlAttribute(name = "recoil_magnitude_min")
    protected Double recoilMagnitudeMin;
    @XmlAttribute(name = "recoil_max_total_magnitude")
    protected Integer recoilMaxTotalMagnitude;
    @XmlAttribute(name = "recoil_recovery_acceleration")
    protected Integer recoilRecoveryAcceleration;
    @XmlAttribute(name = "recoil_recovery_delay_ms")
    protected Integer recoilRecoveryDelayMs;
    @XmlAttribute(name = "recoil_recovery_rate")
    protected Integer recoilRecoveryRate;
    @XmlAttribute(name = "recoil_shots_at_min_magnitude")
    protected Integer recoilShotsAtMinMagnitude;
    @XmlAttribute(name = "reload_ammo_fill_ms")
    protected Integer reloadAmmoFillMs;
    @XmlAttribute(name = "reload_block_auto")
    protected Boolean reloadBlockAuto;
    @XmlAttribute(name = "reload_chamber_ms")
    protected Integer reloadChamberMs;
    @XmlAttribute(name = "reload_continuous")
    protected Boolean reloadContinuous;
    @XmlAttribute(name = "reload_loop_end_ms")
    protected Integer reloadLoopEndMs;
    @XmlAttribute(name = "reload_loop_start_ms")
    protected Integer reloadLoopStartMs;
    @XmlAttribute(name = "reload_time_ms")
    protected Integer reloadTimeMs;
    @XmlAttribute(name = "shield_bypass_pct")
    protected Integer shieldBypassPct;
    @XmlAttribute(name = "sprint_fire")
    protected Integer sprintFire;
    @XmlAttribute(name = "sway_amplitude_x")
    protected Integer swayAmplitudeX;
    @XmlAttribute(name = "sway_amplitude_y")
    protected Integer swayAmplitudeY;
    @XmlAttribute(name = "sway_can_steady")
    protected Integer swayCanSteady;
    @XmlAttribute(name = "sway_period_x")
    protected Integer swayPeriodX;
    @XmlAttribute(name = "sway_period_y")
    protected Integer swayPeriodY;
    @XmlAttribute(name = "turn_modifier")
    protected Double turnModifier;
    @XmlAttribute(name = "use_in_water")
    protected Integer useInWater;
    @XmlAttribute(name = "zoom_default")
    protected Double zoomDefault;

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
     * Ruft den Wert der abilityId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAbilityId() {
        return abilityId;
    }

    /**
     * Legt den Wert der abilityId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAbilityId(Integer value) {
        this.abilityId = value;
    }

    /**
     * Ruft den Wert der ammoSlot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAmmoSlot() {
        return ammoSlot;
    }

    /**
     * Legt den Wert der ammoSlot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAmmoSlot(Integer value) {
        this.ammoSlot = value;
    }

    /**
     * Ruft den Wert der armorPenetration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArmorPenetration() {
        return armorPenetration;
    }

    /**
     * Legt den Wert der armorPenetration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArmorPenetration(Integer value) {
        this.armorPenetration = value;
    }

    /**
     * Ruft den Wert der automatic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutomatic() {
        return automatic;
    }

    /**
     * Legt den Wert der automatic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutomatic(Integer value) {
        this.automatic = value;
    }

    /**
     * Ruft den Wert der cofOverride-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCofOverride() {
        return cofOverride;
    }

    /**
     * Legt den Wert der cofOverride-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCofOverride(Boolean value) {
        this.cofOverride = value;
    }

    /**
     * Ruft den Wert der cofPelletSpread-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCofPelletSpread() {
        return cofPelletSpread;
    }

    /**
     * Legt den Wert der cofPelletSpread-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCofPelletSpread(Float value) {
        this.cofPelletSpread = value;
    }

    /**
     * Ruft den Wert der cofRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCofRange() {
        return cofRange;
    }

    /**
     * Legt den Wert der cofRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCofRange(Integer value) {
        this.cofRange = value;
    }

    /**
     * Ruft den Wert der cofRecoil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCofRecoil() {
        return cofRecoil;
    }

    /**
     * Legt den Wert der cofRecoil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCofRecoil(Float value) {
        this.cofRecoil = value;
    }

    /**
     * Ruft den Wert der cofScalar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCofScalar() {
        return cofScalar;
    }

    /**
     * Legt den Wert der cofScalar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCofScalar(Integer value) {
        this.cofScalar = value;
    }

    /**
     * Ruft den Wert der cofScalarMoving-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCofScalarMoving() {
        return cofScalarMoving;
    }

    /**
     * Legt den Wert der cofScalarMoving-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCofScalarMoving(Integer value) {
        this.cofScalarMoving = value;
    }

    /**
     * Ruft den Wert der damageDirectEffectId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDamageDirectEffectId() {
        return damageDirectEffectId;
    }

    /**
     * Legt den Wert der damageDirectEffectId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDamageDirectEffectId(Integer value) {
        this.damageDirectEffectId = value;
    }

    /**
     * Ruft den Wert der damageHeadMultiplier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDamageHeadMultiplier() {
        return damageHeadMultiplier;
    }

    /**
     * Legt den Wert der damageHeadMultiplier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDamageHeadMultiplier(Float value) {
        this.damageHeadMultiplier = value;
    }

    /**
     * Ruft den Wert der damageIndirectEffectId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDamageIndirectEffectId() {
        return damageIndirectEffectId;
    }

    /**
     * Legt den Wert der damageIndirectEffectId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDamageIndirectEffectId(Integer value) {
        this.damageIndirectEffectId = value;
    }

    /**
     * Ruft den Wert der damageLegsMultiplier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDamageLegsMultiplier() {
        return damageLegsMultiplier;
    }

    /**
     * Legt den Wert der damageLegsMultiplier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDamageLegsMultiplier(Float value) {
        this.damageLegsMultiplier = value;
    }

    /**
     * Ruft den Wert der fireAmmoPerShot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireAmmoPerShot() {
        return fireAmmoPerShot;
    }

    /**
     * Legt den Wert der fireAmmoPerShot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireAmmoPerShot(Integer value) {
        this.fireAmmoPerShot = value;
    }

    /**
     * Ruft den Wert der fireAutoFireMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireAutoFireMs() {
        return fireAutoFireMs;
    }

    /**
     * Legt den Wert der fireAutoFireMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireAutoFireMs(Integer value) {
        this.fireAutoFireMs = value;
    }

    /**
     * Ruft den Wert der fireBurstCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireBurstCount() {
        return fireBurstCount;
    }

    /**
     * Legt den Wert der fireBurstCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireBurstCount(Integer value) {
        this.fireBurstCount = value;
    }

    /**
     * Ruft den Wert der fireChargeUpMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireChargeUpMs() {
        return fireChargeUpMs;
    }

    /**
     * Legt den Wert der fireChargeUpMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireChargeUpMs(Integer value) {
        this.fireChargeUpMs = value;
    }

    /**
     * Ruft den Wert der fireDelayMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireDelayMs() {
        return fireDelayMs;
    }

    /**
     * Legt den Wert der fireDelayMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireDelayMs(Integer value) {
        this.fireDelayMs = value;
    }

    /**
     * Ruft den Wert der fireDetectRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireDetectRange() {
        return fireDetectRange;
    }

    /**
     * Legt den Wert der fireDetectRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireDetectRange(Integer value) {
        this.fireDetectRange = value;
    }

    /**
     * Ruft den Wert der fireDurationMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireDurationMs() {
        return fireDurationMs;
    }

    /**
     * Legt den Wert der fireDurationMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireDurationMs(Integer value) {
        this.fireDurationMs = value;
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
     * Ruft den Wert der fireModeTypeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireModeTypeId() {
        return fireModeTypeId;
    }

    /**
     * Legt den Wert der fireModeTypeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireModeTypeId(Integer value) {
        this.fireModeTypeId = value;
    }

    /**
     * Ruft den Wert der firePelletsPerShot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirePelletsPerShot() {
        return firePelletsPerShot;
    }

    /**
     * Legt den Wert der firePelletsPerShot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirePelletsPerShot(Integer value) {
        this.firePelletsPerShot = value;
    }

    /**
     * Ruft den Wert der fireRefireMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireRefireMs() {
        return fireRefireMs;
    }

    /**
     * Legt den Wert der fireRefireMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireRefireMs(Integer value) {
        this.fireRefireMs = value;
    }

    /**
     * Ruft den Wert der griefImmune-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGriefImmune() {
        return griefImmune;
    }

    /**
     * Legt den Wert der griefImmune-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGriefImmune(Integer value) {
        this.griefImmune = value;
    }

    /**
     * Ruft den Wert der heatPerShot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeatPerShot() {
        return heatPerShot;
    }

    /**
     * Legt den Wert der heatPerShot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeatPerShot(Integer value) {
        this.heatPerShot = value;
    }

    /**
     * Ruft den Wert der heatRecoveryDelayMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeatRecoveryDelayMs() {
        return heatRecoveryDelayMs;
    }

    /**
     * Legt den Wert der heatRecoveryDelayMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeatRecoveryDelayMs(Integer value) {
        this.heatRecoveryDelayMs = value;
    }

    /**
     * Ruft den Wert der heatThreshold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeatThreshold() {
        return heatThreshold;
    }

    /**
     * Legt den Wert der heatThreshold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeatThreshold(Integer value) {
        this.heatThreshold = value;
    }

    /**
     * Ruft den Wert der ironSights-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIronSights() {
        return ironSights;
    }

    /**
     * Legt den Wert der ironSights-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIronSights(Boolean value) {
        this.ironSights = value;
    }

    /**
     * Ruft den Wert der laserGuided-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLaserGuided() {
        return laserGuided;
    }

    /**
     * Legt den Wert der laserGuided-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLaserGuided(Boolean value) {
        this.laserGuided = value;
    }

    /**
     * Ruft den Wert der lockonAcquireCloseMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLockonAcquireCloseMs() {
        return lockonAcquireCloseMs;
    }

    /**
     * Legt den Wert der lockonAcquireCloseMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLockonAcquireCloseMs(Integer value) {
        this.lockonAcquireCloseMs = value;
    }

    /**
     * Ruft den Wert der lockonAcquireFarMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLockonAcquireFarMs() {
        return lockonAcquireFarMs;
    }

    /**
     * Legt den Wert der lockonAcquireFarMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLockonAcquireFarMs(Integer value) {
        this.lockonAcquireFarMs = value;
    }

    /**
     * Ruft den Wert der lockonAcquireMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLockonAcquireMs() {
        return lockonAcquireMs;
    }

    /**
     * Legt den Wert der lockonAcquireMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLockonAcquireMs(Integer value) {
        this.lockonAcquireMs = value;
    }

    /**
     * Ruft den Wert der lockonAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockonAngle() {
        return lockonAngle;
    }

    /**
     * Legt den Wert der lockonAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockonAngle(Boolean value) {
        this.lockonAngle = value;
    }

    /**
     * Ruft den Wert der lockonLoseMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLockonLoseMs() {
        return lockonLoseMs;
    }

    /**
     * Legt den Wert der lockonLoseMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLockonLoseMs(Integer value) {
        this.lockonLoseMs = value;
    }

    /**
     * Ruft den Wert der lockonMaintain-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockonMaintain() {
        return lockonMaintain;
    }

    /**
     * Legt den Wert der lockonMaintain-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockonMaintain(Boolean value) {
        this.lockonMaintain = value;
    }

    /**
     * Ruft den Wert der lockonRadius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLockonRadius() {
        return lockonRadius;
    }

    /**
     * Legt den Wert der lockonRadius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLockonRadius(Float value) {
        this.lockonRadius = value;
    }

    /**
     * Ruft den Wert der lockonRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLockonRange() {
        return lockonRange;
    }

    /**
     * Legt den Wert der lockonRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLockonRange(Integer value) {
        this.lockonRange = value;
    }

    /**
     * Ruft den Wert der lockonRangeClose-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLockonRangeClose() {
        return lockonRangeClose;
    }

    /**
     * Legt den Wert der lockonRangeClose-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLockonRangeClose(Integer value) {
        this.lockonRangeClose = value;
    }

    /**
     * Ruft den Wert der lockonRangeFar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLockonRangeFar() {
        return lockonRangeFar;
    }

    /**
     * Legt den Wert der lockonRangeFar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLockonRangeFar(Integer value) {
        this.lockonRangeFar = value;
    }

    /**
     * Ruft den Wert der lockonRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockonRequired() {
        return lockonRequired;
    }

    /**
     * Legt den Wert der lockonRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockonRequired(Boolean value) {
        this.lockonRequired = value;
    }

    /**
     * Ruft den Wert der maxDamage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxDamage() {
        return maxDamage;
    }

    /**
     * Legt den Wert der maxDamage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxDamage(Integer value) {
        this.maxDamage = value;
    }

    /**
     * Ruft den Wert der maxDamageInd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxDamageInd() {
        return maxDamageInd;
    }

    /**
     * Legt den Wert der maxDamageInd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxDamageInd(Integer value) {
        this.maxDamageInd = value;
    }

    /**
     * Ruft den Wert der maxDamageIndRadius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxDamageIndRadius() {
        return maxDamageIndRadius;
    }

    /**
     * Legt den Wert der maxDamageIndRadius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxDamageIndRadius(Integer value) {
        this.maxDamageIndRadius = value;
    }

    /**
     * Ruft den Wert der maxDamageRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxDamageRange() {
        return maxDamageRange;
    }

    /**
     * Legt den Wert der maxDamageRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxDamageRange(Integer value) {
        this.maxDamageRange = value;
    }

    /**
     * Ruft den Wert der minDamage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinDamage() {
        return minDamage;
    }

    /**
     * Legt den Wert der minDamage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinDamage(Integer value) {
        this.minDamage = value;
    }

    /**
     * Ruft den Wert der minDamageInd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinDamageInd() {
        return minDamageInd;
    }

    /**
     * Legt den Wert der minDamageInd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinDamageInd(Integer value) {
        this.minDamageInd = value;
    }

    /**
     * Ruft den Wert der minDamageIndRadius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinDamageIndRadius() {
        return minDamageIndRadius;
    }

    /**
     * Legt den Wert der minDamageIndRadius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinDamageIndRadius(Integer value) {
        this.minDamageIndRadius = value;
    }

    /**
     * Ruft den Wert der minDamageRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinDamageRange() {
        return minDamageRange;
    }

    /**
     * Legt den Wert der minDamageRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinDamageRange(Integer value) {
        this.minDamageRange = value;
    }

    /**
     * Ruft den Wert der moveModifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMoveModifier() {
        return moveModifier;
    }

    /**
     * Legt den Wert der moveModifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMoveModifier(Double value) {
        this.moveModifier = value;
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
     * Ruft den Wert der projectileSpeedOverride-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProjectileSpeedOverride() {
        return projectileSpeedOverride;
    }

    /**
     * Legt den Wert der projectileSpeedOverride-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProjectileSpeedOverride(Boolean value) {
        this.projectileSpeedOverride = value;
    }

    /**
     * Ruft den Wert der recoilAngleMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecoilAngleMax() {
        return recoilAngleMax;
    }

    /**
     * Legt den Wert der recoilAngleMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecoilAngleMax(Integer value) {
        this.recoilAngleMax = value;
    }

    /**
     * Ruft den Wert der recoilAngleMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecoilAngleMin() {
        return recoilAngleMin;
    }

    /**
     * Legt den Wert der recoilAngleMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecoilAngleMin(Integer value) {
        this.recoilAngleMin = value;
    }

    /**
     * Ruft den Wert der recoilFirstShotModifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecoilFirstShotModifier() {
        return recoilFirstShotModifier;
    }

    /**
     * Legt den Wert der recoilFirstShotModifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecoilFirstShotModifier(Double value) {
        this.recoilFirstShotModifier = value;
    }

    /**
     * Ruft den Wert der recoilHorizontalMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRecoilHorizontalMax() {
        return recoilHorizontalMax;
    }

    /**
     * Legt den Wert der recoilHorizontalMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRecoilHorizontalMax(Float value) {
        this.recoilHorizontalMax = value;
    }

    /**
     * Ruft den Wert der recoilHorizontalMaxIncrease-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecoilHorizontalMaxIncrease() {
        return recoilHorizontalMaxIncrease;
    }

    /**
     * Legt den Wert der recoilHorizontalMaxIncrease-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecoilHorizontalMaxIncrease(Integer value) {
        this.recoilHorizontalMaxIncrease = value;
    }

    /**
     * Ruft den Wert der recoilHorizontalMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRecoilHorizontalMin() {
        return recoilHorizontalMin;
    }

    /**
     * Legt den Wert der recoilHorizontalMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRecoilHorizontalMin(Float value) {
        this.recoilHorizontalMin = value;
    }

    /**
     * Ruft den Wert der recoilHorizontalMinIncrease-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecoilHorizontalMinIncrease() {
        return recoilHorizontalMinIncrease;
    }

    /**
     * Legt den Wert der recoilHorizontalMinIncrease-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecoilHorizontalMinIncrease(Integer value) {
        this.recoilHorizontalMinIncrease = value;
    }

    /**
     * Ruft den Wert der recoilHorizontalTolerance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecoilHorizontalTolerance() {
        return recoilHorizontalTolerance;
    }

    /**
     * Legt den Wert der recoilHorizontalTolerance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecoilHorizontalTolerance(Double value) {
        this.recoilHorizontalTolerance = value;
    }

    /**
     * Ruft den Wert der recoilIncrease-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRecoilIncrease() {
        return recoilIncrease;
    }

    /**
     * Legt den Wert der recoilIncrease-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRecoilIncrease(Float value) {
        this.recoilIncrease = value;
    }

    /**
     * Ruft den Wert der recoilIncreaseCrouched-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRecoilIncreaseCrouched() {
        return recoilIncreaseCrouched;
    }

    /**
     * Legt den Wert der recoilIncreaseCrouched-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRecoilIncreaseCrouched(Float value) {
        this.recoilIncreaseCrouched = value;
    }

    /**
     * Ruft den Wert der recoilMagnitudeMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecoilMagnitudeMax() {
        return recoilMagnitudeMax;
    }

    /**
     * Legt den Wert der recoilMagnitudeMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecoilMagnitudeMax(Double value) {
        this.recoilMagnitudeMax = value;
    }

    /**
     * Ruft den Wert der recoilMagnitudeMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecoilMagnitudeMin() {
        return recoilMagnitudeMin;
    }

    /**
     * Legt den Wert der recoilMagnitudeMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecoilMagnitudeMin(Double value) {
        this.recoilMagnitudeMin = value;
    }

    /**
     * Ruft den Wert der recoilMaxTotalMagnitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecoilMaxTotalMagnitude() {
        return recoilMaxTotalMagnitude;
    }

    /**
     * Legt den Wert der recoilMaxTotalMagnitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecoilMaxTotalMagnitude(Integer value) {
        this.recoilMaxTotalMagnitude = value;
    }

    /**
     * Ruft den Wert der recoilRecoveryAcceleration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecoilRecoveryAcceleration() {
        return recoilRecoveryAcceleration;
    }

    /**
     * Legt den Wert der recoilRecoveryAcceleration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecoilRecoveryAcceleration(Integer value) {
        this.recoilRecoveryAcceleration = value;
    }

    /**
     * Ruft den Wert der recoilRecoveryDelayMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecoilRecoveryDelayMs() {
        return recoilRecoveryDelayMs;
    }

    /**
     * Legt den Wert der recoilRecoveryDelayMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecoilRecoveryDelayMs(Integer value) {
        this.recoilRecoveryDelayMs = value;
    }

    /**
     * Ruft den Wert der recoilRecoveryRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecoilRecoveryRate() {
        return recoilRecoveryRate;
    }

    /**
     * Legt den Wert der recoilRecoveryRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecoilRecoveryRate(Integer value) {
        this.recoilRecoveryRate = value;
    }

    /**
     * Ruft den Wert der recoilShotsAtMinMagnitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecoilShotsAtMinMagnitude() {
        return recoilShotsAtMinMagnitude;
    }

    /**
     * Legt den Wert der recoilShotsAtMinMagnitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecoilShotsAtMinMagnitude(Integer value) {
        this.recoilShotsAtMinMagnitude = value;
    }

    /**
     * Ruft den Wert der reloadAmmoFillMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReloadAmmoFillMs() {
        return reloadAmmoFillMs;
    }

    /**
     * Legt den Wert der reloadAmmoFillMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReloadAmmoFillMs(Integer value) {
        this.reloadAmmoFillMs = value;
    }

    /**
     * Ruft den Wert der reloadBlockAuto-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReloadBlockAuto() {
        return reloadBlockAuto;
    }

    /**
     * Legt den Wert der reloadBlockAuto-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReloadBlockAuto(Boolean value) {
        this.reloadBlockAuto = value;
    }

    /**
     * Ruft den Wert der reloadChamberMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReloadChamberMs() {
        return reloadChamberMs;
    }

    /**
     * Legt den Wert der reloadChamberMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReloadChamberMs(Integer value) {
        this.reloadChamberMs = value;
    }

    /**
     * Ruft den Wert der reloadContinuous-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReloadContinuous() {
        return reloadContinuous;
    }

    /**
     * Legt den Wert der reloadContinuous-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReloadContinuous(Boolean value) {
        this.reloadContinuous = value;
    }

    /**
     * Ruft den Wert der reloadLoopEndMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReloadLoopEndMs() {
        return reloadLoopEndMs;
    }

    /**
     * Legt den Wert der reloadLoopEndMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReloadLoopEndMs(Integer value) {
        this.reloadLoopEndMs = value;
    }

    /**
     * Ruft den Wert der reloadLoopStartMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReloadLoopStartMs() {
        return reloadLoopStartMs;
    }

    /**
     * Legt den Wert der reloadLoopStartMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReloadLoopStartMs(Integer value) {
        this.reloadLoopStartMs = value;
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
     * Ruft den Wert der shieldBypassPct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShieldBypassPct() {
        return shieldBypassPct;
    }

    /**
     * Legt den Wert der shieldBypassPct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShieldBypassPct(Integer value) {
        this.shieldBypassPct = value;
    }

    /**
     * Ruft den Wert der sprintFire-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSprintFire() {
        return sprintFire;
    }

    /**
     * Legt den Wert der sprintFire-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSprintFire(Integer value) {
        this.sprintFire = value;
    }

    /**
     * Ruft den Wert der swayAmplitudeX-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSwayAmplitudeX() {
        return swayAmplitudeX;
    }

    /**
     * Legt den Wert der swayAmplitudeX-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSwayAmplitudeX(Integer value) {
        this.swayAmplitudeX = value;
    }

    /**
     * Ruft den Wert der swayAmplitudeY-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSwayAmplitudeY() {
        return swayAmplitudeY;
    }

    /**
     * Legt den Wert der swayAmplitudeY-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSwayAmplitudeY(Integer value) {
        this.swayAmplitudeY = value;
    }

    /**
     * Ruft den Wert der swayCanSteady-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSwayCanSteady() {
        return swayCanSteady;
    }

    /**
     * Legt den Wert der swayCanSteady-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSwayCanSteady(Integer value) {
        this.swayCanSteady = value;
    }

    /**
     * Ruft den Wert der swayPeriodX-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSwayPeriodX() {
        return swayPeriodX;
    }

    /**
     * Legt den Wert der swayPeriodX-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSwayPeriodX(Integer value) {
        this.swayPeriodX = value;
    }

    /**
     * Ruft den Wert der swayPeriodY-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSwayPeriodY() {
        return swayPeriodY;
    }

    /**
     * Legt den Wert der swayPeriodY-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSwayPeriodY(Integer value) {
        this.swayPeriodY = value;
    }

    /**
     * Ruft den Wert der turnModifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTurnModifier() {
        return turnModifier;
    }

    /**
     * Legt den Wert der turnModifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTurnModifier(Double value) {
        this.turnModifier = value;
    }

    /**
     * Ruft den Wert der useInWater-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUseInWater() {
        return useInWater;
    }

    /**
     * Legt den Wert der useInWater-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUseInWater(Integer value) {
        this.useInWater = value;
    }

    /**
     * Ruft den Wert der zoomDefault-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getZoomDefault() {
        return zoomDefault;
    }

    /**
     * Legt den Wert der zoomDefault-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZoomDefault(Double value) {
        this.zoomDefault = value;
    }

}
