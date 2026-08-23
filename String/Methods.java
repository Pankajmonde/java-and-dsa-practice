package String;

import java.util.Arrays;

public class Methods {
    public static void main(String args[]){
        
     String s= "pankaj";

     System.out.println(s.length()); 
     System.out.println(s.charAt(0));
     System.out.println(s.toUpperCase());
     System.out.println(s.toLowerCase());
     System.out.println(s.indexOf('a'));
     System.out.println(s.lastIndexOf('a'));

    //  char arr[]=s.toCharArray();
    //  System.out.println(Arrays.toString(arr));
      
    System.out.println(s.substring(1,5));
    System.out.println(s.substring(6)); // " "
    
    String s1="okAbroAhowAareAyou";
    String arr[]=s1.split("A");
    System.out.println(Arrays.toString(arr));

    String a1="abc";
    String a2="zbc";

    System.out.println(a1.compareTo(a2));





     

        
      
    }
    
}
