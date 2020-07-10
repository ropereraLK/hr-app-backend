package com.hrapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrapp.model.Employee;
import com.hrapp.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	 private EmployeeRepository repo;
	
	public List<Employee> getEmployee(){
		List<Employee> list = new ArrayList<>();
		for(Employee emp : repo.findAll()) {
			list.add(emp);
		}
		return list;
		
	}

	public Employee getEmployee(int id) {
	
		return repo.findById(id).get();
	}

 

	public void postEmpoyee(Employee emp) {
		 
		repo.save(emp);
		
	}
	

}
