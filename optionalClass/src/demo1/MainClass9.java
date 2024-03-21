package demo1;

import java.util.Optional;

public class MainClass9 {
	public static void main(String[] args) {
		Employee emp1 = getEmployee(100);
		Employee emp2 = getEmployee(5000);
		
		System.out.println(emp1);
		System.out.println(emp2);
	}

	public static Employee getEmployee(int empId) {

		// Return unknown employee if employee is null ( i.e. optional is not containing
		// employee object.)
		Employee emp = null;
		if(empId < 1000) {
			emp = new Employee(empId, "Vikash");
		}
		Optional<Employee> optionalEmp = Optional.ofNullable(emp);
		Employee employee = optionalEmp.orElse(new Employee(0, "Unknown employee"));
		return employee;

	}

}
