import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice4 {
    // ask user to enter integer number
    //we will find out if this is even number or not
    // input is 7
    //output 7 even number false
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("Please enter the number ");
        int userNum= num.nextInt();
        int check = userNum %2;
        boolean even = check == 0;

        System.out.println("Your number is even " + even);
    }
}
