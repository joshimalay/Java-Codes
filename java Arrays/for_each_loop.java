public class for_each_loop {

    public static void main(String[] args) {
        String names[] = {"Ram" , "Malay" , "Vasu" , "Soma"};
        for (int i=0;i< names.length;i++){
            System.out.println("Names is: "+names[i]);

        }
        for(String name: names){
            System.out.println("For each loop is :" +name);
        }
    }
}
