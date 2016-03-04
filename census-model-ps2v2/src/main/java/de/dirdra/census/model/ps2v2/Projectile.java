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
 * <p>Java-Klasse für projectile complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="projectile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="acceleration" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="arm_distance" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="detonate_distance" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="detonate_on_contact" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *       &lt;attribute name="drag" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="gravity" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="lifespan" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="lockon_acceleration" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="lockon_lifespan" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="lockon_lose_angle" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="lockon_seek_in_flight" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute ref="{}projectile_flight_type_id"/&gt;
 *       &lt;attribute ref="{}projectile_id"/&gt;
 *       &lt;attribute name="speed" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="speed_max" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="sticks_to_players" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *       &lt;attribute name="sticky" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="tether_distance" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="turn_rate" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "projectile")
public class Projectile {

    @XmlAttribute(name = "acceleration")
    protected Double acceleration;
    @XmlAttribute(name = "arm_distance")
    protected Double armDistance;
    @XmlAttribute(name = "detonate_distance")
    protected Integer detonateDistance;
    @XmlAttribute(name = "detonate_on_contact")
    protected Short detonateOnContact;
    @XmlAttribute(name = "drag")
    protected Integer drag;
    @XmlAttribute(name = "gravity")
    protected Integer gravity;
    @XmlAttribute(name = "lifespan")
    protected Integer lifespan;
    @XmlAttribute(name = "lockon_acceleration")
    protected Integer lockonAcceleration;
    @XmlAttribute(name = "lockon_lifespan")
    protected Integer lockonLifespan;
    @XmlAttribute(name = "lockon_lose_angle")
    protected Integer lockonLoseAngle;
    @XmlAttribute(name = "lockon_seek_in_flight")
    protected Integer lockonSeekInFlight;
    @XmlAttribute(name = "projectile_flight_type_id")
    protected Integer projectileFlightTypeId;
    @XmlAttribute(name = "projectile_id")
    protected Integer projectileId;
    @XmlAttribute(name = "speed")
    protected Integer speed;
    @XmlAttribute(name = "speed_max")
    protected Integer speedMax;
    @XmlAttribute(name = "sticks_to_players")
    protected Short sticksToPlayers;
    @XmlAttribute(name = "sticky")
    protected Boolean sticky;
    @XmlAttribute(name = "tether_distance")
    protected Integer tetherDistance;
    @XmlAttribute(name = "turn_rate")
    protected Integer turnRate;

    /**
     * Ruft den Wert der acceleration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAcceleration() {
        return acceleration;
    }

    /**
     * Legt den Wert der acceleration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAcceleration(Double value) {
        this.acceleration = value;
    }

    /**
     * Ruft den Wert der armDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getArmDistance() {
        return armDistance;
    }

    /**
     * Legt den Wert der armDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setArmDistance(Double value) {
        this.armDistance = value;
    }

    /**
     * Ruft den Wert der detonateDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDetonateDistance() {
        return detonateDistance;
    }

    /**
     * Legt den Wert der detonateDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDetonateDistance(Integer value) {
        this.detonateDistance = value;
    }

    /**
     * Ruft den Wert der detonateOnContact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDetonateOnContact() {
        return detonateOnContact;
    }

    /**
     * Legt den Wert der detonateOnContact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDetonateOnContact(Short value) {
        this.detonateOnContact = value;
    }

    /**
     * Ruft den Wert der drag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrag() {
        return drag;
    }

    /**
     * Legt den Wert der drag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrag(Integer value) {
        this.drag = value;
    }

    /**
     * Ruft den Wert der gravity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGravity() {
        return gravity;
    }

    /**
     * Legt den Wert der gravity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGravity(Integer value) {
        this.gravity = value;
    }

    /**
     * Ruft den Wert der lifespan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLifespan() {
        return lifespan;
    }

    /**
     * Legt den Wert der lifespan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLifespan(Integer value) {
        this.lifespan = value;
    }

    /**
     * Ruft den Wert der lockonAcceleration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLockonAcceleration() {
        return lockonAcceleration;
    }

    /**
     * Legt den Wert der lockonAcceleration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLockonAcceleration(Integer value) {
        this.lockonAcceleration = value;
    }

    /**
     * Ruft den Wert der lockonLifespan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLockonLifespan() {
        return lockonLifespan;
    }

    /**
     * Legt den Wert der lockonLifespan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLockonLifespan(Integer value) {
        this.lockonLifespan = value;
    }

    /**
     * Ruft den Wert der lockonLoseAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLockonLoseAngle() {
        return lockonLoseAngle;
    }

    /**
     * Legt den Wert der lockonLoseAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLockonLoseAngle(Integer value) {
        this.lockonLoseAngle = value;
    }

    /**
     * Ruft den Wert der lockonSeekInFlight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLockonSeekInFlight() {
        return lockonSeekInFlight;
    }

    /**
     * Legt den Wert der lockonSeekInFlight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLockonSeekInFlight(Integer value) {
        this.lockonSeekInFlight = value;
    }

    /**
     * Ruft den Wert der projectileFlightTypeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectileFlightTypeId() {
        return projectileFlightTypeId;
    }

    /**
     * Legt den Wert der projectileFlightTypeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectileFlightTypeId(Integer value) {
        this.projectileFlightTypeId = value;
    }

    /**
     * Ruft den Wert der projectileId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectileId() {
        return projectileId;
    }

    /**
     * Legt den Wert der projectileId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectileId(Integer value) {
        this.projectileId = value;
    }

    /**
     * Ruft den Wert der speed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * Legt den Wert der speed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpeed(Integer value) {
        this.speed = value;
    }

    /**
     * Ruft den Wert der speedMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpeedMax() {
        return speedMax;
    }

    /**
     * Legt den Wert der speedMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpeedMax(Integer value) {
        this.speedMax = value;
    }

    /**
     * Ruft den Wert der sticksToPlayers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSticksToPlayers() {
        return sticksToPlayers;
    }

    /**
     * Legt den Wert der sticksToPlayers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSticksToPlayers(Short value) {
        this.sticksToPlayers = value;
    }

    /**
     * Ruft den Wert der sticky-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSticky() {
        return sticky;
    }

    /**
     * Legt den Wert der sticky-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSticky(Boolean value) {
        this.sticky = value;
    }

    /**
     * Ruft den Wert der tetherDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTetherDistance() {
        return tetherDistance;
    }

    /**
     * Legt den Wert der tetherDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTetherDistance(Integer value) {
        this.tetherDistance = value;
    }

    /**
     * Ruft den Wert der turnRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTurnRate() {
        return turnRate;
    }

    /**
     * Legt den Wert der turnRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTurnRate(Integer value) {
        this.turnRate = value;
    }

}
