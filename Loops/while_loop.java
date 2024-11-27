import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean haslearnt = false;
        while(!haslearnt){
            System.out.println("Went to school,tried to learn");
            System.out.println("Have you understood?");
            haslearnt = sc.nextBoolean();
        }
    }
}
