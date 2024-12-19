import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        
        int original = n; // Store the original number
        int reversed = 0; // Variable to store the reversed number
        
        // Reverse the digits of the number
        while (n > 0) {
            int digit = n % 10;      // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to reversed
            n /= 10;                // Remove the last digit
        }
        
        // Check if the original number is equal to the reversed number
        if (original == reversed) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is Not Palindrome");
        }
        
        sc.close();
    }
}
