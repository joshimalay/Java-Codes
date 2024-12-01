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

        int min = Integer.MAX_VALUE;
        for(int number:numbers){
            if(number<min){
                min = number;
            }
        }
        System.out.println("Number min : "+ min);
    }

}
