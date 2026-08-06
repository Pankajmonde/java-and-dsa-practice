package Array;

public class Reverse {
     public static void main(String agrs[]){
      
        int arr[]={1,2,3,4,5};
        // int rev[]=new int[arr.length];
        // int j=0;

        for(int i=arr.length-1; i>=0 ; i--){
            System.out.print(arr[i]+" ");
           // rev[j++]=arr[i];
        }
        //System.out.println(Arrys.toString());

     }
}

//Two pointer 
 
// public class Reverse {
//     public static void main(String agrs[]){

//         int arr[]={1,2,3,4,5};

//         int start=0, end=arr.length-1;

//         while(start < end){
//             int temp= arr[start];
//             arr[start] =arr[end];
//             arr[end]=temp;
//             start++;
//             end--;
//         }

//         System.out.println(Arrays.toString(arr));


//         }
//     }





