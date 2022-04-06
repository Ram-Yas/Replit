package Eng_Arrays;

public class Ex06 {
    /*
    Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

    Input : {3,2,5,4,1,6}

    Output :

    min: 1

    max: 6
     */
    public static void main(String[] args) {

        int arr [] = {3,2,5,4,1,6};

        printMinMax(arr);

    }

    private static void printMinMax(int[] arr) {
        int min= arr[0];
        int max=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min=arr[i];
            }else if (arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println("Array'in max degeri : "+max);
        System.out.println("Array'in min degeri : "+min);
    }
}
