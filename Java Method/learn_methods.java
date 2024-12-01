
public class learn_methods {
    public static void main(String[] args) {
        // System.out.println(1);
        // System.out.println(2);
        // greet();
        // System.out.println(45);

        int average_function = average(4,6,true);
        int doubleofAvg = average_function * 2;
        System.out.println("Hello world");
        average(4, 6,false);
        System.out.println(average_function);

    }

    static void greet(){
        System.out.println(46);
        System.out.println("Hello world");
        System.out.println(47);
    }

    public static int average(int a, int b , boolean shouldAverage){
        int avg = (a+ b) /2;
        System.out.println("The average is "+avg);
                return avg;
        
    }
}
