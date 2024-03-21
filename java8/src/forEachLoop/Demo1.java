package forEachLoop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> myList =new ArrayList<Integer>();
		for(int i=10;i<=20;i++)
			myList.add(i);
		
		//traversing through Iterator
		
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
		
		//Traversing through forEach method of Iterable with anonymous class
		
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				 System.out.println("Foreach anonymous class value: "+t);
			}
		});
		
		
		//traversing through Consumer interface implementation
	
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
		
	}
}
class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("Consumer impl value: "+t);
		
	}
	
}

