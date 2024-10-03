
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
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ArticleId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "articleId",
    "amount"
})
@XmlRootElement(name = "AddOrderItem")
public class AddOrderItem {

    @XmlElement(name = "UserId")
    protected int userId;
    @XmlElement(name = "OrderId")
    protected int orderId;
    @XmlElement(name = "ArticleId")
    protected int articleId;
    @XmlElement(name = "Amount")
    protected int amount;

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
     * Obtiene el valor de la propiedad articleId.
     * 
     */
    public int getArticleId() {
        return articleId;
    }

    /**
     * Define el valor de la propiedad articleId.
     * 
     */
    public void setArticleId(int value) {
        this.articleId = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

}
