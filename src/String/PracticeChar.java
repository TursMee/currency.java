package String;

import java.util.Locale;
import java.util.Scanner;

public class PracticeChar {
    public static void main(String[] args) {
        String device = "microphone";
        System.out.println(device.charAt(0));
        System.out.println("please type a word");
        Scanner input = new Scanner(System.in);
//        String word  = input.next();
//        System.out.println(word);
//        char firstletter = word.charAt(0);
//        System.out.println(firstletter);
//        System.out.println("please type another word");
//        System.out.println(input.next().charAt(0);
        System.out.println(input.next().toUpperCase().charAt(0));

    }
}
