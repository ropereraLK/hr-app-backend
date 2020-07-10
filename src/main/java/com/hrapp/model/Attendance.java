package com.hrapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="Attendance")
public class Attendance {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 
	private String username;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	
	private Date time;
	
	
	
	private String recordEntry;
	//recordEntry can be M1, M2 or hrmanager@abc.com ; any user used to enter the record
	 
 
	public Attendance() {
	}
	
 
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
 
 
	public Date getTime() {
		return time;
	}
 
	public void setTime(Date time) {
		this.time = time;
	}
 
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getRecordEntry() {
		return recordEntry;
	}


	public void setRecordEntry(String recordEntry) {
		this.recordEntry = recordEntry;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
 

}
