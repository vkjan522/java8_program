package demo1;

public class MainClass2 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Vikash", 29, "male", "CS", 2017, 500000.0);
		Employee emp2 = null;
		showInfo(emp1);
		showInfo(emp2);

	}

	public static void showInfo(Employee emp) {
		if (emp != null) {
			System.out.println("Name: " + emp.getName());
			System.out.println("Age: " + emp.getAge());
		}else {
			System.out.println("Object is null!!");
		}
	}

}
