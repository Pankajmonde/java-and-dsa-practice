package CollectionFramework;
import  java.util.*;
public class FrequencyCount {
    
    public static void main(String agrs[]){
        int arr[]={1,2,3,4,5,6,1,3,4};
        HashMap<Integer, Integer> map = new HashMap<>();
  
        for( int ele: arr){


        //    if(  map.containsKey(ele)){
        //     int oldValue= map.get(ele);
        //     map.put(ele, oldValue+1);

        //    }else{
        //     map.put(ele, 1);
        //    }
        map.put(ele,map.getOrDefault(ele, 0)+1);
        }
        System.out.println(map);


    }        
}
