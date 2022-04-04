package chapter03_If_Switch_Ternary;

public class Ex04 {

    public static void main(String[] args) {
        /*
        Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:

yanıt a ise,

"Talebiniz işleniyor" mesajı yazdırılır

yanıt b ise,

"yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır yanıt c ise,

"Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır

başka herhangi bir yanıt değeri için,

"Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
         */

        char harf = 'b';

        switch(harf){
            case 'a' : System.out.print("Talebiniz işleniyor");
                break;
            case 'b' : System.out.print("yine de ilgilendiğiniz için teşekkür ederiz");
                break;
            case 'c' : System.out.print("Üzgünüz, şu anda herhangi bir yardım yok");
                break;
            default :
                System.out.print("Geçersiz giriş, lütfen tekrar deneyin!");
                break;
        }
    }
}
