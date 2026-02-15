package loops;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        //print sum of first n natrual numbers
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;

        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

    }


}
