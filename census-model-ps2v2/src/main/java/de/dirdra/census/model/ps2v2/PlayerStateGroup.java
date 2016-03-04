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
 * <p>Java-Klasse für player_state_group complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="player_state_group"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="min_cone_of_fire" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="player_state" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{}player_state_group_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "player_state_group")
public class PlayerStateGroup {

    @XmlAttribute(name = "min_cone_of_fire")
    protected Double minConeOfFire;
    @XmlAttribute(name = "player_state")
    protected String playerState;
    @XmlAttribute(name = "player_state_group_id")
    protected Integer playerStateGroupId;

    /**
     * Ruft den Wert der minConeOfFire-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinConeOfFire() {
        return minConeOfFire;
    }

    /**
     * Legt den Wert der minConeOfFire-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinConeOfFire(Double value) {
        this.minConeOfFire = value;
    }

    /**
     * Ruft den Wert der playerState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayerState() {
        return playerState;
    }

    /**
     * Legt den Wert der playerState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayerState(String value) {
        this.playerState = value;
    }

    /**
     * Ruft den Wert der playerStateGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlayerStateGroupId() {
        return playerStateGroupId;
    }

    /**
     * Legt den Wert der playerStateGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlayerStateGroupId(Integer value) {
        this.playerStateGroupId = value;
    }

}
