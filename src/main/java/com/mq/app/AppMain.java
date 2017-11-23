package com.mq.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppMain {
	
	public static final String APP_QUEUE = "app-queue";
	public static void main (String args[]) {
		SpringApplication.run(AppMain.class, args);
	}

}
