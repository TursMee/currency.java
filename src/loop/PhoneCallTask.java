package loop;

import java.util.Scanner;

public class PhoneCallTask {
    public static void main(String[] args) {
       int balance=40;
       int call=5;
       int count=0;
       while(balance>0){
           balance-=call;
           count++;
           //System.out.println("You can make "+count+" calls with your " + balance);
           int calls=balance/call;
           System.out.println("You can make "+calls+" more with your remaining balance of "+balance);
       }
       // System.out.println("You can make "+count+" calls with your balance");


    }

}
