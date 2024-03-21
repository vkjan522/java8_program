package defaultMethod;

public class Test16 {
	public static void main(String[] args) {
		new TestDefault2().m1();
	}

}

interface DefaultDemo3 {
	public default void m1() {
		System.out.println("DefaultDemo3 -> m1()");
	}
}

interface DefaultDemo4 extends DefaultDemo3{
	public default void m1() {
		System.out.println("DefaultDemo4 -> m1()");
	}
}


class TestDefault2 implements DefaultDemo4 {

}