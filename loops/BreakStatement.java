package loops;

import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // for (int i=1; i<5; i++){
        //     if(i==3){
        //         break;
        //     }
        //     System.err.println(i);
        // }
        // System.out.println("i am out of the loop");

        //keep entering number till user entera multiple of 10
     

        do{
            System.err.print("Enter your number");
            int n =sc.nextInt();
            if(n % 10==0){
                break;
            }
            System.err.println(n);
        }while(true);
          
    }
}
