import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        // Add elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2); // Duplicate, won't be added

        // Check and iterate
        System.out.println("Numbers: " + numbers);
        System.out.println("Contains 2: " + numbers.contains(2));

        for (int num : numbers) {
        	System.out.println(num);
        }
    }
}
