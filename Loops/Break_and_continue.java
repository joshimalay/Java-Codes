public class Break_and_continue {
    public static void main(String[] args) {
        // for(int i = 0;i<=20;i+=2){
        //     System.out.println(i);
        //     if(i>=10) break;
        // }

        for(int i = 0;i<=20;i+=1){
            if(i==2 || i==8 )continue;
            if(i>=15)break;
            System.out.println("give toffee to " + i);

        }





        // int i =0;
        // while(i<=5){
        //     System.out.println(i);
        //     i++;
        //     if(i==3) break;
        // }
    }
}
