package Project;

import java.util.Scanner;

public class Project5Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter word");
        String word= scanner.nextLine().trim();
        String word2="";
        for(int i=word.length()-1;i>=0;i--){
            word2=word2+word.charAt(i);
        }
        System.out.println(word2);
    }
}
