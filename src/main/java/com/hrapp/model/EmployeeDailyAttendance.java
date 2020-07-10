package com.hrapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeDailyAttendance")
public class EmployeeDailyAttendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column private int intId;
	@Column private String stringEmployeeUsername;
	
	@Column private Date dateDate;
	@Column private Date dateEmployeeTimeIn;
	@Column private Date dateEmployeeTimeOut;
	@Column private Date dateEmployeeRegularWorkTimeStart;
	@Column private Date dateEmployeeRegularWorkTimeEnd;
	
	@Column private float floatExtraWorkTimeBeforeWork;
	@Column private float floatExtraWorkTimeAfterWork;
	@Column private float floatWorkTime;
	@Column private float floatDelayedTimeBeforeWorkStart;
	@Column private float floatDelayedTimeAfterWorkStart;
	
	@Column private Date dateEmployeeOverWorkTimeStart;
	@Column private Date dateEmployeeOverWorkTimeEnd;
	
	@Column private float floatScheduledOverTimeMinutes;
	@Column private String stringOverTimeType;
	@Column private float floatWorkedOverTimeMinutesBeforeWork;
	@Column private float floatWorkedOverTimeMinutesAfterWork;

	
	public EmployeeDailyAttendance (){
		
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

	public Date getDateEmployeeTimeIn() {
		return dateEmployeeTimeIn;
	}

	public void setDateEmployeeTimeIn(Date dateEmployeeTimeIn) {
		this.dateEmployeeTimeIn = dateEmployeeTimeIn;
	}

	public Date getDateEmployeeTimeOut() {
		return dateEmployeeTimeOut;
	}

	public void setDateEmployeeTimeOut(Date dateEmployeeTimeOut) {
		this.dateEmployeeTimeOut = dateEmployeeTimeOut;
	}

	public Date getDateEmployeeRegularWorkTimeStart() {
		return dateEmployeeRegularWorkTimeStart;
	}

	public void setDateEmployeeRegularWorkTimeStart(Date dateEmployeeRegularWorkTimeStart) {
		this.dateEmployeeRegularWorkTimeStart = dateEmployeeRegularWorkTimeStart;
	}

	public Date getDateEmployeeRegularWorkTimeEnd() {
		return dateEmployeeRegularWorkTimeEnd;
	}

	public void setDateEmployeeRegularWorkTimeEnd(Date dateEmployeeRegularWorkTimeEnd) {
		this.dateEmployeeRegularWorkTimeEnd = dateEmployeeRegularWorkTimeEnd;
	}

	public float getFloatExtraWorkTimeBeforeWork() {
		return floatExtraWorkTimeBeforeWork;
	}

	public void setFloatExtraWorkTimeBeforeWork(float floatExtraWorkTimeBeforeWork) {
		this.floatExtraWorkTimeBeforeWork = floatExtraWorkTimeBeforeWork;
	}

	public float getFloatExtraWorkTimeAfterWork() {
		return floatExtraWorkTimeAfterWork;
	}

	public void setFloatExtraWorkTimeAfterWork(float floatExtraWorkTimeAfterWork) {
		this.floatExtraWorkTimeAfterWork = floatExtraWorkTimeAfterWork;
	}

	public float getFloatWorkTime() {
		return floatWorkTime;
	}

	public void setFloatWorkTime(float floatWorkTime) {
		this.floatWorkTime = floatWorkTime;
	}

	public float getFloatDelayedTimeBeforeWorkStart() {
		return floatDelayedTimeBeforeWorkStart;
	}

	public void setFloatDelayedTimeBeforeWorkStart(float floatDelayedTimeBeforeWorkStart) {
		this.floatDelayedTimeBeforeWorkStart = floatDelayedTimeBeforeWorkStart;
	}

	public float getFloatDelayedTimeAfterWorkStart() {
		return floatDelayedTimeAfterWorkStart;
	}

	public void setFloatDelayedTimeAfterWorkStart(float floatDelayedTimeAfterWorkStart) {
		this.floatDelayedTimeAfterWorkStart = floatDelayedTimeAfterWorkStart;
	}

	public Date getDateEmployeeOverWorkTimeStart() {
		return dateEmployeeOverWorkTimeStart;
	}

	public void setDateEmployeeOverWorkTimeStart(Date dateEmployeeOverWorkTimeStart) {
		this.dateEmployeeOverWorkTimeStart = dateEmployeeOverWorkTimeStart;
	}

	public Date getDateEmployeeOverWorkTimeEnd() {
		return dateEmployeeOverWorkTimeEnd;
	}

	public void setDateEmployeeOverWorkTimeEnd(Date dateEmployeeOverWorkTimeEnd) {
		this.dateEmployeeOverWorkTimeEnd = dateEmployeeOverWorkTimeEnd;
	}

	public float getFloatScheduledOverTimeMinutes() {
		return floatScheduledOverTimeMinutes;
	}

	public void setFloatScheduledOverTimeMinutes(float floatScheduledOverTimeMinutes) {
		this.floatScheduledOverTimeMinutes = floatScheduledOverTimeMinutes;
	}

	public String getStringOverTimeType() {
		return stringOverTimeType;
	}

	public void setStringOverTimeType(String stringOverTimeType) {
		this.stringOverTimeType = stringOverTimeType;
	}

	public float getFloatWorkedOverTimeMinutesBeforeWork() {
		return floatWorkedOverTimeMinutesBeforeWork;
	}

	public void setFloatWorkedOverTimeMinutesBeforeWork(float floatWorkedOverTimeMinutesBeforeWork) {
		this.floatWorkedOverTimeMinutesBeforeWork = floatWorkedOverTimeMinutesBeforeWork;
	}

	public float getFloatWorkedOverTimeMinutesAfterWork() {
		return floatWorkedOverTimeMinutesAfterWork;
	}

	public void setFloatWorkedOverTimeMinutesAfterWork(float floatWorkedOverTimeMinutesAfterWork) {
		this.floatWorkedOverTimeMinutesAfterWork = floatWorkedOverTimeMinutesAfterWork;
	}

	 
	
	
	
}
