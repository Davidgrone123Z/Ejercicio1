//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.09 a las 05:13:26 PM PET 
//


package io.spring.guides.gs_producing_web_service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para day complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="day"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="traduction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ntraduc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "day", propOrder = {
    "name",
    "traduction",
    "numero",
    "ntraduc"
})
public class Day {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String traduction;
    @XmlElement(required = true)
    protected String numero;
    @XmlElement(required = true)
    protected String ntraduc;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad traduction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraduction() {
        return traduction;
    }

    /**
     * Define el valor de la propiedad traduction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraduction(String value) {
        this.traduction = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad ntraduc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtraduc() {
        return ntraduc;
    }

    /**
     * Define el valor de la propiedad ntraduc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtraduc(String value) {
        this.ntraduc = value;
    }

}
