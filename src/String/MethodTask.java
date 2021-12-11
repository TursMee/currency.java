package String;

import java.util.Locale;

public class MethodTask {
    public static void main(String[] args) {
        String str = " Zero to Ten ";
        System.out.println(str.replace("Ten","Hero"));
        System.out.println(str.toUpperCase());
        System.out.println(str.replace(" ", ""));
        String newWord = str.substring(0,4);
        System.out.println(newWord);
        System.out.println(newWord.length());

        //chaining method
        str = " Zero to Ten ";
        //use int for reassigning but it shows just length
        System.out.println(str.replace("Ten","Hero").toUpperCase().trim().replace("", "").substring(0,3).length());





    }
}
