package chapter03_If_Switch_Ternary;

import java.util.Scanner;

public class Ex05 {
    /*
    Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
    INPUT:
    Ay Numarasi:2
    Yil : 2016
    OUTPUT : Subat 2016 29 Gundur.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ay numarasini girin : ");
        int secim = scan.nextInt();
        System.out.print("Yil numarasini girin : ");
        int yil = scan.nextInt();


        switch(secim){

            case 2 : System.out.print("Subat "+yil+ " 29 Gundur" );
                break;
            case 1 : System.out.print("Ocak "+yil+ " 31 Gundur" );
                break;
            case 3: System.out.print("Mart "+yil+ " 31 Gundur" );
                break;
            case 4 : System.out.print("Nisan "+yil+ " 30 Gundur" );
                break;
            case 5 : System.out.print("Mayis "+yil+ " 31 Gundur" );
                break;
            case 6 : System.out.print("Haziran "+yil+ " 30 Gundur" );
                break;
            case 7 : System.out.print("Temmuz "+yil+ " 31 Gundur" );
                break;
            case 8 : System.out.print("Agustos "+yil+ " 31 Gundur" );
                break;
            case 9 : System.out.print("Eylul "+yil+ " 30 Gundur" );
                break;
            case 10 : System.out.print("Ekim "+yil+ " 31 Gundur" );
                break;
            case 11 : System.out.print("Kasim "+yil+ " 30 Gundur" );
                break;
            case 12 : System.out.print("Aralik "+yil+ " 31 Gundur" );
                break;




        }

    }

}
