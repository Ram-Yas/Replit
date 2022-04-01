package chapter02_Scanner;

import java.util.Scanner;

public class Ex03 {
    /*
    Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.
    Örnek Çıktı:
        Alan: 32
        Çevre: 24
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("dikdortgenin uzun kenarini girin: ");
        int uzun = scan.nextInt();
        System.out.print("dikdortgenin kisa kenarini girin: ");
        int kisa = scan.nextInt();
        int alan = uzun*kisa;
        System.out.println("Alan: "+alan);
        int cevre = (uzun+kisa)*2;
        System.out.println("Cevre: "+cevre);

    }
}
