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
 * <p>Java-Klasse für marketing_bundle_item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="marketing_bundle_item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}item_id"/&gt;
 *       &lt;attribute ref="{}marketing_bundle_id"/&gt;
 *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="release_time" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marketing_bundle_item")
public class MarketingBundleItem {

    @XmlAttribute(name = "item_id")
    protected Integer itemId;
    @XmlAttribute(name = "marketing_bundle_id")
    protected Integer marketingBundleId;
    @XmlAttribute(name = "quantity")
    protected Integer quantity;
    @XmlAttribute(name = "release_time")
    protected Long releaseTime;

    /**
     * Ruft den Wert der itemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * Legt den Wert der itemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemId(Integer value) {
        this.itemId = value;
    }

    /**
     * Ruft den Wert der marketingBundleId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarketingBundleId() {
        return marketingBundleId;
    }

    /**
     * Legt den Wert der marketingBundleId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarketingBundleId(Integer value) {
        this.marketingBundleId = value;
    }

    /**
     * Ruft den Wert der quantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Legt den Wert der quantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Ruft den Wert der releaseTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReleaseTime() {
        return releaseTime;
    }

    /**
     * Legt den Wert der releaseTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReleaseTime(Long value) {
        this.releaseTime = value;
    }

}
