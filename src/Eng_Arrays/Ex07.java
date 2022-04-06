package Eng_Arrays;

public class Ex07 {
    /*
    Write a method that accepts an array as parameter and returns sum off all elements in the array Then print the result in the main method.

    Eg :    input : {1,2,3,4,5,6,7,8};
            output: 36
     */

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};

        int toplam = sumOfArray(array);
        System.out.println(toplam);


    }

    private static int sumOfArray(int[] array) {
        int sum = 0;
        for (int each : array
        ) {
            sum += each;
        }
        return sum;
    }
}
