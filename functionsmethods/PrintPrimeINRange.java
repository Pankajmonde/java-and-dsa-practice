package functionsmethods;

public class PrintPrimeINRange {

    public static boolean isPrime(int n){
        if(n==2)      {   return true;
        }

        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    
}

    public static void Primesinrange(int n){
        for(int i=2;i<=n-1;i++){
            if(isPrime(i)) {
                System.out.println(i+" ");
            }

    }
    System.out.println();
    
}

public static void  main(String args[]){
    Primesinrange(20);
}
}