package Eng_Constructor;

import java.util.Locale;
import java.util.Scanner;

public class Scrabble {
    /*
    Write a Scrabble Game for two person Rules OK==
    1- At the beginning Ask to first Player enter a word for starting game OK
    2- Then change the player ask to new player if given word is valid or not OK
        i) If new player accepts the given word add number of letters in the word as points to player who wrote the word And go to step 3 OK
        ii) If new player does not accept the word as valid then print "Invalid word, player X(Current player) won the game" and finish the game

OK  3- Ask to users if user want to continue game or not OK
        i) If player want to continue, OK ask to user a letter to add to word OK and ask to user side to add (beginning or end) OK
       then add letter to word and run step 2
OK      ii) If player does not want to continue then print "Game Finished" and print points and winner
     */


    static int player1_Puan;
    static int player2_Puan;
    static int puan;

    static String word;
    static String harf;
    static String tercih;
    static int tercihHarf1;
    static int tercihHarf;
    static int tercihHarf2;
    static int tercihdevam1;
    static int tercihDevam;
    static int tercihdevam2;
    static Scanner scan = new Scanner(System.in);
    Scrabble player1 = new Scrabble(0,0,0);
    Scrabble player2 = new Scrabble(0,0,0);

    public Scrabble() {
    }

    public Scrabble(int puan, int tercihHarf, int tercihDevam) {

    }

    public static void main(String[] args) {

        Scrabble player1 = new Scrabble(0, 0, 0);
        Scrabble player2 = new Scrabble(0, 0, 0);
        System.out.println("oyuna hosgeldiniz...");
        System.out.print(player1+" bir kelime girsin...: ");
        word = scan.nextLine();
        kelimeKontrol(word);
        harfGir();
        ikincioyuncuHarfgirmetodu();
    }

    private static void kelimeKontrol(String word) {
        System.out.println(word + " kelimesi kabul ise E degilse H giriniz");
        tercih = scan.nextLine().toUpperCase(Locale.ROOT);
        switch (tercih) {
            case "E":
                setPuan(word.length());
                puanekleme1oyuncu();
                break;
            case "H":
                sonuc();
                break;
        }
    }

    private static void harfGir() {
        System.out.println("birinci oyuncu gecerli bir harf giriniz");
        harf = scan.nextLine();
        System.out.println(harf + " harfi kelimenin basina gelmesi icin 1 && sonu icin 2 giriniz");
        tercihHarf = scan.nextInt();
        if(tercihHarf == 1){
            word= harf+word;
        } else if(tercihHarf == 2){
            word=word+harf;
        } else {
            System.out.println("yanlis bir tercih girdiniz");
        }
        kelimeKontrol(word);
    }

    private static void sonuc() {
        if (player1_Puan > player2_Puan) {
            System.out.println("Invalid word,end the game");
            System.out.println(player1_Puan + " puan ile player1 kazandi");
        } else if (player1_Puan < player2_Puan) {
            System.out.println("Invalid word,end the game");
            System.out.println(player2_Puan + " puan ile player2 kazandi");
        } else if (player1_Puan == player2_Puan) {
            System.out.println("Invalid word,end the game");
            System.out.println(" esit puan berabere");
        }

    }

    public static void puanekleme1oyuncu() {
       //player1 += (word.length());
    }

    private static void puanekleme2oyuncu() {
        player2_Puan += (word.length());
    }

    private static void birincioyuncuHarfgirmetodu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci oyuncu gecerli bir harf giriniz");
        harf = scan.nextLine();
        System.out.println(harf + " harfi kelimenin basina gelmesi icin 1 && sonu icin 2 giriniz");
        tercihHarf1 = scan.nextInt();
        String s = tercihHarf1 == 2 ? (word = word.concat(harf)) : (word = harf.concat(word));

        System.out.println("ikinci oyuncu==> " + word + " kelimesi kabul ise 1 degilse 2 giriniz");
        tercihdevam2 = scan.nextInt();
        if (tercihdevam2 == 1) {
            puanekleme1oyuncu();
            ikincioyuncuHarfgirmetodu();

        } else if (tercihdevam2 == 2) {
            sonuc();
        }
    }

    private static void ikincioyuncuHarfgirmetodu() {
        Scanner scan = new Scanner(System.in);
        System.out.print("ikinci oyucu gecerli bir harf giriniz: ");
        harf = scan.nextLine();
        System.out.println(harf + " harfi kelimenin basina gelmesi icin 1 && sonu icin 2 giriniz: ");
        tercihHarf2 = scan.nextInt();
        String s = tercihHarf2 == 2 ? (word = word.concat(harf)) : (word = harf.concat(word));

        System.out.println("birinci oyuncu==> " + word + " kelimesi kabul ise 1 degilse 2 giriniz: ");
        tercihdevam1 = scan.nextInt();
        if (tercihdevam1 == 1) {
            puanekleme2oyuncu();
            birincioyuncuHarfgirmetodu();

        } else if (tercihdevam1 == 2) {
            sonuc();
        }
    }

    public static int getPlayer1_Puan() {
        return player1_Puan;
    }

    public static void setPlayer1_Puan(int player1_Puan) {
        Scrabble.player1_Puan = player1_Puan;
    }

    public static int getPlayer2_Puan() {
        return player2_Puan;
    }

    public static void setPlayer2_Puan(int player2_Puan) {
        Scrabble.player2_Puan = player2_Puan;
    }

    public static int getPuan() {
        return puan;
    }

    public static void setPuan(int puan) {
        Scrabble.puan = puan;
    }

    public static String getWord() {
        return word;
    }

    public static void setWord(String word) {
        Scrabble.word = word;
    }

    public static String getHarf() {
        return harf;
    }

    public static void setHarf(String harf) {
        Scrabble.harf = harf;
    }

    public static String getTercih() {
        return tercih;
    }

    public static void setTercih(String tercih) {
        Scrabble.tercih = tercih;
    }










}

