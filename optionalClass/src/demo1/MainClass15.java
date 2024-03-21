package demo1;

import java.util.Optional;

public class MainClass15 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Vikash", 29, "male", "CS", 2017, 500000.0);
		Optional<Employee> optionalEmp1 = Optional.ofNullable(emp1);
		Employee result = addTitle(optionalEmp1);
		System.out.println(result);

		Employee emp2 = new Employee(101, "Khushboo", 29, "female", "CS", 2017, 500000.0);
		Optional<Employee> optionalEmp2 = Optional.ofNullable(emp2);
		Employee result2 = addTitle(optionalEmp2);
		System.out.println(result2);
		
		Employee emp3 = null;
		Optional<Employee> optionalEmp3 = Optional.ofNullable(emp3);
		Employee result3 = addTitle(optionalEmp3);
		System.out.println(result3);

	}

	public static Employee addTitle(Optional<Employee> op) {
		/*Employee emp =null;
		if (op.isPresent()) {
			emp = op.get();
			if (emp.getGender().equalsIgnoreCase("male")) {
				emp.setName("Mr " + emp.getName());
			}else {
				emp.setName("Mrs " + emp.getName());
			}
		}
		return emp;
		*/
		
		Optional<Employee> opEmp=op.filter(emp -> emp.getGender().equalsIgnoreCase("male"));
		System.out.println(opEmp.isEmpty());
		opEmp.ifPresent(emp -> emp.setName("Mr " + emp.getName()));
		
		return op.orElse(new Employee(0,"Unknown User"));
	}

}
