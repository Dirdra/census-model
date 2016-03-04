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
 * <p>Java-Klasse für characters_stat complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="characters_stat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}character_id"/&gt;
 *       &lt;attribute ref="{}last_save"/&gt;
 *       &lt;attribute ref="{}last_save_date"/&gt;
 *       &lt;attribute ref="{}profile_id"/&gt;
 *       &lt;attribute name="stat_name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="value_daily" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_forever" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_monthly" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_one_life_max" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_weekly" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "characters_stat")
public class CharactersStat {

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
    @XmlAttribute(name = "value_daily")
    protected Integer valueDaily;
    @XmlAttribute(name = "value_forever")
    protected Integer valueForever;
    @XmlAttribute(name = "value_monthly")
    protected Integer valueMonthly;
    @XmlAttribute(name = "value_one_life_max")
    protected Integer valueOneLifeMax;
    @XmlAttribute(name = "value_weekly")
    protected Integer valueWeekly;

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
     * Ruft den Wert der valueDaily-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueDaily() {
        return valueDaily;
    }

    /**
     * Legt den Wert der valueDaily-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueDaily(Integer value) {
        this.valueDaily = value;
    }

    /**
     * Ruft den Wert der valueForever-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueForever() {
        return valueForever;
    }

    /**
     * Legt den Wert der valueForever-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueForever(Integer value) {
        this.valueForever = value;
    }

    /**
     * Ruft den Wert der valueMonthly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueMonthly() {
        return valueMonthly;
    }

    /**
     * Legt den Wert der valueMonthly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueMonthly(Integer value) {
        this.valueMonthly = value;
    }

    /**
     * Ruft den Wert der valueOneLifeMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueOneLifeMax() {
        return valueOneLifeMax;
    }

    /**
     * Legt den Wert der valueOneLifeMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueOneLifeMax(Integer value) {
        this.valueOneLifeMax = value;
    }

    /**
     * Ruft den Wert der valueWeekly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueWeekly() {
        return valueWeekly;
    }

    /**
     * Legt den Wert der valueWeekly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueWeekly(Integer value) {
        this.valueWeekly = value;
    }

}
