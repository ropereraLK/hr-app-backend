package com.hrapp.attendanceComputation;

import java.util.Date;

public class DelayedWorkTimeIn {
public float computeExtraWorkBeforeWork(Date dateEmployeeTimeIn, Date dateEmployeeRegularWorkTimeStart,Date dateEmployeeRegularWorkTimeEnd ) {
		
		if(dateEmployeeTimeIn.compareTo(dateEmployeeRegularWorkTimeStart) > 0
				&&
				dateEmployeeTimeIn.compareTo(dateEmployeeRegularWorkTimeEnd) <= 0
				
				)
			{	//If the employee enters EARLY compared to Work start time
			
			return (dateEmployeeTimeIn.getTime()-dateEmployeeRegularWorkTimeStart.getTime())/60000;
			}
		
		else if(dateEmployeeTimeIn.compareTo(dateEmployeeRegularWorkTimeStart) > 0
				&&
				dateEmployeeTimeIn.compareTo(dateEmployeeRegularWorkTimeEnd) > 0
				
				)
			{	//If the employee enters EARLY compared to Work start time
			
			return (dateEmployeeRegularWorkTimeEnd.getTime()-dateEmployeeRegularWorkTimeStart.getTime())/60000;
			}
		else return 0;
	}

}
