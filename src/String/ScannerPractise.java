package String;
import java.util.Scanner;
public class ScannerPractise {
    public static void main(String[] args) {
        String name = "David";
        System.out.println("My name is " + name);
        //creating scanner object
        System.out.println("your last name is? ");
        Scanner input = new Scanner(System.in);
        String lastname = input.nextLine();
        System.out.println("your last name is " + lastname);
        System.out.println("where are you living");
        String city = input.nextLine();
        System.out.println(name + " " + lastname + " You are living in " + city);
        System.out.println("what is your age enter the numbers");
        int age = input.nextInt();
        System.out.println(name  + "your age is very good age. That is " + age);
        System.out.println("what is your height in inches? ");
        double height = input.nextDouble();
        System.out.println("your height in inches is " + height);



        input.nextLine();
        System.out.println("please enter your address");
        //input = new Scanner(System.in);
        String address = input.nextLine();
        System.out.println("your address is " + address);




    }
}