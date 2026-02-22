package oops;
//Single inheritance is a type of inheritance in which a class (called a child class or subclass) inherits properties and behaviors from a single parent class (called a superclass). In Java, single inheritance is achieved using the "extends" keyword. The child class can override the methods of the parent class to provide specific implementations or add new methods and fields to enhance functionality.
class Shape {
    public void area(){
        System.out.println("display area");
    }   

}
class Triangle extends Shape{
     public void area(int l,int h){
        System.out.println(0.5*l*h);
     }

}

public class SingleInheritance {
        public static void main(String[] args) {
            
        }
}
