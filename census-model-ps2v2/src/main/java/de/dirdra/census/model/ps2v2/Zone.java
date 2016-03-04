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
 * <p>Java-Klasse für zone complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="zone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{}multi_language_description_type"/&gt;
 *         &lt;element name="description" type="{}multi_language_description_type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="hex_size" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}zone_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zone", propOrder = {
    "name",
    "description"
})
public class Zone {

    @XmlElement(required = true)
    protected MultiLanguageDescriptionType name;
    @XmlElement(required = true)
    protected MultiLanguageDescriptionType description;
    @XmlAttribute(name = "code")
    protected String code;
    @XmlAttribute(name = "hex_size")
    protected Integer hexSize;
    @XmlAttribute(name = "zone_id")
    protected Integer zoneId;

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
     * Ruft den Wert der code-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Legt den Wert der code-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Ruft den Wert der hexSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHexSize() {
        return hexSize;
    }

    /**
     * Legt den Wert der hexSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHexSize(Integer value) {
        this.hexSize = value;
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
