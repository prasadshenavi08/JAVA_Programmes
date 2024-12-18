import java.util.Scanner;
class ThreeDigit{
	public static void main(String [] args){
		int no;
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		no =sc.nextInt();
		if (no>=100 && no<=999){
			System.out.println("Three digit number");
		}else{
			System.out.println("NOT Three digit number");
		}
	}

}