package Eng_Arrays;

public class Ex02 {
    /*
    Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

    Input : Coding is greate.

    Output : .etaerg si gnidoC
     */
    public static void main(String[] args) {
        String str =  "Coding is greate.";
        String arr [] = str.split("");
        String arrTers="";

        for (int i = arr.length - 1; i >= 0; i--) {
            arrTers+= arr[i];

        }
        System.out.println(arrTers);
    }
}
