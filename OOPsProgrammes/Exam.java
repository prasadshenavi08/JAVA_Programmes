
public class Exam extends Students{
	int marks1;
	int marks2;
	
	public void setMarks(int marks1,int marks2) {
		this.marks1 = marks1;
		this.marks2 = marks2;
	}
	
	public void showMarks() {
		System.out.println("Student Marks 1 : "+this.marks1);
		System.out.println("Student Marks 2 : "+this.marks2);
	}
}
