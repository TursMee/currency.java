package primitives;

import java.sql.SQLOutput;

public class remainderPractice1 {
    public static void main(String[] args) {
        //modulus--> % remainder
        int num1=45;
        int num2 =6;
        int remainder1 = num1%num2;
        System.out.println("Remainder 1 is equal "+ remainder1);
        //if you divide any number to 10 the remainder will be last digit
        int num3 = 890;
        int storage1 = num3%10;
        System.out.println(storage1);
        num3 = num3/10;
        int storage2=num3%10;
        System.out.println(storage2);
        num3=num3/10;
        int storage3 = num3%10;
        System.out.println(storage3);
        int sum = storage1 +storage2 +storage3;
        System.out.println(sum);
    }



}
