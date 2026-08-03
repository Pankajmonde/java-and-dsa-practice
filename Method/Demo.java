package Method;
// A method is a block of code that performs a specific task. 
// It is executed when it is called from another method.
// Methods help in code reusability and modular programming.

public class Demo {

    // This method demonstrates swapping values using pass by value.
    // In Java, arguments are passed by value, meaning a copy of the variable is passed.
    public static void swap(int a, int b) {
        int temp = a; // Store the value of 'a' in 'temp'
        a = b;        // Assign the value of 'b' to 'a'
        b = temp;     // Assign the value of 'temp' to 'b'
        System.out.println("Inside swap method: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before calling swap: a = " + a + ", b = " + b);
        swap(a, b); // Pass by value: a copy of 'a' and 'b' is passed
        System.out.println("After calling swap: a = " + a + ", b = " + b);
        // The original values of 'a' and 'b' remain unchanged because Java uses pass by value.
    }
}
