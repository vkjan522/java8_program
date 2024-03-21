package demo1;

import java.util.Optional;

public class MainClass5 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Vikash", 29, "male", "CS", 2017, 500000.0);
		Employee emp2 = null;
		Optional<Employee> optionalEmp1 = Optional.ofNullable(emp1);
		showInfo(optionalEmp1);
		Optional<Employee> optionalEmp2 = Optional.ofNullable(emp2);
		showInfo(optionalEmp2);
	}

	public static void showInfo(Optional<Employee> op) {
		System.out.println("-------show info-----");
		if (op.isPresent()) {
			Employee emp = op.get();
			System.out.println("Name: " + emp.getName());
			System.out.println("Age: " + emp.getAge());
		} else {
			System.out.println(" Optional container is Empty!!");

		}

	}

}
