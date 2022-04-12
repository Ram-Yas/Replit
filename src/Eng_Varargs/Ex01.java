package Eng_Varargs;

public class Ex01 {
    /*
    Write a return method that accepts more than one integer as parameter
    and prints the sum of integers
    Method name = sum
    if you call method like that sum(1,2,3) output =6
                                sum(1,2,3,4,5) output =15 sum(1,2) output=3
     */

    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;

        System.out.println(sumNum(number1, number2, number3, number4, number5));

    }

    private static int sumNum(Integer ... num) {

        int sum=0;

        for (int each:num
             ) {
            sum += each;
        }
        return sum;
    }
}
