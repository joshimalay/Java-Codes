public class learn_maths {
    public static void main(String[] args) {
        int a =7;
        int b = 5;
        System.out.println(Math.min(a,b));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(a, b));
        System.out.println(Math.abs(a));
        System.out.println(getrandom(10, 20));
        System.out.println(Math.floor(5.7));
        System.out.println(Math.ceil(7.1));
        System.out.println(Math.round(4.89));
    }
    public static int getrandom(int a,int b){
        // return (int) (Math.random()*6);
        return (int) (Math.random()*(b-a+1) + a);
    }
}
