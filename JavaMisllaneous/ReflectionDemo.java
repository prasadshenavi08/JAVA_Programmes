import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        // Create an instance of Employee
       // Employee e1 = new Employee(1, "John Doe", 50000.0f);
        //Class<?> c1 = e1.getClass();

    	Class<?> c1 = Class.forName("Employee");
    	
    	//without using new keyword create obj
    	Constructor<?> cn1 = c1.getConstructor();
    	Employee e1 =(Employee) cn1.newInstance();
    	
        // Display all constructors in Employee class
        System.out.println("All Constructors in Employee Class: ");
        Constructor<?>[] constructors = c1.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        // Display all methods in Employee class
        Method[] methods = c1.getMethods();
        System.out.println("\nAll Methods in Employee Class: ");
        for (Method method : methods) {
            System.out.println(method);
        }
        
       
    }
}
