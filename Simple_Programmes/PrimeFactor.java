//24 = 2 * 2 * 2 * 3

import java.util.Scanner;
class PrimeFactor{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int no = sc.nextInt();
		int i = 2;
		while(no >1){
			if(no%i ==0){
				System.out.println(i+" ");
				no /=i;
			}
			else{
				i++;
			}
		}
	}	
}