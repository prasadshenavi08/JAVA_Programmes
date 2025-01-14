import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
    	ArrayList<String> fruits = new ArrayList<>();

        // Add elements
    	fruits.add("Apple");
    	fruits.add("Banana");
    	fruits.add("Cherry");

        // Access and iterate
    	System.out.println("Fruits: " + fruits);
    		for (String fruit : fruits) {
    			System.out.println(fruit);
        }

        // Remove an element
    		fruits.remove("Banana");
    		System.out.println("After removal: " + fruits);
    }
}
