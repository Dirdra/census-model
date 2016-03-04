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
 * <p>Java-Klasse für event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="event"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}achievement_id"/&gt;
 *       &lt;attribute ref="{}character_id"/&gt;
 *       &lt;attribute name="event_type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="table_type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute ref="{}world_id"/&gt;
 *       &lt;attribute ref="{}zone_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "event")
public class Event {

    @XmlAttribute(name = "achievement_id")
    protected Integer achievementId;
    @XmlAttribute(name = "character_id")
    protected Long characterId;
    @XmlAttribute(name = "event_type")
    protected String eventType;
    @XmlAttribute(name = "table_type")
    protected String tableType;
    @XmlAttribute(name = "timestamp")
    protected Long timestamp;
    @XmlAttribute(name = "world_id")
    protected Integer worldId;
    @XmlAttribute(name = "zone_id")
    protected Integer zoneId;

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
     * Ruft den Wert der eventType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Legt den Wert der eventType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Ruft den Wert der tableType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * Legt den Wert der tableType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableType(String value) {
        this.tableType = value;
    }

    /**
     * Ruft den Wert der timestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Legt den Wert der timestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimestamp(Long value) {
        this.timestamp = value;
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

    /**
     * Ruft den Wert der zoneId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZoneId() {
        return zoneId;
    }

    /**
     * Legt den Wert der zoneId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZoneId(Integer value) {
        this.zoneId = value;
    }

}
