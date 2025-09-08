package queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.offer(3);
        priorityQueue.offer(4);

        System.out.println("Size: " + priorityQueue.size());

        // get head element
        System.out.println("--------------get head element------------");
        System.out.println(priorityQueue.element()); // if empty NoSuchElementException
        System.out.println(priorityQueue.peek()); // if empty returns null

        // remove element from queue
        System.out.println("--------------remove element from queue------------");
        System.out.println(priorityQueue.remove()); //1
        System.out.println(priorityQueue.poll()); //2

    }

}
