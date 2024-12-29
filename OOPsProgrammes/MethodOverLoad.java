
public class MethodOverLoad {
	public void show() {
		System.out.println("hello");
	}
	//method overloading
	public void show(int no) {
		System.out.println(no);
		}
	
	public void show(String msg) {
		System.out.println(msg);
	}
	
	public void show(String msg,int no) {
		for(int i=1;i<=no;i++) {
			System.out.println(msg);
		}
	}
	
	public static void main(String[] args) {
		MethodOverLoad m1 = new MethodOverLoad();
		//when we define same method name but different
		//number of parameter or different types of
		//parameters,it is called as method overloading
		m1.show();
		m1.show(5);
		m1.show("prasad",5);
	}
}
