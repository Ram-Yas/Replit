package chapter02_Scanner;

import java.util.Scanner;

public class Ex01 {
    /*
    Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayi girin: ");
        int sayi = scanner.nextInt();
        double sonuc = Math.pow(sayi,3)/2;
        System.out.println(sonuc);

    }
}
