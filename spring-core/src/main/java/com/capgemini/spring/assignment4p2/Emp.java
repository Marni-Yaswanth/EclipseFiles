package com.capgemini.spring.assignment4p2;

public class Emp {

	String Ename;
	Dept dept;

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}
	@Override
	public String toString()
	{
		return Ename+" works in "+dept;
				
	}
}
