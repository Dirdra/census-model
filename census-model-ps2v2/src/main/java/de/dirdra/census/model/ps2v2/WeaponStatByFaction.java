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
 * <p>Java-Klasse für weapon_stat_by_faction complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="weapon_stat_by_faction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}character_id"/&gt;
 *       &lt;attribute name="item_id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}last_save"/&gt;
 *       &lt;attribute ref="{}last_save_date"/&gt;
 *       &lt;attribute name="stat_name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="value_nc" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_tr" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="value_vs" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="vehicle_id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weapon_stat_by_faction")
public class WeaponStatByFaction {

    @XmlAttribute(name = "character_id")
    protected Long characterId;
    @XmlAttribute(name = "item_id")
    protected Integer itemId;
    @XmlAttribute(name = "last_save")
    protected Integer lastSave;
    @XmlAttribute(name = "last_save_date")
    protected String lastSaveDate;
    @XmlAttribute(name = "stat_name")
    protected String statName;
    @XmlAttribute(name = "value_nc")
    protected Integer valueNc;
    @XmlAttribute(name = "value_tr")
    protected Integer valueTr;
    @XmlAttribute(name = "value_vs")
    protected Integer valueVs;
    @XmlAttribute(name = "vehicle_id")
    protected Integer vehicleId;

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
     * Ruft den Wert der itemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * Legt den Wert der itemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemId(Integer value) {
        this.itemId = value;
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
     * Ruft den Wert der valueNc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueNc() {
        return valueNc;
    }

    /**
     * Legt den Wert der valueNc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueNc(Integer value) {
        this.valueNc = value;
    }

    /**
     * Ruft den Wert der valueTr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueTr() {
        return valueTr;
    }

    /**
     * Legt den Wert der valueTr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueTr(Integer value) {
        this.valueTr = value;
    }

    /**
     * Ruft den Wert der valueVs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueVs() {
        return valueVs;
    }

    /**
     * Legt den Wert der valueVs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueVs(Integer value) {
        this.valueVs = value;
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
