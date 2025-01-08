import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        // File path to read from (same as the writer program for consistency)
        String filePath = "D:\\Unique_System_skill\\Backend_JAVA\\Eclipse_JAVA_Program\\ExceptionHanding\\book.txt";
        
        // Try-with-resources for automatic resource management
        try (FileReader f1 = new FileReader(filePath)) {
            int c;
            System.out.println("Reading contents of the file:");
            while ((c = f1.read()) != -1) { // Read characters until end of file
                System.out.print((char) c); // Print characters without extra line breaks
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage()); // Handle missing file
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage()); // Handle general I/O errors
        }
    }
}
