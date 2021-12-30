package loop.ForEach;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        char[] chs={'A','4','&','z','3','u','*'};
        //by using for each loop print out letters only

        for(char ch:chs){
            if(ch>='A'&&ch<='Z' || ch>='a'&&ch<='z'){

                System.out.println(ch);
            }
        }
        System.out.println("==============");
        for(char letter:chs){
            if(Character.isAlphabetic(letter)){
                System.out.println("This is letters "+letter);
            }else if(Character.isDigit(letter)){
                System.out.println("There is a digit "+letter);
            }else{
                System.out.println("This is symbols"+letter);
            }
        }
    }
}
