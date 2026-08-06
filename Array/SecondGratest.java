package Array;

public class SecondGratest {
    public static void main(String[] args) {
        int arr[]={11 ,7,5,3,9};

        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
  
            }else {
                if(arr[i]>secMax && arr[i]!=max){
                    secMax=arr[i];
                }
            }
        }

       System.out.println("Second greatest element is "+secMax);


    }
}
