package Eng_Arrays;

public class Ex05 {
    /*
    Write a java program that calculates the average value of array elements

    input[]= {1,2,3,4,5,6,7}

    Output : 4
     */

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 6, 7};

        int toplam = 0;

        for (int each: array
             ) {
            toplam +=each;
        }

        double average = toplam / (array.length);
        System.out.println("average = " + average);
    }
}
