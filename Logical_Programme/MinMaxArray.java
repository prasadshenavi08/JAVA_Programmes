
public class MinMaxArray {
	public static void main(String[] args) {
		int a[] = {62,265,21,151,3651,13};
		
		int max = a[0];
		int min = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("MAX Number is = "+max);
		System.out.println("MIN number is = "+min);
	}
}
