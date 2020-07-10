package com.hrapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrApp  {

	public static void main(String[] args) {
		 
		//SpringApplication.run(HrApp.class, args);
		
		SpringApplication app = new SpringApplication(HrApp.class);
	    app.setBannerMode(Banner.Mode.OFF);
	    app.run(args); 
	}

}
