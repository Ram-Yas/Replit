package chapter04;

public class Ex03 {

    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        Input :
        String str=“Javaisalsoeasy”
        Output: a s
         */

        String str ="Javaisalsoeasy";
        String yeni ="";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)&& !yeni.contains(str.substring(i, i+1))){ //i j ye esitse ve yeni str i charAtin de olan karakteri icermiyorsa (bu islem substring ile yapilmis)
                    yeni+=str.charAt(i)+" ";
                }
            }
        }
        System.out.println(yeni);
    }
}
