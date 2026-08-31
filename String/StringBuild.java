package String;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        // String s="abcd";
        // StringBuilder sb1= new StringBuilder(s);
        // StringBuilder sb2= new StringBuilder(100);


        // sb.append("abcdefghiklmngww");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());


        // System.out.println(sb1.capacity());
        // System.out.println(sb1.length());

        // System.out.println(sb2.capacity());
        // System.out.println(sb2.length());

        sb.append("hello bhai kaise ho");
    System.out.println(sb);
    System.out.println(sb.length());
    System.out.println(sb.capacity());
    // sb.delete(4, 9);
    // System.out.println(sb);
    // sb.deleteCharAt(5);
    // System.out.println(sb);
    //sb.reverse();
    System.out.println(sb);
   sb.insert(19,"nice bro");
   System.out.println(sb);
    }

}
