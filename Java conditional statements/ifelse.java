// Java if-else statements
// The if statement executes a certain section of code if the test expression is evaluated to true. 

// Statements inside the body of else block are executed if the test expression is evaluated to false. 

// This is known as the if-...else statement in Java.
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        // int age = 2;
        // if(age>=18){
        //     System.out.println("You can vote");
        //     System.out.println("Good Moraning");
        // }else{
        //     System.out.println("You cannot not vote");
        // }
    //     int day =6;
    //     if(day==1){
    //         System.out.println("Go to Home");
    //     }
    //     else {
    //     System.out.println("Go to office");
    //     }
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter The time:");
           float time = sc.nextFloat(); 
           if(time >=12.00 && time<=18.00){
            System.out.println("Time for snacks");
           }else {
            System.out.println("Time for work");
           }
    }
}
