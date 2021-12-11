package elseStatement;

import java.util.Scanner;

public class NestedIf2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Which city you live in?");
        String city= scanner.nextLine();
        if(city.equalsIgnoreCase("chicago")){
            System.out.println("Which bootcamp are you attending?");
            String boot= scanner.nextLine();
            if (boot.equalsIgnoreCase("techtorial")){
                System.out.println("What is your batch");
                String batch= scanner.nextLine();
                if(batch.equalsIgnoreCase("11")) {
                    System.out.println("GREAT! GOOD LUCK");
                }else{
                    System.out.println("SO SAD:(  ");
                }
            }else{
                System.out.println("You should do your best");
            }
        }else {
            System.out.println("You should visit Chicago!");
        }

    }
}
