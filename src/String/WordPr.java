package String;

import java.util.Scanner;

public class WordPr {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter random word");

        String word = scanner.nextLine();

        System.out.println("Enter letter ");
        String letter = scanner.nextLine();

        System.out.println("Enter the number of letters your word consist");
        int number = scanner.nextInt();


        System.out.println("Enter letter to find index");
        String let2 = scanner.nextLine();
        System.out.println(let2.indexOf(let2));
        System.out.println(number==word.length());












    }
}
