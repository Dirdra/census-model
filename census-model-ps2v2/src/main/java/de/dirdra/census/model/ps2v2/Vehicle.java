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
 * <p>Java-Klasse für vehicle complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vehicle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{}multi_language_description_type"/&gt;
 *         &lt;element name="description" type="{}multi_language_description_type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{}vehicle_id"/&gt;
 *       &lt;attribute ref="{}type_id"/&gt;
 *       &lt;attribute name="type_name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="cost" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}cost_resource_id"/&gt;
 *       &lt;attribute ref="{}image_set_id"/&gt;
 *       &lt;attribute ref="{}image_id"/&gt;
 *       &lt;attribute ref="{}image_path"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicle", propOrder = {
    "name",
    "description"
})
public class Vehicle {

    @XmlElement(required = true)
    protected MultiLanguageDescriptionType name;
    @XmlElement(required = true)
    protected MultiLanguageDescriptionType description;
    @XmlAttribute(name = "vehicle_id")
    protected Integer vehicleId;
    @XmlAttribute(name = "type_id")
    protected Integer typeId;
    @XmlAttribute(name = "type_name")
    protected String typeName;
    @XmlAttribute(name = "cost")
    protected Integer cost;
    @XmlAttribute(name = "cost_resource_id")
    protected Integer costResourceId;
    @XmlAttribute(name = "image_set_id")
    protected Integer imageSetId;
    @XmlAttribute(name = "image_id")
    protected Integer imageId;
    @XmlAttribute(name = "image_path")
    protected String imagePath;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiLanguageDescriptionType }
     *     
     */
    public MultiLanguageDescriptionType getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLanguageDescriptionType }
     *     
     */
    public void setName(MultiLanguageDescriptionType value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiLanguageDescriptionType }
     *     
     */
    public MultiLanguageDescriptionType getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLanguageDescriptionType }
     *     
     */
    public void setDescription(MultiLanguageDescriptionType value) {
        this.description = value;
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

    /**
     * Ruft den Wert der typeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * Legt den Wert der typeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeId(Integer value) {
        this.typeId = value;
    }

    /**
     * Ruft den Wert der typeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Legt den Wert der typeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

    /**
     * Ruft den Wert der cost-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCost() {
        return cost;
    }

    /**
     * Legt den Wert der cost-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCost(Integer value) {
        this.cost = value;
    }

    /**
     * Ruft den Wert der costResourceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCostResourceId() {
        return costResourceId;
    }

    /**
     * Legt den Wert der costResourceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCostResourceId(Integer value) {
        this.costResourceId = value;
    }

    /**
     * Ruft den Wert der imageSetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageSetId() {
        return imageSetId;
    }

    /**
     * Legt den Wert der imageSetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageSetId(Integer value) {
        this.imageSetId = value;
    }

    /**
     * Ruft den Wert der imageId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageId() {
        return imageId;
    }

    /**
     * Legt den Wert der imageId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageId(Integer value) {
        this.imageId = value;
    }

    /**
     * Ruft den Wert der imagePath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Legt den Wert der imagePath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePath(String value) {
        this.imagePath = value;
    }

}
