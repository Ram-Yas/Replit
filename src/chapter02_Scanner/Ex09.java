package chapter02_Scanner;

import java.util.Scanner;

public class Ex09 {

    /*
    Girilen zamanı saniyeye çeviren bir program yazınız.
        Örnek Çıktı:
        1 saat 10 dakika 50 saniye ==>
        4250 saniye
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("cevirmek istedginiz saati giriniz: ");
        int saat = scan.nextInt();
        System.out.print("cevirmek istedginiz dakikayi giriniz: ");
        int dakika = scan.nextInt();

        System.out.print("cevirmek istedginiz saniyeyi giriniz: ");
        int saniye = scan.nextInt();

        int sonuc = ((saat*60)+dakika)*60+saniye;
        System.out.print(sonuc+ " saniye");
    }
}
