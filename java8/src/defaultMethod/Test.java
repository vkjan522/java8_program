package defaultMethod;

public class Test implements Demo {
	public static void main(String[] args) {
		Test t = new Test();
		t.show();
		t.display();
	}

	@Override
	public void show() {
		System.out.println("show()");

	}

	@Override
	public void display() {
		System.out.println("Display()");

	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		
	}
}
