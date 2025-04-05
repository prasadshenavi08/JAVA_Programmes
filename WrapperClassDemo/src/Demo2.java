//when static call then does not create obj
public class Demo2 {
	public static int sum(int n1,int n2) {
		return n1+n2;
	}
	
	public static int sum(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
	
	public static int sum(int ...k) {
		int total = 0;
		for(int i=0;i<k.length;i++) {
			total +=k[i];
		}
		return total;
	}
	public static void main(String[] args) {
		System.out.println(sum(12,15));
		System.out.println(sum(12,15,15));
		System.out.println(sum(12,15,146,49,518,1546));
	}
}
