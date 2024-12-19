import java.util.Scanner;

public class Arraysortdecendingorder {
	
	public static void sort(int [] a) {
		int temp;
		for(int i=0;i<10;i++) {
			for(int j=i;j<10;j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	 
	public static void print(int [] a) {
		for(int i=0;i<10;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [] a= new int [10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any 10 Numbers");
		for(int i=0;i<10;i++) {
			a[i]=sc.nextInt();
		}
		sort(a);
		System.out.println("Sorted Array=");
		print(a);
		sc.close();
	}
}
