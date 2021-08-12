package CollectionsDemos.StackDemos;

import java.util.Stack;

public class StackDemo2 {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();
	
		s.push(12); // 6
		s.push(32); // 5
		s.push(11); // 4
		s.push(42); // 3
		s.push(14); // 2
		s.push(83); // 1
		
		System.out.println(s);
		
		System.out.println(s.search(31));
		
		// if element does not exists it returns -1
		// if element  exists it returns positive number
		// this number is offset
		System.out.println(s.search(12));

			
			
	}

}
