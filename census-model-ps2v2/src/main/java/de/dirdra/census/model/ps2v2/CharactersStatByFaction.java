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
 * <p>Java-Klasse für characters_stat_by_faction complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="characters_stat_by_faction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}character_id"/&gt;
 *       &lt;attribute ref="{}last_save"/&gt;
 *       &lt;attribute ref="{}last_save_date"/&gt;
 *       &lt;attribute ref="{}profile_id"/&gt;
 *       &lt;attribute name="stat_name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="value_daily_nc" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_daily_tr" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_daily_vs" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_forever_nc" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_forever_tr" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_forever_vs" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_monthly_nc" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_monthly_tr" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_monthly_vs" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_one_life_max_nc" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_one_life_max_tr" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_one_life_max_vs" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_weekly_nc" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_weekly_tr" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_weekly_vs" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "characters_stat_by_faction")
public class CharactersStatByFaction {

    @XmlAttribute(name = "character_id")
    protected Long characterId;
    @XmlAttribute(name = "last_save")
    protected Integer lastSave;
    @XmlAttribute(name = "last_save_date")
    protected String lastSaveDate;
    @XmlAttribute(name = "profile_id")
    protected Integer profileId;
    @XmlAttribute(name = "stat_name")
    protected String statName;
    @XmlAttribute(name = "value_daily_nc")
    protected Integer valueDailyNc;
    @XmlAttribute(name = "value_daily_tr")
    protected Integer valueDailyTr;
    @XmlAttribute(name = "value_daily_vs")
    protected Integer valueDailyVs;
    @XmlAttribute(name = "value_forever_nc")
    protected Integer valueForeverNc;
    @XmlAttribute(name = "value_forever_tr")
    protected Integer valueForeverTr;
    @XmlAttribute(name = "value_forever_vs")
    protected Integer valueForeverVs;
    @XmlAttribute(name = "value_monthly_nc")
    protected Integer valueMonthlyNc;
    @XmlAttribute(name = "value_monthly_tr")
    protected Integer valueMonthlyTr;
    @XmlAttribute(name = "value_monthly_vs")
    protected Integer valueMonthlyVs;
    @XmlAttribute(name = "value_one_life_max_nc")
    protected Integer valueOneLifeMaxNc;
    @XmlAttribute(name = "value_one_life_max_tr")
    protected Integer valueOneLifeMaxTr;
    @XmlAttribute(name = "value_one_life_max_vs")
    protected Integer valueOneLifeMaxVs;
    @XmlAttribute(name = "value_weekly_nc")
    protected Integer valueWeeklyNc;
    @XmlAttribute(name = "value_weekly_tr")
    protected Integer valueWeeklyTr;
    @XmlAttribute(name = "value_weekly_vs")
    protected Integer valueWeeklyVs;

    /**
     * Ruft den Wert der characterId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCharacterId() {
        return characterId;
    }

    /**
     * Legt den Wert der characterId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCharacterId(Long value) {
        this.characterId = value;
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
     * Ruft den Wert der profileId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProfileId() {
        return profileId;
    }

    /**
     * Legt den Wert der profileId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProfileId(Integer value) {
        this.profileId = value;
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
     * Ruft den Wert der valueDailyNc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueDailyNc() {
        return valueDailyNc;
    }

    /**
     * Legt den Wert der valueDailyNc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueDailyNc(Integer value) {
        this.valueDailyNc = value;
    }

    /**
     * Ruft den Wert der valueDailyTr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueDailyTr() {
        return valueDailyTr;
    }

    /**
     * Legt den Wert der valueDailyTr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueDailyTr(Integer value) {
        this.valueDailyTr = value;
    }

    /**
     * Ruft den Wert der valueDailyVs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueDailyVs() {
        return valueDailyVs;
    }

    /**
     * Legt den Wert der valueDailyVs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueDailyVs(Integer value) {
        this.valueDailyVs = value;
    }

    /**
     * Ruft den Wert der valueForeverNc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueForeverNc() {
        return valueForeverNc;
    }

    /**
     * Legt den Wert der valueForeverNc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueForeverNc(Integer value) {
        this.valueForeverNc = value;
    }

    /**
     * Ruft den Wert der valueForeverTr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueForeverTr() {
        return valueForeverTr;
    }

    /**
     * Legt den Wert der valueForeverTr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueForeverTr(Integer value) {
        this.valueForeverTr = value;
    }

    /**
     * Ruft den Wert der valueForeverVs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueForeverVs() {
        return valueForeverVs;
    }

    /**
     * Legt den Wert der valueForeverVs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueForeverVs(Integer value) {
        this.valueForeverVs = value;
    }

    /**
     * Ruft den Wert der valueMonthlyNc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueMonthlyNc() {
        return valueMonthlyNc;
    }

    /**
     * Legt den Wert der valueMonthlyNc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueMonthlyNc(Integer value) {
        this.valueMonthlyNc = value;
    }

    /**
     * Ruft den Wert der valueMonthlyTr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueMonthlyTr() {
        return valueMonthlyTr;
    }

    /**
     * Legt den Wert der valueMonthlyTr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueMonthlyTr(Integer value) {
        this.valueMonthlyTr = value;
    }

    /**
     * Ruft den Wert der valueMonthlyVs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueMonthlyVs() {
        return valueMonthlyVs;
    }

    /**
     * Legt den Wert der valueMonthlyVs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueMonthlyVs(Integer value) {
        this.valueMonthlyVs = value;
    }

    /**
     * Ruft den Wert der valueOneLifeMaxNc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueOneLifeMaxNc() {
        return valueOneLifeMaxNc;
    }

    /**
     * Legt den Wert der valueOneLifeMaxNc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueOneLifeMaxNc(Integer value) {
        this.valueOneLifeMaxNc = value;
    }

    /**
     * Ruft den Wert der valueOneLifeMaxTr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueOneLifeMaxTr() {
        return valueOneLifeMaxTr;
    }

    /**
     * Legt den Wert der valueOneLifeMaxTr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueOneLifeMaxTr(Integer value) {
        this.valueOneLifeMaxTr = value;
    }

    /**
     * Ruft den Wert der valueOneLifeMaxVs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueOneLifeMaxVs() {
        return valueOneLifeMaxVs;
    }

    /**
     * Legt den Wert der valueOneLifeMaxVs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueOneLifeMaxVs(Integer value) {
        this.valueOneLifeMaxVs = value;
    }

    /**
     * Ruft den Wert der valueWeeklyNc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueWeeklyNc() {
        return valueWeeklyNc;
    }

    /**
     * Legt den Wert der valueWeeklyNc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueWeeklyNc(Integer value) {
        this.valueWeeklyNc = value;
    }

    /**
     * Ruft den Wert der valueWeeklyTr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueWeeklyTr() {
        return valueWeeklyTr;
    }

    /**
     * Legt den Wert der valueWeeklyTr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueWeeklyTr(Integer value) {
        this.valueWeeklyTr = value;
    }

    /**
     * Ruft den Wert der valueWeeklyVs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueWeeklyVs() {
        return valueWeeklyVs;
    }

    /**
     * Legt den Wert der valueWeeklyVs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueWeeklyVs(Integer value) {
        this.valueWeeklyVs = value;
    }

}
