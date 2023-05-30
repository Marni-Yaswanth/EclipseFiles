package com.presentation.examples;

public class Triangle {
	Points pointA;
	Points pointB;
	
	public Points getPointA() {
		return pointA;
	}
	public void setPointA(Points pointA) {
		this.pointA = pointA;
	}
	public Points getPointB() {
		return pointB;
	}
	public void setPointB(Points pointB) {
		this.pointB = pointB;
	}
	
	public void display() {
		System.out.println(pointA.getX()+" "+pointB.getX()+" "+pointA.getY()+" "+pointB.getY());
	}

}
