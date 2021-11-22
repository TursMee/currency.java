package primitives;

public class UniPractise2 {
    public static void main(String[] args) {
        int a =7;
        int b = 4;
        // also there is a precedence you assign unary from left to right;
        //6    3    6        18
        int result = --a+--b+a++*2 -b++ *a--;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);


        int donut = 2;
        int buy12 = 12* donut;
        System.out.println("if you buy 12 donuts today for" +buy12 + " next time you buy it for " + --buy12 );
        System.out.println("buy 12 donuts today and pay only" + --buy12 );
    }



}
