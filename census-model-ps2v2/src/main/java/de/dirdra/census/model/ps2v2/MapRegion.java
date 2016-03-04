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
 * <p>Java-Klasse für map_region complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="map_region"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}facility_id"/&gt;
 *       &lt;attribute name="facility_name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="facility_type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{}facility_type_id"/&gt;
 *       &lt;attribute name="location_x" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="location_y" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="location_z" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute ref="{}map_region_id"/&gt;
 *       &lt;attribute name="reward_amount" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}reward_currency_id"/&gt;
 *       &lt;attribute ref="{}zone_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "map_region")
public class MapRegion {

    @XmlAttribute(name = "facility_id")
    protected Integer facilityId;
    @XmlAttribute(name = "facility_name")
    protected String facilityName;
    @XmlAttribute(name = "facility_type")
    protected String facilityType;
    @XmlAttribute(name = "facility_type_id")
    protected Integer facilityTypeId;
    @XmlAttribute(name = "location_x")
    protected Double locationX;
    @XmlAttribute(name = "location_y")
    protected Double locationY;
    @XmlAttribute(name = "location_z")
    protected Double locationZ;
    @XmlAttribute(name = "map_region_id")
    protected Integer mapRegionId;
    @XmlAttribute(name = "reward_amount")
    protected Integer rewardAmount;
    @XmlAttribute(name = "reward_currency_id")
    protected Integer rewardCurrencyId;
    @XmlAttribute(name = "zone_id")
    protected Integer zoneId;

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
     * Ruft den Wert der facilityName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * Legt den Wert der facilityName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityName(String value) {
        this.facilityName = value;
    }

    /**
     * Ruft den Wert der facilityType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityType() {
        return facilityType;
    }

    /**
     * Legt den Wert der facilityType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityType(String value) {
        this.facilityType = value;
    }

    /**
     * Ruft den Wert der facilityTypeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFacilityTypeId() {
        return facilityTypeId;
    }

    /**
     * Legt den Wert der facilityTypeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFacilityTypeId(Integer value) {
        this.facilityTypeId = value;
    }

    /**
     * Ruft den Wert der locationX-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocationX() {
        return locationX;
    }

    /**
     * Legt den Wert der locationX-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocationX(Double value) {
        this.locationX = value;
    }

    /**
     * Ruft den Wert der locationY-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocationY() {
        return locationY;
    }

    /**
     * Legt den Wert der locationY-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocationY(Double value) {
        this.locationY = value;
    }

    /**
     * Ruft den Wert der locationZ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocationZ() {
        return locationZ;
    }

    /**
     * Legt den Wert der locationZ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocationZ(Double value) {
        this.locationZ = value;
    }

    /**
     * Ruft den Wert der mapRegionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMapRegionId() {
        return mapRegionId;
    }

    /**
     * Legt den Wert der mapRegionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMapRegionId(Integer value) {
        this.mapRegionId = value;
    }

    /**
     * Ruft den Wert der rewardAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRewardAmount() {
        return rewardAmount;
    }

    /**
     * Legt den Wert der rewardAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRewardAmount(Integer value) {
        this.rewardAmount = value;
    }

    /**
     * Ruft den Wert der rewardCurrencyId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRewardCurrencyId() {
        return rewardCurrencyId;
    }

    /**
     * Legt den Wert der rewardCurrencyId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRewardCurrencyId(Integer value) {
        this.rewardCurrencyId = value;
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
