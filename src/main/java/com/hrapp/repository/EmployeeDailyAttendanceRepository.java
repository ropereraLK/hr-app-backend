package com.hrapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hrapp.model.EmployeeDailyAttendance;

public interface EmployeeDailyAttendanceRepository extends JpaRepository <EmployeeDailyAttendance, Integer> {

}
