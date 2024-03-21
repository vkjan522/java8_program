package streamAPI.demo1;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "Vikash");
		map.put(202, "Deppak");
		map.put(202, "Chhotu");
		map.put(202, "Happy");

		List<String> order = map.entrySet().stream().map(f -> f.getValue()).sorted().collect(Collectors.toList());
		System.out.println(order);

		List<String> reverseOrder = map.entrySet().stream().map(f -> f.getValue()).sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(reverseOrder);
		

	}

}
