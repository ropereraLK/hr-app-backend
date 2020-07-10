package com.hrapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ScheduledWork")
public class ScheduledWork {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int intId;
	@Column
	private String stringEmployeeUsername;
	
	@Column private Date dateDate;
	@Column private Date dateEmployeeTimeInScheduled;
	@Column private Date dateEmployeeTimeOutScheduled;
	@Column private Date dateEmployeeRegularWorkTimeStartScheduled;
	@Column private Date dateEmployeeRegularWorkTimeEndScheduled;
	
	public ScheduledWork(int intId, String stringEmployeeUsername, Date dateDate, Date dateEmployeeTimeInScheduled,
			Date dateEmployeeTimeOutScheduled, Date dateEmployeeRegularWorkTimeStartScheduled,
			Date dateEmployeeRegularWorkTimeEndScheduled) {
		this.intId = intId;
		this.stringEmployeeUsername = stringEmployeeUsername;
		this.dateDate = dateDate;
		this.dateEmployeeTimeInScheduled = dateEmployeeTimeInScheduled;
		this.dateEmployeeTimeOutScheduled = dateEmployeeTimeOutScheduled;
		this.dateEmployeeRegularWorkTimeStartScheduled = dateEmployeeRegularWorkTimeStartScheduled;
		this.dateEmployeeRegularWorkTimeEndScheduled = dateEmployeeRegularWorkTimeEndScheduled;
	}

	public ScheduledWork() {
	}

	public int getIntId() {
		return intId;
	}

	public void setIntId(int intId) {
		this.intId = intId;
	}

	public String getStringEmployeeUsername() {
		return stringEmployeeUsername;
	}

	public void setStringEmployeeUsername(String stringEmployeeUsername) {
		this.stringEmployeeUsername = stringEmployeeUsername;
	}

	public Date getDateDate() {
		return dateDate;
	}

	public void setDateDate(Date dateDate) {
		this.dateDate = dateDate;
	}

	public Date getDateEmployeeTimeInScheduled() {
		return dateEmployeeTimeInScheduled;
	}

	public void setDateEmployeeTimeInScheduled(Date dateEmployeeTimeInScheduled) {
		this.dateEmployeeTimeInScheduled = dateEmployeeTimeInScheduled;
	}

	public Date getDateEmployeeTimeOutScheduled() {
		return dateEmployeeTimeOutScheduled;
	}

	public void setDateEmployeeTimeOutScheduled(Date dateEmployeeTimeOutScheduled) {
		this.dateEmployeeTimeOutScheduled = dateEmployeeTimeOutScheduled;
	}

	public Date getDateEmployeeRegularWorkTimeStartScheduled() {
		return dateEmployeeRegularWorkTimeStartScheduled;
	}

	public void setDateEmployeeRegularWorkTimeStartScheduled(Date dateEmployeeRegularWorkTimeStartScheduled) {
		this.dateEmployeeRegularWorkTimeStartScheduled = dateEmployeeRegularWorkTimeStartScheduled;
	}

	public Date getDateEmployeeRegularWorkTimeEndScheduled() {
		return dateEmployeeRegularWorkTimeEndScheduled;
	}

	public void setDateEmployeeRegularWorkTimeEndScheduled(Date dateEmployeeRegularWorkTimeEndScheduled) {
		this.dateEmployeeRegularWorkTimeEndScheduled = dateEmployeeRegularWorkTimeEndScheduled;
	}
	
	
	

}
