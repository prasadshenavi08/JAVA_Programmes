
public class ArrayEvenOddCount {
	public static void evenOddCount(int [] a) {
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evenCount++;
			}else if(a[i]%2==1) {
				oddCount++;
			}
		}

		System.out.println(evenCount);
		System.out.println(oddCount);

	}

	public static void main(String[] args) {
		int [] a = {35,65,76,34,7,8,37,45};
		evenOddCount(a);
	}
}
