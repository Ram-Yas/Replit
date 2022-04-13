package Eng_Constructor;


import java.util.Scanner;

public class Ex02 {
    static String studentSurname;
    static String studentName;

    /*
     1- Create a student's variables in the main method and use this assign variables
     2- create a method named Changename, student as parameter
     3- get the information and change all the information in the method and add the new information
     4- have it print
     5- The line where we call the Rename method in the Main method is immediately then reprint student information
     6- Create a method named changesurname, this method is "lastname" as parameter get the variable. In the method, ask the user to enter a new last name and
     7- change the old last name (i.e. can).
     */
    public static void main(String[] args) {

        String studentSurname = "";
        String studentName = "";

        Ex02 student1 = new Ex02("ali", "can");
        System.out.println("student1 : " + student1);
        changeName(student1.studentName);
        System.out.println(student1);
        changeSurname(student1.studentSurname);
        System.out.println(student1);
    }

    private static void changeSurname(String studentSurname) {
        Scanner scan = new Scanner(System.in);
        System.out.print("yeni soyismi giriniz: ");
        String yeniSoyisim = scan.next();
        studentSurname = yeniSoyisim;
    }


    private static void changeName(String student1) {
        studentName = "Ahmet";
        studentSurname = "yilmaz";
    }

    public Ex02(String studentSurname, String studentName) {
        this.studentSurname = studentSurname;
        this.studentName = studentName;
    }

    public Ex02() {
    }

    @Override
    public String toString() {
        return
                "studentSurname='" + studentSurname + '\'' +
                        ", studentName='" + studentName + '\'' +
                        '}';
    }
}
