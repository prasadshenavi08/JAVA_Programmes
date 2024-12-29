
public class Student1 {
		int rollno;
		String name;
		
		public void setData(int rollno, String name) {
			this.rollno = rollno;
			this.name = name;
		}
		
		public void showdata() {
			System.out.println("Student rollno : "+this.rollno);
			System.out.println("Student Name : "+this.name);
		}
}
