package CollectionFramework.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        list.add(10);

        System.out.println("Original List: " + list);

        // Find maximum value
        System.out.println("Maximum: " + Collections.max(list));

        // Find minimum value
        System.out.println("Minimum: " + Collections.min(list));

        // Reverse the list
        Collections.reverse(list);
        System.out.println("After Reverse: " + list);

        // Count how many times 10 occurs
        System.out.println("Frequency of 10: " + Collections.frequency(list, 10));

        // Fill all elements with -1
        Collections.fill(list, -1);
        System.out.println("After Fill: " + list);
    }
}