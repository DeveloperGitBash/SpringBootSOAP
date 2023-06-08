package com.example.main.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long deptId;
	@Column(name="deptName")
	String depNane;
	@Column(name="hodName")
	String hodName;
	@Column(name="hodContact")
	String hodContact;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_dep_id", referencedColumnName = "deptId")
	private List<Student> students = new ArrayList<Student>();
	public Department() {
	// TODO Auto-generated constructor stub
	}
	
	public Department(long deptId, String depNane, String hodName, String hodContact, List<Student> students) {
		super();
		this.deptId = deptId;
		this.depNane = depNane;
		this.hodName = hodName;
		this.hodContact = hodContact;
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public String getDepNane() {
		return depNane;
	}

	public void setDepNane(String depNane) {
		this.depNane = depNane;
	}

	public String getHodName() {
		return hodName;
	}

	public void setHodName(String hodName) {
		this.hodName = hodName;
	}

	public String getHodContact() {
		return hodContact;
	}

	public void setHodContact(String hodContact) {
		this.hodContact = hodContact;
	}


	

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", depNane=" + depNane + ", hodName=" + hodName + ", hodContact="
				+ hodContact + ", students=" + students + ", getStudents()=" + getStudents() + ", getDeptId()="
				+ getDeptId() + ", getDepNane()=" + getDepNane() + ", getHodName()=" + getHodName()
				+ ", getHodContact()=" + getHodContact() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((depNane == null) ? 0 : depNane.hashCode());
		result = prime * result + (int) (deptId ^ (deptId >>> 32));
		result = prime * result + ((hodContact == null) ? 0 : hodContact.hashCode());
		result = prime * result + ((hodName == null) ? 0 : hodName.hashCode());
		result = prime * result + ((students == null) ? 0 : students.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (depNane == null) {
			if (other.depNane != null)
				return false;
		} else if (!depNane.equals(other.depNane))
			return false;
		if (deptId != other.deptId)
			return false;
		if (hodContact == null) {
			if (other.hodContact != null)
				return false;
		} else if (!hodContact.equals(other.hodContact))
			return false;
		if (hodName == null) {
			if (other.hodName != null)
				return false;
		} else if (!hodName.equals(other.hodName))
			return false;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		return true;
	}

	

	

	
	
}
