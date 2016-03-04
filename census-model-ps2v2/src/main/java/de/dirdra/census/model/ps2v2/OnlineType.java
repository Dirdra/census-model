//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.04 um 03:33:06 PM CET 
//


package de.dirdra.census.model.ps2v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für onlineType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="onlineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventServerEndpoint_Briggs_25" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EventServerEndpoint_Cobalt_13" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EventServerEndpoint_Connery_1" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EventServerEndpoint_Emerald_17" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EventServerEndpoint_Jaeger_19" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EventServerEndpoint_Miller_10" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "onlineType", propOrder = {
    "eventServerEndpointBriggs25",
    "eventServerEndpointCobalt13",
    "eventServerEndpointConnery1",
    "eventServerEndpointEmerald17",
    "eventServerEndpointJaeger19",
    "eventServerEndpointMiller10"
})
public class OnlineType {

    @XmlElement(name = "EventServerEndpoint_Briggs_25")
    protected boolean eventServerEndpointBriggs25;
    @XmlElement(name = "EventServerEndpoint_Cobalt_13")
    protected boolean eventServerEndpointCobalt13;
    @XmlElement(name = "EventServerEndpoint_Connery_1")
    protected boolean eventServerEndpointConnery1;
    @XmlElement(name = "EventServerEndpoint_Emerald_17")
    protected boolean eventServerEndpointEmerald17;
    @XmlElement(name = "EventServerEndpoint_Jaeger_19")
    protected boolean eventServerEndpointJaeger19;
    @XmlElement(name = "EventServerEndpoint_Miller_10")
    protected boolean eventServerEndpointMiller10;

    /**
     * Ruft den Wert der eventServerEndpointBriggs25-Eigenschaft ab.
     * 
     */
    public boolean isEventServerEndpointBriggs25() {
        return eventServerEndpointBriggs25;
    }

    /**
     * Legt den Wert der eventServerEndpointBriggs25-Eigenschaft fest.
     * 
     */
    public void setEventServerEndpointBriggs25(boolean value) {
        this.eventServerEndpointBriggs25 = value;
    }

    /**
     * Ruft den Wert der eventServerEndpointCobalt13-Eigenschaft ab.
     * 
     */
    public boolean isEventServerEndpointCobalt13() {
        return eventServerEndpointCobalt13;
    }

    /**
     * Legt den Wert der eventServerEndpointCobalt13-Eigenschaft fest.
     * 
     */
    public void setEventServerEndpointCobalt13(boolean value) {
        this.eventServerEndpointCobalt13 = value;
    }

    /**
     * Ruft den Wert der eventServerEndpointConnery1-Eigenschaft ab.
     * 
     */
    public boolean isEventServerEndpointConnery1() {
        return eventServerEndpointConnery1;
    }

    /**
     * Legt den Wert der eventServerEndpointConnery1-Eigenschaft fest.
     * 
     */
    public void setEventServerEndpointConnery1(boolean value) {
        this.eventServerEndpointConnery1 = value;
    }

    /**
     * Ruft den Wert der eventServerEndpointEmerald17-Eigenschaft ab.
     * 
     */
    public boolean isEventServerEndpointEmerald17() {
        return eventServerEndpointEmerald17;
    }

    /**
     * Legt den Wert der eventServerEndpointEmerald17-Eigenschaft fest.
     * 
     */
    public void setEventServerEndpointEmerald17(boolean value) {
        this.eventServerEndpointEmerald17 = value;
    }

    /**
     * Ruft den Wert der eventServerEndpointJaeger19-Eigenschaft ab.
     * 
     */
    public boolean isEventServerEndpointJaeger19() {
        return eventServerEndpointJaeger19;
    }

    /**
     * Legt den Wert der eventServerEndpointJaeger19-Eigenschaft fest.
     * 
     */
    public void setEventServerEndpointJaeger19(boolean value) {
        this.eventServerEndpointJaeger19 = value;
    }

    /**
     * Ruft den Wert der eventServerEndpointMiller10-Eigenschaft ab.
     * 
     */
    public boolean isEventServerEndpointMiller10() {
        return eventServerEndpointMiller10;
    }

    /**
     * Legt den Wert der eventServerEndpointMiller10-Eigenschaft fest.
     * 
     */
    public void setEventServerEndpointMiller10(boolean value) {
        this.eventServerEndpointMiller10 = value;
    }

}
