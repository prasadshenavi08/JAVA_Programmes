import java.util.Scanner;

class ArrayConversion {

    // Method returns an integer, not void
    int conversion(int a[]) {
        int no = 0;
        for (int i = 0; i < a.length; i++) {
            no = no * 10 + a[i];
        }
        return no;  // Return the integer formed from the array
    }

    public static void main(String[] args) {
        int a[] = new int[10];  // Array size can be dynamic if needed
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();  // Always good practice to close the scanner
        
        ArrayConversion a1 = new ArrayConversion();		//obj
        int x = a1.conversion(a);  // Store returned integer
        System.out.println("Number is = " + x);  // Print the final result
    }
}
