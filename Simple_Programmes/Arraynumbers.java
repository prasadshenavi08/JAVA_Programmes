//write java programm to acept number and store them inside the array and find total number of element which are divisible by 3 and 5.

import java.util.Scanner;
class Arraynumbers{
	public static void main(String [] args){
		System.out.println("Enter any 10 Number");
		Scanner sc = new Scanner(System.in);
			int [] no = new int[10];
			int count = 0;
			
			
			for(int i=0;i<10;i++){
				no[i]=sc.nextInt();
			
				if(no[i]%3==0 && no[i]%5==0){
					count++;
				}
			}
			System.out.println("The Total no of element divisible by 3 and 5="+count);
		
	}
	
}