
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderStatus.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="OrderStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="InProgress"/&gt;
 *     &lt;enumeration value="Ordered"/&gt;
 *     &lt;enumeration value="Delivered"/&gt;
 *     &lt;enumeration value="Canceled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus")
@XmlEnum
public enum OrderStatus {

    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Ordered")
    ORDERED("Ordered"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled");
    private final String value;

    OrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderStatus fromValue(String v) {
        for (OrderStatus c: OrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
