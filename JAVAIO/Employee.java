package javaIO;

import java.io.Serializable;

//to provide the special permission for this class to serialize 
//we must implements serilizable.
//NonSerializable exception.
public class Employee implements Serializable{
		int roll;
		String name;
		String username;
		//transient filed will not take part in serialization. 
		transient String Password;
		float marks;
		
		public Employee(int roll, String name, String username, String password, float marks) {
			super();
			this.roll = roll;
			this.name = name;
			this.username = username;
			Password = password;
			this.marks = marks;
		}
		public int getRoll() {
			return roll;
		}
		public void setRoll(int roll) {
			this.roll = roll;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public float getMarks() {
			return marks;
		}
		public void setMarks(float marks) {
			this.marks = marks;
		}
		@Override
		public String toString() {
			return "Employee [roll=" + roll + ", name=" + name + ", username=" + username + ", Password=" + Password
					+ ", marks=" + marks + "]";
		}
		
}
