package com.hrapp.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hrapp.attendanceComputation.AttendanceComputation;
import com.hrapp.model.Attendance;
import com.hrapp.model.EmployeeDailyAttendance;
import com.hrapp.model.ScheduledWork;
import com.hrapp.model.computeAttendance.ComputeAttendancePostRequest;
import com.hrapp.repository.AttendanceRepository;
import com.hrapp.repository.EmployeeDailyAttendanceRepository;
import com.hrapp.repository.ScheduledWorkRepository;


@Service
public class ComputeWorkTimeService {
	@Autowired
	private AttendanceRepository repo;
	
 
	@Autowired private ScheduledWorkRepository scheduledWorkRepository;
	 
	@Autowired private EmployeeDailyAttendanceRepository employeeDailyAttendanceRepository;
 
	SimpleDateFormat dateFormatLong = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	
	public String computeWorkTimeForAttendance(Attendance att) {
		// TODO Auto-generated method stub
		return "Hi";
		
	}

	public String computeWorkTimeForAttendance(String att) {
		// TODO Auto-generated method stub
		return "Hi";
	}

	public Attendance computeWorkTimeForAttendance(String username, Date startDate, Date endDate) {
		List<Attendance> x = repo.getAttendanceWithUsernameAndDateRange(username, startDate, endDate);
		// TODO Auto-generated method stub
	 
	 
		return null;
	}

	public ArrayList<Attendance> getAttendanceWithUsernameAndDateRange(String username, Date startDate, Date endDate) {
		ArrayList<Attendance> x = (ArrayList<Attendance>) repo.getAttendanceWithUsernameAndDateRange(username, startDate, endDate);
		return x;
		 
	}
	
	//This method adds data to the db

	public List<Attendance> getAttendanceWithUsernameAndDateRange(String username,String workType, Date date) {
		
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeeDailyAttendance getAttendanceWithUsernameAndDateRange  (ComputeAttendancePostRequest c) throws ParseException {
 		
 		
		
		String username = c.getUsername();
 		 
		
		String stringStartDate = dateFormatLong.format(c.getDate());
		Date dateStartDate = dateFormatLong.parse(stringStartDate);
		dateStartDate.setHours(0);
		dateStartDate.setMinutes(0);
		dateStartDate.setSeconds(0);
		
		String stringEndDate = dateFormatLong.format(c.getDate());
		Date dateEndDate = dateFormatLong.parse(stringStartDate);
		dateEndDate.setHours(23);
		dateEndDate.setMinutes(59);
		dateEndDate.setSeconds(59);
		
 
		System.out.println("Start Date "+ dateStartDate);
		System.out.println("End Date "+dateEndDate);
		 

		ArrayList<Attendance> x =  (ArrayList<Attendance>) repo.getAttendanceWithUsernameAndDateRange(username, dateStartDate,dateEndDate);
		Date EmployeeTimeIn = null;
		Date EmployeeTimeOut= null;
		
		
		if(x.size()>=2) {
			
			for(int i = 0; i<x.size();i++) {
				if (i==0) {
					EmployeeTimeIn = x.get(0).getTime();
					EmployeeTimeOut = x.get(0).getTime();
					
				}else {
					if(EmployeeTimeIn.after(x.get(i).getTime())) {
						EmployeeTimeIn = x.get(i).getTime();
					}
					
					if(EmployeeTimeOut.before(x.get(i).getTime())) {
						EmployeeTimeOut = x.get(i).getTime();
					}
				} 
		}
			}
		System.out.println("Start EmployeeTimeIn "+ EmployeeTimeIn);
		System.out.println("End EmployeeTimeOut "+ EmployeeTimeOut);
		
		ScheduledWork scheduledWork = getWorkScheduleWithUsernameAndDateRange(username, dateStartDate, dateEndDate);
		
		
		if(scheduledWork.getDateEmployeeRegularWorkTimeEndScheduled()!= null && scheduledWork.getDateEmployeeRegularWorkTimeStartScheduled()!=null) {
 
			AttendanceComputation ac = new AttendanceComputation(EmployeeTimeIn,EmployeeTimeOut,scheduledWork.getDateEmployeeRegularWorkTimeStartScheduled(),
					scheduledWork.getDateEmployeeRegularWorkTimeEndScheduled(),scheduledWork.getDateEmployeeTimeInScheduled(),scheduledWork.getDateEmployeeTimeOutScheduled() );
			
			EmployeeDailyAttendance  employeeDailyAttendance = ac.getAttendance();
			employeeDailyAttendance.setStringEmployeeUsername(username);
			employeeDailyAttendance.setDateDate(scheduledWork.getDateEmployeeRegularWorkTimeStartScheduled());

			employeeDailyAttendanceRepository.save(employeeDailyAttendance);
			

			return employeeDailyAttendance;

		}else {
			return null;

		}
 
	}
 	
 	public ScheduledWork  getWorkScheduleWithUsernameAndDateRange(String username, Date startDate, Date endDate) {
		//return null;
 		 return scheduledWorkRepository.getWorkScheduleWithUsernameAndDateRange(username, startDate, endDate);
		
 	}
	
 	 
	

}
