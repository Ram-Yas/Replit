package Eng_List;

import java.util.Scanner;

public class Ex03 {

    /*
    Get a sentence from the user. Accept the sentence received from the user as a parameter,
    Invert sentence using Array and write a Method that returns the result as a String to the main method.

    Note: Upper and lower case letters, spaces and special characters will not be changed.

    Input :  It is very nice to write code.

    Output : .edoc etirw ot ecin yrev si tI
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir cumle giriniz: ");
        String sentence = scanner.nextLine();
        String array []= sentence.split("");

        System.out.println(reverseSentence(array));
    }

    private static String reverseSentence(String[] array) {

        String newSentence = "";
        for (int i = array.length - 1; i >= 0; i--) {
            newSentence+=array[i];
        }
        return newSentence;
    }
}
