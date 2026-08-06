package Array;
import java.util.Arrays;
public class RightRoteteByOne {

    public static void main(String args[]){
   int arr[]={1,2,3,4,5};
   int n=arr.length;

   //store last element 
   int temp= arr[n-1];

   //shift element to right

   for(int i=n-1; i>0; i--){
    arr[i]=arr[i-1];
   }

   //put last element at first positon
   arr[0]=temp;
   System.out.println(Arrays.toString(arr));


    }
    
}
