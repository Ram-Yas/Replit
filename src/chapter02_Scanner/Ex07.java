package chapter02_Scanner;

import java.util.Scanner;

public class Ex07 {

    //int veri türünün Maximum ve Minimum değerlerini gösteren kodu konsola yazınız.
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.print("bir double sayi giriniz: ");
        double sayi = scan.nextDouble();

        int cevrilmisSayi = (int) sayi;
        System.out.print(cevrilmisSayi);

    }
}
