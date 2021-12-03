package ifStatement;

import java.util.Scanner;

public class ifPractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hour for the time");
        int hour2 =(int) scanner.nextDouble();

        if(hour2<12){
            System.out.println("good morning");
        }
        if(hour2>12 && hour2<18){
            System.out.println("Good afternoon");
        }
        if(hour2>18){
            System.out.println("Good evening");
        }
        if(hour2<0 || hour2>23){
            System.out.println("check your time");
        }
        //int number = 1234;
       //if (number){\\here is no condition
          //  System.out.println("Hello World");
       // }
    }
}
