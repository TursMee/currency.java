package MentoringWithAhmet;

import java.util.Scanner;

public class ReversTheWordsAndNumbers {
    public static void main(String[] args) {
        //Ask user to input a word and number and revers it
        System.out.println("Enter one word");
        Scanner scanner=new Scanner(System.in);
        String word= scanner.nextLine();
        String rev="";
        for(int i=word.length()-1; i>=0;i--){
            rev=rev+word.charAt(i);

        }
        System.out.println(rev);


        System.out.println("Enter numbers");
        int num=scanner.nextInt();
        String word2=""+num;
        String rev2="";
        for(int a=word2.length()-1;a>=0;a--){
            rev2=rev2+word2.charAt(a);
        }
        System.out.println(rev2);


    }
}
