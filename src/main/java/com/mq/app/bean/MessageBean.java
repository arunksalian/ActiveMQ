package com.mq.app.bean;

import java.io.Serializable;
import java.util.Date;

public class MessageBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 131645441386992286L;
	private String message;
	private Date date;
	
	public MessageBean () {}
	
	public MessageBean (String message) {
		this.message = message;
		this.date = new Date(System.currentTimeMillis());
	}
	
	public String toString () {
		return date.toString().concat(":").concat(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
}
