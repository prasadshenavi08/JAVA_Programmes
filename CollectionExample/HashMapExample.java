import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Access values
        System.out.println("Bob's age: " + map.get("Bob"));

        // Iterate over keys and values
        for (String key :map.keySet()) {
        	System.out.println(key + ": " + map.get(key));
        }

        // Remove a key-value pair
        map.remove("Alice");
        System.out.println("After removal: " + map);
    }
}
