import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Elephant"); // Add at the beginning
        animals.addLast("Horse");    // Add at the end

        // Access elements
        System.out.println("First animal: " + animals.getFirst());
        System.out.println("Last animal: " + animals.getLast());

        // Iterate
        System.out.println("Animals: " + animals);
        for (String animal : animals) {
        	System.out.println(animal);
        }
    }
}
