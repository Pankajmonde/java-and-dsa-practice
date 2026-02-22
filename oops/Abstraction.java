package oops;
//  Abstraction is a fundamental object-oriented programming concept that focuses on hiding the internal implementation details of a class and exposing only the essential features and functionalities to the outside world. It allows developers to create complex systems by breaking them down into simpler, more manageable components. In Java, abstraction can be achieved using abstract classes and interfaces.


 abstract class Animal {
    abstract  void walk();
    Animal(){
        System.out.println("animal is created");
    }
    public void eat(){
        System.out.println("eats food");
    }

    
}
class Horse extends Animal{
    Horse(){
        System.out.println("horse is created");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chiken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class Abstraction {

    public static void main(String[] args) {
        Horse horse=new Horse();
        

       
    }
}
