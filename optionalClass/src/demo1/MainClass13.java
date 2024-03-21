package demo1;

import java.util.Optional;

public class MainClass13 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Vikash", 29, "male", "CS", 2017, 500000.0);
		Optional<Employee> optionalEmp1 = Optional.ofNullable(emp1);
		Employee result = increaseSalaray(optionalEmp1);
		System.out.println(result);
		
		Employee emp2 = null;
		Optional<Employee> optionalEmp2 = Optional.ofNullable(emp2);
		Employee result2 = increaseSalaray(optionalEmp2);
		System.out.println(result2);

	}

	public static Employee increaseSalaray(Optional<Employee> op) {
		op.ifPresent(emp -> emp.setSalary(emp.getSalary() + 5051));
		return op.orElseThrow();

	}

}
