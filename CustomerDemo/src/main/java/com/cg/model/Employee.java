package com.cg.model;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
public class Employee {
	private int employeeId;
	private String employeeName;
	
	//@Autowired
	@Resource(name="pancard")
	private PanCard pancard;

	public PanCard getPancard() {
		return pancard;
	}
	public void setPancard(PanCard pancard) {
		this.pancard = pancard;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
