
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
 *         &lt;element name="SearchArticlesResult" type="{http://tempuri.org/}ArrayOfArticle" minOccurs="0"/&gt;
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
    "searchArticlesResult"
})
@XmlRootElement(name = "SearchArticlesResponse")
public class SearchArticlesResponse {

    @XmlElement(name = "SearchArticlesResult")
    protected ArrayOfArticle searchArticlesResult;

    /**
     * Obtiene el valor de la propiedad searchArticlesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArticle }
     *     
     */
    public ArrayOfArticle getSearchArticlesResult() {
        return searchArticlesResult;
    }

    /**
     * Define el valor de la propiedad searchArticlesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArticle }
     *     
     */
    public void setSearchArticlesResult(ArrayOfArticle value) {
        this.searchArticlesResult = value;
    }

}
