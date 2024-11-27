
public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Data Types");
        boolean isPassed = true;
        int count = 12;
        int countint = count;

        byte marks = 13;
        short stundentcount = 1355;
        float pi = 3.14f;
        double secondpi = 3.1457567564534237823;


        System.out.println(pi);
        System.out.println(secondpi);   
        System.out.println(isPassed);
        System.out.println(count);
        System.out.println(marks);
        System.out.println(stundentcount);
        System.out.println(count);

        char myLetter = 'A';
        System.out.println(myLetter);
        // Data Types Implicit conversion
        int age =150;
        byte newage = (byte)age;
        System.out.println(newage); 

    }
}
