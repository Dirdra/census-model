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
 * <p>Java-Klasse für fire_group_to_fire_mode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fire_group_to_fire_mode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}fire_group_id"/&gt;
 *       &lt;attribute ref="{}fire_mode_id"/&gt;
 *       &lt;attribute ref="{}fire_mode_index"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fire_group_to_fire_mode")
public class FireGroupToFireMode {

    @XmlAttribute(name = "fire_group_id")
    protected Integer fireGroupId;
    @XmlAttribute(name = "fire_mode_id")
    protected Integer fireModeId;
    @XmlAttribute(name = "fire_mode_index")
    protected Integer fireModeIndex;

    /**
     * Ruft den Wert der fireGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireGroupId() {
        return fireGroupId;
    }

    /**
     * Legt den Wert der fireGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireGroupId(Integer value) {
        this.fireGroupId = value;
    }

    /**
     * Ruft den Wert der fireModeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireModeId() {
        return fireModeId;
    }

    /**
     * Legt den Wert der fireModeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireModeId(Integer value) {
        this.fireModeId = value;
    }

    /**
     * Ruft den Wert der fireModeIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireModeIndex() {
        return fireModeIndex;
    }

    /**
     * Legt den Wert der fireModeIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireModeIndex(Integer value) {
        this.fireModeIndex = value;
    }

}
