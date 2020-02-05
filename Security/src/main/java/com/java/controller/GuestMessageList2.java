package com.java.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class GuestMessageList2 {
	private int id;
	private String message;
	private Date createionTime;
	
	public GuestMessageList2(int id, String message, Date createionTime) {
		this.id = id;
		this.message= message;
		this.createionTime = createionTime;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreateionTime() {
		return createionTime;
	}
	public void setCreateionTime(Date createionTime) {
		this.createionTime = createionTime;
	}
	

		
}
