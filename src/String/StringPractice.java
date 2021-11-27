package String;

import java.util.Scanner;

public class StringPractice {
    // firstname
    //lastname
    public static void main(String[] args) {
        // .toLowerCase()-- method
        // .toUpperCase()-- method if do not reassighn the string it will not change the value.
        Scanner new1 = new Scanner(System.in);
        System.out.println("please enter your lastname");
        String myName = new1.nextLine();
       myName = myName.toUpperCase();

        System.out.println(myName);
        System.out.println("please enter your firstname");
        String firstName  = new1.nextLine();
        firstName = firstName.toLowerCase();
        System.out.println(firstName + " " + myName);
        // next() takes only one input
 }
}
