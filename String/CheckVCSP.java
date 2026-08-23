package String;

public class CheckVCSP {
    public static void main(String[] args) {
        String s= "Hello aur kaise ho";

        int v=0, c=0, sp=0;

        for(char ch : s.toCharArray()){
            switch (ch) {
                case 'a','e','i','o','u' -> v++;
                case ' '-> sp++;
                default -> c++;
                    
            }


        }
        System.out.println("Vowels= "+ v + ", Consonant= "+ c +" amd spaces= "+ sp);
    }
}
