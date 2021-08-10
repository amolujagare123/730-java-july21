package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {

			
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Anjumol"); // 0
		al.add("Dhanajay"); // 1
		al.add("hari"); // 2
		al.add("Keerthana"); // 3
		al.add("Monica"); //4
		al.add("Nadim");//5
		al.add("Nikhil"); //6 
		al.add("Nikhil");//7
		
		System.out.println(al);
		
		System.out.println(al.size());
		System.out.println(al.get(6));
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		// ------ for each -----------
		System.out.println("Printing using for each loop");
		for(String str : al)
			System.out.println(str);
		
		
	}

}
