package primitives;

import java.io.OutputStream;

public class ArithmeticPractice {
    public static void main(String[] args) {
        int num1=4;
        int num2 =3;

        System.out.println("Total is " +(num1+num2));
        int sum = num1+num2;
        // subtraction
        int subs= num1- num2;
        double  product = subs * num2;
        System.out.println(product);
// division
        double div = product/3;
        System.out.println(div);
        // data types matter you can not give ariphmetical
        int division2= 5/2; //  only gonna show 2
        double division3 = 5/2; // only shows 2.0
        float division4 = 5/2f; // shows 2.5
        // casting will help not to loose any number

        //remainder - % modulus operator
        int a = 11;
        int b=5;
        int remainder1=a%b;
        System.out.println(remainder1);
        int x = 13;
        int y = 5;
        int remainder2 = x%y;
        System.out.println(remainder2);
        //precendent


    }
}
