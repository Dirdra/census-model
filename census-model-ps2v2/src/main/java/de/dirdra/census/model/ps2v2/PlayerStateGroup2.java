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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für player_state_group_2 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="player_state_group_2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="can_iron_sight" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *       &lt;attribute name="cof_grow_rate" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="cof_max" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="cof_min" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="cof_recovery_delay_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="cof_recovery_delay_threshold" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="cof_recovery_rate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="xsd:int" /&gt;
 *       &lt;attribute name="cof_shots_before_penalty" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="cof_turn_penalty" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}player_state_group_id"/&gt;
 *       &lt;attribute ref="{}player_state_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "player_state_group_2")
public class PlayerStateGroup2 {

    @XmlAttribute(name = "can_iron_sight")
    protected Short canIronSight;
    @XmlAttribute(name = "cof_grow_rate")
    protected Double cofGrowRate;
    @XmlAttribute(name = "cof_max")
    protected Double cofMax;
    @XmlAttribute(name = "cof_min")
    protected Double cofMin;
    @XmlAttribute(name = "cof_recovery_delay_ms")
    protected Integer cofRecoveryDelayMs;
    @XmlAttribute(name = "cof_recovery_delay_threshold")
    protected Integer cofRecoveryDelayThreshold;
    @XmlAttribute(name = "cof_recovery_rate")
    @XmlSchemaType(name = "anySimpleType")
    protected String cofRecoveryRate;
    @XmlAttribute(name = "cof_shots_before_penalty")
    protected Integer cofShotsBeforePenalty;
    @XmlAttribute(name = "cof_turn_penalty")
    protected Integer cofTurnPenalty;
    @XmlAttribute(name = "player_state_group_id")
    protected Integer playerStateGroupId;
    @XmlAttribute(name = "player_state_id")
    protected Integer playerStateId;

    /**
     * Ruft den Wert der canIronSight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCanIronSight() {
        return canIronSight;
    }

    /**
     * Legt den Wert der canIronSight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCanIronSight(Short value) {
        this.canIronSight = value;
    }

    /**
     * Ruft den Wert der cofGrowRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCofGrowRate() {
        return cofGrowRate;
    }

    /**
     * Legt den Wert der cofGrowRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCofGrowRate(Double value) {
        this.cofGrowRate = value;
    }

    /**
     * Ruft den Wert der cofMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCofMax() {
        return cofMax;
    }

    /**
     * Legt den Wert der cofMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCofMax(Double value) {
        this.cofMax = value;
    }

    /**
     * Ruft den Wert der cofMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCofMin() {
        return cofMin;
    }

    /**
     * Legt den Wert der cofMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCofMin(Double value) {
        this.cofMin = value;
    }

    /**
     * Ruft den Wert der cofRecoveryDelayMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCofRecoveryDelayMs() {
        return cofRecoveryDelayMs;
    }

    /**
     * Legt den Wert der cofRecoveryDelayMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCofRecoveryDelayMs(Integer value) {
        this.cofRecoveryDelayMs = value;
    }

    /**
     * Ruft den Wert der cofRecoveryDelayThreshold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCofRecoveryDelayThreshold() {
        return cofRecoveryDelayThreshold;
    }

    /**
     * Legt den Wert der cofRecoveryDelayThreshold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCofRecoveryDelayThreshold(Integer value) {
        this.cofRecoveryDelayThreshold = value;
    }

    /**
     * Ruft den Wert der cofRecoveryRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCofRecoveryRate() {
        if (cofRecoveryRate == null) {
            return "xsd:int";
        } else {
            return cofRecoveryRate;
        }
    }

    /**
     * Legt den Wert der cofRecoveryRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCofRecoveryRate(String value) {
        this.cofRecoveryRate = value;
    }

    /**
     * Ruft den Wert der cofShotsBeforePenalty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCofShotsBeforePenalty() {
        return cofShotsBeforePenalty;
    }

    /**
     * Legt den Wert der cofShotsBeforePenalty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCofShotsBeforePenalty(Integer value) {
        this.cofShotsBeforePenalty = value;
    }

    /**
     * Ruft den Wert der cofTurnPenalty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCofTurnPenalty() {
        return cofTurnPenalty;
    }

    /**
     * Legt den Wert der cofTurnPenalty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCofTurnPenalty(Integer value) {
        this.cofTurnPenalty = value;
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
     * Ruft den Wert der playerStateId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlayerStateId() {
        return playerStateId;
    }

    /**
     * Legt den Wert der playerStateId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlayerStateId(Integer value) {
        this.playerStateId = value;
    }

}
