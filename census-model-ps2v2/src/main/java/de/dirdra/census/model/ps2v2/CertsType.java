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
 * <p>Java-Klasse für certs_type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="certs_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="available_points" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="earned_points" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="gifted_points" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="percent_to_next" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="spent_points" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certs_type")
public class CertsType {

    @XmlAttribute(name = "available_points")
    protected Integer availablePoints;
    @XmlAttribute(name = "earned_points")
    protected Integer earnedPoints;
    @XmlAttribute(name = "gifted_points")
    protected Integer giftedPoints;
    @XmlAttribute(name = "percent_to_next")
    protected Double percentToNext;
    @XmlAttribute(name = "spent_points")
    protected Integer spentPoints;

    /**
     * Ruft den Wert der availablePoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailablePoints() {
        return availablePoints;
    }

    /**
     * Legt den Wert der availablePoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailablePoints(Integer value) {
        this.availablePoints = value;
    }

    /**
     * Ruft den Wert der earnedPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEarnedPoints() {
        return earnedPoints;
    }

    /**
     * Legt den Wert der earnedPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEarnedPoints(Integer value) {
        this.earnedPoints = value;
    }

    /**
     * Ruft den Wert der giftedPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGiftedPoints() {
        return giftedPoints;
    }

    /**
     * Legt den Wert der giftedPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGiftedPoints(Integer value) {
        this.giftedPoints = value;
    }

    /**
     * Ruft den Wert der percentToNext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentToNext() {
        return percentToNext;
    }

    /**
     * Legt den Wert der percentToNext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentToNext(Double value) {
        this.percentToNext = value;
    }

    /**
     * Ruft den Wert der spentPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpentPoints() {
        return spentPoints;
    }

    /**
     * Legt den Wert der spentPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpentPoints(Integer value) {
        this.spentPoints = value;
    }

}
