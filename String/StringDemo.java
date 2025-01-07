
public class StringDemo {
	public static void main(String[] args) {
		String s1 =new String ("Hello");
		String s2 = "abcd";
		
		char [] a = {'a','b','c','d'};
		String s3 = new String(a);
		System.out.println(s3.length());
		System.out.println(s3.charAt(2));
		System.out.println(s3.compareTo(s2));
		System.out.println(s3.codePointAt(2));//return accie value
		System.out.println(s3.toCharArray());
	}
	
}
