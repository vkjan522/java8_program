package collections.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Test5 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>(Map.of(
				12,"Ram",
				13,"Sita",
				38,"Krishna",
				80,"radha",
				80,"vikash",
				null,"none",
				null,"hello",
				null,null
				));
		System.out.println(map);
		

	}

}
