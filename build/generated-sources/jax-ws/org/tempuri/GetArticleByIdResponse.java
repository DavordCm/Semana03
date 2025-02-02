
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
 *         &lt;element name="GetArticleByIdResult" type="{http://tempuri.org/}Article" minOccurs="0"/&gt;
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
    "getArticleByIdResult"
})
@XmlRootElement(name = "GetArticleByIdResponse")
public class GetArticleByIdResponse {

    @XmlElement(name = "GetArticleByIdResult")
    protected Article getArticleByIdResult;

    /**
     * Obtiene el valor de la propiedad getArticleByIdResult.
     * 
     * @return
     *     possible object is
     *     {@link Article }
     *     
     */
    public Article getGetArticleByIdResult() {
        return getArticleByIdResult;
    }

    /**
     * Define el valor de la propiedad getArticleByIdResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Article }
     *     
     */
    public void setGetArticleByIdResult(Article value) {
        this.getArticleByIdResult = value;
    }

}
