//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.06 at 02:11:43 PM IST 
//


package com.java.xml.school.dept;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdateUpdateDepartmentVo" type="{http://www.java.com/xml/school/dept}UpdateDepartmentVo"/>
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
    "updateUpdateDepartmentVo"
})
@XmlRootElement(name = "UpdateDeptResponse")
public class UpdateDeptResponse {

    @XmlElement(name = "UpdateUpdateDepartmentVo", required = true)
    protected UpdateDepartmentVo updateUpdateDepartmentVo;

    /**
     * Gets the value of the updateUpdateDepartmentVo property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateDepartmentVo }
     *     
     */
    public UpdateDepartmentVo getUpdateUpdateDepartmentVo() {
        return updateUpdateDepartmentVo;
    }

    /**
     * Sets the value of the updateUpdateDepartmentVo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateDepartmentVo }
     *     
     */
    public void setUpdateUpdateDepartmentVo(UpdateDepartmentVo value) {
        this.updateUpdateDepartmentVo = value;
    }

}
