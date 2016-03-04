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
 * <p>Java-Klasse für directive_tree_category complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="directive_tree_category"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{}directive_tree_category_name"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{}directive_tree_category_id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "directive_tree_category", propOrder = {
    "name"
})
public class DirectiveTreeCategory {

    @XmlElement(required = true)
    protected DirectiveTreeCategoryName name;
    @XmlAttribute(name = "directive_tree_category_id")
    protected Integer directiveTreeCategoryId;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveTreeCategoryName }
     *     
     */
    public DirectiveTreeCategoryName getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveTreeCategoryName }
     *     
     */
    public void setName(DirectiveTreeCategoryName value) {
        this.name = value;
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

}
