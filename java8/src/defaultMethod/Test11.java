package defaultMethod;

interface inter8 {
	default Number getNumber() {
		System.out.println("getNumber in inter6 interface");
		return 50;
	}
}

interface inter9 extends inter8 {
}

interface inter10 extends inter8 {

}

public class Test11 implements inter9, inter10 {

	public static void main(String[] args) {
		Test11 t11 = new Test11();
		System.out.println(t11.getNumber());

	}

}
