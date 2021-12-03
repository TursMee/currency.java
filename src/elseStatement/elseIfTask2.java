package elseStatement;

import java.util.Scanner;

public class elseIfTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 test result from 0 to 100 ");
        int res1 = scanner.nextInt();
        int res2 = scanner.nextInt();
        int res3 = scanner.nextInt();

        int total = (res1 + res2 + res3) / 3;
        if (total <= 100 && total > 90) {
            System.out.println("Your lettre grade is A");
        } else if (total <= 89 && total > 80) {
            System.out.println("Ypur letter grade is B");
        } else if (total <= 79 && total > 69) {
            System.out.println("Your letter grade is C");
        } else  {
            System.out.println("You should take the course again ");

        }

    }
}
