package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf {

	public static void main(String[] args) {

			
		ArrayList<String> al = new ArrayList<>();
		

		al.add("Anjumol");
		al.add("Dhanajay");
		al.add("hari"); //-
		al.add("Keerthana");//
		al.add("Monica");//
		al.add("Nadim");//-
		al.add("Nikhil");
		al.add("Nikhil");
		
		
		System.out.println("al="+al);
			
	 // removeIf -- 1. elements ends with a
	//2. remove elements whose length is less or equal to 5	
		
		//al.removeIf(str -> str.endsWith("a"));
		//System.out.println("al="+al);
		
		al.removeIf(str -> (str.length()<=5));
		
		System.out.println("al="+al);

	}

}
