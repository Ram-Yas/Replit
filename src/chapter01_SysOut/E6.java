package chapter01_SysOut;

public class E6 {
    /*
    Verilen 5 sayinin ortalamasiniz hesaplayan java kodunu yaziniz.
    Ortalamasi alinacak Sayilar : 22, 20, 30, 28, 50
    Ornek Cikti:
    Sayilarin Ortalamasi : 30
     */

    public static void main(String[] args) {
        int sayi1 = 22;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 28;
        int sayi5 = 50;
        int ortalama= (sayi1 + sayi2+sayi3+sayi4+sayi5)/5;
        System.out.println("Sayilarin Ortalamasi : "+ortalama);
    }
}
