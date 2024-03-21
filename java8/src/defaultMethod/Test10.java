package defaultMethod;

interface inter6 {
	default Number getNumber() {
		System.out.println("getNumber in inter6 interface");
		return 50;
	}
}

interface inter7 extends inter6 {
	default Integer getNumber() {
		System.out.println("getNumber in A interface 7 interface");
		return 10;
	}
}

public class Test10 implements inter6, inter7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test10 t10 = new Test10();
		System.out.println(t10.getNumber());

	}

}
