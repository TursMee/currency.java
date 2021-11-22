package primitives;

public class TrueTable2 {
    public static void main(String[] args) {
        // there is an event for kids if the age of kid is 6 or less or if the height of child 48 inches or less the even is free
        int childHeight= 48;
        int myChildheight = 56;
        int childAge = 6;
        int myChildAge = 5;
        boolean pass2 = childAge<= myChildAge || childHeight<=myChildheight;
        System.out.println("your child is passing for free  " +pass2);
        boolean payment =true;
        boolean willPay = false;
        boolean pass3 = childAge<= myChildAge || childHeight<=myChildheight || payment == willPay;
        System.out.println("You can pass  " +pass3);


        // find out if student can pass
        // there are 3 tests taken average of those tests has to be more than 70;
        // attendance has to be 80%;
//        int testAverage = 70;
//        int Test1= 90;
//        int Test2 = 60;
//        int Test3 = 57;
//        boolean testScore= testAverage <= (Test1 + Test2 +Test3) / 3;
//
//        System.out.println(testScore);
//        int attendance =80;
//        int studAttendance = 89;
//        boolean validate = testScore==true && attendance <=studAttendance;
//
//        System.out.println("Validation "+validate);


    }
}
