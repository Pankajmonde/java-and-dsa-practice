package operators;

public class Basic {
    public static void main(String[] args) {
    //     int a=10;
    //     int b=20;
    // System.out.println("add= " + (a+b));
    // System.out.println("sub= " + (a-b));
        //Unary op
        int a=10;
        int b=++a;

        //pre increment first increment then assign
        System.out.println(a);
        System.out.println(b);


        int c=10;
        int d=c++;
        //post increment first value use and hen value change 
        System.out.println(c);
        System.out.println(d);

        //relational operators
        int x = 15;
        int y = 20;

        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));

        //logical operatos


      

        int w=10;
        int r=5;
        System.out.println((w>r) && (w!=r)); //true && true = true
            System.out.println((w>r) || (w==r)); //true || false = true
            System.out.println(!(w>r)); // !true = false

        //assignment operators
        int p=10;
        // p=p+10;
        p+=10; //p=p+10

        System.out.println(p);

        int h=20;
        // h=h-5;
        h-=5; //h=h-5
        System.out.println(h);

        int m=5;
        // m=m*2;
        m*=2; //m=m*2
        System.out.println(m);

            int n=10;
        // n=n/2;
        n/=2; //n=n/2
        System.out.println(n);

         int q=15;
        // q=q%4;
        q%=4; //q=q%4
        System.out.println(q);

         
        
        

    }
}
