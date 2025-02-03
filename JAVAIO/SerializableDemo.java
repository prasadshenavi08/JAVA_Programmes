package javaIO;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	public static void main(String[] args) throws IOException {
		Employee e1 = new Employee(1,"prasad","prasad1444","1234",56);
		FileOutputStream f1 =new FileOutputStream("employee.ser");
		ObjectOutputStream oos = new ObjectOutputStream(f1);
		oos.writeObject(e1);
		System.out.println("Employee Object is Serialized");
	}
}
