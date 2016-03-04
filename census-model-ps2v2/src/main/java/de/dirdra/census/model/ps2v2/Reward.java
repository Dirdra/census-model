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
 * <p>Java-Klasse für reward complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="reward"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="count_max" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="count_min" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="param1" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param2" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param3" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param4" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param5" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{}reward_type_id"/&gt;
 *       &lt;attribute ref="{}reward_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reward")
public class Reward {

    @XmlAttribute(name = "count_max")
    protected Integer countMax;
    @XmlAttribute(name = "count_min")
    protected Integer countMin;
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
    @XmlAttribute(name = "reward_type_id")
    protected Integer rewardTypeId;
    @XmlAttribute(name = "reward_id")
    protected Integer rewardId;

    /**
     * Ruft den Wert der countMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountMax() {
        return countMax;
    }

    /**
     * Legt den Wert der countMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountMax(Integer value) {
        this.countMax = value;
    }

    /**
     * Ruft den Wert der countMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountMin() {
        return countMin;
    }

    /**
     * Legt den Wert der countMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountMin(Integer value) {
        this.countMin = value;
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
     * Ruft den Wert der rewardTypeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRewardTypeId() {
        return rewardTypeId;
    }

    /**
     * Legt den Wert der rewardTypeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRewardTypeId(Integer value) {
        this.rewardTypeId = value;
    }

    /**
     * Ruft den Wert der rewardId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRewardId() {
        return rewardId;
    }

    /**
     * Legt den Wert der rewardId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRewardId(Integer value) {
        this.rewardId = value;
    }

}
