
public class SumArray {
	public static void main(String[] args) {
		int a[]= {16,1531,86413,181,1,56,15};
		int sum=0;
		
		for(int i=1;i<a.length;i++) {
			sum +=a[i];
		}
		System.out.println("Sum of NUmber is = "+sum);
	}
	
}
