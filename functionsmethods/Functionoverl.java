package functionsmethods;

public class Functionoverl {

    // public static int add(int a,int b){
    //     return a+b;
    // }
    // public static double add(double a,double b){
    //     return a+b;
    // }


    //function to calulate integer sum

    public static int sum(int a,int b){
        return a+b;
    }
    //function to calculate float sum 
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
       
        System.out.println(sum(10, 20));
      
        System.out.println(sum(10.5f, 20.5f));
    }
    
}
