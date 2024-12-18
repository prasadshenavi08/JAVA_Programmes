import java.util.Scanner;

//Menu Driven Program
class WhileDemo1{
	public static void main(String [] args){
		int ch , no;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("1 . Print the sq and cube of given no");
			System.out.println("2 . Print the sq root  of given no");
			System.out.println("3 . Print the reverse of given no");
			System.out.println("3 . Print the no is prime or not");
			System.out.println("4 . Exit");
			ch = sc.nextInt();
			switch(ch){
				case 1:System.out.println("Enter any Number");
						no =sc.nextInt();	
						System.out.println("Sq of number is" +no*no+"Cube of number is"+no*no*no);	
						break;
				case 2 :System.out.println("Enter any Number");
						no= sc.nextInt();
					System.out.println("sq root of number is"+Math.sqrt(no));
						break;
				case 3 :System.out.println("Enter any Number");
						no= sc.nextInt();
						int reversed = 0;
						while (no != 0) {
    						reversed = reversed * 10 + no % 10;
    						no /= 10;
						}
						System.out.println("Reversed number: " + reversed);
				case 4: System.out.println("Enter any Number");
						no = sc.nextInt();
						boolean flag =false;
						while(no >1){
							for(int i=2;i<=no/2;i++){
								if(no%2==0){
									flag =true;
									System.out.println("No is not Prime");
								}else{
									i++;
								}
							}
						}
				case 5: System.out.println("Exit");
						break;
				default: System.out.println("Invalid Option");


			}
		
		}while(ch !=4);
	}
}