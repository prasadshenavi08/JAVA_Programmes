import java.util.Scanner;
import java.util.Arrays;
class NumberTOArray{
	public void ConvertToArray(int no){
		int temp =no;
		int digits=0;
		int d;
		while(no>0){
			d=no%10;
			digits++;
			no = no/10;
		}
		System.out.println("Total digits = "+digits);
		no=temp;
		int[] a = new int[digits];
		while(no>0){
			d=no%10;
			a[digits-1]=d;
			no=no/10;
			digits--;
		}
			System.out.println(Arrays.toString(a));

	}


public static void main(String[] args){
		NumberTOArray a1 = new NumberTOArray();
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		no =sc.nextInt();
		a1.ConvertToArray(no);
	}
}