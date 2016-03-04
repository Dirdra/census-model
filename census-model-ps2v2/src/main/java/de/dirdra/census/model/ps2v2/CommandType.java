//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.04 um 03:33:06 PM CET 
//


package de.dirdra.census.model.ps2v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für commandType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="commandType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="characters" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="worlds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eventNames" type="{}eventNames" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="all" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="payload" type="{}commandPayloadType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commandType", propOrder = {
    "service",
    "action",
    "characters",
    "worlds",
    "eventNames",
    "all",
    "payload"
})
public class CommandType {

    @XmlElement(required = true)
    protected String service;
    @XmlElement(required = true)
    protected String action;
    protected List<String> characters;
    protected List<String> worlds;
    @XmlSchemaType(name = "string")
    protected List<EventNames> eventNames;
    protected Boolean all;
    protected CommandPayloadType payload;

    /**
     * Ruft den Wert der service-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Legt den Wert der service-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Ruft den Wert der action-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Legt den Wert der action-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the characters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCharacters() {
        if (characters == null) {
            characters = new ArrayList<String>();
        }
        return this.characters;
    }

    /**
     * Gets the value of the worlds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the worlds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorlds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWorlds() {
        if (worlds == null) {
            worlds = new ArrayList<String>();
        }
        return this.worlds;
    }

    /**
     * Gets the value of the eventNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventNames }
     * 
     * 
     */
    public List<EventNames> getEventNames() {
        if (eventNames == null) {
            eventNames = new ArrayList<EventNames>();
        }
        return this.eventNames;
    }

    /**
     * Ruft den Wert der all-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAll() {
        return all;
    }

    /**
     * Legt den Wert der all-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAll(Boolean value) {
        this.all = value;
    }

    /**
     * Ruft den Wert der payload-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommandPayloadType }
     *     
     */
    public CommandPayloadType getPayload() {
        return payload;
    }

    /**
     * Legt den Wert der payload-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandPayloadType }
     *     
     */
    public void setPayload(CommandPayloadType value) {
        this.payload = value;
    }

}
