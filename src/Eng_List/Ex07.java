package Eng_List;

import java.util.ArrayList;
import java.util.List;

public class Ex07 {

    /*
    write a Java program to removes a specific element from an array and put the remaining elements in a new array and prints the new array

    Input :{1,2,3,4,5,6}

    element:6

    Output : [1,2,3,4,5]
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6));

        System.out.println(list);


        List<Integer> newList = new ArrayList<Integer>();
        int number = 6;


        for (int i = 0; i < list.size(); i++) {

            if (list.get(i)==number){
                list.remove(i);
            } else
            newList.add(list.get(i));
        }

        System.out.println(newList);
    }
}
