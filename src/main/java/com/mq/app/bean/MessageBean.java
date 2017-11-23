package com.mq.app.bean;

import java.io.Serializable;
import java.time.LocalDate;

public class MessageBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 131645441386992286L;
	private String message;
	private LocalDate date;
	
	public String toString () {
		return date.toString().concat(":").concat(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
