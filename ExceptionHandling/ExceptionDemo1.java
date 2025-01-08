import java.util.Scanner;

public class ExceptionDemo1 {
    public void show() {
        int a, b;
        System.out.println("Enter any two numbers:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        try {
            System.out.println("Division: " + (a / b));
        } catch (ArithmeticException e) {
            // System.out.println(e);
            // e.printStackTrace();
            //System.out.println(e.getMessage());
            System.out.println("You are trying to divide by zero");
        }
        System.out.println("Multiplication: " + (a * b));
        sc.close();
    }

    public static void main(String[] args) {
        ExceptionDemo1 d1 = new ExceptionDemo1(); // Corrected class name
        d1.show();
    }
}
