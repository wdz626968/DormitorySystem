package com.ass.domin;

import java.util.Date;


public class customer {

	private String name;
	private String address;
	private String pNumber;
	private String ID;
	private String password;
	private String birth;
	private String sex;
	private boolean type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}
	public  customer(){}
	public customer(String name, String address, String pNumber, String ID, String password, String birth, String sex, boolean type) {
		this.name = name;
		this.address = address;
		this.pNumber = pNumber;
		this.ID = ID;
		this.password = password;
		this.birth = birth;
		this.sex = sex;
		this.type = type;
	}
}
