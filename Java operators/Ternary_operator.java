// Java Ternary Operator 
// A ternary operator evaluates the test condition and executes a block of code based on the result of the condition. 
// The ternary operator can be used to replace certain types of if...else statements. condition? expression: expression2;
// condition? expression: expression2;

import java.util.Scanner;
public class Ternary_operator{
    public static void main(String[] args) {
        // int a  = 12;
        // int b = 23;
        // int c = 92;
        // int max = 0; 
        // if(a>b){
        //     max = a;
        // }else{
        //     max =b;
        // }
        // user input 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        max = a>b ? a>c ? a:c : b>c ? b:c;
        System.out.println("The value of max "+max);
        sc.close();
    }
}