package defaultMethod;

interface inter5 {
	default Number getNumber() {
		System.out.println("getNumber in inter4 interface");
		return 50;
	}
}

class B implements inter5 {
	public Integer getNumber() {
		System.out.println("getNumber in A class");
		inter5.super.getNumber();
		return 10;
	}
}

public class Test9 extends B implements inter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test9 t9 = new Test9();
		System.out.println(t9.getNumber());

	}

}
