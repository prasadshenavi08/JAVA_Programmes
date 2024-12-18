import java.util.Scanner;
class Perimeter{
	public static void main(String [] args){
		int length;
		int breadth;
		int peri;
		System.out.println("Enter Length");
		Scanner sc = new Scanner(System.in);
		length = sc.nextInt();
		System.out.println("Enter Breadth");
		breadth =sc.nextInt();
		peri = 2*length*breadth;
		System.out.println(peri);
	}
}