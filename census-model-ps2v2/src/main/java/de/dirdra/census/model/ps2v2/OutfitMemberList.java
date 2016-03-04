//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.04 um 03:33:06 PM CET 
//


package de.dirdra.census.model.ps2v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für outfit_member_list complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="outfit_member_list"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="outfit_member" type="{}outfit_member" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{}basicResponseAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outfit_member_list", propOrder = {
    "outfitMember"
})
public class OutfitMemberList {

    @XmlElement(name = "outfit_member")
    protected List<OutfitMember> outfitMember;
    @XmlAttribute(name = "limit")
    protected Integer limit;
    @XmlAttribute(name = "returned")
    protected Integer returned;
    @XmlAttribute(name = "milliseconds")
    protected Integer milliseconds;
    @XmlAttribute(name = "seconds")
    protected Float seconds;
    @XmlAttribute(name = "count")
    protected Integer count;

    /**
     * Gets the value of the outfitMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outfitMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutfitMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutfitMember }
     * 
     * 
     */
    public List<OutfitMember> getOutfitMember() {
        if (outfitMember == null) {
            outfitMember = new ArrayList<OutfitMember>();
        }
        return this.outfitMember;
    }

    /**
     * Ruft den Wert der limit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Legt den Wert der limit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * Ruft den Wert der returned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturned() {
        return returned;
    }

    /**
     * Legt den Wert der returned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturned(Integer value) {
        this.returned = value;
    }

    /**
     * Ruft den Wert der milliseconds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMilliseconds() {
        return milliseconds;
    }

    /**
     * Legt den Wert der milliseconds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMilliseconds(Integer value) {
        this.milliseconds = value;
    }

    /**
     * Ruft den Wert der seconds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSeconds() {
        return seconds;
    }

    /**
     * Legt den Wert der seconds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSeconds(Float value) {
        this.seconds = value;
    }

    /**
     * Ruft den Wert der count-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Legt den Wert der count-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

}
