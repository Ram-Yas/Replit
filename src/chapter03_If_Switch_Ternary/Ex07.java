package chapter03_If_Switch_Ternary;

public class Ex07 {

    public static void main(String[] args) {

        String isim1 = "memet";
        String isim2 = "ahmet";

        if(isim1.length()%2==0){
            System.out.print(isim1.substring(0,isim1.length()/2)+isim2
                    +isim1.substring(isim1.length()/2));
        } else {
            System.out.print("isim1, isim2 ye eklenemiyor");
        }
    }
}
