//call by value 

package functionsmethods;

public class CallbyVAlue {
    public static void change(int a){
        a=10;
    }
    public static void main(String[] args) {
        int a=5;
        change(a);
        System.out.println(a);
    }
}   