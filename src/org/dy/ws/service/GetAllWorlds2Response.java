
package org.dy.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getAllWorlds2Response complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getAllWorlds2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.ws.dy.org/}worldMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllWorlds2Response", propOrder = {
    "_return"
})
public class GetAllWorlds2Response {

    @XmlElement(name = "return")
    protected WorldMap _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WorldMap }
     *     
     */
    public WorldMap getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WorldMap }
     *     
     */
    public void setReturn(WorldMap value) {
        this._return = value;
    }

}
