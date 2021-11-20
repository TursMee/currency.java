package primitives;

public class NumericPromotion {
    public static void main(String[] args) {
        byte b1= 12;
        short sh1 =b1;
        short sh2 =3;
        //byte b2 = sh2;
        int result= b1+sh2;
        float a= 1.2f;
        float a1 = 2.3f;
        float a3 = a1+a;
        double s1 = 8.9;
        double s2= s1+a1;
        //float s3= s1+a1; compile time error, you have to store in a large data type.




    }
}
