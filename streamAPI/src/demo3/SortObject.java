package demo3;

import java.util.List;
import java.util.stream.Collectors;

public class SortObject {

	public static void main(String[] args) {

		//sorting in ascending order
		List<Employee> list = Employee.getEmployeeList().stream()
				.sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
		for (Employee i : list) {
			System.out.println(i);
		}
		//sorting in descending order
		List<Employee> list1 = Employee.getEmployeeList().stream()
				.sorted((o1, o2) -> (int) (o2.getSalary() - (o1.getSalary()))).collect(Collectors.toList());

		for(Employee e: list1) {
			System.out.println(e);
		}
	}

}
