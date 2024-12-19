import java.util.Scanner;
public class Arraysortaecendingorder {
	public static void sort(int []a) {
		int temp;
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	public static void print(int []a) {
		for(int i=0;i<5;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 5 Number =");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
			
		}
		sort(a);
		System.out.println("Acending Order = ");
		print(a);
		sc.close();
	}
}
