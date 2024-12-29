
public class HashExample {
	public static void main(String[] args) {
		HashExample h1 = new HashExample();
		System.out.println(h1);
		System.out.println(h1.hashCode());
		
		HashExample h2 = new HashExample();
		System.out.println(h2);
		System.out.println(h2.hashCode());
		
		System.out.println(h2==h1);
		HashExample h3 = h2;
		System.out.println(h2==h3);	//it check to references or hashcode
		
	}
}
