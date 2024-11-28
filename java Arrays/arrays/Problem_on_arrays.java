package arrays;


public class Problem_on_arrays {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        int numbers[] = {23,12,34,45,56,67,89};
        int sum =0;
//        for (int number: numbers){
//            sum += number;
//        }
//        System.out.println("Sum is: "+sum);


//         for(int i=0;i<numbers.length;i++){
//             sum = sum + numbers[i];
//             System.out.println("sum = "+sum);
//         }

        // int min = Integer.MAX_VALUE;
        // for(int number:numbers){
        //     if(number<min){
        //         min = number;
        //     }
        // }
        // System.out.println("Number min : "+ min);

        // Multi  dimensional array.
        // row -> student roll number
        // column -> subject position
        // int marks[][] = new int[4][3];

        int marks[][] = {
            {12,98,34},
            {12,87,67},
            {23,45,67},
            {45,34,56},
        };

        System.out.println(marks[2][1]);
        System.out.println(marks[2][2]);
        System.out.println(marks[3][1]);


        // marks[0][0] = 12;
        // marks[0][1] = 98;
        // marks[0][2] = 34;

        // marks[1][0] = 12;
        // marks[1][1] = 87;
        // marks[1][2] = 67;

        // marks[2][0] = 12;
        // marks[2][1] = 98;
        // marks[2][2] = 34;

        // marks[3][0] = 12;
        // marks[3][1] = 87;
        // marks[3][2] = 67;





    }

}
