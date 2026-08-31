package CollectionFramework;

public class Generic<T> { //type parameter 
    T value ;

    public Generic (T value){
        this.value=value;
    }
    public T getValue(){
        return value;
    }

}
    class Temp {
    public static void main(String[] args) {

        //help in compile time which data 
    
        Generic<Integer>obj1= new Generic<>(10);
        Generic<String>obj2= new Generic<>("20");
        Generic<Double>obj3= new Generic<>(90.30);


        Integer value1=obj1.getValue();
        String value2=obj2.getValue();
        Double value3=obj3.getValue();

        System.out.println(value1);
        
        

    }
    
}
