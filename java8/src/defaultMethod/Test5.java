package defaultMethod;

interface inter1{
	void display();
}
class Hello implements inter1{
	public void display() {
		System.out.println("display()");
	}
	
}
public class Test5 extends Hello {

	public static void main(String[] args) {
		Test5 t5  = new Test5();
		t5.display();

	}

}
