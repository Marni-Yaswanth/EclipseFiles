package org.capgemini.spring.example2;

import org.capgemini.spring.example2.Point;

public class Ex1 {
	Point p1;
	Point p2;
	Point p3;
	
	
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	public Point getP3() {
		return p3;
	}
	public void setP3(Point p3) {
		this.p3 = p3;
	}
	public void draw()
	{
		System.out.println(" pointA x and y are :"+getP1().getX()+" " + getP1().getX());
		System.out.println(" pointB x and y are :"+getP2().getX()+" " + getP2().getX());
		System.out.println(" pointC x and y are :"+getP3().getX()+" " + getP3().getX());
	}
	
	
}
