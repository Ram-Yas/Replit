package Eng_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05 {

    /*
    Write a program that accepts an integer as input and
    prints first 10 prime numbers greater than input
    Check numbers if they are even or not in a return method.

    Input : 5

    Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayi giriniz: ");
        int number = scanner.nextInt();

        int count = 0;
        number++;
        List<Integer> primeNumbers = new ArrayList<Integer>();

        while (count< 10) { //continue until counter equals 10

            int sayac = 0;
            for (int i = 2; i < number; i++) {//control of the numbers one by one
                if (number % i == 0) { //if the number is divisible with any other number
                    sayac++; // if so increase the sayac
                }
            }
            if (sayac == 0) { //that means our number is not divisible with any other number

                primeNumbers.add(number); //add the number on the list
                count++; //as the number is prime, increase the counter
            }
            number++; //increase the number

        }

        System.out.println(primeNumbers);//print list

    }
}
