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
 * <p>Java-Klasse für skill complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="skill"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{}multi_language_description_type"/&gt;
 *         &lt;element name="description" type="{}multi_language_description_type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{}grant_item_id"/&gt;
 *       &lt;attribute ref="{}image_id"/&gt;
 *       &lt;attribute ref="{}image_path"/&gt;
 *       &lt;attribute ref="{}image_set_id"/&gt;
 *       &lt;attribute ref="{}skill_id"/&gt;
 *       &lt;attribute ref="{}skill_line_id"/&gt;
 *       &lt;attribute name="skill_line_index" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="skill_points" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "skill", propOrder = {
    "name",
    "description"
})
public class Skill {

    @XmlElement(required = true)
    protected MultiLanguageDescriptionType name;
    @XmlElement(required = true)
    protected MultiLanguageDescriptionType description;
    @XmlAttribute(name = "grant_item_id")
    protected Integer grantItemId;
    @XmlAttribute(name = "image_id")
    protected Integer imageId;
    @XmlAttribute(name = "image_path")
    protected String imagePath;
    @XmlAttribute(name = "image_set_id")
    protected Integer imageSetId;
    @XmlAttribute(name = "skill_id")
    protected Integer skillId;
    @XmlAttribute(name = "skill_line_id")
    protected Integer skillLineId;
    @XmlAttribute(name = "skill_line_index")
    protected Integer skillLineIndex;
    @XmlAttribute(name = "skill_points")
    protected Integer skillPoints;

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
     * Ruft den Wert der grantItemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGrantItemId() {
        return grantItemId;
    }

    /**
     * Legt den Wert der grantItemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGrantItemId(Integer value) {
        this.grantItemId = value;
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
     * Ruft den Wert der skillId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSkillId() {
        return skillId;
    }

    /**
     * Legt den Wert der skillId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSkillId(Integer value) {
        this.skillId = value;
    }

    /**
     * Ruft den Wert der skillLineId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSkillLineId() {
        return skillLineId;
    }

    /**
     * Legt den Wert der skillLineId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSkillLineId(Integer value) {
        this.skillLineId = value;
    }

    /**
     * Ruft den Wert der skillLineIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSkillLineIndex() {
        return skillLineIndex;
    }

    /**
     * Legt den Wert der skillLineIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSkillLineIndex(Integer value) {
        this.skillLineIndex = value;
    }

    /**
     * Ruft den Wert der skillPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSkillPoints() {
        return skillPoints;
    }

    /**
     * Legt den Wert der skillPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSkillPoints(Integer value) {
        this.skillPoints = value;
    }

}
