
import java.util.Scanner;

public class TypeCon {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float number = sc.nextInt();
            System.out.println(number);
        }
    }
}


// byte->short->int->long->float->double