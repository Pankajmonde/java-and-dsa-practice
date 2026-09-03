package CollectionFramework;
import java.util.*;

public class RemoveDuplicate {

    public static  void main(String args[]){
     int arr[]= {1,2,3,2,3,4,5,6,6,5};

     Set<Integer> set = new HashSet<>();

     for(int ele: arr){
        set.add(ele);
     }
     System.out.println(set);



    }
    
}
