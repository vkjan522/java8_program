package staticMethodInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(36);
		list.add(90);
		list.add(27);
		list.add(49);
		list.add(20);
		list.add(42);
		System.out.println("List: " + list);

		MyUtils2.sortList(list);

		A a = new A();
		a.searchElement(list, 5);

	}

}

interface MyUtils2 {
	static List<Integer> sortList(List<Integer> l) {
		TreeSet<Integer> t = new TreeSet<>(l);
		return new ArrayList<>(t);
	}

	default Integer searchElement(List<Integer> l, int i) {
		List<Integer> sortedList=MyUtils2.sortList(l);
		int e=sortedList.indexOf(i);
		return e;	
	}
}

class A implements MyUtils2 {
	

}
