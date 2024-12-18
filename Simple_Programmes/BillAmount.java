import java.util.Scanner;
class BillAmount{
	public static void main(String [] args){
		int qty;
		int prize;
		int bill_amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Quantity");
		qty=sc.nextInt();
		System.out.println("Enter Prize");
		prize=sc.nextInt();
		bill_amount= qty*prize;
		System.out.println(bill_amount);
	}
}