package com.crud.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.employee.entity.Employee;
import com.crud.employee.enums.ConstantValues;
import com.crud.employee.service.EmployeeService;

@RestController
public class Controller {

	
	
	@Autowired
	EmployeeService service;
	//localhost:8080/
	//post, put, patch, delete, get
	
	@GetMapping("/")
	public String sayHello() {
		return "Hiiiiii Ajay";
	}
	
	
	@PostMapping("/post")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
		}
	
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
	
	
	@PatchMapping("/patch")
	public Employee patchEmployee(@RequestBody Employee employee) {
		return service.patchEmployee(employee);
	}
	
	
	@GetMapping("/findAll")
	public List<Employee> getAllEmployee(){
		return service.findAll();
	}
	
	@GetMapping("/get/{employeeId}")
	public Employee get(@PathVariable String employeeId) {
		return service.findById(employeeId);
	}
	
	
	@DeleteMapping("/delete/{employeeId}")
	public void delete(@PathVariable String employeeId) {
			try {
				 service.deleteEmployee(employeeId);

				}catch(Exception e) {
					System.out.print(e);
				}
			}
	
}
