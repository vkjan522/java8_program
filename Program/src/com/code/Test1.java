package com.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

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
		
		emplList.forEach(System.out::println);
		System.out.println("++++++++++++++++++++++++++");
		List<Employee> list = emplList.stream().filter(e -> e.getEsalary()>10000).collect(Collectors.toList());
		System.out.println(list);
		System.out.println("++++++++++++++++++++++++++");
		
		 
	}

}
