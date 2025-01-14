import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
    	PriorityQueue<Integer>pq = new PriorityQueue<>();

        // Add elements
    	pq.add(10);
    	pq.add(5);
    	pq.add(20);
    	pq.add(1);

        // Access and remove
    	System.out.println("PriorityQueue: " + pq);
    	System.out.println("Peek: " + pq.peek()); // Smallest element
    	System.out.println("Poll: " + pq.poll()); // Remove and return smallest
    	System.out.println("After poll: " + pq);
    }
}
