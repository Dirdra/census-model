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
 * <p>Java-Klasse für characters_directive_objective complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="characters_directive_objective"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}character_id"/&gt;
 *       &lt;attribute ref="{}directive_id"/&gt;
 *       &lt;attribute ref="{}objective_group_id"/&gt;
 *       &lt;attribute ref="{}objective_id"/&gt;
 *       &lt;attribute name="state_data" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "characters_directive_objective")
public class CharactersDirectiveObjective {

    @XmlAttribute(name = "character_id")
    protected Long characterId;
    @XmlAttribute(name = "directive_id")
    protected Integer directiveId;
    @XmlAttribute(name = "objective_group_id")
    protected Integer objectiveGroupId;
    @XmlAttribute(name = "objective_id")
    protected Integer objectiveId;
    @XmlAttribute(name = "state_data")
    protected Integer stateData;
    @XmlAttribute(name = "status")
    protected Integer status;

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
     * Ruft den Wert der directiveId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirectiveId() {
        return directiveId;
    }

    /**
     * Legt den Wert der directiveId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirectiveId(Integer value) {
        this.directiveId = value;
    }

    /**
     * Ruft den Wert der objectiveGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectiveGroupId() {
        return objectiveGroupId;
    }

    /**
     * Legt den Wert der objectiveGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectiveGroupId(Integer value) {
        this.objectiveGroupId = value;
    }

    /**
     * Ruft den Wert der objectiveId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectiveId() {
        return objectiveId;
    }

    /**
     * Legt den Wert der objectiveId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectiveId(Integer value) {
        this.objectiveId = value;
    }

    /**
     * Ruft den Wert der stateData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStateData() {
        return stateData;
    }

    /**
     * Legt den Wert der stateData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStateData(Integer value) {
        this.stateData = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

}
