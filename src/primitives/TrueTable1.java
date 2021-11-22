package primitives;

public class TrueTable1 {
    public static void main(String[] args) {
        // visa ticket
        boolean visa = true;
        boolean ticket = true;
        boolean myVisa = false;
        boolean  myTicket = true;

         boolean eligible = visa==myVisa && ticket==myTicket;
        System.out.println(eligible);

        boolean online=true;
        boolean campus = true;
        boolean student = true;
        boolean askQuestion = student == online || student == campus;
        System.out.println(askQuestion);

        // 90% attendance && score 80 out of 100 to pass.
        int passingAttendance = 90;
        int passingScore = 80;
        int myAttendance = 97;
        int myScore =87;
        int homework = 90;
        int myHomework = 67;

        boolean passingCheck = myAttendance >=passingAttendance && myScore>= passingScore && homework==myHomework;
        System.out.println(passingCheck);


    }
}
