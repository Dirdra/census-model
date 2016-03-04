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
 * <p>Java-Klasse für weapon_to_fire_group complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="weapon_to_fire_group"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}fire_group_id"/&gt;
 *       &lt;attribute name="fire_group_index" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}weapon_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weapon_to_fire_group")
public class WeaponToFireGroup {

    @XmlAttribute(name = "fire_group_id")
    protected Integer fireGroupId;
    @XmlAttribute(name = "fire_group_index")
    protected Integer fireGroupIndex;
    @XmlAttribute(name = "weapon_id")
    protected Integer weaponId;

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
     * Ruft den Wert der fireGroupIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireGroupIndex() {
        return fireGroupIndex;
    }

    /**
     * Legt den Wert der fireGroupIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireGroupIndex(Integer value) {
        this.fireGroupIndex = value;
    }

    /**
     * Ruft den Wert der weaponId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeaponId() {
        return weaponId;
    }

    /**
     * Legt den Wert der weaponId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeaponId(Integer value) {
        this.weaponId = value;
    }

}
