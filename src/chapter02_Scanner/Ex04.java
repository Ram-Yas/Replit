package chapter02_Scanner;

import java.util.Scanner;

public class Ex04 {
    /*
        Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
        1 şeker = 1.7 gr
        Örnek Çıktı:
        Yılda 12.41 kg şeker kullanıyor. */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Gunde kac bardak cay iciyorsun:");
        int cay = scan.nextInt();
        System.out.print("Bir bardakta ne kadar seker kullaniyorsun: ");
        int seker = scan.nextInt();

        double tuketim = (cay*seker*1.7*365)/1000;
        System.out.print("Yilda "+tuketim+"kg seker kullaniyor.");
        scan.close();
    }

}
