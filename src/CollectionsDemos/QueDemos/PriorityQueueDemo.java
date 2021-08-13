package CollectionsDemos.QueDemos;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();

		pq.offer(78);
		pq.offer(18);
		pq.offer(71);
		pq.offer(48);
		pq.offer(22);
		//pq.offer('h');
		
		System.out.println(pq);
		
		// 18 22 48 71 78 --> ascending order
			
		// some os does not support priority queue
		
		System.out.println(pq.poll()); // 18
		System.out.println(pq.poll()); // 22
		System.out.println(pq.poll()); // 48
		System.out.println(pq.poll()); // 71
		System.out.println(pq.poll()); // 78

	}

}
