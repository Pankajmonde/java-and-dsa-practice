package String;

public class PrintEach {

    public static void main(String[] args) {
        String s ="hello";

        for( char ch : s.toCharArray()){
            System.out.println(ch);
        }
    }
}