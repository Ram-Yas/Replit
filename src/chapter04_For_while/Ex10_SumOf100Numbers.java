package chapter04_For_while;

public class Ex10_SumOf100Numbers {

    /*
    1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.

    OutPut: Sayilarin Toplami : 5050

     */

    public static void main(String[] args) {

        int toplam=0;
        for(int i=0; i<=100; i++){
            toplam +=i;
        }
        System.out.print("Sayilarin Toplami : "+toplam);
    }
}
