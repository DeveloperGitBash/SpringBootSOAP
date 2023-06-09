//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.06 at 02:11:43 PM IST 
//


package com.java.xml.school.dept;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateDepartmentVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateDepartmentVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deptId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="depNane" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hodName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hodContact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="students" type="{http://www.java.com/xml/school/dept}UpdateStudentVo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDepartmentVo", propOrder = {
    "deptId",
    "depNane",
    "hodName",
    "hodContact",
    "students"
})
public class UpdateDepartmentVo {

    protected long deptId;
    @XmlElement(required = true)
    protected String depNane;
    @XmlElement(required = true)
    protected String hodName;
    @XmlElement(required = true)
    protected String hodContact;
    @XmlElement(required = true)
    protected List<UpdateStudentVo> students;

    /**
     * Gets the value of the deptId property.
     * 
     */
    public long getDeptId() {
        return deptId;
    }

    /**
     * Sets the value of the deptId property.
     * 
     */
    public void setDeptId(long value) {
        this.deptId = value;
    }

    /**
     * Gets the value of the depNane property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepNane() {
        return depNane;
    }

    /**
     * Sets the value of the depNane property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepNane(String value) {
        this.depNane = value;
    }

    /**
     * Gets the value of the hodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHodName() {
        return hodName;
    }

    /**
     * Sets the value of the hodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHodName(String value) {
        this.hodName = value;
    }

    /**
     * Gets the value of the hodContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHodContact() {
        return hodContact;
    }

    /**
     * Sets the value of the hodContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHodContact(String value) {
        this.hodContact = value;
    }

    /**
     * Gets the value of the students property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the students property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateStudentVo }
     * 
     * 
     */
    public List<UpdateStudentVo> getStudents() {
        if (students == null) {
            students = new ArrayList<UpdateStudentVo>();
        }
        return this.students;
    }

}
