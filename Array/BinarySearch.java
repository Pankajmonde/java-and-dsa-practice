package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,10,20,30,40,50,123,33,43,56,};
        int target=40;
        int n=arr.length ,ans=-1;

        int s=0, e=n-1;

        while(s<=e){
            int mid =(s+e)/2;
            //s+(e-s)/2 integer overflow 
            if(arr[mid]==target){
                ans=mid;
                break;
            }else if(arr[mid]<target){
                s=mid+1;
            }else {
                e=mid-1;
            }

        }
        System.out.println(ans);
    }


    
}
