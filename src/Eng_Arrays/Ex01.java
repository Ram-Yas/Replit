package Eng_Arrays;

public class Ex01 {

    /*
    Write a return method to reverse number.

    Input : 12345

    Output : 54321
     */

    public static void main(String[] args) {

       String str = "12345";
       String arr [] = str.split("");

        System.out.println(tersCevir(arr));

    }

    private static String tersCevir(String[] arr) {

        String ters = "";
        for (int i = arr.length-1; i >= 0; i--) {
            ters += arr[i];
        }

        return ters;
    }

}
