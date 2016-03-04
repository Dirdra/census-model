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
 * <p>Java-Klasse für ability complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{}abilityParamGroup"/&gt;
 *       &lt;attGroup ref="{}abilityStringGroup"/&gt;
 *       &lt;attribute ref="{}ability_id"/&gt;
 *       &lt;attribute ref="{}ability_type_id"/&gt;
 *       &lt;attribute name="distance_max" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="expire_msec" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="first_use_delay_msec" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="flag_toggle" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="next_use_delay_msec" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="radius_max" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="resource_cost_per_msec" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="resource_first_cost" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute ref="{}resource_type_id"/&gt;
 *       &lt;attribute name="reuse_delay_msec" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ability")
public class Ability {

    @XmlAttribute(name = "ability_id")
    protected Integer abilityId;
    @XmlAttribute(name = "ability_type_id")
    protected Integer abilityTypeId;
    @XmlAttribute(name = "distance_max")
    protected Integer distanceMax;
    @XmlAttribute(name = "expire_msec")
    protected Integer expireMsec;
    @XmlAttribute(name = "first_use_delay_msec")
    protected Integer firstUseDelayMsec;
    @XmlAttribute(name = "flag_toggle")
    protected Boolean flagToggle;
    @XmlAttribute(name = "next_use_delay_msec")
    protected Integer nextUseDelayMsec;
    @XmlAttribute(name = "radius_max")
    protected Double radiusMax;
    @XmlAttribute(name = "resource_cost_per_msec")
    protected Double resourceCostPerMsec;
    @XmlAttribute(name = "resource_first_cost")
    protected Double resourceFirstCost;
    @XmlAttribute(name = "resource_type_id")
    protected Integer resourceTypeId;
    @XmlAttribute(name = "reuse_delay_msec")
    protected Integer reuseDelayMsec;
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
    @XmlAttribute(name = "param14")
    protected String param14;
    @XmlAttribute(name = "string1")
    protected String string1;
    @XmlAttribute(name = "string2")
    protected String string2;
    @XmlAttribute(name = "string3")
    protected String string3;
    @XmlAttribute(name = "string4")
    protected String string4;

    /**
     * Ruft den Wert der abilityId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAbilityId() {
        return abilityId;
    }

    /**
     * Legt den Wert der abilityId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAbilityId(Integer value) {
        this.abilityId = value;
    }

    /**
     * Ruft den Wert der abilityTypeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAbilityTypeId() {
        return abilityTypeId;
    }

    /**
     * Legt den Wert der abilityTypeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAbilityTypeId(Integer value) {
        this.abilityTypeId = value;
    }

    /**
     * Ruft den Wert der distanceMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanceMax() {
        return distanceMax;
    }

    /**
     * Legt den Wert der distanceMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanceMax(Integer value) {
        this.distanceMax = value;
    }

    /**
     * Ruft den Wert der expireMsec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpireMsec() {
        return expireMsec;
    }

    /**
     * Legt den Wert der expireMsec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpireMsec(Integer value) {
        this.expireMsec = value;
    }

    /**
     * Ruft den Wert der firstUseDelayMsec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstUseDelayMsec() {
        return firstUseDelayMsec;
    }

    /**
     * Legt den Wert der firstUseDelayMsec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstUseDelayMsec(Integer value) {
        this.firstUseDelayMsec = value;
    }

    /**
     * Ruft den Wert der flagToggle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlagToggle() {
        return flagToggle;
    }

    /**
     * Legt den Wert der flagToggle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlagToggle(Boolean value) {
        this.flagToggle = value;
    }

    /**
     * Ruft den Wert der nextUseDelayMsec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNextUseDelayMsec() {
        return nextUseDelayMsec;
    }

    /**
     * Legt den Wert der nextUseDelayMsec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNextUseDelayMsec(Integer value) {
        this.nextUseDelayMsec = value;
    }

    /**
     * Ruft den Wert der radiusMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRadiusMax() {
        return radiusMax;
    }

    /**
     * Legt den Wert der radiusMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRadiusMax(Double value) {
        this.radiusMax = value;
    }

    /**
     * Ruft den Wert der resourceCostPerMsec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getResourceCostPerMsec() {
        return resourceCostPerMsec;
    }

    /**
     * Legt den Wert der resourceCostPerMsec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setResourceCostPerMsec(Double value) {
        this.resourceCostPerMsec = value;
    }

    /**
     * Ruft den Wert der resourceFirstCost-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getResourceFirstCost() {
        return resourceFirstCost;
    }

    /**
     * Legt den Wert der resourceFirstCost-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setResourceFirstCost(Double value) {
        this.resourceFirstCost = value;
    }

    /**
     * Ruft den Wert der resourceTypeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResourceTypeId() {
        return resourceTypeId;
    }

    /**
     * Legt den Wert der resourceTypeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResourceTypeId(Integer value) {
        this.resourceTypeId = value;
    }

    /**
     * Ruft den Wert der reuseDelayMsec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReuseDelayMsec() {
        return reuseDelayMsec;
    }

    /**
     * Legt den Wert der reuseDelayMsec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReuseDelayMsec(Integer value) {
        this.reuseDelayMsec = value;
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

    /**
     * Ruft den Wert der param14-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam14() {
        return param14;
    }

    /**
     * Legt den Wert der param14-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam14(String value) {
        this.param14 = value;
    }

    /**
     * Ruft den Wert der string1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString1() {
        return string1;
    }

    /**
     * Legt den Wert der string1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString1(String value) {
        this.string1 = value;
    }

    /**
     * Ruft den Wert der string2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString2() {
        return string2;
    }

    /**
     * Legt den Wert der string2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString2(String value) {
        this.string2 = value;
    }

    /**
     * Ruft den Wert der string3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString3() {
        return string3;
    }

    /**
     * Legt den Wert der string3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString3(String value) {
        this.string3 = value;
    }

    /**
     * Ruft den Wert der string4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString4() {
        return string4;
    }

    /**
     * Legt den Wert der string4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString4(String value) {
        this.string4 = value;
    }

}
