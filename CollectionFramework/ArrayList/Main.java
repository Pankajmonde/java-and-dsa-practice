package CollectionFramework.ArrayList;

import java.util.ArrayList;

/*
 * ARRAYLIST
 *
 * Definition:
 * ArrayList is a class in Java used to store multiple elements
 * in a dynamic/resizable array.
 *
 * It:
 * - Allows duplicate values
 * - Maintains insertion order
 * - Allows null values
 * - Provides index-based access
 * - Automatically increases its size when needed
 *
 * Where is it used?
 * - Storing student records
 * - Product lists in e-commerce
 * - Employee lists
 * - Shopping cart items
 * - Storing database/API results
 * - Whenever we need a collection whose size can change
 */

public class Main {

    public static void main(String[] args) {

        // Creating an ArrayList of Integer
        ArrayList<Integer> list = new ArrayList<>();

        // add() → Adds an element at the end of the list
        list.add(10);
        list.add(106);
        list.add(15);
        list.add(14);
        list.add(13);
        list.add(12);


        /*
         * for-each loop
         *
         * Used when we simply want to read/process
         * every element of the ArrayList.
         */

        // for (int ele : list) {
        //     System.out.println(ele);
        // }


        /*
         * Normal for loop
         *
         * size() → Returns the number of elements.
         *
         * get(index) → Returns the element at a particular index.
         *
         * ArrayList uses INDEX starting from 0.
         */

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        // size() → Returns the total number of elements
        System.out.println(list.size());


        /*
         * add(index, element)
         *
         * Adds an element at a particular index.
         *
         * Existing elements are shifted to the right.
         *
         * Current:
         * [10, 106, 15, 14, 13, 12]
         *
         * list.add(2, 100)
         *
         * Result:
         * [10, 106, 100, 15, 14, 13, 12]
         */

        list.add(2, 100);


        /*
         * set(index, element)
         *
         * Replaces/updates the element at the given index.
         *
         * Here index 2 contains 100.
         *
         * 100 → 700
         *
         * Result:
         * [10, 106, 700, 15, 14, 13, 12]
         */

        list.set(2, 700);


        /*
         * remove(index)
         *
         * Removes the element at the specified index.
         *
         * Here index 2 contains 700.
         *
         * 700 is removed.
         *
         * Result:
         * [10, 106, 15, 14, 13, 12]
         */

        list.remove(2);


        /*
         * contains(element)
         *
         * Checks whether a particular element exists.
         *
         * Returns:
         * true  → element exists
         * false → element does not exist
         */

        System.out.println(list.contains(15));


        /*
         * get(index)
         *
         * Returns the element at the specified index.
         *
         * Index:
         *
         * 0 → 10
         * 1 → 106
         * 2 → 15
         * 3 → 14
         * 4 → 13
         * 5 → 12
         */

        System.out.println(list.get(0));


        /*
         * indexOf(element)
         *
         * Returns the index of the first occurrence
         * of the specified element.
         *
         * 13 is at index 4.
         */

        System.out.println(list.indexOf(13));


        /*
         * Printing the complete ArrayList
         */

        System.out.println(list);
    }
}