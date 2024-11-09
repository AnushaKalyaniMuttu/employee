package com.crud.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	private String employeeId;
	private String employeeName;
	private Float employeeSalary;
	private String employeeStatus;
	
	
	public Employee(String employeeId, String employeeName, Float employeeSalary, String employeeStatus) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeStatus = employeeStatus;
	}
	
	
	public String getEmployeeStatus() {
		return employeeStatus;
	}
	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	

	public Employee() {
		super();
	}
	
	
	
	
	
}
