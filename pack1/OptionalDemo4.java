package pack1;

import java.util.Optional;

public class OptionalDemo4 {

	public static Optional<String> getOptional() {
		//String name = "vikash";
		String name = null;
		return Optional.ofNullable(name);
	}

	public static void main(String[] args) {

		Optional<String> nameOptional = getOptional();
		//System.out.println(nameOptional.get());
		System.out.println(nameOptional.isPresent());
		System.out.print(nameOptional.orElse("Object Not Found!!"));
	}

}
