package com.cardona.restapidemo.service.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cardona.restapidemo.exception.ResourceNotFoundException;
import com.cardona.restapidemo.model.Employee;
import com.cardona.restapidemo.repository.EmployeeRepository;
import com.cardona.restapidemo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}else {
			throw new ResourceNotFoundException("Employee","id",id);
		}
	}

	

}
