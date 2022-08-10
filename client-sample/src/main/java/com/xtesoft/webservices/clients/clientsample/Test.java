
package com.xtesoft.webservices.clients.clientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for test complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="test">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "test", propOrder = {
    "apodo"
})
public class Test {

    protected String apodo;

    /**
     * Gets the value of the apodo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApodo() {
        return apodo;
    }

    /**
     * Sets the value of the apodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApodo(String value) {
        this.apodo = value;
    }

}
