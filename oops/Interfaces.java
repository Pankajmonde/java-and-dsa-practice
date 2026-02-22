package oops;
// An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. It is a way to achieve abstraction and multiple inheritance in Java. An interface cannot be instantiated on its own; instead, it must be implemented by a class. The class that implements the interface must provide concrete implementations for all the methods declared in the interface. Interfaces are used to define a contract for what a class can do, without specifying how it does it.
interface Animal {

    void eat();
    void sleep();
}
interface Mammal {
    
}
class Dog implements Animal , Mammal {
    public void eat() {
        System.out.println("Dog eats food");
    }
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
    }
    
}
