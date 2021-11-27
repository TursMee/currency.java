package String;

import java.util.Scanner;

public class ScannerPractice7 {
    public static void main(String[] args) {
        Scanner bank = new Scanner(System.in);
        int account =200;
        System.out.println("How much would you like to deposit");
        int deposit1 = bank.nextInt();
        account +=deposit1;
        System.out.println("How much would you like to deposit");
        int deposit2 = bank.nextInt();
        account +=deposit2;
        System.out.println("How much would you like to deposit");
        int deposit3 = bank.nextInt();
        account +=deposit3;
        //////////////////////////////
        System.out.println("How much would you like to withdraw");
        int withdraw1 = bank.nextInt();
        account -=withdraw1;
        System.out.println("How much would you like to withdraw");
        int withdraw2 = bank.nextInt();
        account -=withdraw2;





        System.out.println("Your current ballance is " + account);
    }
}
