import java.util.Scanner;

public class CapitalLettersASCIISum {
    public static void main(String[] args) {
	String s1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s1 = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i); 
            if (ch >= 'A' && ch <= 'Z') { 
                sum += (int) ch;            
		}
        }
        System.out.println("Sum of ASCII values of capital letters: " + sum);
    }
}
