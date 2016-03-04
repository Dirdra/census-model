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
 * <p>Java-Klasse für profile complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="profile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{}multi_language_description_type"/&gt;
 *         &lt;element name="description" type="{}multi_language_description_type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{}profile_id"/&gt;
 *       &lt;attribute ref="{}profile_type_id"/&gt;
 *       &lt;attribute name="profile_type_description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{}faction_id"/&gt;
 *       &lt;attribute ref="{}image_set_id"/&gt;
 *       &lt;attribute ref="{}image_id"/&gt;
 *       &lt;attribute name="image_path" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="movement_speed" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="backpedal_speed_modifier" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="sprint_speed_modifier" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="strafe_speed_modifier" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profile", propOrder = {
    "name",
    "description"
})
public class Profile {

    @XmlElement(required = true)
    protected MultiLanguageDescriptionType name;
    @XmlElement(required = true)
    protected MultiLanguageDescriptionType description;
    @XmlAttribute(name = "profile_id")
    protected Integer profileId;
    @XmlAttribute(name = "profile_type_id")
    protected Integer profileTypeId;
    @XmlAttribute(name = "profile_type_description")
    protected String profileTypeDescription;
    @XmlAttribute(name = "faction_id")
    protected Integer factionId;
    @XmlAttribute(name = "image_set_id")
    protected Integer imageSetId;
    @XmlAttribute(name = "image_id")
    protected Integer imageId;
    @XmlAttribute(name = "image_path")
    protected String imagePath;
    @XmlAttribute(name = "movement_speed")
    protected Integer movementSpeed;
    @XmlAttribute(name = "backpedal_speed_modifier")
    protected Double backpedalSpeedModifier;
    @XmlAttribute(name = "sprint_speed_modifier")
    protected Double sprintSpeedModifier;
    @XmlAttribute(name = "strafe_speed_modifier")
    protected Double strafeSpeedModifier;

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
     * Ruft den Wert der profileTypeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProfileTypeId() {
        return profileTypeId;
    }

    /**
     * Legt den Wert der profileTypeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProfileTypeId(Integer value) {
        this.profileTypeId = value;
    }

    /**
     * Ruft den Wert der profileTypeDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileTypeDescription() {
        return profileTypeDescription;
    }

    /**
     * Legt den Wert der profileTypeDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileTypeDescription(String value) {
        this.profileTypeDescription = value;
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

    /**
     * Ruft den Wert der movementSpeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMovementSpeed() {
        return movementSpeed;
    }

    /**
     * Legt den Wert der movementSpeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMovementSpeed(Integer value) {
        this.movementSpeed = value;
    }

    /**
     * Ruft den Wert der backpedalSpeedModifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBackpedalSpeedModifier() {
        return backpedalSpeedModifier;
    }

    /**
     * Legt den Wert der backpedalSpeedModifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBackpedalSpeedModifier(Double value) {
        this.backpedalSpeedModifier = value;
    }

    /**
     * Ruft den Wert der sprintSpeedModifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSprintSpeedModifier() {
        return sprintSpeedModifier;
    }

    /**
     * Legt den Wert der sprintSpeedModifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSprintSpeedModifier(Double value) {
        this.sprintSpeedModifier = value;
    }

    /**
     * Ruft den Wert der strafeSpeedModifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStrafeSpeedModifier() {
        return strafeSpeedModifier;
    }

    /**
     * Legt den Wert der strafeSpeedModifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStrafeSpeedModifier(Double value) {
        this.strafeSpeedModifier = value;
    }

}
