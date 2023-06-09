package buchitest;

import java.util.List;

public class EmployeeManagement {

	String name;
	String designation;
	double salary;
	
	@Override
	public String toString() {
		return String.format("EmployeeManagement [name=%s, designation=%s, salary=%s]", name, designation, salary);
	}
	public EmployeeManagement(String name, String designation, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public EmployeeManagement() {
		super();
	}
	
}
