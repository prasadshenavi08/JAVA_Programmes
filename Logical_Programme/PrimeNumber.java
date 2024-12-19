import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
    	System.out.println("Enter any Number : ");
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true; // Initialize isPrime as true
	        
        // Check divisors from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) { // If n is divisible by i
                isPrime = false; // It's not a prime number
                break; // Exit the loop early
            }
        }
	        
        // Output the result
        if( isPrime == false) {
        	
        	System.out.println(" Number is Not prime: ");
        }else {
        	System.out.println("number is prime");
        }
        sc.close();
    }
}
