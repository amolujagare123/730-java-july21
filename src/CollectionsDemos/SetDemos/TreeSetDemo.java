package CollectionsDemos.SetDemos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet hs = new TreeSet();
		
		hs.add("abc");
		hs.add("pqr");
		hs.add("xyz");
		hs.add("amol");
		hs.add("hari");
		hs.add("ramya");
		hs.add("ravi");
		
		System.out.println(hs.add("lmn"));
		
		System.out.println(hs);

	}

}
