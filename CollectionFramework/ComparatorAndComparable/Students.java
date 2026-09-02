package CollectionFramework.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Comparator for sorting students by Age
class SortByAge implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return Integer.compare(o1.age, o2.age);
    }
}

// Comparator for sorting students by Name
class SortByName implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return o1.name.compareTo(o2.name);
    }
}

// Student class
public class Students {

    String name;
    int age;

    // Constructor
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display Student object
    @Override
    public String toString() {
        return "Students {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


// Main class
class Demo {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Students> list = new ArrayList<>();

        // Add students
        list.add(new Students("golu", 10));
        list.add(new Students("tolu", 30));
        list.add(new Students("wolu", 55));
        list.add(new Students("solu", 211));
        list.add(new Students("bolu", 21));

        // Sort by Name
        Collections.sort(list, new SortByName());

        // Display
        System.out.println("Sorted by Name:");

        for (Students s : list) {
            System.out.println(s);
        }

        // Sort by Age
        Collections.sort(list, new SortByAge());

        System.out.println("\nSorted by Age:");

        for (Students s : list) {
            System.out.println(s);
        }
    }
}