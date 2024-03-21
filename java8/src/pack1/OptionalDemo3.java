package pack1;

import java.util.Optional;

public class OptionalDemo3 {

	public static void main(String[] args) {
		//String str = "Java is my favorite";
		String str = null;

		Optional<String> optional = Optional.ofNullable(str);
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		System.out.println(optional.orElse("No value in this Object"));

	}

}
