public class TypePromotionExp {
    public static void main(String[] args) {

        
        //1 .Java automatically promotes each byte short or char operand to int when evaluating an expression
        char p='a';
        int k='b';

        
        System.out.println((int)(p));
        System.out.println((int)(k));
        // System.out.println(a);
        System.out.println(k-p);

        short a=5;
        byte b=25;
        char c='c';
        byte bt=(byte)(a+b+c);
        System.out.println(bt);


        //2. if any of the operands is of type double the whole expression is promoted to double

        int x=5;
        float z=5.5f;
        long l=10;
        double d=20;
        double result = x + z + l + d;
        System.out.println(result);


    
    }
}
