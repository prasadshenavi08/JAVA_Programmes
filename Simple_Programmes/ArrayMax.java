import java.util.Scanner;
class ArrayMax{
	public static void main(String [] args){
		int marks[] = new int[10];
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(i=0;i<10;i++){
			marks[i] = sc.nextInt();
		}
		int max = marks[0];
		for(i=1;i<10;i++){
			if(marks[i]>max){
				max=marks[i];
			}
		}
		System.out.println("Highest value is = "+max);
	}
}