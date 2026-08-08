package Array;
import java.util.Arrays;

public class MoveZero {

    public static void main (String args[]) {

    int arr[]={1,0,3,0,5};

    int n=arr.length;

    int ans[]=new int[n];

    int s=0, e=n-1;

    for(int i=0; i<n; i++){
        if(arr[i] !=0)
           ans[s++]=arr[i];
        else 
        ans[e--]=arr[i];
    }
       System.out.println(Arrays.toString(ans));

    } 
    
}

