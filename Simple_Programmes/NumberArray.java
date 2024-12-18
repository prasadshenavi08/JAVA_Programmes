import java.util.Scanner;

class NumberArray {
    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 0) { 
                sum += a[i];   
            }
        }
	return sum;
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        int result = sum(a);
        System.out.println("Sum of numbers divisible by 5: " + result);
    }
}
