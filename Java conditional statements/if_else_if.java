// Java if else if - else statements 
//  In Java, we have an if...else...if ladder, that can be used to execute one block of code among multiple other blocks.


public class if_else_if {
    public static void main(String[] args) {
        int day =3;
        if(day==1){
            System.out.println("Go to Home");
        } 
        else if(day==2){
            System.out.println("Go to village");
        }
        else if(day==3){
            System.out.println("Go to party");
        }
        else {
        System.out.println("Go to office");
        }
        System.out.println("Went someway today");

    }
}
