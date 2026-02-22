package oops;
// Multilevel inheritance is a type of inheritance in which a class (called a child class or subclass) inherits properties and behaviors from a parent class (called a superclass), and then another class (called a grandchild class) inherits from the child class. In Java, multilevel inheritance is achieved using the "extends" keyword. The grandchild class can override the methods of the child class and the parent class to provide specific implementations or add new methods and fields to enhance functionality.
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

class EquilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
     }
}

public class MultilevelInheritance {
        public static void main(String[] args) {
            EquilateralTriangle et1=new EquilateralTriangle();
            et1.area(5, 10);
            
        }
}
