package Array;
import java.util.Arrays;

public class leftRotateByoneE {
    public static void main(String args[]){
     int arr[]= {1,2,3,4,5};
    //store the ele at 0th index
     int temp=arr[0];
     int n=arr.length;
     for(int i=1; i<n; i++){
        arr[i-1]=arr[i];

     }
     //store the temp
     arr[n-1]=temp;

    System.out.println(Arrays.toString(arr));


    }
    
}
