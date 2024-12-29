
public class Student {
	String name;
	int age;
	
	public Student() {
		this("prasad", 22);
	}
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return "Name = "+name+", age = "+age;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
	}
}
