package com.cardona.restapidemo.service;

import java.util.List;

import com.cardona.restapidemo.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(Integer id);
}
