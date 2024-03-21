package demo1;

import java.util.Optional;

public class MainClass4 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Vikash", 29, "male", "CS", 2017, 500000.0);
		Employee emp2 = null;
		/*
		 * if you are not sure that the object which u r adding is null or not null then
		 * in that case you can use of ofNullable() to wrap an object into Optional
		 * container
		 */
		Optional<Employee> optionalEmp1 = Optional.ofNullable(emp1);
		Optional<Employee> optionalEmp2 = Optional.ofNullable(emp2);

	}

}
