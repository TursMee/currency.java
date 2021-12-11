package String;

import java.util.Scanner;

public class TaskPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your gender, full name and year of birth in this format--> F - Jenny Brown - 1999 ");
        String gender = scanner.nextLine();

        System.out.println(gender.startsWith("F"));
        System.out.println(gender.endsWith("M"));
        System.out.println(gender.contains("Meerim Tursunova"));
        System.out.println(gender.endsWith("2000"));
        System.out.println(gender.replace('-','/'));

    }
}
