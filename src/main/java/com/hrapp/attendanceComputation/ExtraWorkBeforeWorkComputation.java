package com.hrapp.attendanceComputation;

import java.util.Date;

public class ExtraWorkBeforeWorkComputation {
	
	public float computeExtraWorkBeforeWork(Date dateEmployeeTimeIn, Date dateEmployeeRegularWorkTimeStart, Date dateEmployeeTimeOut) {
		
		if(dateEmployeeTimeIn.compareTo(dateEmployeeRegularWorkTimeStart) <= 0
				&& dateEmployeeTimeOut.compareTo(dateEmployeeRegularWorkTimeStart) >= 0)
			{	//If the employee enters EARLY compared to Work start time
			
			return (dateEmployeeRegularWorkTimeStart.getTime()-dateEmployeeTimeIn.getTime()+59999)/60000;
			}
		else if(dateEmployeeTimeIn.compareTo(dateEmployeeRegularWorkTimeStart) <= 0
				&& dateEmployeeTimeOut.compareTo(dateEmployeeRegularWorkTimeStart) < 0)
			{	//If the employee enters EARLY compared to Work start time
			
			return (dateEmployeeTimeOut.getTime()-dateEmployeeTimeIn.getTime()+59999)/60000;
			}
		else return 0;
	}
}
