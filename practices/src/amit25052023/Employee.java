package amit25052023;

public class Employee {

	String name;
	double salary;
	String department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(String name, double salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	
	
}
