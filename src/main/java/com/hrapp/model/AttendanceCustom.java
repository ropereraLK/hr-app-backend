package com.hrapp.model;

import java.util.Date;
 
/*
public class AttendanceCustom {
	
		
		 
	
		 
		private String username;
		
		private Date date;
		
		private Date time;
		
		
		
 
	 
		public AttendanceCustom() {
		}
		
	 
 
	 
	 
		public Date getTime() {
			return time;
		}
	 
		public void setTime(Date time) {
			this.time = time;
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
	 

 

}

*/

public interface AttendanceCustom{
	 
	 String getUsername();
	
	 Date getDate();
	
	 Date getTime();
}
