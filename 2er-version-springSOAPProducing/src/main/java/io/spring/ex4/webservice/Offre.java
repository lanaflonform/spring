//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.05 at 09:10:42 PM CET 
//


package io.spring.ex4.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Offre complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Offre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="typeChambre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateDisponibilite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Offre", propOrder = {
    "id",
    "typeChambre",
    "dateDisponibilite",
    "prix"
})
public class Offre {

    protected int id;
    @XmlElement(required = true)
    protected String typeChambre;
    @XmlElement(required = true)
    protected String dateDisponibilite;
    protected double prix;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the typeChambre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeChambre() {
        return typeChambre;
    }

    /**
     * Sets the value of the typeChambre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeChambre(String value) {
        this.typeChambre = value;
    }

    /**
     * Gets the value of the dateDisponibilite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDisponibilite() {
        return dateDisponibilite;
    }

    /**
     * Sets the value of the dateDisponibilite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDisponibilite(String value) {
        this.dateDisponibilite = value;
    }

    /**
     * Gets the value of the prix property.
     * 
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Sets the value of the prix property.
     * 
     */
    public void setPrix(double value) {
        this.prix = value;
    }

}