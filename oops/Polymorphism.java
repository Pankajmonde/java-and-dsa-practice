package oops;
// Polymorphism is the ability of an object to take on many forms. Polymorphism allows us to perform a single action in different ways. There are two types of polymorphism in Java: compile-time polymorphism (method overloading) and runtime polymorphism (method overriding).

class  Student {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println("the name of the student is "+name);
    }
    public void printInfo(int age){
        System.out.println("the age of the student is "+age);
    }
     public void printInfo(String name,int age){
        System.out.println("the name of the student is "+name+" and the age is "+age);
    }

}


public class Polymorphism {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="harry";
        s1.age=25;

        // s1.printInfo(s1.name);
        // s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
    
}
