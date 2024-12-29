
public class MethodOverLoadArea {

	public void area(float radius) {
		System.out.println("Area of Circle :"+(3.14*radius*radius));
	}
	
	public void area(int len, int bre) {
		System.out.println("Area of rectangle : "+(len*bre));
	}
	
	public static void main(String[] args) {
		MethodOverLoadArea m1 =new MethodOverLoadArea();
		m1.area(5.6f);
		m1.area(15, 16);
	}
}
