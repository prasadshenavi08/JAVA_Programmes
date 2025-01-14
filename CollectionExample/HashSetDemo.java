import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	//built in interface  duplicAte not allow  inorder
	public static void main(String[] args) {
		HashSet s1 = new HashSet();
		s1.add(15);
		s1.add(154);
		s1.add(1515);
		s1.add(155);
		s1.add(215);
		
		System.out.println(s1);
		Iterator i1 = s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}
