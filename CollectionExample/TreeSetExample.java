import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
    	TreeSet<Integer>sortedNumbers = new TreeSet<>();

        // Add elements
    	sortedNumbers.add(5);
    	sortedNumbers.add(1);
    	sortedNumbers.add(10);
    	sortedNumbers.add(3);
    	sortedNumbers.add(3);

        // Access elements
    	System.out.println("TreeSet: " + sortedNumbers);
    	System.out.println("First: " + sortedNumbers.first());
    	System.out.println("Last: " + sortedNumbers.last());

        // Iterate
        for (int num :sortedNumbers) {
        	System.out.println(num);
        }
    }
}
