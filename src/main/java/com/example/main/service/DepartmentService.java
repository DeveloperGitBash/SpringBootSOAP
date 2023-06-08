package com.example.main.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.beans.Department;
import com.example.main.beans.Student;
import com.example.main.repo.CurdRepositry;
import com.java.xml.school.dept.CreateDeptRequest;
import com.java.xml.school.dept.CreateDeptResponse;
import com.java.xml.school.dept.DeleteDeptRequest;
import com.java.xml.school.dept.DeleteDeptResponse;
import com.java.xml.school.dept.DepartmentVo;
import com.java.xml.school.dept.StudentDetailsRequest;
import com.java.xml.school.dept.StudentDetailsResponse;
import com.java.xml.school.dept.StudentVo;
import com.java.xml.school.dept.UpdateDepartmentVo;
import com.java.xml.school.dept.UpdateDeptRequest;
import com.java.xml.school.dept.UpdateDeptResponse;
import com.java.xml.school.dept.UpdateStudentVo;






@Service
public class DepartmentService {
	
	@Autowired
	private CurdRepositry curdRepositry;
	
	@Autowired
	private ModelMapper mapper;

	public StudentDetailsResponse getDepartDetils(StudentDetailsRequest studentDetailsRequest) {
		Department dept = curdRepositry.findById(studentDetailsRequest.getDeptId()).get();
		StudentDetailsResponse response = new StudentDetailsResponse();
		DepartmentVo ddp = new DepartmentVo();
		
		BeanUtils.copyProperties(dept, ddp);
		for(Student fromBean: dept.getStudents()) {
		    if(fromBean != null) {
		    	StudentVo toBean = new StudentVo();
		        org.springframework.beans.BeanUtils.copyProperties(fromBean, toBean);
		        ddp.getStudents().add(toBean);
		    }
		}
		
		response.setDepartmentVo(ddp);
		return response;
	}
	
	public CreateDeptResponse createDepartDetils(CreateDeptRequest studentDetailsRequest) {
		Department toBean = new Department();
		 org.springframework.beans.BeanUtils.copyProperties(studentDetailsRequest.getDepartmentVo(), toBean);
		 
		 for(StudentVo fromBeans: studentDetailsRequest.getDepartmentVo().getStudents()) {
			    if(fromBeans != null) {
			    	Student studTo = new Student();
			        org.springframework.beans.BeanUtils.copyProperties(fromBeans, studTo);
			        toBean.getStudents().add(studTo);
			    }
		 }
		Department dept =curdRepositry.save(toBean);
		CreateDeptResponse response = new CreateDeptResponse();
		DepartmentVo ddp = new DepartmentVo();
		
		BeanUtils.copyProperties(dept, ddp);
		for(Student fromBean: dept.getStudents()) {
		    if(fromBean != null) {
		    	StudentVo toBeans = new StudentVo();
		        org.springframework.beans.BeanUtils.copyProperties(fromBean, toBeans);
		        ddp.getStudents().add(toBeans);
		    }
		}
		
		response.setDepartmentVo(ddp);
		return response;
	}
	public UpdateDeptResponse updateDepartDetils(UpdateDeptRequest studentDetailsRequest) {
		Department toBean = new Department();
		 org.springframework.beans.BeanUtils.copyProperties(studentDetailsRequest.getUpdateDepartmentVo(), toBean);
		 
		 for(UpdateStudentVo fromBeans: studentDetailsRequest.getUpdateDepartmentVo().getStudents()) {
			    if(fromBeans != null) {
			    	Student studTo = new Student();
			        org.springframework.beans.BeanUtils.copyProperties(fromBeans, studTo);
			        toBean.getStudents().add(studTo);
			    }
		 }
		Department dept =curdRepositry.save(toBean);
		UpdateDeptResponse response = new UpdateDeptResponse();
		UpdateDepartmentVo ddp = new UpdateDepartmentVo();
		
		BeanUtils.copyProperties(dept, ddp);
		for(Student fromBean: dept.getStudents()) {
		    if(fromBean != null) {
		    	UpdateStudentVo toBeans = new UpdateStudentVo();
		        org.springframework.beans.BeanUtils.copyProperties(fromBean, toBeans);
		        ddp.getStudents().add(toBeans);
		    }
		}
		
		response.setUpdateUpdateDepartmentVo(ddp);
		return response;
	}
	public DeleteDeptResponse deleteDepartDetils(DeleteDeptRequest deleteDeptRequest) {
		Department deptDelete = curdRepositry.findById(deleteDeptRequest.getDeptId()).get();
		DeleteDeptResponse response = new DeleteDeptResponse();
		 curdRepositry.delete(deptDelete);
		 response.setDeletStatus(Boolean.TRUE);
		return response;
	}

}