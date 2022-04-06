package chapter04_For_while;

import java.util.Scanner;

public class Ex01 {
    /*
    Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
    char ch1= 'a' ;
	String name =“John came late"
	Expected Output: Number of a = 2
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz : ");
        String str = scan.nextLine();
        System.out.print("Bir harf girin: ");
        String ch1 = scan.next();
        int sayac =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch1.charAt(0)){
                sayac++;
            }
        }

        System.out.print("Number of "+ch1.charAt(0)+"="+sayac);


    }
}
