package com.pan.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String userId;
	
	private String userName;	
	private String userPassword;
	private Date userLimdate;
	private String userLimit;
	private String telno;
	private String corpCode;
	private String email;
	private String wechatId;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Date getUserLimdate() {
		return userLimdate;
	}

	public void setUserLimdate(Date userLimdate) {
		this.userLimdate = userLimdate;
	}

	public String getUserLimit() {
		return userLimit;
	}

	public void setUserLimit(String userLimit) {
		this.userLimit = userLimit;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getCorpCode() {
		return corpCode;
	}

	public void setCorpCode(String corpCode) {
		this.corpCode = corpCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWechatId() {
		return wechatId;
	}

	public void setWechatId(String wechatId) {
		this.wechatId = wechatId;
	}
 
 
}
