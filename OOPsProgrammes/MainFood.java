
public class MainFood {
	public static void test(AbFood f1){
		f1.preapre();
	}
	
	public static void main(String[] args) {
		Maggi m1 = new Maggi();
		Sandwich s1 = new Sandwich();
		test(m1);
		test(s1);
		AbFood.sandwich1();
	}
}
