package CollectionFramework;

public class GenericBound <T extends  Number>{
    T  value1;

    public GenericBound(T value1){
        this.value1=value1;
    }


    
}
class Temp {
    public static void main(String[] args) {
        GenericBound<Integer>obj1= new GenericBound<>(10);
        GenericBound<Double>obj2= new GenericBound<>(10.10);

        Integer num =90;
        Double num2=90.50;

        System.out.println(obj1.value1);
        System.out.println(obj2.value1);
    }
}
