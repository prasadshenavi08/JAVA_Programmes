import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FoEachDemo {
	public static void main(String[] args) {
		Integer [] a1 = {26,85,5,51,51,516};
//		for( Integer n :a1) {
//			System.out.println(n);
//		}
	
		List a2 = Arrays.asList(a1);
		//foreach method
//		Iterator<E> i1 = a2.iterator();
//		while(i1.hasNext()) {
//			System.out.println();
//		}
		a2.forEach(n -> System.out.println(n));
	}
}
