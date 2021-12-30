package Project;

import java.util.Scanner;

public class Project5Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num= scanner.nextInt();
        int first=1,last=num;
        for(int i=1;i<=num;i++){
            for(int y=2;y<=i;y++){
                System.out.println(y+" ");
            }
        }
        System.out.println();
    }
}
