package com.crud.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.employee.entity.Employee;
import com.crud.employee.enums.ConstantValues;
import com.crud.employee.repo.EmployeeRepo;


@Service
public class EmployeeService {

	
	@Autowired 
	EmployeeRepo repo;
	public Employee saveEmployee(Employee employee) {
		
		return repo.save(employee);
	}
	public Employee updateEmployee(Employee employee) {
	
		return repo.save(employee);
	}
	
	public Employee patchEmployee(Employee employee) {
		Employee dbEmp = null;
	Optional<Employee> emp=	repo.findById(employee.getEmployeeId());
	if(emp.isPresent()) {
		 dbEmp=emp.get();
		if(employee.getEmployeeName()!=null) {
			dbEmp.setEmployeeName(employee.getEmployeeName());
		}
		if(employee.getEmployeeSalary()!=null) {
			dbEmp.setEmployeeSalary(employee.getEmployeeSalary());
		}
		repo.save(dbEmp);
	}
		return dbEmp;
	}
	
	public List<Employee> findAll() {
		return repo.findAll();
	}
	
	public Employee findById(String employeeId) {
		return repo.findById(employeeId).isPresent() ? repo.findById(employeeId).get() : null;
	}
	public void deleteEmployee(String employeeId) {
		Optional<Employee> employeeDetails=repo.findById(employeeId);
		String employeeStatus=employeeDetails.get().getEmployeeStatus();
		String enumConstant=ConstantValues.RESIGN.getValue();
		System.out.println(enumConstant);
		if( employeeStatus.equals(enumConstant)) {
			repo.deleteById(employeeId);
		}
	}

}
