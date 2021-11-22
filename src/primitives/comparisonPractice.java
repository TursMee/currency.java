package primitives;

public class comparisonPractice {
    public static void main(String[] args) {
        float fl = 4;
        int i =4;
        String  f= "4";
        boolean compare1= fl==i;
        boolean compare2= false;
        System.out.println(compare2==compare1);
        System.out.println("test"=="test");
        //System.out.println("test"<"test");//error
        System.out.println('a'<='A');


        // >greater than
        int num1 = 55;
        int num2 =66;
        System.out.println(num1>num2);//false
        System.out.println(num2 >109);
        System.out.println(num2++>66);//false
        System.out.println(++num2 > 66);//true;
        System.out.println(num2);
        System.out.println(num2>=68);
    }
}
