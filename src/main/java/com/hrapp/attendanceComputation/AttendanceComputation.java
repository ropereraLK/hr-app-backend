package com.hrapp.attendanceComputation;

import java.util.Date;

import com.hrapp.model.EmployeeDailyAttendance;

public class AttendanceComputation {
	 
	DelayedWorkTimeIn delayedWorkTimeIn =new DelayedWorkTimeIn();
	 
	DelayedWorkTimeOut delayedWorkTimeOut = new DelayedWorkTimeOut();
 
	ExtraWorkAfterWorkComputation extraWorkAfterWorkComputation = new ExtraWorkAfterWorkComputation();
 
	ExtraWorkBeforeWorkComputation extraWorkBeforeWorkComputation= new ExtraWorkBeforeWorkComputation();
 
	WorkTimeComputation workTimeComputation = new WorkTimeComputation();
	
	ScheduledOverTime scheduledOverTime = new ScheduledOverTime();
	
 
	EmployeeDailyAttendance eda = new EmployeeDailyAttendance();
	
	 
	  public AttendanceComputation (
	  
			
			 Date dateEmployeeTimeIn,
			 Date dateEmployeeTimeOut,
			 Date dateEmployeeRegularWorkTimeStart,
			 Date dateEmployeeRegularWorkTimeEnd,
			 Date dateEmployeeOverWorkTimeStart,
			 Date dateEmployeeOverWorkTimeEnd
		 
			
			) {
		  this.dateEmployeeTimeIn=dateEmployeeTimeIn;
		  this.dateEmployeeTimeOut=dateEmployeeTimeOut;
		  this.dateEmployeeRegularWorkTimeStart=dateEmployeeRegularWorkTimeStart;
		  this.dateEmployeeRegularWorkTimeEnd=dateEmployeeRegularWorkTimeEnd;
		  this.dateEmployeeOverWorkTimeStart=dateEmployeeOverWorkTimeStart;
		  this.dateEmployeeOverWorkTimeEnd=dateEmployeeOverWorkTimeEnd;
		  
	  }
	  
	  private Date dateEmployeeTimeIn;
	  private Date dateEmployeeTimeOut;
	  private Date dateEmployeeRegularWorkTimeStart;
	  private Date dateEmployeeRegularWorkTimeEnd;
	  private Date dateEmployeeOverWorkTimeStart;
	  private Date dateEmployeeOverWorkTimeEnd;
			
			 
	public AttendanceComputation () {}
	
	public EmployeeDailyAttendance getAttendance() {
		
		eda.setFloatExtraWorkTimeBeforeWork(
			
				
				(extraWorkBeforeWorkComputation.computeExtraWorkBeforeWork(
						dateEmployeeTimeIn, 
						dateEmployeeRegularWorkTimeStart,dateEmployeeTimeOut
						)
				)-(scheduledOverTime.computeOverTimeBeforeWork(
						dateEmployeeTimeIn, 
						dateEmployeeTimeOut, 
						dateEmployeeRegularWorkTimeStart, 
						dateEmployeeOverWorkTimeStart, 
						dateEmployeeOverWorkTimeEnd
						)));
		//eda.setFloatExtraWorkTimeBeforeWork(5-3);
		
		eda.setFloatExtraWorkTimeAfterWork(
				extraWorkAfterWorkComputation.computeExtraWorkAftereWork(dateEmployeeTimeOut, dateEmployeeRegularWorkTimeEnd,dateEmployeeTimeIn)-(scheduledOverTime.computeOverTimeAfterWork(dateEmployeeTimeIn, dateEmployeeTimeOut, dateEmployeeRegularWorkTimeEnd, dateEmployeeOverWorkTimeStart, dateEmployeeOverWorkTimeEnd)));
				 
		eda.setFloatWorkTime(
				workTimeComputation.computeWorkTime(
						dateEmployeeTimeIn, 
						dateEmployeeTimeOut, 
						dateEmployeeRegularWorkTimeStart, 
						dateEmployeeRegularWorkTimeEnd
						)
				);
		
		eda.setFloatDelayedTimeAfterWorkStart(
				delayedWorkTimeOut.computeExtraWorkBeforeWork(
						dateEmployeeTimeOut, 
						dateEmployeeRegularWorkTimeEnd,
						dateEmployeeRegularWorkTimeStart
						)
				);
		
		eda.setFloatDelayedTimeBeforeWorkStart(
				delayedWorkTimeIn.computeExtraWorkBeforeWork(
						dateEmployeeTimeIn, 
						dateEmployeeRegularWorkTimeStart,
						dateEmployeeRegularWorkTimeEnd)
				);
		
		eda.setFloatWorkedOverTimeMinutesBeforeWork(
				scheduledOverTime.computeOverTimeBeforeWork(
						dateEmployeeTimeIn, 
						dateEmployeeTimeOut, 
						dateEmployeeRegularWorkTimeStart, 
						dateEmployeeOverWorkTimeStart, 
						dateEmployeeOverWorkTimeEnd
						)
				);
		
		 eda.setFloatWorkedOverTimeMinutesAfterWork(
				 scheduledOverTime.computeOverTimeAfterWork(
						 dateEmployeeTimeIn, 
						 dateEmployeeTimeOut, 
						 dateEmployeeRegularWorkTimeEnd, 
						 dateEmployeeOverWorkTimeStart,
						 dateEmployeeOverWorkTimeEnd)
				 
				 );
		

		
		eda.setDateEmployeeTimeIn(dateEmployeeTimeIn);
		eda.setDateEmployeeTimeOut(dateEmployeeTimeOut);
		eda.setDateEmployeeOverWorkTimeStart(dateEmployeeOverWorkTimeStart);
		eda.setDateEmployeeOverWorkTimeEnd(dateEmployeeOverWorkTimeEnd);
		eda.setDateEmployeeRegularWorkTimeStart(dateEmployeeRegularWorkTimeStart);
		eda.setDateEmployeeRegularWorkTimeEnd(dateEmployeeRegularWorkTimeEnd);
		
		return eda;
	}
		
 
	
	
}
