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
 * <p>Java-Klasse für marketing_bundle_with_1_item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="marketing_bundle_with_1_item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="cert_price" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}item_id"/&gt;
 *       &lt;attribute name="item_quantity" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}marketing_bundle_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marketing_bundle_with_1_item")
public class MarketingBundleWith1Item {

    @XmlAttribute(name = "cert_price")
    protected Integer certPrice;
    @XmlAttribute(name = "item_id")
    protected Integer itemId;
    @XmlAttribute(name = "item_quantity")
    protected Integer itemQuantity;
    @XmlAttribute(name = "marketing_bundle_id")
    protected Integer marketingBundleId;

    /**
     * Ruft den Wert der certPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCertPrice() {
        return certPrice;
    }

    /**
     * Legt den Wert der certPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCertPrice(Integer value) {
        this.certPrice = value;
    }

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
     * Ruft den Wert der itemQuantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemQuantity() {
        return itemQuantity;
    }

    /**
     * Legt den Wert der itemQuantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemQuantity(Integer value) {
        this.itemQuantity = value;
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

}
