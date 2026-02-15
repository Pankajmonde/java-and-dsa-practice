package loops;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // print 1 to n using while loop

        int range=sc.nextInt();
        int counter=1;
        while(counter<=range){ 
            System.out.println(counter + " ");
            counter ++;
        }
        System.out.println("Loop ended");

      
            
        }

        
    

}
