package com.hrapp.model;

import java.util.Date;

public class FingerPrintVerification {
	 
	private String username;
	
	private Date date;
	
	private Date time;
	
	private String fingerPrintStation;

	public FingerPrintVerification(String username, Date date, Date time, String fingerPrintStation) {
		this.username = username;
		this.date = date;
		this.time = time;
		this.fingerPrintStation = fingerPrintStation;
	}

	public FingerPrintVerification() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getFingerPrintStation() {
		return fingerPrintStation;
	}

	public void setFingerPrintStation(String fingerPrintStation) {
		this.fingerPrintStation = fingerPrintStation;
	}
	
	
	
}
