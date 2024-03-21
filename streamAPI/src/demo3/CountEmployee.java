package demo3;

import java.util.stream.Collectors;

public class CountEmployee {

	public static void main(String[] args) {
		
		//stream().count
		long count = Employee.getEmployeeList().stream().count();
		System.out.println(count);
		
		//collectors().counting()
		long count1 = Employee.getEmployeeList().stream().collect(Collectors.counting());
		System.out.println(count1);
		
		
		
	}

}
