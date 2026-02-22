package oops;

class Pen {

    String color;
    String type;//ballpoint or gel

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
     

}

class Student{
    String name;
    int age;
    

    public void printName(){
        System.out.println(this.name);//this keyword is used to refer to the current object of the class. It is used to access the properties and methods of the current object.
        System.out.println(this.age);
    }

    // Student(){
    //     System.out.println("constructor is called");
    // }

    // Student(String name,int age){  //constructor is a special method that is used to initialize the properties of the class. It is called when an object of the class is created. It has the same name as the class and does not have a return type.
    //     this.name=name;
    //     this.age=age;
    // }

    Student(Student s2_){  //copy constructor is a special constructor that is used to create a new object by copying the properties of an existing object. It takes an object of the same class as a parameter and copies the properties of that object to the new object.
        this.name=s2_.name;
        this.age=s2_.age;
    }

    Student() {
    }
    

}

public class Constructor {

     public static void main(String[] args) {
        //  Pen pen1=new Pen();
        //  pen1.color="blue";
        //  pen1.type="gel";

        //  Pen pen2=new Pen();
        //     pen2.color="black";
        //     pen2.type="ballpoint";

        // pen1.printColor();
        // pen2.printColor();
         
         //Student s1=new Student("aman", 20); //creating an object of student class using parameterized constructor
        Student s1=new Student(); //creating an object of student class using default constructor
        s1.name="Alice";  //accessing the properties of student class using s1 object
        s1.age=20;
        // s1.printName(); //accessing the method of student class using s1 object

        Student s2=new Student(s1); //creating an object of student class using copy constructor
        s2.printName(); //accessing the method of student class using s2 object

         

     }
}
