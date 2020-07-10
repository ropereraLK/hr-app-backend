package com.hrapp.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hrapp.model.Attendance;
import com.hrapp.model.EmployeeDailyAttendance;
import com.hrapp.model.computeAttendance.ComputeAttendancePostRequest;
import com.hrapp.service.AttendanceService;
import com.hrapp.service.ComputeWorkTimeService;

@CrossOrigin()
@RestController
public class ComputeWorkTimeController {

	@Autowired
	private ComputeWorkTimeService service;
 /*
	@RequestMapping(method=RequestMethod.POST,value="/attendance13") 
	public String postAttendance(@RequestBody Attendance att) {
		  return service.computeWorkTimeForAttendance(att);
	}
	*/
	
 	@RequestMapping(method=RequestMethod.GET,value="/attendance133/{username}/{startDate}/{endDate}")  
	public List<Attendance> getAttendance(@PathVariable(value="username") String username, 
							@PathVariable(value="startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate , 
							@PathVariable(value="endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate ){
		return  service.getAttendanceWithUsernameAndDateRange(username,startDate, endDate);
	}
 	
 	@RequestMapping(method=RequestMethod.GET,value="/attendanceDayShift/{username}/{workType}/{date}")  
	public List<Attendance> attendanceDayShiftWithOT(
							@PathVariable(value="username") String username,
							@PathVariable(value="workType") String workType, 
							@PathVariable(value="date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date ){
		return  service.getAttendanceWithUsernameAndDateRange(username,workType, date);
	}
 	
 	@RequestMapping(method=RequestMethod.POST,value="/attendanceDayShift")  
	public EmployeeDailyAttendance  attendanceDayShiftWithOT(@RequestBody ComputeAttendancePostRequest c) throws ParseException{
		return  service.getAttendanceWithUsernameAndDateRange(c);
	}
 	
 	
 	@RequestMapping(method=RequestMethod.GET,value="/attendanceDayShift1/{username}/{startDate}/{endDate}/{endDate}/{endDate}/{endDate}/{endDate}/{endDate}")  
	public List<Attendance> attendanceDayShift(@PathVariable(value="username") String username, 
							@PathVariable(value="startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate , 
							@PathVariable(value="endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate ){
		return  service.getAttendanceWithUsernameAndDateRange(username,startDate, endDate);
	}
	
}
