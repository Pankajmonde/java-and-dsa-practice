package oops;
// Inheritance is a fundamental object-oriented programming concept that allows a new class (called a subclass or child class) to inherit properties and behaviors (fields and methods) from an existing class (called a superclass or parent class). This promotes code reusability and establishes a natural hierarchical relationship between classes. In Java, inheritance is achieved using the "extends" keyword.
class Shape {
    String color;

}

class Triangle extends Shape {
    
}

public class Inheritance {
    public static void main(String[] args) {
       Triangle t1=new Triangle();
       t1.color="red";
    }
    
}
