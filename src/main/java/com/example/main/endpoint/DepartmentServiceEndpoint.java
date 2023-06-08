package com.example.main.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.main.service.DepartmentService;
import com.java.xml.school.dept.CreateDeptRequest;
import com.java.xml.school.dept.CreateDeptResponse;
import com.java.xml.school.dept.DeleteDeptRequest;
import com.java.xml.school.dept.DeleteDeptResponse;
import com.java.xml.school.dept.StudentDetailsRequest;
import com.java.xml.school.dept.StudentDetailsResponse;
import com.java.xml.school.dept.UpdateDeptRequest;
import com.java.xml.school.dept.UpdateDeptResponse;




@Endpoint
public class DepartmentServiceEndpoint {
	
	private static final String NAMESPACE="http://www.java.com/xml/school/dept";
	
	@Autowired
	private DepartmentService severice;
	
	@PayloadRoot(namespace = NAMESPACE,localPart = "StudentDetailsRequest")
	@ResponsePayload
	public StudentDetailsResponse getDepartDetilsById(@RequestPayload StudentDetailsRequest request) {
		return severice.getDepartDetils(request);
		
	}
	@PayloadRoot(namespace = NAMESPACE,localPart = "CreateDeptRequest")
	@ResponsePayload
	public CreateDeptResponse createDepartDetils(@RequestPayload CreateDeptRequest request) {
		return severice.createDepartDetils(request);
		
	}
	@PayloadRoot(namespace = NAMESPACE,localPart = "UpdateDeptRequest")
	@ResponsePayload
	public UpdateDeptResponse updateDepartDetils(@RequestPayload UpdateDeptRequest request) {
		return severice.updateDepartDetils(request);
		
	}
	@PayloadRoot(namespace = NAMESPACE,localPart = "DeleteDeptRequest")
	@ResponsePayload
	public DeleteDeptResponse deleteDepartDetils(@RequestPayload DeleteDeptRequest request) {
		return severice.deleteDepartDetils(request);
		
	}

}
