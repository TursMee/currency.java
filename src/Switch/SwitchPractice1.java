package Switch;

import java.util.Scanner;

public class SwitchPractice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 1-4");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("summer");
                break;
            case 4:
                System.out.println("Fall");
                break;
            default:
                System.out.println("No idea!");
        }
    }
}
