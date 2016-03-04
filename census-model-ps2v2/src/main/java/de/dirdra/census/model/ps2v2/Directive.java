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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für directive complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="directive"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{}directive_name"/&gt;
 *         &lt;element name="description" type="{}directive_description"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{}directive_id"/&gt;
 *       &lt;attribute ref="{}directive_tier_id"/&gt;
 *       &lt;attribute ref="{}directive_tree_id"/&gt;
 *       &lt;attribute ref="{}image_id"/&gt;
 *       &lt;attribute ref="{}image_path"/&gt;
 *       &lt;attribute ref="{}image_set_id"/&gt;
 *       &lt;attribute ref="{}objective_set_id"/&gt;
 *       &lt;attribute ref="{}qualify_requirement_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "directive", propOrder = {
    "name",
    "description"
})
public class Directive {

    @XmlElement(required = true)
    protected DirectiveName name;
    @XmlElement(required = true)
    protected DirectiveDescription description;
    @XmlAttribute(name = "directive_id")
    protected Integer directiveId;
    @XmlAttribute(name = "directive_tier_id")
    protected Integer directiveTierId;
    @XmlAttribute(name = "directive_tree_id")
    protected Integer directiveTreeId;
    @XmlAttribute(name = "image_id")
    protected Integer imageId;
    @XmlAttribute(name = "image_path")
    protected String imagePath;
    @XmlAttribute(name = "image_set_id")
    protected Integer imageSetId;
    @XmlAttribute(name = "objective_set_id")
    protected Integer objectiveSetId;
    @XmlAttribute(name = "qualify_requirement_id")
    protected Integer qualifyRequirementId;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveName }
     *     
     */
    public DirectiveName getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveName }
     *     
     */
    public void setName(DirectiveName value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveDescription }
     *     
     */
    public DirectiveDescription getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveDescription }
     *     
     */
    public void setDescription(DirectiveDescription value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der directiveId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirectiveId() {
        return directiveId;
    }

    /**
     * Legt den Wert der directiveId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirectiveId(Integer value) {
        this.directiveId = value;
    }

    /**
     * Ruft den Wert der directiveTierId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirectiveTierId() {
        return directiveTierId;
    }

    /**
     * Legt den Wert der directiveTierId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirectiveTierId(Integer value) {
        this.directiveTierId = value;
    }

    /**
     * Ruft den Wert der directiveTreeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirectiveTreeId() {
        return directiveTreeId;
    }

    /**
     * Legt den Wert der directiveTreeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirectiveTreeId(Integer value) {
        this.directiveTreeId = value;
    }

    /**
     * Ruft den Wert der imageId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageId() {
        return imageId;
    }

    /**
     * Legt den Wert der imageId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageId(Integer value) {
        this.imageId = value;
    }

    /**
     * Ruft den Wert der imagePath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Legt den Wert der imagePath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePath(String value) {
        this.imagePath = value;
    }

    /**
     * Ruft den Wert der imageSetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageSetId() {
        return imageSetId;
    }

    /**
     * Legt den Wert der imageSetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageSetId(Integer value) {
        this.imageSetId = value;
    }

    /**
     * Ruft den Wert der objectiveSetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectiveSetId() {
        return objectiveSetId;
    }

    /**
     * Legt den Wert der objectiveSetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectiveSetId(Integer value) {
        this.objectiveSetId = value;
    }

    /**
     * Ruft den Wert der qualifyRequirementId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQualifyRequirementId() {
        return qualifyRequirementId;
    }

    /**
     * Legt den Wert der qualifyRequirementId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQualifyRequirementId(Integer value) {
        this.qualifyRequirementId = value;
    }

}
