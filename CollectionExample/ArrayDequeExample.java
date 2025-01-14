import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
    	ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements
    	deque.addFirst("First");
    	deque.addLast("Last");

        // Access elements
    	System.out.println("First: " + deque.getFirst());
    	System.out.println("Last: " + deque.getLast());

        // Remove elements
    	deque.removeFirst();
    	deque.removeLast();

    	System.out.println("Deque after removal: " + deque);
    }
}
