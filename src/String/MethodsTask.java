package String;

import java.util.Scanner;

public class MethodsTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please give a sentence");
        String sentence = input.nextLine();

        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length()-1));
        System.out.println(sentence.charAt(sentence.indexOf(sentence.length()-1)/2 ));
        System.out.println(sentence.indexOf("x"));
        System.out.println(sentence.length());


        System.out.println(sentence.indexOf("c", sentence.indexOf("c")
        +1));

    }
}
