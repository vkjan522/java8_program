package demo1;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department=" + department
				+ ", yearOfJoining=" + yearOfJoining + ", salary=" + salary;
	}

	public static List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(101, "Vikash", 29, "male", "CS", 2017, 500000.0));
		employeeList.add(new Employee(102, "Deppak", 30, "male", "CS", 2019, 1800000.0));
		employeeList.add(new Employee(103, "Sudipt", 29, "male", "Math", 2018, 2000000.0));
		employeeList.add(new Employee(105, "pushpa", 32, "female", "Math", 2022, 200000.0));
		employeeList.add(new Employee(104, "Hemlata", 28, "male", "History", 2017, 100000.0));
		employeeList.add(new Employee(106, "Tunna", 27, "male", "Computer Science", 2017, 500000.0));
		employeeList.add(new Employee(107, "Verma", 54, "male", "History", 1994, 1200000.0));
		employeeList.add(new Employee(108, "Puja", 30, "female", "Computer Science", 2017, 150000.0));
		employeeList.add(new Employee(111, "Om Praksh", 28, "male", "History", 2017, 700000.0));
		employeeList.add(new Employee(110, "Balika", 26, "female", "CS", 2017, 600000.0));
		return employeeList;
	}

}
