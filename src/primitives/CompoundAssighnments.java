package primitives;

public class CompoundAssighnments {
    public static void main(String[] args) {
        int num1 =7;
        int num2 = num1 +7;
        num1+=num2;
        System.out.println(num1);
        num2 -= 8;
        System.out.println(num2);
        int num3 = num1+num2;
        num1 +=num3;
        num2 +=num3;
        System.out.println(num1);
        System.out.println(num2);
        // %=
        num1 %=2;
        System.out.println(num1);
        // boollean can not be compounded;

        char ch1 = 'a';
        char ch2 = 'm';
        char ch3 = 't';
        ch3 += 'a';
        System.out.println(ch3);
        // char is working with ASCII table and does arithmetical operations on them always giving the char as a result
        int remainder = ch1% 3;
        System.out.println(remainder);
        // casting

    }
}
