package loops;

import java.util.Scanner;

public class ContinueState {
    public static void main(String[] args) {
        // for(int i=0 ;i<10 ;i++){
        //     if(i==5){
        //         //skip iteration
        //         continue;
        //     }
        //     System.err.println(i);

    // }
    // display all numbers enterd by user except multiples of 10 
    Scanner sc=new Scanner(System.in);
    do { 
        System.out.println("ENter your number");
        int n=sc.nextInt();

        if(n %10==0){
            continue;
        }
        System.out.println("number was: "+n);
    } while (true);
    }
    
}
