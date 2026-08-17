package Alogorithms.Sorting;
import java.util.Arrays;

public class PassBy {
   public static void main(String []args){
    int arr[]={1,2,3};
    System.out.println("Before calling..");
    System.out.println(Arrays.toString(arr));
    change(arr);
    System.out.println("After calling");
    System.out.println(Arrays.toString(arr));
    
   } 
   public static void change(int arr[]) {
       arr =new int  [3]; //java does not support pass by ref
       arr[2]=100;
   }
}
