import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        s1 = sc.nextLine();
        StringBuffer s2 = new StringBuffer(s1); // Correct class name
        s2.reverse(); // Reverse s2, not s1
        if (s1.equals(s2.toString())) { // Compare original with reversed
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
