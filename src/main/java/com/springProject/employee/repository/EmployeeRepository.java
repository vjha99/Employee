package com.springProject.employee.repository;

import com.springProject.employee.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {


}
