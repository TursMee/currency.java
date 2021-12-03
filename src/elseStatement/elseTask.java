package elseStatement;

import java.util.Scanner;

public class elseTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        if (sum>=1000){
           int total =  (sum/100)*20;
           int total2 = sum-total;
            System.out.println("Your discount is 20% and your total is " + total2+" You save " + total);
        }
        else{
            int total3 = (sum/100)*5;
            int total4 = sum-total3;
            System.out.println("Your discount is just 5% your total is "+ total4 + " You save "+total3);
        }
    }
}
