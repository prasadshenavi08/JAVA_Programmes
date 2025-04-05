import java.util.Scanner;
public class PalindromeNumber {
	    public static void main(String[] args) {
	        int no;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a Number:");
	        no = sc.nextInt();
	        String s1 = String.valueOf(no);
	        StringBuffer s2 = new StringBuffer(s1); // Correct class name
	        s2.reverse(); // Reverse s2, not s1
	        System.out.println(s2);
	        if (s1.equals(s2.toString())) { // Compare original with reversed
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not a palindrome");
	       }
	 }
}
