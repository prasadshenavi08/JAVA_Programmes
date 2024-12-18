import java.util.Scanner;
class EvenOddDemo{
	/*	void acceptno(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Any Number");
		int no = sc.nextInt();
		Evenodd(no);
	}
	*/
	void Evenodd(int num){
		if(num %2==0){
			System.out.println("No is Even");
		}else{
			System.out.println("No is Odd");
		}
	}

	public static void main(String [] args){
		EvenOddDemo e1 = new EvenOddDemo();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Any Number");
		int no = sc.nextInt();
		e1.Evenodd(no);
	}
}