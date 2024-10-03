
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
 *         &lt;element name="CreateNewOrderResult" type="{http://tempuri.org/}Order" minOccurs="0"/&gt;
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
    "createNewOrderResult"
})
@XmlRootElement(name = "CreateNewOrderResponse")
public class CreateNewOrderResponse {

    @XmlElement(name = "CreateNewOrderResult")
    protected Order createNewOrderResult;

    /**
     * Obtiene el valor de la propiedad createNewOrderResult.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getCreateNewOrderResult() {
        return createNewOrderResult;
    }

    /**
     * Define el valor de la propiedad createNewOrderResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setCreateNewOrderResult(Order value) {
        this.createNewOrderResult = value;
    }

}
