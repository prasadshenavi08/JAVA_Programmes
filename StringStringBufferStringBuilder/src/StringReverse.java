import java.util.Scanner;

public class StringReverse {
    public static String reverse(String s1) {
        int len = s1.length();
        String rev = "";
        for (int i = len - 1; i >= 0; i--) { // Fix: Loop runs until i >= 0
            rev = rev + s1.charAt(i);
        }
        return rev; // Fix: Return the reversed string
    }

    public static void main(String[] args) {
        String s1;
        System.out.println("Enter Any String");
        Scanner sc = new Scanner(System.in);
        s1 = sc.next(); // Reads a single word (not the entire line)
        System.out.println("Reversed String: " + reverse(s1)); // Fix: Correctly display the returned reversed string
    }
}
