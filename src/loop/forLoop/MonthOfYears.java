package loop.forLoop;

public class MonthOfYears {
    public static void main(String[] args) {
        //print out month for the years btw 2020 to 2023
        //2020-->1,2,3


        for(int year=2020;year<=2023;year++){
            System.out.println(year+"YEAR");

            for(int mon=1;mon<=12;mon++){
                System.out.println(mon+"month");
            }

        }
        for(int year=2020;year<+2023;year++){
            System.out.println(year+"YEAR");
            for(int mon=1;mon<=12;mon++){
                switch (mon){
                    case 1:
                        System.out.println("January");
                        for(int day=1;day<=31;day++) {
                            System.out.print(day + "--");
                        }
                        break;

                    case 2:
                        System.out.println("February");
                        break;

                    case 3:
                        System.out.println("March");
                        break;

                    case 4:
                        System.out.println("April");
                        break;

                    case 5:
                        System.out.println("May");
                        break;

                    case 6:
                        System.out.println("June");
                        break;

                    case 7:
                        System.out.println("July");
                        break;

                    case 8:
                        System.out.println("August");
                        break;
                    case 9:
                        System.out.println("September");
                        break;

                    case 10:
                        System.out.println("October");
                        break;

                    case 11:
                        System.out.println("November");
                        break;

                    case 12:
                        System.out.println("December");
                        break;

                }
            }

        }


















    }
}
