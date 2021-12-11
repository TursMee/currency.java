package loop;

import java.util.Scanner;

public class whilePractice3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter whole number");
//        int number= scanner.nextInt();
//        int mult=1;
//
//        while(mult<=10){
//            System.out.println(number+ "*"+ mult+"="+number*mult);
//            mult++;
//        }

        String word= scanner.nextLine();
        int let=0;
        while(let<word.length()){
            System.out.print(word.charAt(let)+ " , ");//here is println without ln
            let++;
        }
        int last=word.length()-1;
        while (last>=0){
            System.out.print(word.charAt(last)+ " , ");
            last--;
        }
    }
}
