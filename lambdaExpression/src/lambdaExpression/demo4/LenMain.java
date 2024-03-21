package lambdaExpression.demo4;

public class LenMain {

	public static void main(String[] args) {

		LengthInterface len = (s) -> s.length();
		System.out.println(len.getLen("vikash Kuamr"));
	}

}
