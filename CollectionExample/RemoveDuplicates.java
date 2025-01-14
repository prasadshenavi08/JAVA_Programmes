import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int [] a = {26,56,11,161,26,56};
		removeduplicates(a);
	}

	public static void removeduplicates(int[] a) {
		// TODO Auto-generated method stub
//		List list1 = Arrays.asList(a);
		LinkedHashSet<Integer> s1 = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			s1.add(a[i]);	
		}
		System.out.println(s1);
	}
}
