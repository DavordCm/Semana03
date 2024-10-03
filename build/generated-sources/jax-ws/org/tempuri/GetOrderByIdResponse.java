
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetOrderByIdResult" type="{http://tempuri.org/}Order" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getOrderByIdResult"
})
@XmlRootElement(name = "GetOrderByIdResponse")
public class GetOrderByIdResponse {

    @XmlElement(name = "GetOrderByIdResult")
    protected Order getOrderByIdResult;

    /**
     * Obtiene el valor de la propiedad getOrderByIdResult.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getGetOrderByIdResult() {
        return getOrderByIdResult;
    }

    /**
     * Define el valor de la propiedad getOrderByIdResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setGetOrderByIdResult(Order value) {
        this.getOrderByIdResult = value;
    }

}
