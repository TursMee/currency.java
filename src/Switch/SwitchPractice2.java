package Switch;

import java.util.Locale;
import java.util.Scanner;

public class SwitchPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favorite fruit");
        String fruit= scanner.nextLine().toLowerCase();
        switch (fruit){
            case "mango":
                System.out.println("We have your favorite fruit in our store");
                break;
            case "banana":
                System.out.println("We have your favorite fruit in our store");
                break;
            case "kiwi":
                System.out.println("We have your favorite fruit in our store");
                break;
            case "orange":
                System.out.println("We have your favorite fruit in our store");
                break;
            case "apple":
                System.out.println("We have your favorite fruit in our store");
                break;
            case "grape":
                System.out.println("We have your favorite fruit in our store");
                break;
            default:
                System.out.println("Sorry we don't have your favorite fruit.");
        }
    }
}
