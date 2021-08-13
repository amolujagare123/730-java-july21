package CollectionsDemos.SetDemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) {

		LinkedHashSet hs = new LinkedHashSet();
		
		hs.add("abc");
		hs.add("pqr");
		hs.add("xyz");
		hs.add("lmn");
		hs.add(12);
		hs.add('l');
		System.out.println(hs.add("lmn"));
		
		System.out.println(hs);

	}

}
