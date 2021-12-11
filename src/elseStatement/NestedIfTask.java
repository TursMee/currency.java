package elseStatement;

import java.util.Scanner;

public class NestedIfTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you know Java? YES/NO");
        String java= scanner.nextLine();
        if(java.equalsIgnoreCase("yes")){
            System.out.println("Dou you know Selenium? YES/NO/LEARN");
                String sel= scanner.nextLine();
                if(sel.equalsIgnoreCase("yes") || sel.equalsIgnoreCase("learn") ) {
                    System.out.println("have you API testing experence? YES/NO");
                    String api = scanner.nextLine();
                    if (api.equalsIgnoreCase("yes")){
                        System.out.println("Have you SQL knowledge? YES/NO");
                        String sql= scanner.nextLine();
                        if(sql.equalsIgnoreCase("yes")) {
                            System.out.println("Congrats You are HIRED!!!");
                        }else{
                            System.out.println("We need someone who has Sql experience!");
                        }
                    }else{
                        System.out.println("We need someone who is familiar with Selenium");

                    }                }else{
                    System.out.println("Do you ready to learn Selenium?");
                }


        }else{
            System.out.println("You should know Java for this JOB.");
        }
    }
}
