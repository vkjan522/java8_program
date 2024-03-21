package funInterface;

public class Demo1 {
	public static void main(String[] args) {
		funInterface fobj = (x, y) -> System.out.println(x+y);
		System.out.println("The result is: ");
		fobj.absFun(5, 10);
		fobj.defFun();
	}
}
@FunctionalInterface
interface funInterface{
	void absFun(int x ,int y);
	default void defFun() {
		System.out.println("This is defoult");
	}
}
