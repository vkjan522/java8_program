package demo1;

import java.util.Optional;

public class MainClass3 {
	public static <T> void main(String[] args) {
		Employee emp1 = new Employee(101, "Vikash", 29, "male", "CS", 2017, 500000.0);
		Employee emp2 = null;

		/*
		 * if you are using of() then make sure object should be not-null, otherwise you
		 * will get NullPointerExpeption. It means of() will be used only when you 100%
		 * sure that you are adding a not null object.;
		 */

		Optional<Employee> optionalEmp1 = Optional.of(emp1);
		Optional<Employee> optionalEmp2 = Optional.of(emp2);

		// empty() of Optional class is used to craete an empty container

		Optional<Employee> optionalEmp3 = Optional.empty();
		Optional<T> emptyOp = Optional.empty();

	}

}
