package CollectionsDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf2 {

	public static void main(String[] args) {

			
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(12);
		al.add(32);
		al.add(15);
		al.add(42);
		al.add(19);
		al.add(72);
		
		System.out.println(al);
		
		// remove all odd elements
		
		al.removeIf(a -> (a%2 !=0));
		System.out.println(al);
		
	}

}
