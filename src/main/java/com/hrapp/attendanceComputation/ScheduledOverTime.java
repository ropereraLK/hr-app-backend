package com.hrapp.attendanceComputation;

import java.util.Date;

public class ScheduledOverTime {
	
	public float computeOverTimeBeforeWork(
			
			 Date dateEmployeeTimeIn,
			 Date dateEmployeeTimeOut,
			 Date dateEmployeeRegularWorkTimeStart,
 			 Date dateEmployeeOverWorkTimeStart,
			 Date dateEmployeeOverWorkTimeEnd
			 
			) {
		
		if(dateEmployeeTimeIn != null && 
				dateEmployeeTimeOut != null &&
				dateEmployeeRegularWorkTimeStart!=null &&
				dateEmployeeOverWorkTimeStart!=null &&
				dateEmployeeOverWorkTimeEnd != null
				) {
			if(isOverTimeBeforeWork(
					   dateEmployeeRegularWorkTimeStart,
					   dateEmployeeOverWorkTimeStart,
					   dateEmployeeOverWorkTimeEnd)
					) {
				if(dateEmployeeTimeIn.compareTo(dateEmployeeOverWorkTimeStart) <= 0 
						&& 
						dateEmployeeTimeOut.compareTo(dateEmployeeOverWorkTimeEnd) >=0)
				{	
					//If the employee enters EARLY compared to Work start time
					//And leaves AFTER the work end time
					return (((dateEmployeeOverWorkTimeEnd.getTime()-dateEmployeeOverWorkTimeStart.getTime())/60000));

					
					
				}
				else if(dateEmployeeTimeIn.compareTo(dateEmployeeOverWorkTimeStart) <= 0 
						&& 
						dateEmployeeTimeOut.compareTo(dateEmployeeOverWorkTimeEnd) <0) {
					//If the employee enters EARLY compared to Work start time
					//And leaves BEFORE the work end time
					return (((dateEmployeeTimeOut.getTime()-dateEmployeeOverWorkTimeStart.getTime()+1)/60000));

					
					
				}
				else if(dateEmployeeTimeIn.compareTo(dateEmployeeOverWorkTimeStart) > 0 
						&& 
						dateEmployeeTimeOut.compareTo(dateEmployeeOverWorkTimeEnd) >=0) {
					//If the employee enters AFTER compared to Work start time
					//And leaves AFTER the work end time
					return (((dateEmployeeOverWorkTimeEnd.getTime()-dateEmployeeTimeIn.getTime()+1)/60000));

					
					
				}else if(dateEmployeeTimeIn.compareTo(dateEmployeeOverWorkTimeStart) > 0 
						&& 
						dateEmployeeTimeOut.compareTo(dateEmployeeOverWorkTimeEnd) <0) {
					//If the employee enters AFTER compared to Work start time
					//And leaves BEFORE the work end time
					return (((dateEmployeeTimeOut.getTime()-dateEmployeeTimeIn.getTime()+1)/60000));

					
					
				}else return 0;
				 			
			}
			
			else return 0;
		} else
		return 0;
		
	}
	
	public float computeOverTimeAfterWork(
			
			 Date dateEmployeeTimeIn,
			 Date dateEmployeeTimeOut,
			 Date dateEmployeeRegularWorkTimeEnd,
			 Date dateEmployeeOverWorkTimeStart,
			 Date dateEmployeeOverWorkTimeEnd
			 
			) {
		
		if(dateEmployeeTimeIn != null && 
				dateEmployeeTimeOut != null &&
				dateEmployeeRegularWorkTimeEnd!=null &&
				dateEmployeeOverWorkTimeStart!=null &&
				dateEmployeeOverWorkTimeEnd != null) {
			if(isOverTimeAfterWork(
					dateEmployeeRegularWorkTimeEnd,
					   dateEmployeeOverWorkTimeStart,
					   dateEmployeeOverWorkTimeEnd)
					) {
				
				//System.out.println("Over TIme After");
				if(dateEmployeeTimeIn.compareTo(dateEmployeeOverWorkTimeStart) <= 0 
						&& 
						dateEmployeeTimeOut.compareTo(dateEmployeeOverWorkTimeEnd) >=0
						&&
						dateEmployeeTimeOut.compareTo(dateEmployeeOverWorkTimeStart)>0)
				{	
					//If the employee enters EARLY compared to Work start time
					//And leaves AFTER the work end time
					return (((dateEmployeeOverWorkTimeEnd.getTime()-dateEmployeeOverWorkTimeStart.getTime())/60000)+1);

					
					
				}
				else if(dateEmployeeTimeIn.compareTo(dateEmployeeOverWorkTimeStart) <= 0 
						&& 
						dateEmployeeTimeOut.compareTo(dateEmployeeOverWorkTimeEnd) <0 
						&&
						dateEmployeeTimeOut.compareTo(dateEmployeeOverWorkTimeStart)>0) {
					//If the employee enters EARLY compared to Work start time
					//And leaves BEFORE the work end time
					 
					return (((dateEmployeeTimeOut.getTime()-dateEmployeeOverWorkTimeStart.getTime()+1)/60000)+1);

					
					
				}
				else if(dateEmployeeTimeIn.compareTo(dateEmployeeOverWorkTimeStart) > 0 
						&& 
						dateEmployeeTimeOut.compareTo(dateEmployeeOverWorkTimeEnd) >=0
						&&
						dateEmployeeTimeOut.compareTo(dateEmployeeOverWorkTimeStart)>0) {
					//If the employee enters AFTER compared to Work start time
					//And leaves AFTER the work end time
					return (((dateEmployeeOverWorkTimeEnd.getTime()-dateEmployeeTimeIn.getTime()+1)/60000)+1);

					
					
				}else if(dateEmployeeTimeIn.compareTo(dateEmployeeOverWorkTimeStart) > 0 
						&& 
						dateEmployeeTimeOut.compareTo(dateEmployeeOverWorkTimeEnd) <0
						&&
						dateEmployeeTimeOut.compareTo(dateEmployeeOverWorkTimeStart)>0) {
					//If the employee enters AFTER compared to Work start time
					//And leaves BEFORE the work end time
					return (((dateEmployeeTimeOut.getTime()-dateEmployeeTimeIn.getTime()+1)/60000)+1);

					
					
				}else return 0;
				 			
			}
			
			else return 0;
			
		} else return 0;
	}
	
	
	public boolean isOverTimeBeforeWork(  
			 Date dateEmployeeRegularWorkTimeStart,
			 Date dateEmployeeOverWorkTimeStart,
			 Date dateEmployeeOverWorkTimeEnd) {
		
		if(dateEmployeeRegularWorkTimeStart.compareTo(dateEmployeeOverWorkTimeEnd)>=0 
				&& 
				dateEmployeeRegularWorkTimeStart.compareTo(dateEmployeeOverWorkTimeStart)>=0) {
			return true;
		}
		return false;
	}
	
	public boolean isOverTimeAfterWork(  
			 Date dateEmployeeRegularWorkTimeEnd,
			 Date dateEmployeeOverWorkTimeStart,
			 Date dateEmployeeOverWorkTimeEnd) {
		
		if(dateEmployeeRegularWorkTimeEnd.compareTo(dateEmployeeOverWorkTimeEnd)<=0 
				&& 
				dateEmployeeRegularWorkTimeEnd.compareTo(dateEmployeeOverWorkTimeStart)<=0) {
			return true;
		}
		return false;
	}

}
