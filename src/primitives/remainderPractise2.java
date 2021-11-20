package primitives;

public class remainderPractise2 {
    public static void main(String[] args) {
        int num1 = 789;
        int digit1 = num1%10;
        num1 = num1/10;
        int digit2 =num1%10;
        num1=num1/10;
        int digit3 = num1%10;
        int sum= digit1*digit2*digit3;
        System.out.println((sum));

    }
}
