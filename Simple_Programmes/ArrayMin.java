import java.util.Scanner;
class ArrayMin{
	void acceptArray(){
		//method
		int marks[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(int i=0;i<10;i++){
			marks[i] = sc.nextInt();
		}
			findMinmarks(marks);
	}

	void findMinmarks(int[]  marks){
		int min = marks[0];
		for(int i=1;i<10;i++){
			if(marks[i]<min){
				min=marks[i];
			}
		}
		System.out.println("Minimum value is = "+min);

	}
	public static void main(String [] args){
		ArrayMin a1 = new ArrayMin();  //obj
		a1.acceptArray();
	}
}
