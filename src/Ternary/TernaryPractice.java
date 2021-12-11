package Ternary;

import java.util.Locale;

public class TernaryPractice {
    public static void main(String[] args) {
        int a=2, b=3;
        // ?   :

       String res1 = a<b ? "Hello" : "Bye" ;
      // a<b ? a*b : "text" ; to be able to store the result of ternary both has to be same data type
        System.out.println(a<b ? a*b : "text");
        System.out.println(res1);

       boolean res2= a>=b ? a==b : a<b ;
        System.out.println(res2); //shows true because a<b is true

        int res3= 'a'>'Z' ? 5+6+7 : 7-4-1 ;
        System.out.println(res3); //shows 18 because 'a'>'Z' in ASCII its true

        String str = "David";
        String res4 = str.substring(3).equals("id") ? str.toLowerCase().concat(" is number") : str.toUpperCase().concat(" is String");
        System.out.println(res4);
        System.out.println(str.substring(3).equalsIgnoreCase("DAVID") ? str.substring(3).toUpperCase() : str.substring(3).toLowerCase());

        int num1=2;
        int num2=3;
        int res5=num1%2==0 ? 5 : 6;
    }
}
