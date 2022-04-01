package chapter03_If_Switch_Ternary;

import java.util.Scanner;

public class Ex01 {

    /*
    Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
    IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
    BMI 18,5'in altındaysa zayıfsınız
    BMI 18,5 ile 25 arasında ise kilonuz idealdir
    BMI 25-30 arasındaysa şişmansınız
    BMI 30'dan büyük veya eşitse, obez
    Input:
    Output:
    Agirlik : 71
    Boy : 1,72
    BMI : 23.99945916711736
    Zayifsiniz.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Koilonuzu girin: ");
        double kilo = scan.nextDouble();
        System.out.print("Boyunuzu girin: ");
        double boy = scan.nextDouble();
        double bmi = kilo / (boy * boy);
        System.out.println("Agirlik:" + kilo);
        System.out.println("Boy:" + boy);
        System.out.println("BMI:" + bmi);
        if (bmi > 0 && bmi < 18.5) {
            System.out.print("Zayifsiniz.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.print("kilonuz idealdir");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.print("sismansiniz");
        } else if (bmi >= 30) {
            System.out.print("Obezsiniz");
        } else System.out.print("Yanlis giris yaptiniz");


    }
}