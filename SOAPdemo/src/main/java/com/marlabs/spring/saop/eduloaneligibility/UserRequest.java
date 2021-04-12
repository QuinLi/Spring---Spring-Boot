//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.04.12 时间 04:38:53 PM EDT 
//


package com.marlabs.spring.saop.eduloaneligibility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userannualIncome" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userieltsScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="useremploymentMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userName",
    "userage",
    "userannualIncome",
    "userieltsScore",
    "useremploymentMode"
})
@XmlRootElement(name = "UserRequest")
public class UserRequest {

    @XmlElement(required = true)
    protected String userName;
    protected int userage;
    protected long userannualIncome;
    protected int userieltsScore;
    @XmlElement(required = true)
    protected String useremploymentMode;

    /**
     * 获取userName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置userName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * 获取userage属性的值。
     * 
     */
    public int getUserage() {
        return userage;
    }

    /**
     * 设置userage属性的值。
     * 
     */
    public void setUserage(int value) {
        this.userage = value;
    }

    /**
     * 获取userannualIncome属性的值。
     * 
     */
    public long getUserannualIncome() {
        return userannualIncome;
    }

    /**
     * 设置userannualIncome属性的值。
     * 
     */
    public void setUserannualIncome(long value) {
        this.userannualIncome = value;
    }

    /**
     * 获取userieltsScore属性的值。
     * 
     */
    public int getUserieltsScore() {
        return userieltsScore;
    }

    /**
     * 设置userieltsScore属性的值。
     * 
     */
    public void setUserieltsScore(int value) {
        this.userieltsScore = value;
    }

    /**
     * 获取useremploymentMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseremploymentMode() {
        return useremploymentMode;
    }

    /**
     * 设置useremploymentMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseremploymentMode(String value) {
        this.useremploymentMode = value;
    }

}
