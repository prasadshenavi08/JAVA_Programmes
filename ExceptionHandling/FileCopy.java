import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try {
            // Create a FileReader to read from the source file
            FileReader f1 = new FileReader("book.txt");
            // Create a FileWriter to write to the destination file
            FileWriter f2 = new FileWriter("new.txt");

            int c;
            // Read from source and write to destination character by character
            while ((c = f1.read()) != -1) {
                System.out.print((char) c); // Print the character to the console
                f2.write(c); // Write the character to the new file
            }

            // Close the resources
            f1.close();
            f2.close();

            System.out.println("\nFile copied successfully.");
        } catch (IOException e) {
            // Handle any IOExceptions
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
