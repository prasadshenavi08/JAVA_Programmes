import java.util.Scanner;

class PositiveNegative {
    public static void main(String[] args) {
        int no;
        System.out.println("Enter your Number");

        // Instantiate the Scanner with System.in
        Scanner sc = new Scanner(System.in); 

        // Use nextInt() to read integer input
        no = sc.nextInt(); 

        // Check if the number is Positive or Negative
        if(no > 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }

        // Close the scanner
        sc.close();
    }
}
