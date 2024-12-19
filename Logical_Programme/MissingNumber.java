
public class MissingNumber {

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 5, 6};
	        System.out.println("Missing number: " + findMissingNumber(arr));
	    }

	    public static int findMissingNumber(int[] arr) {
	        int n = arr.length + 1; // The length of the complete array including the missing number
	        int totalSum = n * (n + 1) / 2; // Sum of the first n natural numbers
	        int arraySum = 0;

	        // Calculate the sum of the elements in the array
	        for (int num : arr) {
	            arraySum += num;
	        }

	        // The missing number is the difference between the expected total and the actual sum
	        return totalSum - arraySum;
	    }
	}
