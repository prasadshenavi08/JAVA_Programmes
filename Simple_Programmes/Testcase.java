import java.util.Scanner;
class Testcase{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		
		int no1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int no2 = sc.nextInt();
		
		if(no1 >=100 && no1<=999){
			System.out.println("Welcome");
		} else if(no2 >=10 && no2<=99){
				System.out.println("Good Bye");
			}else{
				System.out.println("Hello");
			}
	}	
}