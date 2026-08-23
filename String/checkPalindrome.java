package String;
public  class checkPalindrome{
    public static void main(String[] args) {
        String s="madam";
        char arr[]= s.toCharArray();

        int n=s.length();
        int st=0, e= n-1;
        while (st < e){
            char temp=arr[st];
            arr[st]=arr[e];
            arr[e]=temp;

            st++;
            e--;

        }
        String rev="";
        for(char ch : arr){
            rev += ch;

        }
        System.out.println(s.equals(rev) ? "Palindrome": "Not palindrome");
         
    }
}