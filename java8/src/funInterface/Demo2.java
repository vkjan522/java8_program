package funInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo2 {

	public static void main(String[] args) {

		// Case Consumer accept();
		Consumer<Integer> cons = a -> System.out.println(a % 2 == 0 ? "Even" : "Odd");
		cons.accept(23);
		cons.accept(20);

		// Case 2
		List<Integer> li = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			li.add(i);

		li.forEach(a -> System.out.println(a));

		// Case 3 Prediacte test();

		Predicate<Integer> predicate = (a) -> {
			if (a % 2 == 0) {
				return true;
			}
			return false;

		};
		System.out.println(predicate.test(23));
		
		//Function apply();
		Function<Integer, Integer> function = (a) -> {
			if(a%2==0) {
				a=a+10;
			}else {
				a=a-10;
			}
			return a;
		};
		System.out.println(function.apply(35));
		
		//Suplier get();
		Supplier<Integer> supplier = () ->{
			return 5;
		};
		System.out.println(supplier.get());

	}

}

interface Square {
	int calculate(int x);
}
