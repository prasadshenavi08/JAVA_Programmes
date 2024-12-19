import java.util.Arrays;

public class Arrayreverse {
	
	public static void arrayReverse(int[] a) {
		int start = 0;
		int end = a.length - 1;
		
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
		System.out.println("Reversed array: " + Arrays.toString(a));
	}

	public static void main(String[] args) {
		int[] a = {35, 65, 76, 34, 7, 8, 37, 45};
		System.out.println("Original array: " + Arrays.toString(a));
		arrayReverse(a);
	}
}
