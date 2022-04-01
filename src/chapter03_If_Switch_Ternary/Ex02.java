package chapter03_If_Switch_Ternary;

import java.util.Scanner;

public class Ex02 {
    /**
     Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
     Input :
     John White
     1234234534561478
     Output : Name :
     J* W**
     CCN : ** ** **** 1478
     Ilk Harfler Buyuk harf ile baslamalidir.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi girin:");
        String isim = scan.next().toUpperCase();
        System.out.print("Soyadinizi girin:");
        String soyad = scan.next().toUpperCase();
        System.out.print("Kredi Karti numaranizi girin:");
        String kKNo = scan.next();

        isim=isim.substring(0,1)+isim.substring(1).replaceAll("\\S","*");
        System.out.print(isim);
        soyad=soyad.substring(0,1)+soyad.substring(1).replaceAll("\\S","*");
        System.out.print(" "+soyad+"\n");

        kKNo = "**** **** **** "+kKNo.substring(kKNo.length()-4);
        System.out.print("CCNO:"+kKNo);

    }
}
