package CollectionFramework.TreeSet;

import java.util.TreeSet;

/*
 * TREESET
 *
 * Definition:
 * TreeSet is a collection in Java used to store
 * UNIQUE elements in SORTED ORDER.
 *
 * Important properties:
 *
 * 1. Does NOT allow duplicate elements.
 * 2. Automatically maintains sorted order.
 * 3. Does NOT use indexes.
 * 4. Normally does NOT allow null values.
 *
 * Where is TreeSet used?
 *
 * - When unique data is required in sorted order
 * - Ranking systems
 * - Sorted student marks
 * - Sorted product prices
 * - Finding minimum and maximum values
 * - Maintaining sorted IDs
 */

public class Main {

    public static void main(String[] args) {

        // Creating a TreeSet of Integer
        TreeSet<Integer> set = new TreeSet<>();


        /*
         * add()
         *
         * Adds an element to the TreeSet.
         *
         * TreeSet automatically sorts the elements.
         */

        set.add(50);
        set.add(20);
        set.add(40);

        // Duplicate value → ignored
        set.add(20);

        set.add(10);
        set.add(30);


        /*
         * TreeSet automatically sorts the elements
         * in ascending order.
         *
         * Result:
         *
         * [10, 20, 30, 40, 50]
         */

        System.out.println(set);


        /*
         * for-each loop
         *
         * Used to access each element.
         *
         * Elements will be printed in sorted order.
         */

        for (Integer ele : set) {
            System.out.println(ele);
        }


        /*
         * contains()
         *
         * Checks whether an element exists.
         *
         * true  → element exists
         * false → element doesn't exist
         */

        System.out.println(set.contains(30));


        /*
         * remove()
         *
         * Removes the specified element.
         */

        set.remove(20);

        System.out.println(set);


        /*
         * first()
         *
         * Returns the smallest element.
         */

        System.out.println("First: " + set.first());


        /*
         * last()
         *
         * Returns the largest element.
         */

        System.out.println("Last: " + set.last());


        /*
         * size()
         *
         * Returns the number of elements.
         */

        System.out.println("Size: " + set.size());


        /*
         * isEmpty()
         *
         * Checks whether the TreeSet is empty.
         */

        System.out.println("Is Empty: " + set.isEmpty());


        /*
         * clear()
         *
         * Removes all elements.
         */

        // set.clear();
        
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());

        System.out.println(set);
    }
}