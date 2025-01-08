public class TestStudent {
    public static void main(String[] args) {
        try {
            // Example with invalid marks
            Student s1 = new Student(1, "Prasad", 101);
            System.out.println(s1);
        } catch (InvalidMarksException e) {
            System.out.println(e); // Print the exception details
        }

        try {
            // Example with valid marks
            Student s2 = new Student(2, "Pashya", 85);
            Student s3 = new Student(3, "Panya", 95);
            Student s4 = new Student(4, "Banya", 65);

            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
        } catch (InvalidMarksException e) {
            System.out.println(e);
        }
    }
}
