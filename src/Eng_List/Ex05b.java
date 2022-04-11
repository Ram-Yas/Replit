package Eng_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05b {

     /*
    Write a program that accepts an integer as input and
    prints first 10 prime numbers greater than input
    Check numbers if they are even or not in a return method.

    Input : 5

    Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir tamsayi giriniz: ");
        int sayi = scan.nextInt();

        int count = 0;
        //int sayac = 0;

        List<Integer> numbers = new ArrayList<Integer>();
        sayi++;

        while (count < 10) {
            int sayac = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    sayac++;
                }
            }
            if (sayac == 0) {
                numbers.add(sayi);
                count++;
            }
            sayi++;
        }
        System.out.println(numbers);


    }

}
