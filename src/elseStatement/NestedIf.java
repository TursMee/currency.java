package elseStatement;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have a passport? YES/NO");
        String pass=scanner.nextLine();
        if(pass.equalsIgnoreCase("yes")){
            System.out.println("Do you have a visa? YES/NO");
            String visa=scanner.nextLine();
            if(visa.equalsIgnoreCase("yes")){
                System.out.println("Do you have a ticket? YES?NO");
                String ticket = scanner.nextLine();
                if(ticket.equalsIgnoreCase("Yes")){
                    System.out.println("You can travel ");

                }else {
                    System.out.println("you should buy ticket");
                }
            }else{
                System.out.println("You should get visa");
            }
        }else{
            System.out.println("You have to get passport!");
        }
    }
}
