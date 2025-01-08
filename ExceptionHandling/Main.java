import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // File path to write to
        String filePath = "D:\\Unique_System_skill\\Backend_JAVA\\Eclipse_JAVA_Program\\ExceptionHanding\\book.txt";
        
        // Try-with-resources to ensure the file is closed automatically
        try (FileWriter f1 = new FileWriter(filePath)) {
            f1.write("1001 Core Java");
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
