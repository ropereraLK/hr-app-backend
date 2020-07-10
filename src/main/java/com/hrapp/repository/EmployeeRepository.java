package com.hrapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.hrapp.model.Employee;

public interface EmployeeRepository extends CrudRepository <Employee, Integer>{

}
