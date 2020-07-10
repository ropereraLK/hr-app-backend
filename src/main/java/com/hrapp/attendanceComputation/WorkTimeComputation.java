package com.hrapp.attendanceComputation;

import java.util.Date;

public class WorkTimeComputation {

	public float computeWorkTime(
			 Date dateEmployeeTimeIn,
			 Date dateEmployeeTimeOut,
			 Date dateEmployeeRegularWorkTimeStart,
			 Date dateEmployeeRegularWorkTimeEnd
			) {
		
		if(dateEmployeeTimeIn.compareTo(dateEmployeeRegularWorkTimeStart) <= 0 
				&& 
				dateEmployeeTimeOut.compareTo(dateEmployeeRegularWorkTimeEnd) >=0
				&&
				dateEmployeeTimeOut.compareTo(dateEmployeeRegularWorkTimeStart) > 0
				)
		{	
			//If the employee enters EARLY compared to Work start time
			//And leaves AFTER the work end time
			return (((dateEmployeeRegularWorkTimeEnd.getTime()-dateEmployeeRegularWorkTimeStart.getTime()+59999)/60000));

			
			
		}
		else if(dateEmployeeTimeIn.compareTo(dateEmployeeRegularWorkTimeStart) <= 0 
				&& 
				dateEmployeeTimeOut.compareTo(dateEmployeeRegularWorkTimeEnd) <0
				&&
				dateEmployeeTimeOut.compareTo(dateEmployeeRegularWorkTimeStart) > 0
				) {
			//If the employee enters EARLY compared to Work start time
			//And leaves BEFORE the work end time
			return (((dateEmployeeTimeOut.getTime()-dateEmployeeRegularWorkTimeStart.getTime()+59999)/60000));

			
			
		}
		else if(dateEmployeeTimeIn.compareTo(dateEmployeeRegularWorkTimeStart) > 0 
				&& 
				dateEmployeeTimeOut.compareTo(dateEmployeeRegularWorkTimeEnd) >=0
				&&
				dateEmployeeTimeOut.compareTo(dateEmployeeRegularWorkTimeStart) > 0
				) {
			//If the employee enters AFTER compared to Work start time
			//And leaves AFTER the work end time
			return (((dateEmployeeRegularWorkTimeEnd.getTime()-dateEmployeeTimeIn.getTime()+59999)/60000));

			
			
		}else if(dateEmployeeTimeIn.compareTo(dateEmployeeRegularWorkTimeStart) > 0 
				&& 
				dateEmployeeTimeOut.compareTo(dateEmployeeRegularWorkTimeEnd) <0
				&&
				dateEmployeeTimeOut.compareTo(dateEmployeeRegularWorkTimeStart) > 0
				) {
			//If the employee enters AFTER compared to Work start time
			//And leaves BEFORE the work end time
			return (((dateEmployeeTimeOut.getTime()-dateEmployeeTimeIn.getTime()+59999)/60000));

			
			
		}else {
			return 0;
		}
	}
}
