package CollectionsDemos.LiknedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		
		LinkedList<String> ll = new LinkedList<>();

		ll.add("Anjumol");
		ll.add("Dhanajay");
		ll.add("hari");
		ll.add("Keerthana");
		ll.add("Monica");
		ll.add("Nadim");
		ll.add("Nikhil");
		ll.add("Nikhil");
		
		System.out.println(ll);
		
		ll.addFirst("First");
		ll.addLast("Last");

		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll);
	}

}
