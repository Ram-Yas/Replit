package chapter01_SYSO;

public class E5 {
    /*
    Dikdortgenin alanini ve cevresini hesaplayan java kodunu yaziniz.
    A=5
    B=3
    Ipucu: Dikdortgenin Cevresi : 2*(A+B);
    Dikdortgenin Alani : A * B ;
    Ornek Cikti:
    Dikdortgenin Cevresi : 16
    Dikdortgenin Alani : 15
     */

    public static void main(String[] args) {
        int  a=5;
        int b=3;
        int cevre = 2*(a+b);
        int alan = a*b;
        System.out.println("Dikdortgenin Cevresi :"+cevre);
        System.out.println("Dikdortgenin Alani :"+alan);

    }

}
