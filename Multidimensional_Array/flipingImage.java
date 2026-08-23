package Multidimensional_Array;

import java.util.Arrays;

public class flipingImage {
    public static void main(String[] args) {
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};

        int n=arr.length;
        for (int i = 0; i < n; i++) {
         for (int j = 0; j < n/2; j++) {
            //swap
            int temp=arr[i][j];
            arr[i][j]=arr[i][n-1-j];
            arr[i][n-1-j]=temp ;
             
         }   
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
            
        }
    }
    
}
