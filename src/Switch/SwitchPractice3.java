package Switch;

import java.util.Scanner;

public class SwitchPractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter shape to calculate");
        String shape = scanner.nextLine().toLowerCase();
        switch (shape){
            case "rectangle":
                System.out.println("Enter length ");
                int len= scanner.nextInt();
                System.out.println("Enter width ");
                int wid= scanner.nextInt();
                System.out.println("Area of rectangle is " + len*wid);
                break;
            case "triangle":
                System.out.println("Enter height ");
                int hei= scanner.nextInt();
                System.out.println("Enter length");
                int leng= scanner.nextInt();
                System.out.println("Area of triangle is " + (leng*hei)/2);
                break;
            default:
                System.out.println("Can't calculate");
        }



    }
}
