package CollectionFramework.Iterator;

import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);

        ListIterator<Integer>it =list.listIterator();

        //hashnext()-- chekc next value hai ya phir nui , next()- next ele acccess
             while(it.hasNext()){
                System.out.println(it.next());
             }

             while(it.hasPrevious()){
                System.out.println(it.next());
             }



    }
    
}
