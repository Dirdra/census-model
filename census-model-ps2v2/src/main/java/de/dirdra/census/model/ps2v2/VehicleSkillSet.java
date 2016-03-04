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
 * <p>Java-Klasse für vehicle_skill_set complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vehicle_skill_set"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="display_index" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}faction_id"/&gt;
 *       &lt;attribute ref="{}skill_set_id"/&gt;
 *       &lt;attribute ref="{}vehicle_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicle_skill_set")
public class VehicleSkillSet {

    @XmlAttribute(name = "display_index")
    protected Integer displayIndex;
    @XmlAttribute(name = "faction_id")
    protected Integer factionId;
    @XmlAttribute(name = "skill_set_id")
    protected Integer skillSetId;
    @XmlAttribute(name = "vehicle_id")
    protected Integer vehicleId;

    /**
     * Ruft den Wert der displayIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayIndex() {
        return displayIndex;
    }

    /**
     * Legt den Wert der displayIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayIndex(Integer value) {
        this.displayIndex = value;
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
     * Ruft den Wert der skillSetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSkillSetId() {
        return skillSetId;
    }

    /**
     * Legt den Wert der skillSetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSkillSetId(Integer value) {
        this.skillSetId = value;
    }

    /**
     * Ruft den Wert der vehicleId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVehicleId() {
        return vehicleId;
    }

    /**
     * Legt den Wert der vehicleId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVehicleId(Integer value) {
        this.vehicleId = value;
    }

}
