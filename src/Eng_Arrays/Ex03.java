package Eng_Arrays;

import java.util.Arrays;

public class Ex03 {
    /*
    Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

    input : ade1r4d3

    output : 8

    Hint : Use Character.isDigit()
           Integer.valueOf()
         */

    public static void main(String[] args) {
        String str="ade1r4d3";
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));
        sumOfDigit(arr);
    }

    private static void sumOfDigit(String[] arr) {
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            if (Character.isDigit(arr[i].charAt(0))) {
                sum+=Integer.valueOf(arr[i]);
            }

        }
        System.out.println("the sum of the digits:" +sum);
    }

}
