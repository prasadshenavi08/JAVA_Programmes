import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        // Input the digit to search for
        System.out.println("Enter the digit to search for:");
        int target = sc.nextInt();
        
        boolean found = false; // Flag to track if the digit is found
        
        // Process the digits of the number
        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            if (digit == target) { // Check if it matches the target
                found = true;
                break; // Exit the loop as the digit is found
            }
            n /= 10; // Remove the last digit
        }
        
        // Output the result
        if (found) {
            System.out.println("Digit " + target + " is found in the number.");
        } else {
            System.out.println("Digit " + target + " is not found in the number.");
        }
        
        sc.close();
    }
}
