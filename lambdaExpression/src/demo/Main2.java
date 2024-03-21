package demo;

public class Main2 {

	public static void main(String[] args) {

		InterfaceTest i = () -> System.out.println("this is first time using Lambda exp!!");
		
		i.test();

	}

}
