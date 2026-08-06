package Array;

public class CountSubarraysSumEqualTarget {
    public static void main (String args[]){
    
     int arr[]={1,2,3,7,5};
     int target=12;

     int sum=0, c=0;
     
     for(int i=0 ; i<arr.length; i++){
        sum =0;
       for( int j=i; j<arr.length; j++) {
        sum+=arr[j];
        if(sum==target) c++;
       }
     }
      System.out.println(c);
    }

}
