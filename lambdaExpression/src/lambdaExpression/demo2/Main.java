package lambdaExpression.demo2;

public class Main {

	public static void main(String[] args) {
	
		//Anonymous class for implementing interface
		
		MyInterface obj =  new MyInterface() {
			@Override
			public void show() {
				System.out.println("Hello, World!");
			}
		};
		obj.show();

	}

}
