package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class IterateQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(1);
		priorityQueue.add(2);
		priorityQueue.offer(3);
		priorityQueue.offer(4);

		// Get an Iterator for the Set
		Iterator<Integer> iterator = priorityQueue.iterator();

		// Loop using hasNext() and next()
		while (iterator.hasNext()) {
			Integer number = iterator.next();
			System.out.println(number);
		}
	}

}
