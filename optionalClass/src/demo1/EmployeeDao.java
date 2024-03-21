package demo1;

@FunctionalInterface
public interface EmployeeDao<T extends Employee> {

	public T getDefaultEmployee();

}
