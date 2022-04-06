package chapter04_For_while;

public class Ex09_SayiyiTerstenYazdirma {

    /*
    Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

    Input :1238

    Output :Girilen Numananin Tersi: 8321
     */

    public static void main(String[] args) {


        int sayi = 1238;

        System.out.print("Girilen Numananin Tersi: ");
        while (sayi>0){
            System.out.print(sayi%10);
            sayi/=10;
        }


    }

}
