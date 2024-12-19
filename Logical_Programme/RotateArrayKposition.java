import java.util.Arrays;

public class RotateArrayKposition {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int k=3;
		System.out.println(Arrays.toString(a));
		rotate(a,k);
	}
	public static void rotate(int [] a,int k) {
		int [] temp = new int [a.length];
		int i,j;
		for(i=0;k<a.length;i++) {
			temp[i]=a[k];
			k++;
		}
		for(j=i,k=0;j<a.length;j++) {
			temp[j]=a[j];
			k++;
		}
		System.out.println("Array After Rotating");
		System.out.println(Arrays.toString(temp));
	}
}

/*
public class RotateArrayKposition {
public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int k = 3;
    rotate(a, k);
}

public static void rotate(int[] a, int k) {
    int n = a.length;
    k = k % n; // Handle cases where k is greater than n

    // Create a temporary array to hold the rotated values
    int[] temp = new int[n];

    // Copy the last k elements to the beginning of temp
    for (int i = 0; i < k; i++) {
        temp[i] = a[n - k + i];
    }

    // Copy the rest of the elements to temp
    for (int i = k; i < n; i++) {
        temp[i] = a[i - k];
    }

    // Copy the temp array back to the original array
    for (int i = 0; i < n; i++) {
        a[i] = temp[i];
    }

    // Print the rotated array
    System.out.println("Array After Rotating:");
    for (int num : a) {
        System.out.print(num + " ");
    }
}
}
*/