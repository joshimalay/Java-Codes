import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age:");
        // int age = sc.nextInt();
        // System.out.println("Your age is:  "+age);

        float Firstnumber = sc.nextFloat();
        long SecondNumber = sc.nextLong();
        float result =  (Firstnumber+SecondNumber);
        System.out.println(result);
        sc.close();
    }
}
 