package loop;

import java.util.Scanner;

public class makingStarTree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number btw 3-10");
        int number= scanner.nextInt();
        int built=0;
        String tree="*";
        do{

            System.out.println(tree);
            tree+="*";
            built++;

        }while(number>=built);




    }
}
