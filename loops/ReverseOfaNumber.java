package loops;

public class ReverseOfaNumber {
    public static void main(String[] args) {
        //reverse of a number
        // int n =10899;
        // while(n>0){
        //     int lastDigit=n% 10;
        //     System.out.print(lastDigit );
        //     n=n/10; //n/=10
            
        // }
        // System.out.println();

        //revserse the given number
        int n=10899;
        int rev=0;
        while(n>0){
            int lastDigit=n %10;
            rev=(rev*10)+lastDigit;
            n=n/10;

        }
        System.out.println(rev);
        
    }
    
}
