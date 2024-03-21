package defaultMethodInterface.pack1;

interface Inter1 {
	default void show() {
		System.out.println("Show() inter1");
	}
}

interface Inter2 {
	default void show() {
		System.out.println("Show() inter2");
	}
}

class A implements Inter1, Inter2 {

	public void show() {
		Inter2.super.show();
	}

}

public class Main {

	public static void main(String[] args) {
		A a = new A();
		a.show();

	}

}
