package staticMethodInterface;

public class Demo {
	public static void main(String[] args) {
		MyUtils.search();
		MyUtils.sort();
	}
}

interface MyUtils {
	// static method
	public static void search() {
		// Utility opearation
		System.out.println("MyUtils -> static search()");
		System.out.println("Searching");
	}

	public static void sort() {
		// Utility opearation
		System.out.println("MyUtils -> static sort()");
		System.out.println("Sorting");
	}
}

class Test1 implements MyUtils {

}

class Test2 implements MyUtils {

}