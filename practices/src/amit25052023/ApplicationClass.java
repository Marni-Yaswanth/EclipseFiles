package amit25052023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ApplicationClass {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Employee> list = new ArrayList<>();
		
		Employee em1 = new Employee("yash", 12345634, "cse");
		Employee em2 = new Employee("lax", 3466, "mech");
		Employee em3 = new Employee("lax", 21346, "SGAHE");
		Employee em4 = new Employee("laxaerh", 315466, "sadfgmech");
		list.add(em1);
		list.add(em2);
		list.add(em3);
		list.add(em4);
		
		Comparator<Employee> comparator = new Comparator<Employee>() {

			

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				if(o1.salary>o2.salary)
				{
					return 1;
				}
				else {
					return -1;
				}
				
			}
		};
		
		Collections.sort(list, comparator);
		
		for(Employee employee : list)
		{
			System.out.println(employee.getName()+" "+employee.getDepartment()+" "+employee.getSalary());
		}
		
	}

	

}
