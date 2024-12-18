import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        int no;
        System.out.println("Enter your Number");

        // Instantiate the Scanner with System.in
        Scanner sc = new Scanner(System.in); 

        // Use nextInt() to read integer input
        no = sc.nextInt(); 

        // Check if the number is even or odd
        if(no % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        // Close the scanner
        sc.close();
    }
}
