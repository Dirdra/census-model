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
 * <p>Java-Klasse für outfit complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="outfit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="alias" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="alias_lower" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{}leader_character_id"/&gt;
 *       &lt;attribute name="member_count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="name_lower" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{}outfit_id"/&gt;
 *       &lt;attribute name="time_created" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="time_created_date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outfit")
public class Outfit {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "alias")
    protected String alias;
    @XmlAttribute(name = "alias_lower")
    protected String aliasLower;
    @XmlAttribute(name = "leader_character_id")
    protected Integer leaderCharacterId;
    @XmlAttribute(name = "member_count")
    protected Integer memberCount;
    @XmlAttribute(name = "name_lower")
    protected String nameLower;
    @XmlAttribute(name = "outfit_id")
    protected Integer outfitId;
    @XmlAttribute(name = "time_created")
    protected Long timeCreated;
    @XmlAttribute(name = "time_created_date")
    protected String timeCreatedDate;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der alias-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Legt den Wert der alias-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Ruft den Wert der aliasLower-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasLower() {
        return aliasLower;
    }

    /**
     * Legt den Wert der aliasLower-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasLower(String value) {
        this.aliasLower = value;
    }

    /**
     * Ruft den Wert der leaderCharacterId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeaderCharacterId() {
        return leaderCharacterId;
    }

    /**
     * Legt den Wert der leaderCharacterId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeaderCharacterId(Integer value) {
        this.leaderCharacterId = value;
    }

    /**
     * Ruft den Wert der memberCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemberCount() {
        return memberCount;
    }

    /**
     * Legt den Wert der memberCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemberCount(Integer value) {
        this.memberCount = value;
    }

    /**
     * Ruft den Wert der nameLower-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameLower() {
        return nameLower;
    }

    /**
     * Legt den Wert der nameLower-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameLower(String value) {
        this.nameLower = value;
    }

    /**
     * Ruft den Wert der outfitId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutfitId() {
        return outfitId;
    }

    /**
     * Legt den Wert der outfitId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutfitId(Integer value) {
        this.outfitId = value;
    }

    /**
     * Ruft den Wert der timeCreated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeCreated() {
        return timeCreated;
    }

    /**
     * Legt den Wert der timeCreated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeCreated(Long value) {
        this.timeCreated = value;
    }

    /**
     * Ruft den Wert der timeCreatedDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeCreatedDate() {
        return timeCreatedDate;
    }

    /**
     * Legt den Wert der timeCreatedDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeCreatedDate(String value) {
        this.timeCreatedDate = value;
    }

}
