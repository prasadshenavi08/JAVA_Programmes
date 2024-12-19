
public class RemoveDuplicates {
	public static int removeDuplicates(int[] arr) {
		int uniqueCount = 1; // Start from the first element

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) { // Check if current element is different from the previous one
				arr[uniqueCount] = arr[i];
				uniqueCount++;
			}
		}

		return uniqueCount;
	}

	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
		int newLength = removeDuplicates(arr);

		System.out.print("Array after removing duplicates: ");
		for (int i = 0; i < newLength; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
