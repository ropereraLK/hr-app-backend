package com.hrapp.repository;

 
//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.hrapp.model.AttendanceCustom;
import com.hrapp.model.Attendance;


public interface AttendanceRepository extends CrudRepository <Attendance, Integer> {

 
	/*
	 * THE BELOW METHOD FINDS ALL THE MATCHING RECORDS WITH 
	 * THE USERNAME
	 * METHOD WORKING FINE
	 */
	@Query("Select att FROM Attendance att where att.username = :username") 
    List<Attendance> findAttendanceByUsername(@Param("username") String username);
	
	
	
	
	/*
	 * THE BELOW METHOD FINDS ALL THE MATCHING RECORDS WITH 
	 * THE USERNAME
	 * METHOD WORKING FINE
	 */
	List<Attendance> findByUsername(String username);



	@Query("Select att FROM Attendance att where att.username = :username and att.date > :startDate and att.date < :endDate") 
	List<Attendance> getAttendanceWithUsernameAndDateRange(@Param("username") String username, @Param("startDate") Date startDate, @Param("endDate") Date endDate);

	@Query(value ="Select att.username, att.date, att.time FROM Attendance att where att.username = :username and att.date > :startDate and att.date < :endDate", nativeQuery = true) 
	List<AttendanceCustom> getAttendanceWithUsernameAndDateRangeWithoutTerminal(@Param("username") String username, @Param("startDate") Date startDate, @Param("endDate") Date endDate);




 



 



 	 
 
	  
}
