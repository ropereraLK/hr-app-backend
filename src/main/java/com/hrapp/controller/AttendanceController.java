package com.hrapp.controller;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.hrapp.model.Attendance;
import com.hrapp.model.AttendanceCustom;
import com.hrapp.service.AttendanceService;

@CrossOrigin()
@Controller
public class AttendanceController {
	
	@Autowired
	private AttendanceService service;
	
	@RequestMapping(method=RequestMethod.GET,value="/atd")  
 	public  String index1(){
 		return "index1";
	}
 
	
 
	@RequestMapping(method=RequestMethod.POST,value="/attendance") 
	public void postAttendance(@RequestBody Attendance att) {
		  service.postAttendance(att);
	}

 	@RequestMapping(method=RequestMethod.GET,value="/attendance/{username}")  
	//public List<Attendance> getAttendance(@PathVariable(value="username") String username ){
		//return  service.getAttendanceWithUsername(username);
 	public  String getAttendance(@PathVariable(value="username") String username ){
 		return "index";
	}
 	
 	@RequestMapping(method=RequestMethod.GET,value="/attendance/{username}/{startDate}/{endDate}")  
	public List<Attendance> getAttendance(@PathVariable(value="username") String username, 
							@PathVariable(value="startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate , 
							@PathVariable(value="endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate ){
		return  service.getAttendanceWithUsernameAndDateRange(username,startDate, endDate);
	}
	
 	@RequestMapping(method=RequestMethod.GET,value="/jamf/{username}/{startDate}/{endDate}")  
	public List<AttendanceCustom> getAttendanceWithoutTerminal(@PathVariable(value="username") String username, 
							@PathVariable(value="startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate , 
							@PathVariable(value="endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate ){
		return  service.getAttendanceWithUsernameAndDateRangeWithoutTerminal(username,startDate, endDate);
	}
 	/*
 	/////////////////////////////////////////////////////////////////////
 	@RequestMapping(method=RequestMethod.GET,value="/attendannce/{username}/{startDate}/{endDate}")  
	public List<Attendance> getAttenddance(@PathVariable(value="username") String username, 
							@PathVariable(value="startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate , 
							@PathVariable(value="endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate ){
		return  service.getAttendanceWithUsernameAndDateRange(username,startDate, endDate);
	}
 	
 	@RequestMapping(method=RequestMethod.POST,value="/attendance") 
	public void postAttsendance(@RequestBody Attendance att) {
		  service.postAttendance(att);
	}
	 */
}
