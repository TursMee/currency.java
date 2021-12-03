package ifStatement;

public class ifPractice {
    public static void main(String[] args) {
        int appleNumber = 5;
        int orangeNumber = 10;

        System.out.println("I am about to create an IF block");
        if (appleNumber==orangeNumber){
            System.out.println("I am so lucky today");
        }
        if(appleNumber!=orangeNumber){
            System.out.println("I'm so happy today");

        }
        if(appleNumber<=orangeNumber){
            int sum = appleNumber+orangeNumber;
            System.out.println("You have " + sum + " fruits");
        }
        //every if statement independent of each other

    }
}
