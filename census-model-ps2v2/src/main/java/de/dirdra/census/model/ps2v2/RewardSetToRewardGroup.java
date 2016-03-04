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
 * <p>Java-Klasse für reward_set_to_reward_group complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="reward_set_to_reward_group"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{}reward_group_id"/&gt;
 *       &lt;attribute ref="{}reward_set_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reward_set_to_reward_group")
public class RewardSetToRewardGroup {

    @XmlAttribute(name = "reward_group_id")
    protected Integer rewardGroupId;
    @XmlAttribute(name = "reward_set_id")
    protected Integer rewardSetId;

    /**
     * Ruft den Wert der rewardGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRewardGroupId() {
        return rewardGroupId;
    }

    /**
     * Legt den Wert der rewardGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRewardGroupId(Integer value) {
        this.rewardGroupId = value;
    }

    /**
     * Ruft den Wert der rewardSetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRewardSetId() {
        return rewardSetId;
    }

    /**
     * Legt den Wert der rewardSetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRewardSetId(Integer value) {
        this.rewardSetId = value;
    }

}
