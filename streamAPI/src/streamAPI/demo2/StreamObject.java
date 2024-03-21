package streamAPI.demo2;

import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {

		// 1 - empty Stream
		Stream<Object> emptyStream = Stream.empty();

		//2 - Array - Stream
		String names[] = { "Ram", "shayam", "Geeta", "Sita", "Meera" };
		Stream<String> stream = Stream.of(names);
		stream.forEach(e -> {
			System.out.println(e);
		});
	}

}
