package com.example.main.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long sudentId;
	
	String studentName;
	
	public Student() {
		
	}
	
	public Student(long sudentId, String studentName) {
		super();
		this.sudentId = sudentId;
		this.studentName = studentName;
	}


	public long getSudentId() {
		return sudentId;
	}

	public void setSudentId(long sudentId) {
		this.sudentId = sudentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		result = prime * result + (int) (sudentId ^ (sudentId >>> 32));
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
		Student other = (Student) obj;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		if (sudentId != other.sudentId)
			return false;
		return true;
	}
	

}
