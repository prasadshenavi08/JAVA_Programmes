import java.util.Scanner;

class Inputdemo {
    public static void main(String[] args) {
        String name;
        int age;
        float salary;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        name = sc.next();  // Reading the name as a string

        System.out.println("Enter Your Age:");
        age = sc.nextInt();  // Reading the age as an integer

        System.out.println("Enter Your Salary:");
        salary = sc.nextFloat();  // Reading the salary as a float

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
