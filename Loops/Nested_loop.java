public class Nested_loop {
    public static void main(String[] args) {
        // if a loop exits inside the body of another loop is called nested loop
        // for (int count =0;count<=10;count ++){
        // for(int j=1;j<6;j++){
        // System.out.print(j+" ");
        // }
        // System.out.println("printed "+count);
        // }

        for (int i = 0; i < 18; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <= 10; i++) {
            int j = 0;
            while (j <= 5) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }
    }
}
    