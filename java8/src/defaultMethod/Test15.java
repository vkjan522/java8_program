package defaultMethod;

public class Test15 {
	public static void main(String[] args) {
		new TestDefault1().m1();
	}

}

interface DefaultDemo {
	public default void m1() {
		System.out.println("DefaultDemo -> m1()");
	}
}

class Dd {
	public void m1() {
		System.out.println("Dd -> m1()");
	}
}

class TestDefault1 extends Dd implements DefaultDemo1 {

}