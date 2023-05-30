package com.capgemini.spring.lifecycle;

public class Student {
	InitAndDestroy x;
	
	public InitAndDestroy getX() {
		return x;
	}

	public void setX(InitAndDestroy x) {
		this.x = x;
	}

	public void display()
	{
		System.out.println(x.getName());
		System.out.println(x.getRollNo());
	}

}
