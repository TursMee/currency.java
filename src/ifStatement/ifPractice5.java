package ifStatement;

import java.util.Locale;
import java.util.Scanner;

public class ifPractice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter single word");
        String word = scanner.nextLine().toUpperCase();


        if(word.startsWith("M")){
            System.out.println("Monday");
        }
        if(word.charAt(0)=='T'){
            System.out.println("Tuesday or Thursday");
        }
        if(word.charAt(0)=='W'){
            System.out.println("Wednesday");
        }


        if(word.charAt(0)=='F'){
            System.out.println("Friday");
        }
        if(word.charAt(0)=='S'){
            System.out.println("Saturday or Sunday");
        }
        if(word.charAt(0)!='M' && word.charAt(0)!='T' && word.charAt(0)!='W' && word.charAt(0)!='F' && word.charAt(0)!='S'){
            System.out.println("It doesn't work");
        }
    }
}
