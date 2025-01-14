import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> cities = new Vector<>();

        // Add elements
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");

        // Access elements
        System.out.println("Cities: " + cities);
        System.out.println("First city: " + cities.firstElement());
        System.out.println("Last city: " + cities.lastElement());

        // Iterate
        for (String city : cities) {
        	System.out.println(city);
        }
    }
}
