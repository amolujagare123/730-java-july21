package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {

			
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Anjumol");
		al.add("Dhanajay");
		al.add("hari");
		al.add("Keerthana");
		al.add("Monica");
		al.add("Nadim");
		al.add("Nikhil");
		al.add("Nikhil");
		
		
		System.out.println(al);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		
		al2.add(23);
		al2.add(21);
		al2.add(33);
		
		// int / Integer
		
		System.out.println(al2);
		
		for(int i : al2)
			System.out.println(i);
	}

}
