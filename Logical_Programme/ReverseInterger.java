import java.util.Scanner;

public class ReverseInterger {
	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n>0) {
			int reverse = n%10;
			System.out.print(reverse);
			n /=10;
		}
		sc.close();
	}
}
