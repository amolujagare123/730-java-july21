package CollectionsDemos.QueDemos;

import java.util.ArrayDeque;

public class DQueueDemo {
	
	
	public static void main(String[] args)
	{
		
		ArrayDeque adq = new ArrayDeque();
		
		adq.offer("amol");
		adq.offer("remya");
		adq.offer("keerthana");
		adq.offer("asha");
		adq.offer("rahul");
		adq.offer('h');
		
		System.out.println(adq);
		
		adq.offerFirst("first");
		adq.offerLast("last");
		
		System.out.println(adq);
		
		adq.pollFirst();
		adq.pollLast();
		System.out.println(adq);
		
		
		
				
	}
	

}
