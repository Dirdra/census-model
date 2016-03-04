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
 * <p>Java-Klasse für objective complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="objective"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}objective_group_id"/&gt;
 *       &lt;attribute ref="{}objective_id"/&gt;
 *       &lt;attribute ref="{}objective_type_id"/&gt;
 *       &lt;attribute name="param1" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param2" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param3" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param4" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param5" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param6" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param7" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param8" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="param9" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objective")
public class Objective {

    @XmlAttribute(name = "objective_group_id")
    protected Integer objectiveGroupId;
    @XmlAttribute(name = "objective_id")
    protected Integer objectiveId;
    @XmlAttribute(name = "objective_type_id")
    protected Integer objectiveTypeId;
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

    /**
     * Ruft den Wert der objectiveGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectiveGroupId() {
        return objectiveGroupId;
    }

    /**
     * Legt den Wert der objectiveGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectiveGroupId(Integer value) {
        this.objectiveGroupId = value;
    }

    /**
     * Ruft den Wert der objectiveId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectiveId() {
        return objectiveId;
    }

    /**
     * Legt den Wert der objectiveId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectiveId(Integer value) {
        this.objectiveId = value;
    }

    /**
     * Ruft den Wert der objectiveTypeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectiveTypeId() {
        return objectiveTypeId;
    }

    /**
     * Legt den Wert der objectiveTypeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectiveTypeId(Integer value) {
        this.objectiveTypeId = value;
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

}
