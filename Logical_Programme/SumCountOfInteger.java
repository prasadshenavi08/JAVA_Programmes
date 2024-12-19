import java.util.*;

public class SumCountOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Integer");
        // Read the integer
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        
        // Process the digits
        while (n > 0) {
            int digit = n % 10;  // Extract the last digit
            sum += digit;       // Add to the sum
            count++;            // Increment the count
            n /= 10;            // Remove the last digit
        }
        
        // Print the results
        System.out.println("Sum of digits: " + sum);
        System.out.println("Count of digits: " + count);
        
        sc.close();
    }
}
