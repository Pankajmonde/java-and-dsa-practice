package CollectionFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakingInputViaBuf {
    public static void main(String[] args) throws  IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); // read data in chunks 
        
        int a =Integer.parseInt(br.readLine()); //string
        int b =Integer.parseInt(br.readLine()); //string
        System.out.println(a+b); 
    }
    
}
