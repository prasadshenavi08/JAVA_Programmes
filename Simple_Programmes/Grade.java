import java.util.Scanner;
class Grade{
	public static void main(String [] args){
		int m1,m2,m3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Mrak of 1 sub = ");
		m1= sc.nextInt();
		System.out.println("Mrak of 2 sub = ");
		m2 =sc.nextInt();
		System.out.println("Mrak of 3 sub = ");
		m3= sc.nextInt();
		int total = m1+m2+m3;
		int avg = total/3;
		System.out.println("Total Marks"+total);
		System.out.println("Avg of marks"+avg);
		
		if(avg>=80){
			System.out.println("Distinstion");
		}else{
				if(avg>=70){
					System.out.println("First class");
				}else{
					if(avg>=60){
							System.out.println("Second class");
						}else{
							if(avg>=35){
								System.out.println("Pass");
							}else{
								System.out.println("Fail");
								}
							}
						}
					}
			}
		}