//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.04 at 08:04:25 PM CET 
//


package io.spring.ex4.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreEtoiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreLits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="adresse" type="{http://spring.io/ex4/webservice}Adresse"/>
 *         &lt;element name="chambre" type="{http://spring.io/ex4/webservice}Chambre" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "id",
    "nom",
    "nombreEtoiles",
    "nombreLits",
    "adresse",
    "chambre"
})
public class Reservation {

    protected int id;
    @XmlElement(required = true)
    protected String nom;
    protected int nombreEtoiles;
    protected int nombreLits;
    @XmlElement(required = true)
    protected Adresse adresse;
    protected List<Chambre> chambre;

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
     * Gets the value of the nom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the value of the nom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Gets the value of the nombreEtoiles property.
     * 
     */
    public int getNombreEtoiles() {
        return nombreEtoiles;
    }

    /**
     * Sets the value of the nombreEtoiles property.
     * 
     */
    public void setNombreEtoiles(int value) {
        this.nombreEtoiles = value;
    }

    /**
     * Gets the value of the nombreLits property.
     * 
     */
    public int getNombreLits() {
        return nombreLits;
    }

    /**
     * Sets the value of the nombreLits property.
     * 
     */
    public void setNombreLits(int value) {
        this.nombreLits = value;
    }

    /**
     * Gets the value of the adresse property.
     * 
     * @return
     *     possible object is
     *     {@link Adresse }
     *     
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * Sets the value of the adresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adresse }
     *     
     */
    public void setAdresse(Adresse value) {
        this.adresse = value;
    }

    /**
     * Gets the value of the chambre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chambre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChambre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Chambre }
     * 
     * 
     */
    public List<Chambre> getChambre() {
        if (chambre == null) {
            chambre = new ArrayList<Chambre>();
        }
        return this.chambre;
    }

}
