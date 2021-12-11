package loop;

import java.util.Scanner;

public class WhileTask2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter value");
        int number= scanner.nextInt();
        int div=1;
        while(div<=number){
            if(number%div==0) {
                System.out.println(div + " is divisor of " + number);

            }
            div++;
        }
    }
}
