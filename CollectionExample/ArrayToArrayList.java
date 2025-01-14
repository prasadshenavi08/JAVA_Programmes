import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayToArrayList {
	public static void main(String[] args) {
		Integer [] a1 = {465,4,5485,451,58};
		List list1 = Arrays.asList(a1);
		System.out.println("List : "+list1);
		
		Collections.sort(list1);
		System.out.println("Sorted: "+list1);
	}
}
