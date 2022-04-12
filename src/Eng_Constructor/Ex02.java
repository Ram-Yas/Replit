package Eng_Constructor;

public class Ex02 {

    /*
    Create a student's variables in the main method and
    use this assign variables create a method named Changename,
    student as parameter get the information and change all the information in the method
    and add the new information have it print The line where we call the Rename method in the Main method is immediately
    then reprint student information Create a method named changesurname,
    this method is "lastname" as parameter get the variable.
    In the method, ask the user to enter a new last name and change the old last name (i.e. can).
     */

    public static void main(String[] args) {

        String studentSurname;
        String studentName ;

        studentSurname = "bitmedi";
        studentName = "Ogrencilik";
       Ex02 student = new Ex02("ali", "can");

    }

    private static Object changeName(String studentName, String studentSurname) {
        studentName = "veli";
        studentSurname = "gol";
        return studentName;
    }


    public Ex02(String studentName, String studentSurname) {
    }







}
