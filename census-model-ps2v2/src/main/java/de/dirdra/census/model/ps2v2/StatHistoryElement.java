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
 * <p>Java-Klasse für stat_history_element complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="stat_history_element"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="day" type="{}stat_day_type"/&gt;
 *         &lt;element name="month" type="{}stat_month_type"/&gt;
 *         &lt;element name="week" type="{}stat_week_type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="all_time" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}last_save"/&gt;
 *       &lt;attribute ref="{}last_save_date"/&gt;
 *       &lt;attribute name="one_life_max" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stat_history_element", propOrder = {
    "day",
    "month",
    "week"
})
public class StatHistoryElement {

    @XmlElement(required = true)
    protected StatDayType day;
    @XmlElement(required = true)
    protected StatMonthType month;
    @XmlElement(required = true)
    protected StatWeekType week;
    @XmlAttribute(name = "all_time")
    protected Integer allTime;
    @XmlAttribute(name = "last_save")
    protected Integer lastSave;
    @XmlAttribute(name = "last_save_date")
    protected String lastSaveDate;
    @XmlAttribute(name = "one_life_max")
    protected Integer oneLifeMax;

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
     * Ruft den Wert der oneLifeMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOneLifeMax() {
        return oneLifeMax;
    }

    /**
     * Legt den Wert der oneLifeMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOneLifeMax(Integer value) {
        this.oneLifeMax = value;
    }

}
