package chapter04;

public class Ex02 {
    /*
    Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
    Input : 30 ve 40
    Beklenen Cikti: 30 ve 40 icin GCD = 10
    30 ve 40 icin LCM = 120
     */

    public static void main(String[] args) {
        int sayi1 =30;
        int sayi2= 40;
        int GCD=1; //En buyuk ortak bolen EBOB
        int LCM; //en kucuk ortak kat OKEK

        for(int i=2; i<sayi1; i++){
            if(sayi1%i==0 && sayi2%i==0){
                GCD=i;
            }
        }
        System.out.println("GCD = "+GCD);

        LCM = (sayi1*sayi2)/ GCD;

        System.out.println("LCM = "+LCM);

    }
}
