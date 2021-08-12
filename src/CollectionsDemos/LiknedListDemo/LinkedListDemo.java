package CollectionsDemos.LiknedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		
		LinkedList<String> ll = new LinkedList<>();

		ll.add("Anjumol");//0
		ll.add("Dhanajay");//1
		ll.add("hari");//2
		ll.add("Keerthana");//3
		ll.add("Monica");
		ll.add("Nadim");
		ll.add("Nikhil");
		ll.add("Nikhil");
		
		ll.get(3);
		
		System.out.println(ll);
		
		ll.addFirst("First");
		ll.addLast("Last");

		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll);
	}

}
