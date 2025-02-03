package javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializationDemo{
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			FileInputStream f1 =new FileInputStream("employee.ser");
			ObjectInputStream ois =new ObjectInputStream(f1);
			Employee e1 = (Employee)ois.readObject();	//downCasting
			System.out.println(e1);
			
			
		}
}
