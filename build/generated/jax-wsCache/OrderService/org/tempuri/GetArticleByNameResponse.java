
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
 *         &lt;element name="GetArticleByNameResult" type="{http://tempuri.org/}Article" minOccurs="0"/&gt;
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
    "getArticleByNameResult"
})
@XmlRootElement(name = "GetArticleByNameResponse")
public class GetArticleByNameResponse {

    @XmlElement(name = "GetArticleByNameResult")
    protected Article getArticleByNameResult;

    /**
     * Obtiene el valor de la propiedad getArticleByNameResult.
     * 
     * @return
     *     possible object is
     *     {@link Article }
     *     
     */
    public Article getGetArticleByNameResult() {
        return getArticleByNameResult;
    }

    /**
     * Define el valor de la propiedad getArticleByNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Article }
     *     
     */
    public void setGetArticleByNameResult(Article value) {
        this.getArticleByNameResult = value;
    }

}
