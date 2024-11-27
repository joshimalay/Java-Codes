public class labeled_break_and_continue {

    public static void main(String[] args) {


        leo:
        for (int i = 0; i <= 10; i++) {
            int j = 0;
            while (j <= 5) {
                if(j==3) break leo;
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }
    }
}