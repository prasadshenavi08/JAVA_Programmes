import java.util.Scanner;
class Calculator{
	public static void main(String [] args){
		int no1,no2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 Number");
		no1 = sc.nextInt();
		System.out.println("Enter 2 Number");
		no2 = sc.nextInt();
		System.out.println("Please select option");
		System.out.println("1. Addtion 2. Substration 3.Division 4.Multiplication 5.Modules");
		int opt = sc.nextInt();
		switch(opt){
			case 1: System.out.println("Addtion = "+(no1+no2));
			break;
			case 2: System.out.println("Substration = "+(no1-no2));
			break;
			case 3: System.out.println("Division = "+(no1/no2));
			break;
			case 4: System.out.println("Multiplication = "+(no1*no2));
			break;
			case 5: System.out.println("Modules = "+(no1%no2));
			break;
			default:System.out.println("Invalid Option");
		}

	}
}


/*
import java.util.Scanner;
class Calculator{
    public static void main(String[] args){
        int no1, no2;
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.println("Enter 1st Number");
        no1 = sc.nextInt();
        System.out.println("Enter 2nd Number");
        no2 = sc.nextInt();

        // Menu for options
        System.out.println("Please select an option");
        System.out.println("1. Addition  2. Subtraction  3. Division  4. Multiplication  5. Modulus");
        int opt = sc.nextInt();

        // Perform operations based on user's choice
        switch(opt){
            case 1:
                System.out.println("Addition = " + (no1 + no2));
                break;
            case 2:
                System.out.println("Subtraction = " + (no1 - no2));
                break;
            case 3:
                if (no2 != 0) {
                    System.out.println("Division = " + (no1 / no2));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;
            case 4:
                System.out.println("Multiplication = " + (no1 * no2));
                break;
            case 5:
                if (no2 != 0) {
                    System.out.println("Modulus = " + (no1 % no2));
                } else {
                    System.out.println("Modulus by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid Option");
        }

        // Close scanner to avoid resource leaks
        sc.close();
    }
}

*/