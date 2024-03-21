package defaultMethod;

interface inter2{
	void show();
	default void process() {}
}
class Hi implements inter2{
	public void show() {
		System.out.println("Show()");
	}
	public void process() {
		System.out.println("Process()");
	}
}
public class Test6 extends Hi{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 t6 = new Test6();
		t6.show();
		t6.process();
	}

}
