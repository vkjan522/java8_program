package defaultMethod;

interface inter12 {
	default Number getNumber() {
		System.out.println("getNumber in inter12 interface");
		return 40;
	}
}

interface inter13 {
	default Number getNumber() {
		System.out.println("getNumber in inter13  interface");
		return 50;
	}
}

class D implements inter12 {
}

class E implements inter13 {

}
//class xyz implements inter12, inter13{}

class Abc implements inter12, inter13 {
	public Integer getNumber() {
		System.out.println(inter12.super.getNumber());
		System.out.println(inter13.super.getNumber());
		return 10;
	}
}

public class Test12 implements inter9, inter10 {

	public static void main(String[] args) {
		Abc abc = new Abc();
		System.out.println(abc.getNumber());

	}

}
