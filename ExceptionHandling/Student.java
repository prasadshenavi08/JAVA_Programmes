
public class Student {
	int rollno;
	String name;
	int marks;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		if(marks<0 || marks>100) {
			this.marks = 0;
			throw new InvalidMarksException();
			
		}else {
			this.marks = marks;			
		}
	}
	
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		if(marks<0 || marks>100) {
			this.marks = 0;
			throw new InvalidMarksException();
			
		}else {
			this.marks = marks;			
		}
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
