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
 * <p>Java-Klasse für characters_directive_tree complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="characters_directive_tree"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}character_id"/&gt;
 *       &lt;attribute name="completion_time" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="completion_time_date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{}current_directive_tier_id"/&gt;
 *       &lt;attribute name="current_level" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}directive_tree_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "characters_directive_tree")
public class CharactersDirectiveTree {

    @XmlAttribute(name = "character_id")
    protected Long characterId;
    @XmlAttribute(name = "completion_time")
    protected Integer completionTime;
    @XmlAttribute(name = "completion_time_date")
    protected String completionTimeDate;
    @XmlAttribute(name = "current_directive_tier_id")
    protected Integer currentDirectiveTierId;
    @XmlAttribute(name = "current_level")
    protected Integer currentLevel;
    @XmlAttribute(name = "directive_tree_id")
    protected Integer directiveTreeId;

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
     * Ruft den Wert der completionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompletionTime() {
        return completionTime;
    }

    /**
     * Legt den Wert der completionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompletionTime(Integer value) {
        this.completionTime = value;
    }

    /**
     * Ruft den Wert der completionTimeDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletionTimeDate() {
        return completionTimeDate;
    }

    /**
     * Legt den Wert der completionTimeDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletionTimeDate(String value) {
        this.completionTimeDate = value;
    }

    /**
     * Ruft den Wert der currentDirectiveTierId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentDirectiveTierId() {
        return currentDirectiveTierId;
    }

    /**
     * Legt den Wert der currentDirectiveTierId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentDirectiveTierId(Integer value) {
        this.currentDirectiveTierId = value;
    }

    /**
     * Ruft den Wert der currentLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentLevel() {
        return currentLevel;
    }

    /**
     * Legt den Wert der currentLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentLevel(Integer value) {
        this.currentLevel = value;
    }

    /**
     * Ruft den Wert der directiveTreeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirectiveTreeId() {
        return directiveTreeId;
    }

    /**
     * Legt den Wert der directiveTreeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirectiveTreeId(Integer value) {
        this.directiveTreeId = value;
    }

}
