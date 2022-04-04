package chapter03_If_Switch_Ternary;

public class Ex03 {
    /*
    Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
    Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

    Ornek:
    INPUT :25
           46
    OUTPUT :
    Numaralarin Toplami:71
    */
    public static void main(String[] args) {

        int sayi1=25;
        int sayi2=46;
        int toplam=sayi1+sayi2;
        if (toplam>=0){
            toplam =sayi1+sayi2;
            if(toplam>1000000000|| (sayi1>=1000000000 &&sayi2>=1000000000)){
                System.out.println("Overflow");            }
            else
                System.out.print("Numaralarin Toplami:"+toplam);

        }

    }

}
