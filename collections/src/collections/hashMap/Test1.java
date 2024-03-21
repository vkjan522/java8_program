package collections.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		System.out.println(map.size());
		System.out.println(map);
		map.put(821301,"Patna");
		map.put(835217, "Ranchi");
		map.put(808130,"Delhi");
		map.put(857638, "Banglore");
		System.out.println(map.size());
		System.out.println(map);
		
	}

}
