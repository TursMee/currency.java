package primitives;

public class CastingPractise {
    public static void main(String[] args) {
        int number1 =23;
        long l1 = number1;//implicit casting done

        short sh1=(short)number1;// explicit casting
        byte by1= 1;
        byte by2=2;
        //short sum1= by1+by2; compile time error(deu to numeric promotion java wants to store the result into larger data type. );
        short sum1=(short)(by1+by2);

        int price = (int)750.99;
        System.out.println(price);
        double samsung = 900.45;
        int priceSamsung = (int)samsung;
        System.out.println(priceSamsung);
        double back = priceSamsung;
        System.out.println(back);
        int count =131;
        //when you assigning some var with outside capacity it goes back to minus and goes into the cycle
        System.out.println(count);
        byte count2=(byte)count;
        System.out.println(count2);
    }
}
