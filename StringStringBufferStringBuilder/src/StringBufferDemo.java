public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Hello World");

        // 1. Append a character
        s1.append("!");
        System.out.println("After append: " + s1);

        // 2. Delete a character at a specific position
        s1.deleteCharAt(5); // Removes the space after "Hello"
        System.out.println("After deleteCharAt(5): " + s1);

        // 3. Find the index of a substring
        int index = s1.indexOf("World");
        System.out.println("Index of 'World': " + index);

        // 4. Insert a string at a specific position
        s1.insert(5, " "); // Adds the space back
        System.out.println("After insert(5, ' '): " + s1);

        // 5. Find the last index of a character
        int lastIndex = s1.lastIndexOf("o");
        System.out.println("Last index of 'o': " + lastIndex);

        // 6. Reverse the string
        s1.reverse();
        System.out.println("After reverse: " + s1);
    }
}
