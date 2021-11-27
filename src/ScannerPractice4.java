import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice4 {
    // ask user to enter integer number
    //we will find out if this is even number or not
    // input is 7
    //output 7 even number false
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
//        System.out.println("Please enter the number ");
//        int userNum= num.nextInt();
//        int check = userNum %2;
//        boolean even = check == 0;
//
//        System.out.println("Your number is even " + even);
//        // ask user to enter integer number
//        // first integer you provide should be bigger than second one
//        System.out.println("please enter the number");
//        int userInput  = num.nextInt();
//        System.out.println("please enter the number smaller than previous");
//        int userInp2 = num.nextInt();
//    Boolean check1 = userInput>userInp2;
//        System.out.println(check1);


        System.out.println("please enter your Grade");
        int studentGrade= num.nextInt();
        System.out.println("please enter your Attendance ");
        int studentAttendance= num.nextInt();
        System.out.println("please enter your Homework evaluation");
        int studentHomeWork= num.nextInt();

        boolean passing = studentAttendance >=85 && studentGrade>= 80 && studentHomeWork >=70;
        System.out.println("Student passed " + passing);



    }
}
