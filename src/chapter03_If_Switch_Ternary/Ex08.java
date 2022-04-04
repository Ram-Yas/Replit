package chapter03_If_Switch_Ternary;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Bir string giriniz: ");
        String str = scan.next();

        if(str.length()>=2){
            for(int i=0; i<3; i++){
                System.out.print(str.substring(str.length()-2));
            }
        }else System.out.print("String en az 2 karakterli olmalidir");

        scan.close();
    }
    /*
    Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT : Mustafa

OUTPUT : fafafa
     */
}
