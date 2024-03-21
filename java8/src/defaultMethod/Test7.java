package defaultMethod;

interface inter3 {
	void show();

	default void display() {
	}

	default void process() {
		System.out.println("process() inteface");
	}
}

class Hello2 implements inter3 {
	public void show() {
		System.out.println("Show()");
	}

	public void display() {
		System.out.println("Display()");
	}
	public void process() {
		System.out.println("process() Hello 2 class");
		inter3.super.process();
	}
}

public class Test7 extends Hello2{

	public static void main(String[] args) {
		Test7 t7 = new Test7();
		t7.show();
		t7.display();
		t7.process();

	}

}
