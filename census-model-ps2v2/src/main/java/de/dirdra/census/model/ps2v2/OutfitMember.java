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
 * <p>Java-Klasse für outfit_member complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="outfit_member"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}character_id"/&gt;
 *       &lt;attribute name="member_since" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="member_since_date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{}outfit_id"/&gt;
 *       &lt;attribute name="rank" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rank_ordinal" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outfit_member")
public class OutfitMember {

    @XmlAttribute(name = "character_id")
    protected Long characterId;
    @XmlAttribute(name = "member_since")
    protected Long memberSince;
    @XmlAttribute(name = "member_since_date")
    protected String memberSinceDate;
    @XmlAttribute(name = "outfit_id")
    protected Integer outfitId;
    @XmlAttribute(name = "rank")
    protected String rank;
    @XmlAttribute(name = "rank_ordinal")
    protected Integer rankOrdinal;

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
     *     {@link String }
     *     
     */
    public String getMemberSinceDate() {
        return memberSinceDate;
    }

    /**
     * Legt den Wert der memberSinceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberSinceDate(String value) {
        this.memberSinceDate = value;
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
     * Ruft den Wert der rank-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRank() {
        return rank;
    }

    /**
     * Legt den Wert der rank-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRank(String value) {
        this.rank = value;
    }

    /**
     * Ruft den Wert der rankOrdinal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRankOrdinal() {
        return rankOrdinal;
    }

    /**
     * Legt den Wert der rankOrdinal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRankOrdinal(Integer value) {
        this.rankOrdinal = value;
    }

}
