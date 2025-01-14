import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer, String> h1 = new HashMap<Integer, String>();

        // Adding key-value pairs to the HashMap
        h1.put(12, "Prasad");
        h1.put(14, "Sangram");
        h1.put(16, "Omkar");
        h1.put(14, "Digu"); // Duplicate key; will overwrite "Sangram"
        h1.put(15, "Prasad"); //  same value
        
        // Getting a set view of the entries in the HashMap
        Set<Map.Entry<Integer, String>> s1 = h1.entrySet();
        
        // Creating an iterator for the set
        Iterator<Map.Entry<Integer, String>> i1 = s1.iterator();
        
        // Iterating through the HashMap and printing key-value pairs
        while (i1.hasNext()) {
            Map.Entry<Integer, String> m1 = i1.next();
            System.out.println("Roll Number: " + m1.getKey() + ", Name: " + m1.getValue());
        }
    }
}

//internal working
//interface Map {
//	interface Entry{
//		public void getKey();
//		public void getValue();
//		
//	}
//}