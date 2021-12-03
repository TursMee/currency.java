package ifStatement;

import java.util.Scanner;

public class ifPractice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7");
        //double number=scanner.nextDouble();
        //int myNumber=(int)number; -->in this case have to double reassign to int
        int number = scanner.nextInt();
        if(number==1){
            System.out.println("Today is Monday");

        }
        if(number==2){
            System.out.println("Tuesday");
        }
        if(number==3){
            System.out.println("Wednesday");
        }
        if(number==4){
            System.out.println("Thursday");
        }
        if(number==5){
            System.out.println("Friday");
        }
        if(number==6){
            System.out.println("Saturday");
        }
        if(number==7){
            System.out.println("Sunday");
        }
        if (number>=7 || number<1){
            System.out.println("Hey");
        }
    }
}
