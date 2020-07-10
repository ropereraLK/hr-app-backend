package com.hrapp.model.computeAttendance.computation;

import java.util.Date;

public class DelayedWorkTimeOut {
public float computeExtraWorkBeforeWork(Date dateEmployeeTimeOut, Date dateEmployeeRegularWorkTimeEnd, Date dateEmployeeRegularWorkTimeStart ) {
		
		if(dateEmployeeTimeOut.compareTo(dateEmployeeRegularWorkTimeEnd) <= 0
				&&
				dateEmployeeTimeOut.compareTo(dateEmployeeRegularWorkTimeStart) >= 0
				)
			{	//If the employee enters EARLY compared to Work start time
			
			return (dateEmployeeRegularWorkTimeEnd.getTime()-dateEmployeeTimeOut.getTime())/60000;
			}
		else if(dateEmployeeTimeOut.compareTo(dateEmployeeRegularWorkTimeEnd) <= 0
				&&
				dateEmployeeTimeOut.compareTo(dateEmployeeRegularWorkTimeStart) < 0
				)
			{	//If the employee enters EARLY compared to Work start time
			
			return (dateEmployeeRegularWorkTimeEnd.getTime()-dateEmployeeRegularWorkTimeStart.getTime())/60000;
			}
		else return 0;
	}

}
