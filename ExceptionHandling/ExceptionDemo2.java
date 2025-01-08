public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            int k = args.length; // Number of command-line arguments
            int[] a = {15, 15, 1, 5}; // Array with 4 elements

            // Example 1: Division by k (may throw ArithmeticException)
            System.out.println("Array length divided by number of arguments: " + (a.length / k));

            // Example 2: Accessing an invalid array index (may throw ArrayIndexOutOfBoundsException)
            System.out.println("Accessing element at index 5: " + a[5]);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
            System.out.println("Please provide at least one command-line argument.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
            System.out.println("Valid indices are from 0 to " + (3)); // Array has 4 elements
        } catch (Exception e) { // General exception for other unknown errors
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        finally {
        	System.out.println("After Try");
        }
    }
}
