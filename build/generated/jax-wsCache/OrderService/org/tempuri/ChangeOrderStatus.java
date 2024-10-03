
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NewStatus" type="{http://tempuri.org/}OrderStatus"/&gt;
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
    "userId",
    "orderId",
    "newStatus"
})
@XmlRootElement(name = "ChangeOrderStatus")
public class ChangeOrderStatus {

    @XmlElement(name = "UserId")
    protected int userId;
    @XmlElement(name = "OrderId")
    protected int orderId;
    @XmlElement(name = "NewStatus", required = true)
    @XmlSchemaType(name = "string")
    protected OrderStatus newStatus;

    /**
     * Obtiene el valor de la propiedad userId.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Define el valor de la propiedad userId.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

    /**
     * Obtiene el valor de la propiedad orderId.
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Define el valor de la propiedad orderId.
     * 
     */
    public void setOrderId(int value) {
        this.orderId = value;
    }

    /**
     * Obtiene el valor de la propiedad newStatus.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus }
     *     
     */
    public OrderStatus getNewStatus() {
        return newStatus;
    }

    /**
     * Define el valor de la propiedad newStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus }
     *     
     */
    public void setNewStatus(OrderStatus value) {
        this.newStatus = value;
    }

}
