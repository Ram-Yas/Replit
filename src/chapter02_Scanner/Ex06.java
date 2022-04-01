package chapter02_Scanner;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Bir float giriniz:");
            float sayi = scan.nextFloat();
            short sonSayi = (short) sayi;
            System.out.print(sonSayi);


        }



}
