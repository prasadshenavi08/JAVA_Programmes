//Bubble Sort Program
import java.util.Arrays;

public class AscendingNum {
    public static void accnum(int[] a) {
        int temp;
        // Outer loop for number of passes
        for (int i = 0; i < a.length - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) { // Swap if elements are in wrong order
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Ascending Order: " + Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 454, 5, 615};

        System.out.println("Original Array: " + Arrays.toString(a));
        accnum(a);
    }
}
