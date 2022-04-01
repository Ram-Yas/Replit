package chapter02_Scanner;

import java.util.Scanner;

public class Ex08 {
    /*
    Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.
    Örnek Çıktı:
    Verilen tamsayının rakamları toplamı 10'dur.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("uc basamakli bir sayi giriniz: ");
        int sayi = scan.nextInt();

        int rakamlarToplami = 0;

        for(int i=0; i<3; i++){
            rakamlarToplami+= (sayi%10);
            sayi /=10;    }
        System.out.print("Verilen tamsayının rakamları toplamı "+rakamlarToplami+"'dur.");

    }
}
