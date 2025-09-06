package queue;

import java.util.PriorityQueue;

public class LoopQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		priorityQueue.add(1);
		priorityQueue.add(2);
		priorityQueue.offer(3);
		priorityQueue.offer(4);

		// Use a for-each loop to iterate over the Set
		for (int ele : priorityQueue) {
			System.out.println(ele);
		}
	}

}
