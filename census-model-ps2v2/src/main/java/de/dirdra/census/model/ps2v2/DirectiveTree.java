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
 * <p>Java-Klasse für directive_tree complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="directive_tree"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{}directove_tree_name"/&gt;
 *         &lt;element name="description" type="{}directive_tree_description"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{}directive_tree_category_id"/&gt;
 *       &lt;attribute ref="{}directive_tree_id"/&gt;
 *       &lt;attribute ref="{}image_id"/&gt;
 *       &lt;attribute ref="{}image_path"/&gt;
 *       &lt;attribute ref="{}image_set_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "directive_tree", propOrder = {
    "name",
    "description"
})
public class DirectiveTree {

    @XmlElement(required = true)
    protected DirectoveTreeName name;
    @XmlElement(required = true)
    protected DirectiveTreeDescription description;
    @XmlAttribute(name = "directive_tree_category_id")
    protected Integer directiveTreeCategoryId;
    @XmlAttribute(name = "directive_tree_id")
    protected Integer directiveTreeId;
    @XmlAttribute(name = "image_id")
    protected Integer imageId;
    @XmlAttribute(name = "image_path")
    protected String imagePath;
    @XmlAttribute(name = "image_set_id")
    protected Integer imageSetId;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectoveTreeName }
     *     
     */
    public DirectoveTreeName getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectoveTreeName }
     *     
     */
    public void setName(DirectoveTreeName value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveTreeDescription }
     *     
     */
    public DirectiveTreeDescription getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveTreeDescription }
     *     
     */
    public void setDescription(DirectiveTreeDescription value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der directiveTreeCategoryId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirectiveTreeCategoryId() {
        return directiveTreeCategoryId;
    }

    /**
     * Legt den Wert der directiveTreeCategoryId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirectiveTreeCategoryId(Integer value) {
        this.directiveTreeCategoryId = value;
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

}
