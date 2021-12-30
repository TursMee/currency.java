package Project;

import java.util.Scanner;

public class Project5Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number btw1-10");
        int a= scanner.nextInt();

        for(int i=a;i>=1;i--){
            for(int y=1;y<=i;++y){
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}
