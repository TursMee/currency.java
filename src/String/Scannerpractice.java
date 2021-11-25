package String;

import java.util.Scanner;

public class Scannerpractice {
    public static void main(String[] args) {
        // BMI is equal weight/(height/height)
        Scanner input = new Scanner(System.in);
        System.out.println("please tell your height");
        double  height = input.nextDouble();
        System.out.println("please tell your weight");
        double  weight = input.nextDouble();
        double bmi = weight / (height*height);
        System.out.println("Your BMI is " + bmi);

    }
}
