//Linear serach

import java.util.Scanner;
class ArraySearching{
	public void search(int []a, int key){
		Boolean flag = false;
		for(int i=0;i<10;i++){
			if(a[i] ==key){
				System.out.println("The key fount at position"+(i+1));
				flag =true;
				break;
			}
		}
		if(flag ==false){
			System.out.println("Number is not Found");
		}
	}
	public static void main(String [] args){
		int [] a =new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 Numbers");
		int key = sc.nextInt();
		
		ArraySearching a1 = new ArraySearching();
		a1.search(a,key);
	}
}

/*
import java.util.Scanner;

class ArraySearching {
    public void search(int[] a, int key) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {  // using a.length instead of hardcoded 10
            if (a[i] == key) {
                System.out.println("The key found at position " + (i + 1));
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Number is not Found");
        }
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Numbers:");

        // Filling the array with user input
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the key to search:");
        int key = sc.nextInt();

        ArraySearching a1 = new ArraySearching();
        a1.search(a, key);
    }
}
*/