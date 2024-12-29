
//Static variable is field which common for all Object
//Static field will created only single copy for a entire class.
public class SampleStatic {
	int no;
	static int amt;
	public static void show() {
		System.out.println("Inside Static method");
		//System.out.println(no);  		//compile time error
		System.out.println(amt);		//static method can access only static field
										//static filed  created once for entire class
										//To call static method thier is no need create obj of that class
	}
	public void greet() {
		System.out.println("Good Morning");
	}
	
	//static block
	static{
		amt = 100;
		System.out.println("I am static block");
	}
	//non static block
	{
		System.out.println("I am non static block");
	}
	
	public static void main(String[] args) {
		SampleStatic.show();
		SampleStatic s1 = new SampleStatic();
		s1.greet();
	}
}
