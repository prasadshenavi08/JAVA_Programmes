import java.util.Arrays;
import java.util.List;

public class StreamApiDemo {
	public static void main(String[] args) {
		//primitive array
		Integer [] a1 = {10,20,55,30,40};
		List<Integer> a2 = Arrays.asList(a1);
		
//		a2.forEach(n -> System.out.println(n));
//		//stream=sequence of byte
//		a2.stream()
//		.map(n -> n*n).forEach(n -> System.out.println(n));
	
		a2.stream()
			.filter(n -> n%2==0)
			.forEach(n -> System.out.println(n));
	
		a2.stream()
		.sorted()
		.forEach(n -> System.out.println(n));

		
		int sum = a2.stream()
		.reduce(0,(n1,n2) -> n1+n2);
		System.out.println(sum);

	}
}
