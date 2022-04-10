package Eng_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04b {

    /*
    Write a program that deletes the letters 'a' from the names in the list given as input.

    INPUT :  list1={"Ali","Veli","Ayse","Fatma","Omer"}

    OUTPUT :   [Veli,Omer]
    */


    public static void main(String[] args) {

        List<String> names =  Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer");

        ArrayList<String> aSizlar = new ArrayList<>();

        for (String w : names) {
            if (!w.toLowerCase().contains("a")) {
                aSizlar.add(w);
            }
        }
        System.out.println("aSizlar : " + aSizlar);
    }
}
