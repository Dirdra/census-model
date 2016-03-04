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
 * <p>Java-Klasse für fire_group complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fire_group"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="can_chamber_ironsights" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="chamber_duration_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}fire_group_id"/&gt;
 *       &lt;attribute name="spool_up_initial_refire_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="spool_up_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="transition_duration_ms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fire_group")
public class FireGroup {

    @XmlAttribute(name = "can_chamber_ironsights")
    protected Boolean canChamberIronsights;
    @XmlAttribute(name = "chamber_duration_ms")
    protected Integer chamberDurationMs;
    @XmlAttribute(name = "fire_group_id")
    protected Integer fireGroupId;
    @XmlAttribute(name = "spool_up_initial_refire_ms")
    protected Integer spoolUpInitialRefireMs;
    @XmlAttribute(name = "spool_up_ms")
    protected Integer spoolUpMs;
    @XmlAttribute(name = "transition_duration_ms")
    protected Integer transitionDurationMs;

    /**
     * Ruft den Wert der canChamberIronsights-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanChamberIronsights() {
        return canChamberIronsights;
    }

    /**
     * Legt den Wert der canChamberIronsights-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanChamberIronsights(Boolean value) {
        this.canChamberIronsights = value;
    }

    /**
     * Ruft den Wert der chamberDurationMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChamberDurationMs() {
        return chamberDurationMs;
    }

    /**
     * Legt den Wert der chamberDurationMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChamberDurationMs(Integer value) {
        this.chamberDurationMs = value;
    }

    /**
     * Ruft den Wert der fireGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFireGroupId() {
        return fireGroupId;
    }

    /**
     * Legt den Wert der fireGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFireGroupId(Integer value) {
        this.fireGroupId = value;
    }

    /**
     * Ruft den Wert der spoolUpInitialRefireMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpoolUpInitialRefireMs() {
        return spoolUpInitialRefireMs;
    }

    /**
     * Legt den Wert der spoolUpInitialRefireMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpoolUpInitialRefireMs(Integer value) {
        this.spoolUpInitialRefireMs = value;
    }

    /**
     * Ruft den Wert der spoolUpMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpoolUpMs() {
        return spoolUpMs;
    }

    /**
     * Legt den Wert der spoolUpMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpoolUpMs(Integer value) {
        this.spoolUpMs = value;
    }

    /**
     * Ruft den Wert der transitionDurationMs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransitionDurationMs() {
        return transitionDurationMs;
    }

    /**
     * Legt den Wert der transitionDurationMs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransitionDurationMs(Integer value) {
        this.transitionDurationMs = value;
    }

}
