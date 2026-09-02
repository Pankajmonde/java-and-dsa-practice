package CollectionFramework.ComparatorAndComparable;
import java.util.ArrayList;
import java.util.Collections;
public class Student implements Comparable<Student> {

     String name ;
     int age;
     public Student(String name, int age){
        this.name=name;
        this.age= age;
     }

     @Override 
     public int compareTo(Student o2){
        return this.age - o2.age;
     }

     @Override
     public String toString(){
        return "Student {"+
                 "name= '"+ name + '\''+
                 ",age="+ age+
                 '}';
     }
}


class Demo {
    public static void main(String[] args) {
       ArrayList<Student> list = new ArrayList<>();
       list.add( new Student("golu", 10)); 
       list.add( new Student("tolu", 30)); 
       list.add( new Student("wolu", 55)); 
       list.add( new Student("solu", 211)); 
       list.add( new Student("bolu", 21)); 

       Collections.sort(list);
       for(Student s: list){
        System.out.println(s);

    System.out.println(Collections.max(list));
    System.out.println(Collections.min(list));
    Collections.reverse(list);
    System.out.println(list);
    System.out.println(Collections.frequency(list, 10));
//Collections.fill(list, -1);
    System.out.println(list);


       }
    }

}
    
    

