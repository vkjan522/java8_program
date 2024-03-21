package demo3;

import java.util.Map;
import java.util.stream.Collectors;

public class groupEmployee {

	public static void main(String[] args) {

		Map<String, Long> noOfMaleAndFemale = Employee.getEmployeeList().stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("Number of Female and Male is: " + noOfMaleAndFemale);

		// employee in department
		Map<String, Long> numberOfEmployeeDepartWise = Employee.getEmployeeList().stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("EMployee: "+numberOfEmployeeDepartWise);

	}

}
