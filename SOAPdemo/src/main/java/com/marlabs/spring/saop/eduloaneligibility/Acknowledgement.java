//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.04.12 时间 04:38:53 PM EDT 
//


package com.marlabs.spring.saop.eduloaneligibility;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="isEligible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="approvedAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CriteriaMismatch" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "isEligible",
    "approvedAmount",
    "criteriaMismatch"
})
@XmlRootElement(name = "Acknowledgement")
public class Acknowledgement {

    protected boolean isEligible;
    protected long approvedAmount;
    @XmlElement(name = "CriteriaMismatch", required = true)
    protected List<String> criteriaMismatch;

    /**
     * 获取isEligible属性的值。
     * 
     */
    public boolean isIsEligible() {
        return isEligible;
    }

    /**
     * 设置isEligible属性的值。
     * 
     */
    public void setIsEligible(boolean value) {
        this.isEligible = value;
    }

    /**
     * 获取approvedAmount属性的值。
     * 
     */
    public long getApprovedAmount() {
        return approvedAmount;
    }

    /**
     * 设置approvedAmount属性的值。
     * 
     */
    public void setApprovedAmount(long value) {
        this.approvedAmount = value;
    }

    /**
     * Gets the value of the criteriaMismatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaMismatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaMismatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCriteriaMismatch() {
        if (criteriaMismatch == null) {
            criteriaMismatch = new ArrayList<String>();
        }
        return this.criteriaMismatch;
    }

}
