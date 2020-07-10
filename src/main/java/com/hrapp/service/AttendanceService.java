package com.hrapp.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

//import java.util.List;
//import java.util.Set;
//import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hrapp.model.Attendance;
import com.hrapp.model.AttendanceCustom;
//import com.hrapp.repository.AttendanceCustomRepository;
//import com.hrapp.model.FingerPrintVerification;
import com.hrapp.repository.AttendanceRepository;

@Service
public class AttendanceService {

	@Autowired
	private AttendanceRepository repo;
	
 
	public void postAttendance(Attendance att) {
	
		  repo.save(att);
	}

	/*public List<Attendance> getAttendance() {

 		List<Attendance> x =  repo.findAll( );
		return  x;
		
			 
	}*/
 
	public List<Attendance> getAttendanceWithUsername(String username) {
		List<Attendance> x = repo.findAttendanceByUsername(username);
		return x;
	}

	public List<Attendance> getAttendanceWithUsernameAndDateRange(String username, Date startDate, Date endDate) {
		List<Attendance> x = repo.getAttendanceWithUsernameAndDateRange(username, startDate, endDate);
		return x;
	}

	public List<AttendanceCustom> getAttendanceWithUsernameAndDateRangeWithoutTerminal(String username, Date startDate, Date endDate) {
		List<AttendanceCustom> x = repo.getAttendanceWithUsernameAndDateRangeWithoutTerminal(username,startDate, endDate);
		return x;
	}
	 
}
		
		
		
		
		