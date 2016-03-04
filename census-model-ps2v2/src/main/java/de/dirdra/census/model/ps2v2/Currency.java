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
 * <p>Java-Klasse für currency complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="currency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{}currency_name"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{}currency_id"/&gt;
 *       &lt;attribute ref="{}icon_id"/&gt;
 *       &lt;attribute name="inventory_cap" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "currency", propOrder = {
    "name"
})
public class Currency {

    @XmlElement(required = true)
    protected CurrencyName name;
    @XmlAttribute(name = "currency_id")
    protected Integer currencyId;
    @XmlAttribute(name = "icon_id")
    protected Integer iconId;
    @XmlAttribute(name = "inventory_cap")
    protected Integer inventoryCap;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyName }
     *     
     */
    public CurrencyName getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyName }
     *     
     */
    public void setName(CurrencyName value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der currencyId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrencyId() {
        return currencyId;
    }

    /**
     * Legt den Wert der currencyId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrencyId(Integer value) {
        this.currencyId = value;
    }

    /**
     * Ruft den Wert der iconId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIconId() {
        return iconId;
    }

    /**
     * Legt den Wert der iconId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIconId(Integer value) {
        this.iconId = value;
    }

    /**
     * Ruft den Wert der inventoryCap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInventoryCap() {
        return inventoryCap;
    }

    /**
     * Legt den Wert der inventoryCap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInventoryCap(Integer value) {
        this.inventoryCap = value;
    }

}
