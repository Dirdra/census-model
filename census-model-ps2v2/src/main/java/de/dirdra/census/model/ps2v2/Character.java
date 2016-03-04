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
 * <p>Java-Klasse für character complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="character"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}name"/&gt;
 *         &lt;element ref="{}battle_rank"/&gt;
 *         &lt;element ref="{}certs"/&gt;
 *         &lt;element ref="{}daily_ribbon"/&gt;
 *         &lt;element ref="{}times"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{}basicCharacterAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "character", propOrder = {
    "name",
    "battleRank",
    "certs",
    "dailyRibbon",
    "times"
})
public class Character {

    @XmlElement(required = true)
    protected NameType name;
    @XmlElement(name = "battle_rank", required = true)
    protected BattleRankType battleRank;
    @XmlElement(required = true)
    protected CertsType certs;
    @XmlElement(name = "daily_ribbon", required = true)
    protected DailyRibbonType dailyRibbon;
    @XmlElement(required = true)
    protected TimesType times;
    @XmlAttribute(name = "character_id")
    protected Long characterId;
    @XmlAttribute(name = "faction_id")
    protected Integer factionId;
    @XmlAttribute(name = "head_id")
    protected Integer headId;
    @XmlAttribute(name = "profile_id")
    protected Integer profileId;
    @XmlAttribute(name = "title_id")
    protected Integer titleId;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der battleRank-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BattleRankType }
     *     
     */
    public BattleRankType getBattleRank() {
        return battleRank;
    }

    /**
     * Legt den Wert der battleRank-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BattleRankType }
     *     
     */
    public void setBattleRank(BattleRankType value) {
        this.battleRank = value;
    }

    /**
     * Ruft den Wert der certs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CertsType }
     *     
     */
    public CertsType getCerts() {
        return certs;
    }

    /**
     * Legt den Wert der certs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CertsType }
     *     
     */
    public void setCerts(CertsType value) {
        this.certs = value;
    }

    /**
     * Ruft den Wert der dailyRibbon-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DailyRibbonType }
     *     
     */
    public DailyRibbonType getDailyRibbon() {
        return dailyRibbon;
    }

    /**
     * Legt den Wert der dailyRibbon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyRibbonType }
     *     
     */
    public void setDailyRibbon(DailyRibbonType value) {
        this.dailyRibbon = value;
    }

    /**
     * Ruft den Wert der times-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimesType }
     *     
     */
    public TimesType getTimes() {
        return times;
    }

    /**
     * Legt den Wert der times-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimesType }
     *     
     */
    public void setTimes(TimesType value) {
        this.times = value;
    }

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
     * Ruft den Wert der factionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFactionId() {
        return factionId;
    }

    /**
     * Legt den Wert der factionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFactionId(Integer value) {
        this.factionId = value;
    }

    /**
     * Ruft den Wert der headId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeadId() {
        return headId;
    }

    /**
     * Legt den Wert der headId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeadId(Integer value) {
        this.headId = value;
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
     * Ruft den Wert der titleId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTitleId() {
        return titleId;
    }

    /**
     * Legt den Wert der titleId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTitleId(Integer value) {
        this.titleId = value;
    }

}
