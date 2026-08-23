package String;

import java.util.Arrays;


public class Reverse {
    public static void main(String[] args) {
        String s= "Hello";
        char ch[]=s.toCharArray();
        int n= s.length();
        // String rev= ""; 
        // for(int i =n-1; i>=0 ; i--){
        //     rev +=s.charAt(i);
            
        // } 
        // System.out.print(rev);

        int st= 0, e= n-1;
        while(st<=e){
            char temp =ch[st];
            ch[st]=ch[e];
            ch[e]=temp;
            st++;
            e--;
        }
       System.out.println(Arrays.toString(ch));
        
    }
    
}
