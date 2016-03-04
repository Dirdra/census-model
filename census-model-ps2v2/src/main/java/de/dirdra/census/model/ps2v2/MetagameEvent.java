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
 * <p>Java-Klasse für metagame_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="metagame_event"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{}multi_language_description_type"/&gt;
 *         &lt;element name="description" type="{}multi_language_description_type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="experience_bonus" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}metagame_event_id"/&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metagame_event", propOrder = {
    "name",
    "description"
})
public class MetagameEvent {

    @XmlElement(required = true)
    protected MultiLanguageDescriptionType name;
    @XmlElement(required = true)
    protected MultiLanguageDescriptionType description;
    @XmlAttribute(name = "experience_bonus")
    protected Integer experienceBonus;
    @XmlAttribute(name = "metagame_event_id")
    protected Integer metagameEventId;
    @XmlAttribute(name = "type")
    protected Integer type;

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
     * Ruft den Wert der experienceBonus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExperienceBonus() {
        return experienceBonus;
    }

    /**
     * Legt den Wert der experienceBonus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExperienceBonus(Integer value) {
        this.experienceBonus = value;
    }

    /**
     * Ruft den Wert der metagameEventId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMetagameEventId() {
        return metagameEventId;
    }

    /**
     * Legt den Wert der metagameEventId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMetagameEventId(Integer value) {
        this.metagameEventId = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setType(Integer value) {
        this.type = value;
    }

}
