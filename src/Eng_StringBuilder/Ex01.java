package Eng_StringBuilder;

public class Ex01 {
    /*
    Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder
    and checks if sentence is palindrome or not (without case sensitivity)
    Eg :    input : I love Java
            Output: "Reversed sentence : avaJ evol I . It is not a palindrome"
     */
    public static void main(String[] args) {

        StringBuilder sentence = new StringBuilder("Madam");
       // sentence.reverse(); //as StringBuilder is immutable, no need to da assignment
        StringBuilder result = new StringBuilder(sentence.reverse());
        //if (sentence.toString().toLowerCase().equals(result.toString().toLowerCase())){
            if (sentence.equals(result)){ //the same result for 15th line

                System.out.println("Reversed sentence : "+result+ " It is palindrome");
        } else System.out.println("Reversed sentence : "+result+ " It is not palindrome");

    }
}
