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
 * <p>Java-Klasse für world_stat_history complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="world_stat_history"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="day" type="{}stat_day_type"/&gt;
 *         &lt;element name="month" type="{}stat_month_type"/&gt;
 *         &lt;element name="week" type="{}stat_week_type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="all_time" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="faction" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="last_save" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="last_save_date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="stat_name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tracker_name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{}world_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "world_stat_history", propOrder = {
    "day",
    "month",
    "week"
})
public class WorldStatHistory {

    @XmlElement(required = true)
    protected StatDayType day;
    @XmlElement(required = true)
    protected StatMonthType month;
    @XmlElement(required = true)
    protected StatWeekType week;
    @XmlAttribute(name = "all_time")
    protected Integer allTime;
    @XmlAttribute(name = "faction")
    protected String faction;
    @XmlAttribute(name = "last_save")
    protected Long lastSave;
    @XmlAttribute(name = "last_save_date")
    protected String lastSaveDate;
    @XmlAttribute(name = "stat_name")
    protected String statName;
    @XmlAttribute(name = "tracker_name")
    protected String trackerName;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "world_id")
    protected Integer worldId;

    /**
     * Ruft den Wert der day-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatDayType }
     *     
     */
    public StatDayType getDay() {
        return day;
    }

    /**
     * Legt den Wert der day-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatDayType }
     *     
     */
    public void setDay(StatDayType value) {
        this.day = value;
    }

    /**
     * Ruft den Wert der month-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatMonthType }
     *     
     */
    public StatMonthType getMonth() {
        return month;
    }

    /**
     * Legt den Wert der month-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatMonthType }
     *     
     */
    public void setMonth(StatMonthType value) {
        this.month = value;
    }

    /**
     * Ruft den Wert der week-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatWeekType }
     *     
     */
    public StatWeekType getWeek() {
        return week;
    }

    /**
     * Legt den Wert der week-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatWeekType }
     *     
     */
    public void setWeek(StatWeekType value) {
        this.week = value;
    }

    /**
     * Ruft den Wert der allTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAllTime() {
        return allTime;
    }

    /**
     * Legt den Wert der allTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllTime(Integer value) {
        this.allTime = value;
    }

    /**
     * Ruft den Wert der faction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaction() {
        return faction;
    }

    /**
     * Legt den Wert der faction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaction(String value) {
        this.faction = value;
    }

    /**
     * Ruft den Wert der lastSave-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastSave() {
        return lastSave;
    }

    /**
     * Legt den Wert der lastSave-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastSave(Long value) {
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
     * Ruft den Wert der statName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatName() {
        return statName;
    }

    /**
     * Legt den Wert der statName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatName(String value) {
        this.statName = value;
    }

    /**
     * Ruft den Wert der trackerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackerName() {
        return trackerName;
    }

    /**
     * Legt den Wert der trackerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackerName(String value) {
        this.trackerName = value;
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

    /**
     * Ruft den Wert der worldId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorldId() {
        return worldId;
    }

    /**
     * Legt den Wert der worldId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorldId(Integer value) {
        this.worldId = value;
    }

}
