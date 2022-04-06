package chapter04_For_while;

import java.util.Scanner;

public class Ex04_Faktoriyel {

    /*
    Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
    Input : 6
    Output: 6!=65432*1=720
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Faktoriyelini hesaplamak istedigin sayiyi girin :");
        int sayi = scan.nextInt();
        int faktoriyel = 1;
        int baslangic=1;

        for (int i = 2; i <=sayi ; i++) {
            faktoriyel*=i;
        }
        System.out.print(sayi+"!="+faktoriyel);
    }
}
