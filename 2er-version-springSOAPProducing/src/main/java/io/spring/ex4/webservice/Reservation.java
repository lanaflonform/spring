//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.08 at 12:22:06 AM CET 
//


package io.spring.ex4.webservice;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
 *         &lt;element name="dateArrivee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateDepart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chambre" type="{http://spring.io/ex4/webservice}Chambre"/>
 *         &lt;element name="agenceVoyage" type="{http://spring.io/ex4/webservice}AgenceVoyage"/>
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
    "dateArrivee",
    "dateDepart",
    "chambre",
    "agenceVoyage"
})
@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    protected int id;
    @XmlElement(required = true)
    protected String dateArrivee;
    @XmlElement(required = true)
    protected String dateDepart;
    @XmlElement(required = true)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "chambre_id", referencedColumnName = "id")
    protected Chambre chambre;
    @XmlElement(required = true)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "agence_voyage_id", referencedColumnName = "id")
    protected AgenceVoyage agenceVoyage;

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
     * Gets the value of the dateArrivee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateArrivee() {
        return dateArrivee;
    }

    /**
     * Sets the value of the dateArrivee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateArrivee(String value) {
        this.dateArrivee = value;
    }

    /**
     * Gets the value of the dateDepart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDepart() {
        return dateDepart;
    }

    /**
     * Sets the value of the dateDepart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDepart(String value) {
        this.dateDepart = value;
    }

    /**
     * Gets the value of the chambre property.
     * 
     * @return
     *     possible object is
     *     {@link Chambre }
     *     
     */
    public Chambre getChambre() {
        return chambre;
    }

    /**
     * Sets the value of the chambre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chambre }
     *     
     */
    public void setChambre(Chambre value) {
        this.chambre = value;
    }

    /**
     * Gets the value of the agenceVoyage property.
     * 
     * @return
     *     possible object is
     *     {@link AgenceVoyage }
     *     
     */
    public AgenceVoyage getAgenceVoyage() {
        return agenceVoyage;
    }

    /**
     * Sets the value of the agenceVoyage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgenceVoyage }
     *     
     */
    public void setAgenceVoyage(AgenceVoyage value) {
        this.agenceVoyage = value;
    }

}
