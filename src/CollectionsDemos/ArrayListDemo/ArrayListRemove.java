package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemove {

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
		
		System.out.println("al="+al);
			
		System.out.println(al.remove(3));
		System.out.println("al="+al);
		
		
		
		

	}

}
