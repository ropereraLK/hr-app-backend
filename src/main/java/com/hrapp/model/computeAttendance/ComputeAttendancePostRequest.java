package com.hrapp.model.computeAttendance;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ComputeAttendancePostRequest {
	
	private String username;
	private String workType;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date date;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getWorkType() {
		return workType;
	}
	public void setWorkType(String workType) {
		this.workType = workType;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
	
	

}
