package lambdaExpression.demo4;

public class Main {
	public static void main(String[] args) {
		SumInterface addition = (x, y) -> x + y;
		System.out.println(addition.sum(30, 40));
	}

}
