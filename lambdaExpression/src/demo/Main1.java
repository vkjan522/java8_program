package demo;

public class Main1 {
	public static void main(String[] args) {
		
		//Anonumous class
		InterfaceTest obj = new InterfaceTest() {
			@Override
			public void test() {
				System.out.println("This is first Anonumous class!!");
			}
		};
		obj.test();
		
		InterfaceTest obj2 = new InterfaceTest() {
			
			@Override
			public void test() {
				System.out.println("This is second Anonumous class!!");
			}
		};
		obj2.test();
	}

}
