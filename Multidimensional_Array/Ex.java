package Multidimensional_Array;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter number of rows");
        
          int rows=sc.nextInt();
          System.out.println("Enter number of columns");
          int col=sc.nextInt();
          int arr[][]= new int[rows][col];
       // int arr[][]={{1,2,3}, {4,5,6}, {7,8,9}};

        // int rows=arr.length;
        // int col=arr[0].length;
        
        for( int i=0; i<rows; i++) {
            for(int j=0 ; j<col; j++){
                System.out.println("Enter value at matrix{"+  i + "][" + j +"]");
                arr[i][j]=sc.nextInt();

            }
        }
        for( int i=0; i<rows; i++) {
            for(int j=0 ; j<col; j++){
                
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }


    }
    
}
