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
 * <p>Java-Klasse für weapon complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="weapon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}weapon_id"/&gt;
 *       &lt;attribute name="turn_modifier" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="move_modifier" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="sprint_recovery_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="equip_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="unequip_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="to_iron_sights_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="from_iron_sights_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="melee_detect_width" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="melee_detect_height" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="heat_capacity" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="heat_bleed_off_rate" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="heat_overheat_penalty_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}weapon_group_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weapon")
public class Weapon {

    @XmlAttribute(name = "weapon_id")
    protected Integer weaponId;
    @XmlAttribute(name = "turn_modifier")
    protected Double turnModifier;
    @XmlAttribute(name = "move_modifier")
    protected Double moveModifier;
    @XmlAttribute(name = "sprint_recovery_ms")
    protected Integer sprintRecoveryMs;
    @XmlAttribute(name = "equip_ms")
    protected Integer equipMs;
    @XmlAttribute(name = "unequip_ms")
    protected Integer unequipMs;
    @XmlAttribute(name = "to_iron_sights_ms")
    protected Integer toIronSightsMs;
    @XmlAttribute(name = "from_iron_sights_ms")
    protected Integer fromIronSightsMs;
    @XmlAttribute(name = "melee_detect_width")
    protected Double meleeDetectWidth;
    @XmlAttribute(name = "melee_detect_height")
    protected Double meleeDetectHeight;
    @XmlAttribute(name = "heat_capacity")
    protected Integer heatCapacity;
    @XmlAttribute(name = "heat_bleed_off_rate")
    protected Double heatBleedOffRate;
    @XmlAttribute(name = "heat_overheat_penalty_ms")
    protected Integer heatOverheatPenaltyMs;
    @XmlAttribute(name = "weapon_group_id")
    protected Integer weaponGroupId;

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
     * Ruft den Wert der sprintRecoveryMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSprintRecoveryMs() {
        return sprintRecoveryMs;
    }

    /**
     * Legt den Wert der sprintRecoveryMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSprintRecoveryMs(Integer value) {
        this.sprintRecoveryMs = value;
    }

    /**
     * Ruft den Wert der equipMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEquipMs() {
        return equipMs;
    }

    /**
     * Legt den Wert der equipMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEquipMs(Integer value) {
        this.equipMs = value;
    }

    /**
     * Ruft den Wert der unequipMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnequipMs() {
        return unequipMs;
    }

    /**
     * Legt den Wert der unequipMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnequipMs(Integer value) {
        this.unequipMs = value;
    }

    /**
     * Ruft den Wert der toIronSightsMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getToIronSightsMs() {
        return toIronSightsMs;
    }

    /**
     * Legt den Wert der toIronSightsMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setToIronSightsMs(Integer value) {
        this.toIronSightsMs = value;
    }

    /**
     * Ruft den Wert der fromIronSightsMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFromIronSightsMs() {
        return fromIronSightsMs;
    }

    /**
     * Legt den Wert der fromIronSightsMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFromIronSightsMs(Integer value) {
        this.fromIronSightsMs = value;
    }

    /**
     * Ruft den Wert der meleeDetectWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMeleeDetectWidth() {
        return meleeDetectWidth;
    }

    /**
     * Legt den Wert der meleeDetectWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMeleeDetectWidth(Double value) {
        this.meleeDetectWidth = value;
    }

    /**
     * Ruft den Wert der meleeDetectHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMeleeDetectHeight() {
        return meleeDetectHeight;
    }

    /**
     * Legt den Wert der meleeDetectHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMeleeDetectHeight(Double value) {
        this.meleeDetectHeight = value;
    }

    /**
     * Ruft den Wert der heatCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeatCapacity() {
        return heatCapacity;
    }

    /**
     * Legt den Wert der heatCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeatCapacity(Integer value) {
        this.heatCapacity = value;
    }

    /**
     * Ruft den Wert der heatBleedOffRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeatBleedOffRate() {
        return heatBleedOffRate;
    }

    /**
     * Legt den Wert der heatBleedOffRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeatBleedOffRate(Double value) {
        this.heatBleedOffRate = value;
    }

    /**
     * Ruft den Wert der heatOverheatPenaltyMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeatOverheatPenaltyMs() {
        return heatOverheatPenaltyMs;
    }

    /**
     * Legt den Wert der heatOverheatPenaltyMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeatOverheatPenaltyMs(Integer value) {
        this.heatOverheatPenaltyMs = value;
    }

    /**
     * Ruft den Wert der weaponGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeaponGroupId() {
        return weaponGroupId;
    }

    /**
     * Legt den Wert der weaponGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeaponGroupId(Integer value) {
        this.weaponGroupId = value;
    }

}
