import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet <Integer> s1 =new LinkedHashSet <Integer>();	//LinkedHashSet = maintain order and do not get duplicate
		s1.add(15);
		s1.add(154);
		s1.add(1515);
		s1.add(15);
		System.out.println(s1);
	}
}
