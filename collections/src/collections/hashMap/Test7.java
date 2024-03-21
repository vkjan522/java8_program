package collections.hashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test7 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>(Map.of(
				12,"Ram",
				13,"Sita",
				38,"Krishna",
				80,"radha"
				));

		System.out.println("Print from the HashMap Reference");
		System.out.println(map);
		
		
		System.out.println("Get Method()");
		System.out.println(map.get(13));
		

		System.out.println("Print HashMap using forEach method with keySet()");
		for(Integer key:map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
		
		System.out.println("Print HashMap using Consumer with entrySet()");
		
		map.entrySet().forEach(System.out::println);
		
		System.out.println("Print HashMap using Arrays’s asList() method");
		
		System.out.println(Arrays.asList(map));
		
		System.out.println("Print HashMap using Collections’s singletonList()");
		
		
		
		
		
	}

}
