import java.util.ArrayList;
import java.util.Scanner;

public class MiniProject {
    static ArrayList<Product> productList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void InsertProduct() {
        System.out.print("Enter Product ID: ");
        int pid = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Product Price: ");
        int price = sc.nextInt();

        Product product = new Product(pid, name, price);
        productList.add(product);
        System.out.println("Product added Successfully!");
    }

    public static void UpdateProduct() {
        System.out.print("Enter Product ID to Update: ");
        int pid = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        for (Product product : productList) {
            if (product.getPid() == pid) {
                System.out.print("Enter new Product Name: ");
                String name = sc.nextLine();
                System.out.print("Enter new Product Price: ");
                int price = sc.nextInt();

                product.setName(name);
                product.setPrice(price); // Corrected the method name
                System.out.println("Product updated successfully!");
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public static void ShowProduct() {
        if (productList.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("\n=== List of Products ===");
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    public static void DeleteProduct() {
        System.out.print("Enter Product ID to Delete: ");
        int pid = sc.nextInt();

        // Fixed the syntax for the lambda expression
        boolean removed = productList.removeIf(product -> product.getPid() == pid);
        if (removed) {
            System.out.println("Product deleted successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }

    public static void main(String[] args) {
        int ch;

        do {
            System.out.println("\n=== Product Management System ===");
            System.out.println("1. Insert Product");
            System.out.println("2. Update Product");
            System.out.println("3. View All Products");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    InsertProduct();
                    break;
                case 2:
                    UpdateProduct();
                    break;
                case 3:
                    ShowProduct();
                    break;
                case 4:
                    DeleteProduct();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (ch != 5);
        sc.close();
    }
}