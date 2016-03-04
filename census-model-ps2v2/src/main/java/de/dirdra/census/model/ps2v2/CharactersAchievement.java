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
 * <p>Java-Klasse für characters_achievement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="characters_achievement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="achievement_id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}character_id"/&gt;
 *       &lt;attribute name="earned_count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="finish" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="finish_date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{}last_save"/&gt;
 *       &lt;attribute ref="{}last_save_date"/&gt;
 *       &lt;attribute ref="{}start"/&gt;
 *       &lt;attribute ref="{}start_date"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "characters_achievement")
public class CharactersAchievement {

    @XmlAttribute(name = "achievement_id")
    protected Integer achievementId;
    @XmlAttribute(name = "character_id")
    protected Long characterId;
    @XmlAttribute(name = "earned_count")
    protected Integer earnedCount;
    @XmlAttribute(name = "finish")
    protected Integer finish;
    @XmlAttribute(name = "finish_date")
    protected String finishDate;
    @XmlAttribute(name = "last_save")
    protected Integer lastSave;
    @XmlAttribute(name = "last_save_date")
    protected String lastSaveDate;
    @XmlAttribute(name = "start")
    protected Integer start;
    @XmlAttribute(name = "start_date")
    protected String startDate;

    /**
     * Ruft den Wert der achievementId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAchievementId() {
        return achievementId;
    }

    /**
     * Legt den Wert der achievementId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAchievementId(Integer value) {
        this.achievementId = value;
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
     * Ruft den Wert der earnedCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEarnedCount() {
        return earnedCount;
    }

    /**
     * Legt den Wert der earnedCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEarnedCount(Integer value) {
        this.earnedCount = value;
    }

    /**
     * Ruft den Wert der finish-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFinish() {
        return finish;
    }

    /**
     * Legt den Wert der finish-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFinish(Integer value) {
        this.finish = value;
    }

    /**
     * Ruft den Wert der finishDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishDate() {
        return finishDate;
    }

    /**
     * Legt den Wert der finishDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishDate(String value) {
        this.finishDate = value;
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
     * Ruft den Wert der start-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStart() {
        return start;
    }

    /**
     * Legt den Wert der start-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStart(Integer value) {
        this.start = value;
    }

    /**
     * Ruft den Wert der startDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Legt den Wert der startDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

}
