package com.hrapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
 import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hrapp.model.Employee;
import com.hrapp.service.EmployeeService;

@CrossOrigin()
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	
	/* ***** GET LIST
	 * RETURNING THE EMPLOYEES LIST
	 */
	//@GetMapping(produces="application/json")
	@RequestMapping("/employees")
	public List<Employee> getEmployee() {
		return service.getEmployee();
		
	}
	
	/* ***** GET 
	 * RETURNING THE EMPLOYEES LIST
	 */
	
	@RequestMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return service.getEmployee(id);
		
	}
	
	/* ***** POST 
	 * ADDING NEW EMPLOYEE 
	 */
	
	
	@RequestMapping(method=RequestMethod.POST,value="/employee")
	public void postEmployee(@RequestBody Employee emp) {
		  service.postEmpoyee(emp);
	}

}
