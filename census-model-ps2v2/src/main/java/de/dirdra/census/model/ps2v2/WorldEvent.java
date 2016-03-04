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
 * <p>Java-Klasse für world_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="world_event"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}facility_id"/&gt;
 *       &lt;attribute name="faction_old" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="faction_new" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="duration_held" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute ref="{}objective_id"/&gt;
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute ref="{}zone_id"/&gt;
 *       &lt;attribute ref="{}world_id"/&gt;
 *       &lt;attribute name="event_type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="table_type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{}outfit_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "world_event")
public class WorldEvent {

    @XmlAttribute(name = "facility_id")
    protected Integer facilityId;
    @XmlAttribute(name = "faction_old")
    protected Integer factionOld;
    @XmlAttribute(name = "faction_new")
    protected Integer factionNew;
    @XmlAttribute(name = "duration_held")
    protected Long durationHeld;
    @XmlAttribute(name = "objective_id")
    protected Integer objectiveId;
    @XmlAttribute(name = "timestamp")
    protected Long timestamp;
    @XmlAttribute(name = "zone_id")
    protected Integer zoneId;
    @XmlAttribute(name = "world_id")
    protected Integer worldId;
    @XmlAttribute(name = "event_type")
    protected String eventType;
    @XmlAttribute(name = "table_type")
    protected String tableType;
    @XmlAttribute(name = "outfit_id")
    protected Integer outfitId;

    /**
     * Ruft den Wert der facilityId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFacilityId() {
        return facilityId;
    }

    /**
     * Legt den Wert der facilityId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFacilityId(Integer value) {
        this.facilityId = value;
    }

    /**
     * Ruft den Wert der factionOld-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFactionOld() {
        return factionOld;
    }

    /**
     * Legt den Wert der factionOld-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFactionOld(Integer value) {
        this.factionOld = value;
    }

    /**
     * Ruft den Wert der factionNew-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFactionNew() {
        return factionNew;
    }

    /**
     * Legt den Wert der factionNew-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFactionNew(Integer value) {
        this.factionNew = value;
    }

    /**
     * Ruft den Wert der durationHeld-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDurationHeld() {
        return durationHeld;
    }

    /**
     * Legt den Wert der durationHeld-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDurationHeld(Long value) {
        this.durationHeld = value;
    }

    /**
     * Ruft den Wert der objectiveId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectiveId() {
        return objectiveId;
    }

    /**
     * Legt den Wert der objectiveId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectiveId(Integer value) {
        this.objectiveId = value;
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
     * Ruft den Wert der outfitId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutfitId() {
        return outfitId;
    }

    /**
     * Legt den Wert der outfitId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutfitId(Integer value) {
        this.outfitId = value;
    }

}
