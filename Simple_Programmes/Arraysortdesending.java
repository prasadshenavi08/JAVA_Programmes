//sorting = sorting the array desc or desc order

//array = [15,5,54,42,165,465,486,45,48];

//Simple Exchange sort

import java.util.Scanner;

class Arraysortdesending {
    void sort(int a[]){
        int temp;
        for(int i = 0; i < 10; i++){
            for(int j = i+1; j < 10; j++){
                if(a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    void print(int a[]){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }    
    public static void main(String[] args) {
        int a [] = new int[10];  // Array size can be dynamic if needed
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
                
	Arraysortdesending a1 = new Arraysortdesending();
        a1.sort(a);
        System.out.println("Sorted array in ascending order:");
        a1.print(a);     
    }
}
