import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] a = {262, 656, 62, 65, 156, 5};
        
        // Sort the array in ascending order
        Arrays.sort(a);
        System.out.println("Sorted Array: " + Arrays.toString(a));
        
        // Find the two largest numbers
        int largest = a[a.length - 1]; // Last element after sorting
        int secondLargest = a[a.length - 2]; // Second last element after sorting
        
        // Calculate the sum of the two largest numbers
        int result = largest + secondLargest;
        System.out.println("Sum of the two largest numbers: " + result);
    }
}
