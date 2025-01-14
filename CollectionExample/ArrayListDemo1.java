import java.util.*;
public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(12);
		a1.add(25.23);
		a1.add("Hello");
		a1.add(true);
		a1.add(3,15);
		
		System.out.println(a1);
		a1.remove("Hello");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
	}
}
