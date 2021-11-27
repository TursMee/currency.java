package String;

import java.util.Scanner;

public class ScannerPractice5 {
    public static void main(String[] args) {
        // we will ask user to enter a char  letter

        //if user enters char that is not english letter code should print false
        // and if it is eng letter it should be true
        System.out.println("please enter a char letter");
        Scanner more = new Scanner(System.in);
        int   userInput = more.nextInt();
        char a = (char) userInput;
        Boolean checkChar1 = a>=97 && a<=122;
        System.out.println(checkChar1);


    }
}
