package com.hrapp.model.computeAttendance.computation;

import java.util.Date;

public class ExtraWorkAfterWorkComputation {
public float computeExtraWorkAftereWork(Date dateEmployeeTimeOut, Date dateEmployeeRegularWorkTimeEnd, Date dateEmployeeTimeIn) {
		
		if(dateEmployeeTimeOut.compareTo(dateEmployeeRegularWorkTimeEnd) >= 0
				&& dateEmployeeTimeIn.compareTo(dateEmployeeRegularWorkTimeEnd)<=0 )
			{	//If the employee enters EARLY compared to Work start time
			//System.out.println("Time out >= Regular Work End");
			return (dateEmployeeTimeOut.getTime()-dateEmployeeRegularWorkTimeEnd.getTime()+59999)/60000;
			}
		else if(dateEmployeeTimeOut.compareTo(dateEmployeeRegularWorkTimeEnd) >= 0
				&& dateEmployeeTimeIn.compareTo(dateEmployeeRegularWorkTimeEnd)>0 )
			{	//If the employee enters EARLY compared to Work start time
			//System.out.println("Time out >= Regular Work End");
			return (dateEmployeeTimeOut.getTime()-dateEmployeeTimeIn.getTime()+59999)/60000;
			}
		else return 0;
	}

}
