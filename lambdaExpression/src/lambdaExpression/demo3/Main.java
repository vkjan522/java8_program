package lambdaExpression.demo3;

public class Main {

	public static void main(String[] args) {
		// Using our functional interface with the help of lambda

		MyInterface i = () -> {
			System.out.println("This is Lambda Expression!");
		};
		i.show();
		MyInterface i2 = () -> System.out.println("Hello, lambda");
		i2.show();
	}

}
