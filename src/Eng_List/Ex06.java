package Eng_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex06 {

    /*
    Write a program to find the common elements between two String Arrays (without case sensitivity)

    Input1 : {John,Brad,Ange,Sofia,Emily}

    Input2 : {sofia,brad,grace,emily,hazel}

    Output : [sofia,brad,emily]
     */

    public static void main(String[] args) {

        String input1 []=  {"John","Brad","Ange","Sofia","Emily"};
        String input2 []=  {"sofia","brad","grace","emily","hazel"};

        List<String> list1 = new ArrayList<String>(Arrays.asList(input1));
       // list1.toUpperCase();
        System.out.println(list1);
        List<String> list2 = new ArrayList<String>(Arrays.asList(input2));
        System.out.println(list2);

        List<String> output = new ArrayList<String>();


            for (int j = 0; j < list2.size(); j++) {
                for (int i = 0; i < list1.size(); i++) {
                if (list2.get(j).toLowerCase().contains(list1.get(i).toLowerCase())){
                    output.add(list2.get(j));
                }

            }
        }
        System.out.println(output);



    }
}
