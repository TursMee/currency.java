package Switch;

import java.time.LocalDateTime;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("It is Techtorial. PRESS 1-IT dept, PRESS 2-Admin,PRESS 3-Customer care");
        int dep= scanner.nextInt();
        switch (dep){
            case 1:
                System.out.println("Press 1-David, 2-Tima");
                int emp= scanner.nextInt();
                switch (emp){
                    case 1:
                        //for differ morning and afternoon
                        int hour= LocalDateTime.now().getHour();
                        if (hour>8 && hour<12){
                            System.out.println("I'm still home");
                        }else {
                            System.out.println("Hi it is David");
                        }
                        break;
                    case 2:
                        System.out.println("Hi it is Tima");
                        break;
                    default:
                        System.out.println("Don't have any person");
                        break;

                }break;
            case 2:
                System.out.println("Press: 1-Alex, 2-Jessi");
                int emp2= scanner.nextInt();
                switch (emp2){
                    case 1:
                        System.out.println("it is Alex");
                        break;
                    case 2:
                        System.out.println("It is Jessi");
                        break;
                }break;
            case 3:
                System.out.println("Press: 1-Zack, 2-Ana, 3John");
                int emp3= scanner.nextInt();
                switch (emp3){
                    case 1:
                        System.out.println("it is Zack");
                        break;
                    case 2:
                        System.out.println("It is Ana");
                        break;
                    case 3:
                        System.out.println("It is John");
                        break;
                    default:
                        System.out.println("we dont have any employer");
                        break;
                }break;
            default:
                System.out.println("we don't have any dept");
                break;
        }
    }
}
