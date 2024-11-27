import java.util.Scanner;
public class nested_ifelse{
    public static void main(String[] args){
        // fint the maxmium number from three number
        // int a =12;
        // int b = 78;
        // int c =90;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (a > b) {
            System.out.println("a is bigger than b");
            if (b > c) {
                System.out.println("b is bigger than c");
                System.out.println("b is the largest " + b);
            } else if (c > d) {
                System.out.println("c is bigger than d");
                System.out.println("c is the biggest " + c);
            } else {
                System.out.println("d is the biggest " + d);
            }
        } else {
            if (b > c) {
                System.out.println("b is bigger than c");
                if (b > d) {
                    System.out.println("b is the biggest " + b);
                } else {
                    System.out.println("d is the biggest " + d);
                }
            } else {
                if (c > d) {
                    System.out.println("c is the biggest " + c);
                } else {
                    System.out.println("d is the biggest " + d);
                }
            }
        }
    
}
}