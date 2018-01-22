package com.poc.empservice.model;

public class Employee {
	private String empId;
	private String name;
	private String designation;

	
	public Employee(String empId, String name, String designation) {
		this.empId=empId;
		this.name=name;
		this.designation=designation;
		
	}
	
	public Employee() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

}
