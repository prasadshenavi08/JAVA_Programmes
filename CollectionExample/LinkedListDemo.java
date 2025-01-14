import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addFirst(236); // Only for LinkedList
        list1.add(45);
        list1.add(55);
        list1.add(25);

        // Accessing elements (ensure valid index)
        if (list1.size() > 1) {
            System.out.println("Element at index 1: " + list1.get(1));
        } else {
            System.out.println("Index 1 is out of bounds.");
        }

        // Iterating using Iterator
        Iterator<Integer> i1 = list1.iterator();
        System.out.println("Using Iterator:");
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
        
        Collections.sort(list1);
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);

        // Iterating using ListIterator
        ListIterator<Integer> l1 = list1.listIterator();
        System.out.println("Using ListIterator:");
        while (l1.hasNext()) {
            System.out.println(l1.next());
        }

        // Reverse iteration using ListIterator
        System.out.println("List in Reverse Order:");
        ListIterator<Integer> l2 = list1.listIterator(list1.size());
        while (l2.hasPrevious()) {
            System.out.println(l2.previous());
        }

        // Example with ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(54); // Add element
        System.out.println("ArrayList: " + list2);
    }
}
