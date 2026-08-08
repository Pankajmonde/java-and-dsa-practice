package Array;

public class LinearSearch {
    public static void main(String[] args) {
        
        int arr[]={1,2,10,7,30};
        int target= 100;
        int n=arr.length , ans=-1;

        for(int i=0; i<n; i++){
            if(arr[i]== target){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
    
}
