package Eng_List;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
    /*
    Write a program that deletes the letters 'a' from the names in the list given as input.

    INPUT :  list1={"Ali","Veli","Ayse","Fatma","Omer"}

    OUTPUT :   [Veli,Omer]
     */

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(List.of("Ali", "Veli", "Ayse", "Fatma", "Omer"));

        System.out.println("list in the beginning: "+list);

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {

                if (list.get(i).charAt(j)=='a' || list.get(i).charAt(j)=='A'  ) {
                    list.remove(i);
                }
            }
        }
        System.out.println("list at the end: "+list);
    }
}
