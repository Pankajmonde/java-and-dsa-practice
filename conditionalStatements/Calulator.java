package conditionalStatements;

import java.util.Scanner;

public class Calulator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers and an operator (+, -, *, /):");
        int a=sc.nextInt();
        int b=sc.nextInt();
        char operator=sc.next().charAt(0);
        
        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b!=0){
                    System.out.println(a/b);
                }
                else{
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
           
        }
    }

