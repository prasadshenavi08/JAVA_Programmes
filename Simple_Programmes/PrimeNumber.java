//prime number is number is divisible by 1 and itself
/*
import java.util.Scanner;
class PrimeNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int no = sc.nextInt();
		boolean flag =false;
		//for(int i=1;i<no;i++){
			for(int i=1;i<Math.sqrt(no);i++){
			if(no%i==0){
				flag = true;
				break;
			}
		}

	if(flag=true){
			System.out.println("No is not prime");
			}
			else{
				System.out.println("No is  prime");
		}
	}
}
*/

import java.util.Scanner;
class PrimeNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int no = sc.nextInt();
		for(int i=1;i<no;i++){
		if(no%i==0){
				System.out.println("No is not prime");
			}
		else{
				System.out.println("No is  prime");

		}
	}
}