package com.hrapp.repository;

import java.util.Date;
 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

 import com.hrapp.model.ScheduledWork;

public interface ScheduledWorkRepository extends JpaRepository<ScheduledWork, Integer> {
	
	 @Query("Select sw FROM ScheduledWork sw where sw.stringEmployeeUsername = :stringEmployeeUsername and sw.dateDate > :startDate and sw.dateDate < :endDate") 
	 ScheduledWork getWorkScheduleWithUsernameAndDateRange(@Param("stringEmployeeUsername") String stringEmployeeUsername, @Param("startDate") Date startDate, @Param("endDate") Date endDate);


}
