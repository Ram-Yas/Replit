package chapter02_Scanner;

import java.util.Scanner;

public class Ex02 {
/*
    Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

    Ornek Cikti :

    Alan: 9

    Cevre: 12*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Karenin kenar uzunlugunu girin: ");
        int kenar = scanner.nextInt();

        int cevre = kenar*4;
        int alan = kenar*kenar;
        System.out.println("Alan: "+alan);
        System.out.println("Cevre: "+cevre);

    }
}
