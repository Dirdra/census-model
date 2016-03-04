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
 * <p>Java-Klasse für weapon_to_attachment complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="weapon_to_attachment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}weapon_id"/&gt;
 *       &lt;attribute ref="{}attachment_id"/&gt;
 *       &lt;attribute ref="{}weapon_group_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weapon_to_attachment")
public class WeaponToAttachment {

    @XmlAttribute(name = "weapon_id")
    protected Integer weaponId;
    @XmlAttribute(name = "attachment_id")
    protected Integer attachmentId;
    @XmlAttribute(name = "weapon_group_id")
    protected Integer weaponGroupId;

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

    /**
     * Ruft den Wert der attachmentId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttachmentId() {
        return attachmentId;
    }

    /**
     * Legt den Wert der attachmentId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttachmentId(Integer value) {
        this.attachmentId = value;
    }

    /**
     * Ruft den Wert der weaponGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeaponGroupId() {
        return weaponGroupId;
    }

    /**
     * Legt den Wert der weaponGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeaponGroupId(Integer value) {
        this.weaponGroupId = value;
    }

}
