package loop;

import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] args) {
        int num=0;

//        while (num<10){
//            System.out.println("Sunday is almost over");
//            ++num;
//        }
        Scanner scanner=new Scanner(System.in);
        int age= scanner.nextInt();

        while(age<=26){
            System.out.println("My age is"+age);
            age++;//or a+=1; or a=a+1;
        }
        System.out.println("ENTER number btw 10 to 20");
        int number= scanner.nextInt();
        while(number<=20){
            System.out.println(number);
            number++;
        }
    }
}
