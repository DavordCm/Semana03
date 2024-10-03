
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
 *         &lt;element name="GetOrderPriceResult" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "getOrderPriceResult"
})
@XmlRootElement(name = "GetOrderPriceResponse")
public class GetOrderPriceResponse {

    @XmlElement(name = "GetOrderPriceResult")
    protected double getOrderPriceResult;

    /**
     * Obtiene el valor de la propiedad getOrderPriceResult.
     * 
     */
    public double getGetOrderPriceResult() {
        return getOrderPriceResult;
    }

    /**
     * Define el valor de la propiedad getOrderPriceResult.
     * 
     */
    public void setGetOrderPriceResult(double value) {
        this.getOrderPriceResult = value;
    }

}
