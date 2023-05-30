package com.capgemini.spring.assignment4p2;

public class Dept {

	String Dname;
	String Location;
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString()
	{
		return Dname+" at "+Location;
	}
}
