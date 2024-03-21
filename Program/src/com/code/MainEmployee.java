package com.code;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainEmployee {

	public static void main(String[] args) {
		List<Employee> emplList = new ArrayList<>();
		emplList.add(new Employee(101, "vikash", "Developer", 50000.0F));
		emplList.add(new Employee(102, "Deppak", "Developer", 10000.0F));
		emplList.add(new Employee(103, "Ram", "Manager", 102873F));
		emplList.add(new Employee(104, "Rahim", " Java", 30000.0F));
		emplList.add(new Employee(105, "Sita", " Python", 50000.0f));
		emplList.add(new Employee(106, "Geeta", "manager", 367484F));
		emplList.add(new Employee(107, "Rita", "API", 83873F));
		emplList.add(new Employee(108, "Mita", "QA", 340000F));
		emplList.add(new Employee(109, "Mehesh", "Testing", 20976F));
		emplList.add(new Employee(1010, "Ramesh", "Developer", 20000.0F));
		System.out.println(emplList);

		Double sumSal = emplList.stream().collect(Collectors.summingDouble(e -> e.getEsalary()));
		System.out.println("Sum of Salary:"+sumSal);

		List<Employee> empSalary = emplList.stream().filter(p -> p.getEdepartment().equals("Developer"))
				.collect(Collectors.toList());

		System.out.println("Developer Salary:"+empSalary);

		Double sum = empSalary.stream().collect(Collectors.summingDouble(e -> e.getEsalary()));
		System.out.println("Sum of Salary:"+sum);

		Double sum1 = emplList.stream().filter(p -> p.getEdepartment().equals("Developer"))
				.collect(Collectors.summingDouble(e -> e.getEsalary()));
		System.out.println("Sum of Developer Salary: "+sum1);

		Optional<Float> sum2 = emplList.stream().filter(p -> p.getEdepartment().equals("Developer"))
				.map(emp -> emp.getEsalary()).reduce((acc, x) -> acc + x);
		System.out.println("Developer Salary Reduce By: "+sum2);
		

	}

}
