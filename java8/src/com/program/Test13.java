//Given an element write a program to check if element(value) exists in ArrayList?
package com.program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test13 {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Vikash", "Loan", 12000));
		empList.add(new Employee(102, "Happy", "Insurance", 15000));
		empList.add(new Employee(104, "Rima", "Tech", 50000));
		empList.add(new Employee(105, "Munna", "Loan", 30000));
		empList.add(new Employee(106, "Sukesh", "Credit Card", 32000));
		empList.add(new Employee(107, "Shiva", "Admin", 8000));
		empList.add(new Employee(108, "Rakhi", "Admin", 10000));
		empList.add(new Employee(109, "Suman", "Loan", 250000));
		empList.add(new Employee(110, "Happy", "Loan", 15000));

		System.out.println("List: " + empList);
		
		//Filter+Map
		//Increase the salary of Tech department employee by 5000
		List<Employee> filterEmp2 = empList.stream()
						.filter(e -> e.geteDepartment().equals("Tech"))
						.map(e -> { e.seteSalaray(e.geteSalaray()+5000); return e; }) 
						.collect(Collectors.toList());
		
		System.out.println(filterEmp2);
		
		System.out.println("List: " + empList);

	}
}
