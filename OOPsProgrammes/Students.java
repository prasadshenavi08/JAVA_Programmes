
public class Students {
	int rollno;
	String name;
	String email;
	String mobile;
	
	public void setData(int rollno,String name,String email,String mobile) {
		this.rollno = rollno;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	
	public void showData() {
		System.out.println("Studetn Roll NO : "+this.rollno);
		System.out.println("Student Name : "+this.name);
		System.out.println("Student Email : "+ this.email);
		System.out.println("Student Mobile Number : "+this.mobile);
	}
}
