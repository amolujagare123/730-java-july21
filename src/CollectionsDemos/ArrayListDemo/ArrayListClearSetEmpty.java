package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListClearSetEmpty {

	public static void main(String[] args) {

			
		ArrayList<String> al = new ArrayList<>();
		
		System.out.println(al.isEmpty()); // true

		al.add("Anjumol");
		al.add("Dhanajay");
		al.add("hari");
		al.add("Keerthana");
		al.add("Monica");
		al.add("Nadim");
		al.add("Nikhil");
		al.add("Nikhil");
		
		System.out.println(al.isEmpty()); // false
		
		System.out.println("al="+al);
			
		al.set(3, "amol");
		
		System.out.println("al="+al);
		//al.clear();
		//System.out.println("al="+al);
		
		

	}

}
