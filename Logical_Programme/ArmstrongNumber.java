import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n, r, sum = 0, temp;

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = scanner.nextInt();
        temp = n;

        // Check for Armstrong number
        while (n > 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }

        if (temp == sum) {
            System.out.println("It is Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
