package chapter02_Scanner;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir dakika girin: ");
        int dakika = scan.nextInt();

        int yil = dakika/(60*24*365);
        int gun =  dakika/(60*24) - yil * 365 ;

        System.out.print(dakika + " dakika yaklaşık "+yil+ " yıl "+gun+" gündür");

    }
}

