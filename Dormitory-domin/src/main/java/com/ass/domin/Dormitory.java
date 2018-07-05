package com.ass.domin;


public class Dormitory {

	private boolean type;       //0为单间，1为套间
	private String address;
	private String pNumber;
	private double price;
	private String ownerID;
	private boolean WhetherToRent;     //0为不可出租，1为可以出租
	public boolean getType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
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
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(String ownerID) {
		this.ownerID = ownerID;
	}
	public boolean getWhetherToRent() {
		return WhetherToRent;
	}
	public void setWhetherToRent(boolean whetherToRent) {
		WhetherToRent = whetherToRent;
	}
	public Dormitory() {}
	public Dormitory(boolean type, String address, String pNumber, double price, String ownerID, boolean whetherToRent) {
		this.type = type;
		this.address = address;
		this.pNumber = pNumber;
		this.price = price;
		this.ownerID = ownerID;
		WhetherToRent = whetherToRent;
	}
}

