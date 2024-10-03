
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArticleId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SinglePrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItem", propOrder = {
    "articleId",
    "amount",
    "singlePrice",
    "price"
})
public class OrderItem {

    @XmlElement(name = "ArticleId")
    protected int articleId;
    @XmlElement(name = "Amount")
    protected int amount;
    @XmlElement(name = "SinglePrice")
    protected double singlePrice;
    @XmlElement(name = "Price")
    protected double price;

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

    /**
     * Obtiene el valor de la propiedad singlePrice.
     * 
     */
    public double getSinglePrice() {
        return singlePrice;
    }

    /**
     * Define el valor de la propiedad singlePrice.
     * 
     */
    public void setSinglePrice(double value) {
        this.singlePrice = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

}
