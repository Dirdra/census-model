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
 * <p>Java-Klasse für stat_history complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="stat_history"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="battle_rank" type="{}stat_history_element"/&gt;
 *         &lt;element name="certs" type="{}stat_history_element"/&gt;
 *         &lt;element name="deaths" type="{}stat_history_element"/&gt;
 *         &lt;element name="facility_capture" type="{}stat_history_element"/&gt;
 *         &lt;element name="facility_defend" type="{}stat_history_element"/&gt;
 *         &lt;element name="kills" type="{}stat_history_element"/&gt;
 *         &lt;element name="medals" type="{}stat_history_element"/&gt;
 *         &lt;element name="ribbons" type="{}stat_history_element"/&gt;
 *         &lt;element name="score" type="{}stat_history_element"/&gt;
 *         &lt;element name="time" type="{}stat_history_element"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stat_history", propOrder = {
    "battleRank",
    "certs",
    "deaths",
    "facilityCapture",
    "facilityDefend",
    "kills",
    "medals",
    "ribbons",
    "score",
    "time"
})
public class StatHistory {

    @XmlElement(name = "battle_rank", required = true)
    protected StatHistoryElement battleRank;
    @XmlElement(required = true)
    protected StatHistoryElement certs;
    @XmlElement(required = true)
    protected StatHistoryElement deaths;
    @XmlElement(name = "facility_capture", required = true)
    protected StatHistoryElement facilityCapture;
    @XmlElement(name = "facility_defend", required = true)
    protected StatHistoryElement facilityDefend;
    @XmlElement(required = true)
    protected StatHistoryElement kills;
    @XmlElement(required = true)
    protected StatHistoryElement medals;
    @XmlElement(required = true)
    protected StatHistoryElement ribbons;
    @XmlElement(required = true)
    protected StatHistoryElement score;
    @XmlElement(required = true)
    protected StatHistoryElement time;

    /**
     * Ruft den Wert der battleRank-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatHistoryElement }
     *     
     */
    public StatHistoryElement getBattleRank() {
        return battleRank;
    }

    /**
     * Legt den Wert der battleRank-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatHistoryElement }
     *     
     */
    public void setBattleRank(StatHistoryElement value) {
        this.battleRank = value;
    }

    /**
     * Ruft den Wert der certs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatHistoryElement }
     *     
     */
    public StatHistoryElement getCerts() {
        return certs;
    }

    /**
     * Legt den Wert der certs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatHistoryElement }
     *     
     */
    public void setCerts(StatHistoryElement value) {
        this.certs = value;
    }

    /**
     * Ruft den Wert der deaths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatHistoryElement }
     *     
     */
    public StatHistoryElement getDeaths() {
        return deaths;
    }

    /**
     * Legt den Wert der deaths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatHistoryElement }
     *     
     */
    public void setDeaths(StatHistoryElement value) {
        this.deaths = value;
    }

    /**
     * Ruft den Wert der facilityCapture-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatHistoryElement }
     *     
     */
    public StatHistoryElement getFacilityCapture() {
        return facilityCapture;
    }

    /**
     * Legt den Wert der facilityCapture-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatHistoryElement }
     *     
     */
    public void setFacilityCapture(StatHistoryElement value) {
        this.facilityCapture = value;
    }

    /**
     * Ruft den Wert der facilityDefend-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatHistoryElement }
     *     
     */
    public StatHistoryElement getFacilityDefend() {
        return facilityDefend;
    }

    /**
     * Legt den Wert der facilityDefend-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatHistoryElement }
     *     
     */
    public void setFacilityDefend(StatHistoryElement value) {
        this.facilityDefend = value;
    }

    /**
     * Ruft den Wert der kills-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatHistoryElement }
     *     
     */
    public StatHistoryElement getKills() {
        return kills;
    }

    /**
     * Legt den Wert der kills-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatHistoryElement }
     *     
     */
    public void setKills(StatHistoryElement value) {
        this.kills = value;
    }

    /**
     * Ruft den Wert der medals-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatHistoryElement }
     *     
     */
    public StatHistoryElement getMedals() {
        return medals;
    }

    /**
     * Legt den Wert der medals-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatHistoryElement }
     *     
     */
    public void setMedals(StatHistoryElement value) {
        this.medals = value;
    }

    /**
     * Ruft den Wert der ribbons-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatHistoryElement }
     *     
     */
    public StatHistoryElement getRibbons() {
        return ribbons;
    }

    /**
     * Legt den Wert der ribbons-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatHistoryElement }
     *     
     */
    public void setRibbons(StatHistoryElement value) {
        this.ribbons = value;
    }

    /**
     * Ruft den Wert der score-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatHistoryElement }
     *     
     */
    public StatHistoryElement getScore() {
        return score;
    }

    /**
     * Legt den Wert der score-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatHistoryElement }
     *     
     */
    public void setScore(StatHistoryElement value) {
        this.score = value;
    }

    /**
     * Ruft den Wert der time-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatHistoryElement }
     *     
     */
    public StatHistoryElement getTime() {
        return time;
    }

    /**
     * Legt den Wert der time-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatHistoryElement }
     *     
     */
    public void setTime(StatHistoryElement value) {
        this.time = value;
    }

}
