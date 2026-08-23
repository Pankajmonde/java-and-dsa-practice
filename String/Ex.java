package String;

public class Ex {
    public static void main(String[] args) {
        String s1= "pankaj"; //String 
        String s2="pankaj";

        //with the help of new keyword
        String s3= new String("pankaj");
        String s4= new String("pankaj");

        char ch[]={'a','b','c'};
        String s5= new String(ch);
        
        System.out.println(s5);
        System.out.println(s1==s2); //compare value+ address
        System.out.println(s3==s4);
    }
}
