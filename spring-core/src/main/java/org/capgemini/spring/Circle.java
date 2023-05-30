package org.capgemini.spring;

//import java.io.ObjectInputStream.GetField;

public class Circle {
	String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public void print()
	{
		System.out.println((getType()+ "circle"));
	}
}
