package Eng_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02 {

    /*
    Create a 10-element list. Swap the 8th element with the 3rd element.

    INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

    Output: [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
     */

    public static void main(String[] args) {


        String names[]={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

        List<String> list1= Arrays.asList(names);
        String colon="";
        colon=list1.get(3);
        list1.set(3,list1.get(5));

        list1.set(5,colon);
        System.out.println(list1);
    }
}
