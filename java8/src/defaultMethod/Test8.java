package defaultMethod;

interface inter4{
	default Number getNumber() {
		System.out.println("getNumber in inter4 interface");
		return 50;
	}
}
class A implements inter4{
	public Integer getNumber() {
		System.out.println("getNumber in A class");
		return 10;
	}
}


public class Test8 extends A implements inter4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test8 t8 = new Test8();
		System.out.println(t8.getNumber());

	}

}
