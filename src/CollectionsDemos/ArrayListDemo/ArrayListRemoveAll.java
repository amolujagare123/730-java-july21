package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveAll {

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
			
		
		ArrayList<String> al2 = new ArrayList<>();

		al2.add("Anjumol");
		al2.add("Dhanajay");
		al2.add("hari");
		al2.add("amol");
		al2.add("vaishali");
		al2.add("Tejashree");
			
		
		System.out.println("al2="+al2);
		
		al2.removeAll(al);
		
		System.out.println("al2="+al2);
			
		
		
		

	}

}
