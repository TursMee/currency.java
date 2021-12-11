package String;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Methods4 {
    public static void main(String[] args) {
        String text = "Selenium";
        boolean res1 = text.contains("le");
        System.out.println(res1);
        System.out.println(text.contains("t"));// false
        System.out.println(text.contains("selenium"));//false because here is not uppercase S
        System.out.println(text.contains("1"));//false

        //equals();
        System.out.println(text.equals("Selenium"));//true
        System.out.println(text.equals("nium"));//false

        //equalsIgnoreCase();

        System.out.println(text.equalsIgnoreCase("SeLenium"));//true

        String text2 = "Java";
        System.out.println(text.equalsIgnoreCase(text2));//false

        String text3 = "SELENIUM";
        boolean res2 = text3.equalsIgnoreCase(text);
        System.out.println(res2);//

        text3.concat(text);//don't save ignore this line for result
        text3.toLowerCase();// ignore this line

        text = text3;
        System.out.println(text);

    }

}
