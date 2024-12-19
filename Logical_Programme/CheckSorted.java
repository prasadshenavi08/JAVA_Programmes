
public class CheckSorted {
		public static void main(String[] args) {
			int a []= {1,2,3,4,5,6};
			
			boolean flag= true;
			
			for(int i=1;i<a.length;i++) {
				if(a[i]<a[i-1]) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println("The array is sorted in ascending order.");
			}else {
				System.out.println("The array is Not sorted in ascending order.");
			}
		}
}
