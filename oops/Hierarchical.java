package oops;
// Hierarchical inheritance is a type of inheritance in which multiple child classes inherit from a single parent class. In Java, hierarchical inheritance is achieved using the "extends" keyword. The child classes can override the methods of the parent class to provide specific implementations or add new methods and fields to enhance functionality.
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

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
     }
}

public class Hierarchical {
        public static void main(String[] args) {
            Triangle t1=new Triangle();
            t1.area(5, 10);
            Circle c1=new Circle();
            c1.area(7);
            
        }
}
