package CollectionsDemos.VectorDemos;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();
		
		System.out.println("Size="+v.size()); // 0
		System.out.println("Capacity="+v.capacity()); //10
		
		v.add("Anjumol");//0
		v.add("Dhanajay");//1
		v.add("hari");//2
		v.add("Keerthana");//3
		v.add("Monica");
		v.add("Nadim");
		v.add("Nikhil");
		v.add("Monica");
		v.add("Nadim");
		v.add("Nikhil");
		v.add("Nikhil");
		
		System.out.println("Size="+v.size()); // 10
		System.out.println("Capacity="+v.capacity()); // 10
		
		System.out.println(v);
		
		System.out.println("\nPrinting using Iterator interface");
		
		Iterator itr = v.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("\nPrinting using Enumeration interface");
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}

}
