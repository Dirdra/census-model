//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.04 um 03:33:06 PM CET 
//


package de.dirdra.census.model.ps2v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse f�r outfit_member_extended complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="outfit_member_extended"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="alias" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="alias_lower" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{}character_id"/&gt;
 *       &lt;attribute ref="{}leader_character_id"/&gt;
 *       &lt;attribute name="member_count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="member_rank" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="member_rank_ordinal" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="member_since" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="member_since_date" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="name_lower" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{}outfit_id"/&gt;
 *       &lt;attribute name="time_created" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="time_created_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outfit_member_extended")
public class OutfitMemberExtended {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "alias")
    protected String alias;
    @XmlAttribute(name = "alias_lower")
    protected String aliasLower;
    @XmlAttribute(name = "character_id")
    protected Long characterId;
    @XmlAttribute(name = "leader_character_id")
    protected Integer leaderCharacterId;
    @XmlAttribute(name = "member_count")
    protected Integer memberCount;
    @XmlAttribute(name = "member_rank")
    protected String memberRank;
    @XmlAttribute(name = "member_rank_ordinal")
    protected Integer memberRankOrdinal;
    @XmlAttribute(name = "member_since")
    protected Long memberSince;
    @XmlAttribute(name = "member_since_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar memberSinceDate;
    @XmlAttribute(name = "name_lower")
    protected String nameLower;
    @XmlAttribute(name = "outfit_id")
    protected Integer outfitId;
    @XmlAttribute(name = "time_created")
    protected Long timeCreated;
    @XmlAttribute(name = "time_created_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeCreatedDate;

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
     * Ruft den Wert der memberRank-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberRank() {
        return memberRank;
    }

    /**
     * Legt den Wert der memberRank-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberRank(String value) {
        this.memberRank = value;
    }

    /**
     * Ruft den Wert der memberRankOrdinal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemberRankOrdinal() {
        return memberRankOrdinal;
    }

    /**
     * Legt den Wert der memberRankOrdinal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemberRankOrdinal(Integer value) {
        this.memberRankOrdinal = value;
    }

    /**
     * Ruft den Wert der memberSince-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMemberSince() {
        return memberSince;
    }

    /**
     * Legt den Wert der memberSince-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMemberSince(Long value) {
        this.memberSince = value;
    }

    /**
     * Ruft den Wert der memberSinceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMemberSinceDate() {
        return memberSinceDate;
    }

    /**
     * Legt den Wert der memberSinceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMemberSinceDate(XMLGregorianCalendar value) {
        this.memberSinceDate = value;
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeCreatedDate() {
        return timeCreatedDate;
    }

    /**
     * Legt den Wert der timeCreatedDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeCreatedDate(XMLGregorianCalendar value) {
        this.timeCreatedDate = value;
    }

}
