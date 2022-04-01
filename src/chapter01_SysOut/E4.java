package chapter01_SysOut;

public class E4 {

    /*
    Dairenin alanini ve cevresini hesaplayan java kodunu yaziniz.
    r=7;
    Pi=3.14
    Ipucu:
    Dairenin Cevresi : 2Pir
    Dairenin Alani : Pirr
    Ornek Cikti:
    43.96
    153.86
     */
    public static void main(String[] args) {
        int r=7;
        double pi=3.14;
        double cevre=2*pi*r;
        double alan=pi*Math.pow(r,2);
        System.out.println(cevre);
        System.out.println(alan);
    }
}
