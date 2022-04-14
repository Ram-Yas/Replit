package Eng_Constructor;

public class Kita {
    /*
   Create 2 constructors one is with parameters, the other one is without parameter.
   By using that constructors create at least 2 objects then print their features on the console.
     */

    String ulke;
    String baskent;
    int population;

    public Kita (String ulke, String baskent, int population) {
        this.ulke = ulke;
        this.baskent = baskent;
        this.population = population;
    }

    public Kita() {
    }

    public static void main(String[] args) {
        Kita asya = new Kita("Turkiye", "Ankara", 75000000);
        Kita afrika = new Kita("Togo", "Lome",8000000);
        Kita avrupa = new Kita();
        System.out.println(asya);
        System.out.println(afrika);
        System.out.println(avrupa);
    }

    @Override
    public String toString() {
        return
                "ulke='" + ulke + '\'' +
                ", baskent='" + baskent + '\'' +
                ", population=" + population ;
    }
}
