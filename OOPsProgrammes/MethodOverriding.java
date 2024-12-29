
class parent{
	public void show(int a) {
		System.out.println(a);
	}
}

class child extends parent{
	public void show(int a) {
		System.out.println(a);
	}
}


public class MethodOverriding {
	public static void main(String[] args) {
		parent s1 = new parent();
		s1.show(15);
		
		child c1 = new child();
		c1.show(41);
	}
}
