package CollectionsDemos.SetDemos;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		
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
