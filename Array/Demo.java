package Array;

import java.util.Scanner;
//arrays is a collection of similar type of data elements which have a contiguous memory location. It is a data structure that can hold more than one value at a time. It is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.
public class Demo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter " + size + " elements of array"); 
        for(int i=0; i< arr.length; i++){
            arr[i]=sc.nextInt();
        }
        
       System.out.println("Element are ");
     for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
         





    }
}
}