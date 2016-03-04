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
 * <p>Java-Klasse für experience_rank complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="experience_rank"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nc" type="{}experience_rank_description"/&gt;
 *         &lt;element name="tr" type="{}experience_rank_description"/&gt;
 *         &lt;element name="vs" type="{}experience_rank_description"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{}nc_image_path"/&gt;
 *       &lt;attribute name="rank" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}tr_image_path"/&gt;
 *       &lt;attribute ref="{}vs_image_path"/&gt;
 *       &lt;attribute name="xp_max" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "experience_rank", propOrder = {
    "nc",
    "tr",
    "vs"
})
public class ExperienceRank {

    @XmlElement(required = true)
    protected ExperienceRankDescription nc;
    @XmlElement(required = true)
    protected ExperienceRankDescription tr;
    @XmlElement(required = true)
    protected ExperienceRankDescription vs;
    @XmlAttribute(name = "nc_image_path")
    protected String ncImagePath;
    @XmlAttribute(name = "rank")
    protected Integer rank;
    @XmlAttribute(name = "tr_image_path")
    protected String trImagePath;
    @XmlAttribute(name = "vs_image_path")
    protected String vsImagePath;
    @XmlAttribute(name = "xp_max")
    protected Integer xpMax;

    /**
     * Ruft den Wert der nc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExperienceRankDescription }
     *     
     */
    public ExperienceRankDescription getNc() {
        return nc;
    }

    /**
     * Legt den Wert der nc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperienceRankDescription }
     *     
     */
    public void setNc(ExperienceRankDescription value) {
        this.nc = value;
    }

    /**
     * Ruft den Wert der tr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExperienceRankDescription }
     *     
     */
    public ExperienceRankDescription getTr() {
        return tr;
    }

    /**
     * Legt den Wert der tr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperienceRankDescription }
     *     
     */
    public void setTr(ExperienceRankDescription value) {
        this.tr = value;
    }

    /**
     * Ruft den Wert der vs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExperienceRankDescription }
     *     
     */
    public ExperienceRankDescription getVs() {
        return vs;
    }

    /**
     * Legt den Wert der vs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperienceRankDescription }
     *     
     */
    public void setVs(ExperienceRankDescription value) {
        this.vs = value;
    }

    /**
     * Ruft den Wert der ncImagePath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcImagePath() {
        return ncImagePath;
    }

    /**
     * Legt den Wert der ncImagePath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcImagePath(String value) {
        this.ncImagePath = value;
    }

    /**
     * Ruft den Wert der rank-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * Legt den Wert der rank-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRank(Integer value) {
        this.rank = value;
    }

    /**
     * Ruft den Wert der trImagePath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrImagePath() {
        return trImagePath;
    }

    /**
     * Legt den Wert der trImagePath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrImagePath(String value) {
        this.trImagePath = value;
    }

    /**
     * Ruft den Wert der vsImagePath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVsImagePath() {
        return vsImagePath;
    }

    /**
     * Legt den Wert der vsImagePath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVsImagePath(String value) {
        this.vsImagePath = value;
    }

    /**
     * Ruft den Wert der xpMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getXpMax() {
        return xpMax;
    }

    /**
     * Legt den Wert der xpMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setXpMax(Integer value) {
        this.xpMax = value;
    }

}
