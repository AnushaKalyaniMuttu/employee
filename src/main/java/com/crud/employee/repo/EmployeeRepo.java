package com.crud.employee.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.employee.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,String>{

	
	Optional<Employee> findById(String employeeId);
}
