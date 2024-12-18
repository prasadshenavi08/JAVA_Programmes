//Array = array is group of homogenius/same datatypes element
//array is static varible /means fix size then not change
//Syntax = datatypes [] arrayname = new datatype [size];
//Syntax = datatypes arrayname [] = new datatype [size];
//array is static collection of homogeneous element;
//array element are always stored in contigus memory location.
//index number always begin with zero


import java.util.Scanner;
class Array{
	public static void main(String [] args){
		int [] marks = new int[5];
		int  i;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Marks of 5 sub");
		for(i=0;i<5;i++){
			marks[i] = sc.nextInt();
		}
		int total =0;
		int avg;
		for(i=0;i<5;i++){
			System.out.println("Marks of subject"+(i+1)+":"+marks[i]);
			total  = total+marks[i];
			 avg = total/5;
		}
		System.out.println("Total Marks :" + total);
		System.out.println("avg Marks :" + avg);
	}
}