import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Scanner; 

public class EmployeeCRUD { 
    static int empid; 

    // Static block is always executed automatically before main method gets called 
    static { 
        empid = 101; 
    } 

    { 
        // Instance initializer block 
        System.out.println("This is instance initializer block"); 
    } 

    public static void main(String[] args) { 
        ArrayList<Employee> list1 = new ArrayList<Employee>(); 
        Scanner sc = new Scanner(System.in); 
        int opt; 
        do { 
            System.out.println("1. Add a new Employee "); 
            System.out.println("2. Show all employees "); 
            System.out.println("3. Delete any employee "); 
            System.out.println("4. Update the employee "); 
            System.out.println("5. Sort Employees according to name "); 
            System.out.println("6. Sort Employees according to Salary "); 
            System.out.println("7. Exit "); 
            System.out.println("Enter your option "); 
            opt = sc.nextInt(); 
            switch (opt) { 
                case 1: 
                    int id = empid++; 
                    sc.nextLine(); 
                    System.out.println("Enter the employee name "); 
                    String n = sc.nextLine(); 
                    System.out.println("Enter the salary "); 
                    float s = sc.nextFloat(); 
                    sc.nextLine(); 
                    Employee e1 = new Employee(id, n, s); 
                    list1.add(e1); 
                    System.out.println("Employee Added successfully"); 
                    break; 
                case 2: 
                    if (list1.isEmpty()) { 
                        System.out.println("No employees to display."); 
                    } else { 
                        for (Employee e : list1) { 
                            System.out.println(e); 
                        } 
                    } 
                    break; 
                case 3: 
                    System.out.println("Enter the employee id to delete "); 
                    id = sc.nextInt(); 
                    sc.nextLine(); 
                    boolean flag = false; 
                    for (int i = 0; i < list1.size(); i++) { 
                        if (list1.get(i).getId() == id) { 
                            list1.remove(i); 
                            flag = true; 
                            System.out.println("Employee removed "); 
                            break; 
                        } 
                    } 
                    if (!flag) 
                        System.out.println("Employee not found "); 
                    break; 
                case 4: 
                    System.out.println("Enter the employee id to update "); 
                    id = sc.nextInt(); 
                    sc.nextLine(); 
                    flag = false; 
                    for (Employee e : list1) { 
                        if (e.getId() == id) { 
                            System.out.println("Enter the new name "); 
                            n = sc.nextLine(); 
                            System.out.println("Enter the new salary"); 
                            s = sc.nextFloat(); 
                            e.setName(n); 
                            e.setSalary(s); 
                            flag = true; 
                            System.out.println("Employee updated "); 
                            break; 
                        } 
                    } 
                    if (!flag) 
                        System.out.println("Employee not found "); 
                    break; 
                case 5: 
                    Collections.sort(list1); 
                    System.out.println("Employees sorted by name:");
                    for (Employee e : list1) { 
                        System.out.println(e); 
                    } 
                    break; 
                case 6: 
                    Collections.sort(list1, new EmployeeSalaryComparator()); 
                    System.out.println("Employees sorted by salary:");
                    for (Employee e : list1) { 
                        System.out.println(e); 
                    } 
                    break; 
                case 7: 
                    System.out.println("Exiting the application."); 
                    break; 
                default: 
                    System.out.println("Invalid option. Please try again."); 
            } 
        } while (opt != 7); 
    } 
}
