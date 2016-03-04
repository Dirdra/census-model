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
 * <p>Java-Klasse für effect_type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="effect_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{}effect_type_id"/&gt;
 *       &lt;attribute name="param1" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param2" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param3" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param4" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param5" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param6" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param7" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param8" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param9" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param10" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param11" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param12" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param13" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "effect_type")
public class EffectType {

    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "effect_type_id")
    protected Integer effectTypeId;
    @XmlAttribute(name = "param1")
    protected String param1;
    @XmlAttribute(name = "param2")
    protected String param2;
    @XmlAttribute(name = "param3")
    protected String param3;
    @XmlAttribute(name = "param4")
    protected String param4;
    @XmlAttribute(name = "param5")
    protected String param5;
    @XmlAttribute(name = "param6")
    protected String param6;
    @XmlAttribute(name = "param7")
    protected String param7;
    @XmlAttribute(name = "param8")
    protected String param8;
    @XmlAttribute(name = "param9")
    protected String param9;
    @XmlAttribute(name = "param10")
    protected String param10;
    @XmlAttribute(name = "param11")
    protected String param11;
    @XmlAttribute(name = "param12")
    protected String param12;
    @XmlAttribute(name = "param13")
    protected String param13;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der effectTypeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEffectTypeId() {
        return effectTypeId;
    }

    /**
     * Legt den Wert der effectTypeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEffectTypeId(Integer value) {
        this.effectTypeId = value;
    }

    /**
     * Ruft den Wert der param1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam1() {
        return param1;
    }

    /**
     * Legt den Wert der param1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam1(String value) {
        this.param1 = value;
    }

    /**
     * Ruft den Wert der param2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam2() {
        return param2;
    }

    /**
     * Legt den Wert der param2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam2(String value) {
        this.param2 = value;
    }

    /**
     * Ruft den Wert der param3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam3() {
        return param3;
    }

    /**
     * Legt den Wert der param3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam3(String value) {
        this.param3 = value;
    }

    /**
     * Ruft den Wert der param4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam4() {
        return param4;
    }

    /**
     * Legt den Wert der param4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam4(String value) {
        this.param4 = value;
    }

    /**
     * Ruft den Wert der param5-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam5() {
        return param5;
    }

    /**
     * Legt den Wert der param5-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam5(String value) {
        this.param5 = value;
    }

    /**
     * Ruft den Wert der param6-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam6() {
        return param6;
    }

    /**
     * Legt den Wert der param6-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam6(String value) {
        this.param6 = value;
    }

    /**
     * Ruft den Wert der param7-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam7() {
        return param7;
    }

    /**
     * Legt den Wert der param7-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam7(String value) {
        this.param7 = value;
    }

    /**
     * Ruft den Wert der param8-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam8() {
        return param8;
    }

    /**
     * Legt den Wert der param8-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam8(String value) {
        this.param8 = value;
    }

    /**
     * Ruft den Wert der param9-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam9() {
        return param9;
    }

    /**
     * Legt den Wert der param9-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam9(String value) {
        this.param9 = value;
    }

    /**
     * Ruft den Wert der param10-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam10() {
        return param10;
    }

    /**
     * Legt den Wert der param10-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam10(String value) {
        this.param10 = value;
    }

    /**
     * Ruft den Wert der param11-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam11() {
        return param11;
    }

    /**
     * Legt den Wert der param11-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam11(String value) {
        this.param11 = value;
    }

    /**
     * Ruft den Wert der param12-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam12() {
        return param12;
    }

    /**
     * Legt den Wert der param12-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam12(String value) {
        this.param12 = value;
    }

    /**
     * Ruft den Wert der param13-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam13() {
        return param13;
    }

    /**
     * Legt den Wert der param13-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam13(String value) {
        this.param13 = value;
    }

}
