package Method;


public class StrongNumber{


    public static int fact(int n){

        int fact=1;
        for(int i =1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
  public static void main(String[] args) {
      
   int n=145;
   int copy= n;
   int sum=0;

   while(n>0){
    int lastdigit = n%10;
    //find factorial of digit
    sum = sum + fact(lastdigit);
    //remove last digit
    n=n/10;
   }
    System.out.print(sum == copy ? "Strong Number" : "Not a Strong Number");
   
  }
}

