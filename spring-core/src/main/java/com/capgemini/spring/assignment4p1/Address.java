package com.capgemini.spring.assignment4p1;

public class Address {

	String streetName;
	String area;
	String city;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString()
	{
		return streetName+" "+area+" "+city;
	}
}
