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
 * <p>Java-Klasse für faction complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="faction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{}multi_language_description_type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="code_tag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{}faction_id"/&gt;
 *       &lt;attribute ref="{}image_id"/&gt;
 *       &lt;attribute ref="{}image_path"/&gt;
 *       &lt;attribute ref="{}image_set_id"/&gt;
 *       &lt;attribute name="user_selectable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "faction", propOrder = {
    "name"
})
public class Faction {

    @XmlElement(required = true)
    protected MultiLanguageDescriptionType name;
    @XmlAttribute(name = "code_tag")
    protected String codeTag;
    @XmlAttribute(name = "faction_id")
    protected Integer factionId;
    @XmlAttribute(name = "image_id")
    protected Integer imageId;
    @XmlAttribute(name = "image_path")
    protected String imagePath;
    @XmlAttribute(name = "image_set_id")
    protected Integer imageSetId;
    @XmlAttribute(name = "user_selectable")
    protected Boolean userSelectable;

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
     * Ruft den Wert der codeTag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeTag() {
        return codeTag;
    }

    /**
     * Legt den Wert der codeTag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeTag(String value) {
        this.codeTag = value;
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
     * Ruft den Wert der userSelectable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserSelectable() {
        return userSelectable;
    }

    /**
     * Legt den Wert der userSelectable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserSelectable(Boolean value) {
        this.userSelectable = value;
    }

}
