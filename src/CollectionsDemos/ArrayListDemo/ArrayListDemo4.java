package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {

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
		
		System.out.println("al2="+al2);
		
		al2.addAll(al);
		
		System.out.println("al2="+al2);
		
		
		

	}

}
