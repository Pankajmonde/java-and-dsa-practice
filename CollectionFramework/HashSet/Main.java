package CollectionFramework.HashSet;

import java.util.HashSet;

/*
 * HASHSET
 *
 * Definition:
 * HashSet is a collection in Java that is used to store
 * UNIQUE elements.
 *
 * Important properties:
 *
 * 1. Does NOT allow duplicate elements.
 * 2. Does NOT maintain insertion order.
 * 3. Allows ONE null value.
 * 4. Provides fast searching using contains().
 * 5. Automatically manages its size.
 *
 * Where is HashSet used?
 *
 * - Removing duplicate data
 * - Storing unique student IDs
 * - Storing unique usernames
 * - Checking whether an item already exists
 * - Storing unique product IDs
 * - Finding unique elements from a list
 */

public class Main {

    public static void main(String[] args) {

        // Creating a HashSet that stores Integer values
        HashSet<Integer> set = new HashSet<>();


        /*
         * add()
         *
         * Used to add an element to the HashSet.
         *
         * HashSet does NOT allow duplicates.
         */

        set.add(10);
        set.add(20);

        // 10 is already present, so this duplicate is ignored
        set.add(10);

        // HashSet allows ONE null value
        set.add(null);


        /*
         * remove()
         *
         * Removes the specified element from the HashSet.
         *
         * Here, 20 will be removed.
         */

        set.remove(20);


        /*
         * for-each loop
         *
         * Used to access every element in the HashSet.
         *
         * NOTE:
         * HashSet does NOT guarantee insertion order.
         *
         * So the output order can be different.
         */

        for (Integer ele : set) {
            System.out.println(ele);
        }


        /*
         * contains()
         *
         * Used to search/check whether an element exists.
         *
         * Returns:
         *
         * true  → element exists
         * false → element does not exist
         */

        System.out.println(set.contains(10));


        /*
         * clear()
         *
         * Removes ALL elements from the HashSet.
         *
         * Currently commented.
         *
         * If you uncomment it:
         *
         * set.clear();
         *
         * The HashSet becomes empty.
         */

        // set.clear();


        /*
         * isEmpty()
         *
         * Checks whether the HashSet contains any elements.
         *
         * Returns:
         *
         * true  → HashSet is empty
         * false → HashSet contains elements
         */

        System.out.println(set.isEmpty());


        /*
         * size()
         *
         * Returns the total number of elements
         * currently present in the HashSet.
         */

        System.out.println(set.size());


        /*
         * Printing the complete HashSet.
         *
         * Order is NOT guaranteed.
         */

        System.out.println(set);
    }
}