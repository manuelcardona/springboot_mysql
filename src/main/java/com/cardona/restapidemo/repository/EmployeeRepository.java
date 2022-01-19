package com.cardona.restapidemo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cardona.restapidemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
