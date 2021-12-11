package String;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 ingredients");
        String ing= scanner.nextLine();
        System.out.println("Enter one digit");
        int digit= scanner.nextInt();

        String ing2=ing.substring(0, ing.indexOf(" "));  // first word
        System.out.println(ing2);
        //String ing3=ing.substring(ing.indexOf(" ")+1,);
        String twoWord=ing.substring(ing.indexOf(" ")+1,ing.length());   // last 2 words
        System.out.println(twoWord);
        String ing3=twoWord.substring(0, twoWord.indexOf(" "));    // middle word
        System.out.println(ing3);
        String ing4=twoWord.substring(twoWord.indexOf(" ")+1, twoWord.length());   // last word
        System.out.println(ing4);

        String ch=digit +ing2.substring(1,ing2.length());
        String ch2=digit+1+ing3.substring(1,ing3.length());
        String ch3=digit+2+ing4.substring(1,ing4.length());
        System.out.println(ch+" "+ch2+" "+ch3);
//         System.out.println("Enter 5 digit number");
//         int number = scanner.nextInt();
//         int dig1=number%10;
//         number=number/10;
//        int dig2=number%10;
//        number=number/10;
//        int dig3=number%10;
//        number=number/10;
//        int dig4=number%10;
//        number=number/10;
//        int dig5=number%10;
//        System.out.println(dig1+""+dig2+""+dig3+""+dig4+""+dig5);
//
//
////        System.out.println("Enter two word with spase in the beginning and the and,also first word has to start with upper letter and the second one witn lower letter");
////        String word=scanner.nextLine();
////
////        String noSpase=word.trim();
////        String word2=noSpase.substring(0, noSpase.indexOf(" "));
////        String word3=noSpase.substring(noSpase.indexOf(" ")+1, noSpase.length());
////        String rep = word3.toUpperCase().substring(0,1);
////        String rep2=word3.substring(1,word3.length());
////        System.out.println(word2+" " +rep+rep2);
//
//        System.out.println("Enter 6 digits");
//        int dig= scanner.nextInt();
//        int dig6=dig%10;
//       dig/=10;
//       int dig5 =dig%10;
//       dig/=10;
//       int dig4=dig%10;
//       dig/=10;
//       int dig3=dig%10;
//       dig/=10;
//       int dig2=dig%10;
//       dig/=10;
//       int dig1=dig%10;
//
//        System.out.println(dig1 + "*" + dig2 + "*" +dig3+"*"+dig4+"*"+dig5+"*"+dig6+"="+dig6*dig5*dig4*dig3*dig2*dig1);
//        System.out.println(dig1+" "+dig2+"+"+dig3+"+"+dig4+"+"+dig5+"+"+dig6 +"="+dig1+dig2+dig3+dig4+dig5+dig6);

//        String value=scanner.nextLine();
//        String first=value.substring(0,1);
//        String second=value.substring(1,2);
//        if(first.equalsIgnoreCase("x")){
//            System.out.println(value.substring(1,value.length()));
//        }else if(first.equalsIgnoreCase("x") && second.equalsIgnoreCase("x")){
//            System.out.println(value.substring(3,value.length()));
//        }else if(second.equalsIgnoreCase("x")){
//            String letter=value.substring(0,1);
//            String word=value.substring(2,value.length());
//            System.out.println(letter+word);
//        }else{
//            System.out.println(value);
//        }


    }
}



