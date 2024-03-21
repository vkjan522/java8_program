package lambdaExpression.demo7;

public class MainClass {
	interface Inter1 {
		public abstract int operation(int a, int b);
	}

	interface Inter2 {
		void sayMessage(String str);
	}

	private int operate(int a, int b, Inter1 f1obj) {
		return f1obj.operation(a, b);
	}

	public static void main(String[] args) {
		Inter1 obj1 = (x, y) -> x + y;
		Inter1 obj2 = (x, y) -> x * y;

		MainClass object = new MainClass();
		System.out.println(object.operate(20, 30, obj1));
		System.out.println(object.operate(2, 30, obj2));
		
		Inter2 message = (e) ->{System.out.println(e);};
		message.sayMessage("Hello, How are you?");
		
	}

}
