package CollectionFramework.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        /*
         * HASHMAP
         *
         * Definition:
         * HashMap stores data in KEY-VALUE pairs.
         *
         * Example:
         * Key   → Value
         * 1     → musa
         * 2     → ram
         *
         * Important:
         * - Keys must be unique.
         * - Values can be duplicate.
         * - One null key is allowed.
         * - Multiple null values are allowed.
         * - Does not guarantee insertion order.
         *
         * Real-life uses:
         * - Student ID → Student Name
         * - Product ID → Product
         * - Employee ID → Employee
         * - Username → User information
         */

        HashMap<Integer, String> map = new HashMap<>();


        // put() → Adds key-value pair
        map.put(1, "musa");
        map.put(2, "ram");
        map.put(3, "sam");


        /*
         * If the key already exists,
         * HashMap REPLACES the old value.
         *
         * Key 3 originally had "sam".
         * Now it becomes "jon".
         */

        map.put(3, "jon");


        /*
         * Iterate over KEYS
         *
         * keySet() returns all keys.
         */

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }


        /*
         * Iterate over VALUES
         *
         * values() returns all values.
         */

        for (String value : map.values()) {
            System.out.println(value);
        }


        /*
         * Iterate over KEY + VALUE
         *
         * entrySet() returns every key-value pair.
         *
         * Map.Entry represents one key-value pair.
         */

        for (Map.Entry<Integer, String> entrySet : map.entrySet()) {

            System.out.println(
                entrySet.getKey() + " - " + entrySet.getValue()
            );
        }


        // Print complete HashMap
        System.out.println(map);


        /*
         * containsKey()
         *
         * Checks whether a particular KEY exists.
         *
         * Returns true or false.
         */

        System.out.println(map.containsKey(1));


        /*
         * containsValue()
         *
         * Checks whether a particular VALUE exists.
         */

        System.out.println(map.containsValue("musa"));


        /*
         * isEmpty()
         *
         * Checks whether the HashMap is empty.
         */

        System.out.println(map.isEmpty());


        /*
         * remove(key)
         *
         * Removes the key-value pair associated
         * with the specified key.
         */

        map.remove(3);


        /*
         * remove(key, value)
         *
         * Removes the pair ONLY if both key AND value match.
         */

        map.remove(2, "ram");


        System.out.println(map);


        /*
         * size()
         *
         * Returns the number of key-value pairs.
         */

        // System.out.println(map.size());


        /*
         * get(key)
         *
         * Returns the value associated with the key.
         */

        // System.out.println(map.get(1));
    }
}