package elseStatement;

import java.util.Scanner;

public class elseIfTask {
    public static void main(String[] args) {
        int a =7;
        if(a>0 && a<=5){
            System.out.println("Your number is in range of 0-5");
        }else if(a>6 && a<=10) {
            System.out.println("Your number is in range of 6-10");
        }else if(a>=11 && a>=15){
            System.out.println("Your number is in range of 11-15");
        }else {
            System.out.println("Your number is out of range");
        }
    }
}
