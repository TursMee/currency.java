package primitives;

public class currency {
    public static void main(String[] args) {
        double som=789;
        double dollarRate = 84.78;
        double convert = som/dollarRate;
        System.out.println(convert);

        int inches = 2000;
        double inchToMeter =inches*0.0254;
        System.out.println(inchToMeter);


        int minutes = 3456789;
        int numberOfHours = minutes / 60;
        int numberOfDays = numberOfHours/24;
        int numberOfYears = numberOfDays/365;
        int leftDays = numberOfDays%numberOfYears;

        //double numberOfYears = minutes
        System.out.println(numberOfYears);
        System.out.println(leftDays);

    }
}
