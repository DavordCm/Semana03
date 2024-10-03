
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
 *         &lt;element name="GetOrderItemCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "getOrderItemCountResult"
})
@XmlRootElement(name = "GetOrderItemCountResponse")
public class GetOrderItemCountResponse {

    @XmlElement(name = "GetOrderItemCountResult")
    protected int getOrderItemCountResult;

    /**
     * Obtiene el valor de la propiedad getOrderItemCountResult.
     * 
     */
    public int getGetOrderItemCountResult() {
        return getOrderItemCountResult;
    }

    /**
     * Define el valor de la propiedad getOrderItemCountResult.
     * 
     */
    public void setGetOrderItemCountResult(int value) {
        this.getOrderItemCountResult = value;
    }

}
