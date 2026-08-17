package Alogorithms.Sorting;

import java.util.Arrays;

public class Vara {
    public static void main(String[] args) {
        
        slove("name",1,2,3,4,5);

    }
    public static void slove(String name ,int... arr) //varags -varable length argument 
    {
        System.out.println(name);
        System.out.println(Arrays.toString(arr));
        
    }
    
}
