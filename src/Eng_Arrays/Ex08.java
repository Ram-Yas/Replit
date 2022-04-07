package Eng_Arrays;

import java.util.Arrays;

public class Ex08 {
    /*
    Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.

    Input1={1,2,3,4}

    Input2={5,6}

    Output={1,2,3,4,5,6}
     */

    public static void main(String[] args) {
        int [] Input1={1,2,3,4};
        int []  Input2={5,6};

        //System.out.println(mergeArrayMembers(Input1, Input2));
        System.out.println(Arrays.toString(mergeArrayMembers(Input1, Input2)));


    }

    private static int[] mergeArrayMembers(int[] input1, int[] input2) {
        int newArray [] = new int[input1.length+input2.length];

        for (int i = 0; i < input1.length; i++) {
            newArray[i] = input1[i];

        }
        for (int i = 0; i < input2.length; i++) {
            newArray [input1.length+i] =input2[i];
        }

        return newArray;
    }
}
