package Eng_Arrays;

public class Ex01 {

     /*
    Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)

    input : Learning java is easy

    output: maximum occurring character is : a

     */

    public static void main(String[] args) {

        String str="Learningjavaiseasysss";

        String arr[]=str.split("");

        String maxHarf="";
        int count=0;
        int maxcount=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i].equals(arr[j])){
                    count++;
                }
            }
            if (count>maxcount){
                maxcount=count;
                maxHarf=arr[i];
            }
            count=0;
        }
        System.out.println("maximum occurring character is : " + maxHarf);
    }
}
