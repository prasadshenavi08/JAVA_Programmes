
public class Employee {
	int empid;
	String name;
	float salary;
	
	public void setData(int empid,String name, float salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	public void showData() {
		System.out.println("Employee ID : "+ this.empid);
		System.out.println("Employee Name : "+ this.name);
		System.out.println("Employee Salary : "+ this.salary);
	}
}
