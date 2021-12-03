package elseStatement;

import java.util.Scanner;

public class elseTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your zipcode");
        int zip = scanner.nextInt();
        if (zip%2==0){
            System.out.println("Your zipcode is even");
        }
        else{
            System.out.println("Here you are");
        }
    }
}
