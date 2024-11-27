
import java.util.Scanner;
public class Switich_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day:");
        int day = sc.nextInt();

        // if(day==1){
        //     System.out.println("Today is Sunday");
        // }else if(day==2){
        //     System.out.println("Today is Monday");
        // }else if(day==3){
        //     System.out.println("Today is Tuseday");
        // }else if(day==4){
        //     System.out.println("Today is Wednesday");
        // }else if(day==5){
        //     System.out.println("Today is Thrusday");
        // }else if(day==6){
        //     System.out.println("Today is Friday");
        // }else if(day==7){
        //     System.out.println("Today is Satruday");
        // }
        switch (day) {
            case 1:
                System.out.println("Today is sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday.");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thrusday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
            
        }

    }
}
