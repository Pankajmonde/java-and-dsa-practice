package Array;

public class Sorted {
    public static void main(String args[]){
     int arr[]= {3,7,19,16};
    boolean isSorted=true;
     for(int i =0 ; i<arr.length-1; i++){
        if(arr[i]> arr[i+1]){
            isSorted= false;
            break;

        }

     } 
      System.out.println(isSorted);

    }
}