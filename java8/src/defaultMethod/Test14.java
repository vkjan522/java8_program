package defaultMethod;

public class Test14{
	public static void main(String[] args) {
		new TestDefault().m1();
	}

}

interface DefaultDemo1 {
	public default void m1() {
		System.out.println("DefaultDemo1 -> m1()");
	}
}

interface DefaultDemo2 {
	public default void m1() {
		System.out.println("DefaultDemo2 -> m1()");
	}
}

class TestDefault implements DefaultDemo1, DefaultDemo2{

	@Override
	public void m1() {
		//super.m1();
		DefaultDemo1.super.m1();
		DefaultDemo2.super.m1();
		System.out.println("TestDefault -> m1()");
	}
	
}