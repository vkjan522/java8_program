//Given an element write a program to check if element(value) exists in ArrayList?
package com.program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test10 {

	public static void main(String[] args) {

		List<Student> stuColl = new ArrayList<>();
		stuColl.add(new Student(101,"Vikash","CS"));
		stuColl.add(new Student(102,"Happy","IT"));
		stuColl.add(new Student(104,"Rima","CS"));
		stuColl.add(new Student(105,"Munna","CS"));
		stuColl.add(new Student(106,"Sukesh","EC"));
		stuColl.add(new Student(107,"Shiva","ME"));
		stuColl.add(new Student(108,"Rakhi","ME"));
		
		System.out.println("List: "+ stuColl);
		
		List<Student> csStudents=stuColl.stream().filter(i -> i.getBranch().equals("CS")).collect(Collectors.toList());
		System.out.println("CS Students: " + csStudents);
		
		List<Student> meStudents=stuColl.stream().filter(i -> i.getBranch().equals("ME")).collect(Collectors.toList());
		System.out.println("ME Students: " + meStudents);
		
		List<Student> itStudents=stuColl.stream().filter(i -> i.getBranch().equals("IT")).collect(Collectors.toList());
		System.out.println("IT Students: " + itStudents);
		
		List<Student> ecStudents=stuColl.stream().filter(i -> i.getBranch().equals("EC")).collect(Collectors.toList());
		System.out.println("EC Students: " + ecStudents);
		
		
	}
}
