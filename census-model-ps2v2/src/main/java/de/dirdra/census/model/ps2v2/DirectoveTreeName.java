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
 * <p>Java-Klasse für directove_tree_name complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="directove_tree_name"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{}languageAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "directove_tree_name")
public class DirectoveTreeName {

    @XmlAttribute(name = "de")
    protected String de;
    @XmlAttribute(name = "en")
    protected String en;
    @XmlAttribute(name = "es")
    protected String es;
    @XmlAttribute(name = "fr")
    protected String fr;
    @XmlAttribute(name = "it")
    protected String it;
    @XmlAttribute(name = "tr")
    protected String tr;

    /**
     * Ruft den Wert der de-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe() {
        return de;
    }

    /**
     * Legt den Wert der de-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe(String value) {
        this.de = value;
    }

    /**
     * Ruft den Wert der en-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEn() {
        return en;
    }

    /**
     * Legt den Wert der en-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEn(String value) {
        this.en = value;
    }

    /**
     * Ruft den Wert der es-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEs() {
        return es;
    }

    /**
     * Legt den Wert der es-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEs(String value) {
        this.es = value;
    }

    /**
     * Ruft den Wert der fr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFr() {
        return fr;
    }

    /**
     * Legt den Wert der fr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFr(String value) {
        this.fr = value;
    }

    /**
     * Ruft den Wert der it-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIt() {
        return it;
    }

    /**
     * Legt den Wert der it-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIt(String value) {
        this.it = value;
    }

    /**
     * Ruft den Wert der tr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTr() {
        return tr;
    }

    /**
     * Legt den Wert der tr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTr(String value) {
        this.tr = value;
    }

}
