package lambdaExpression.demo7;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(101);
		list.add(202);
		list.add(303);
		list.add(404);
		list.add(505);

		list.forEach(e -> System.out.println(e));
		System.out.println("-------Even Number-------");
		list.forEach(e -> {
			if(e%2==0)
				System.out.println("Even Number:" +e);
		});
		System.out.println("-------Odd Number-------");
		list.forEach(e ->{
			if(e%2!=0)
				System.out.println("Odd Number: "+e);
		});

	}

}
