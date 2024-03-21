//Given an element write a program to check if element(value) exists in ArrayList?
package com.program;

import java.util.ArrayList;
import java.util.List;

public class Test24 {

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
		
		//Filter the employee which belongs to Loan department and having salary>=20000
		Double totalSal=empList.stream().mapToDouble(e -> e.geteSalaray()).sum();
		System.out.println(totalSal);

	}
}
