package loop;

import java.util.Random;

public class randomPractice {
    public static void main(String[] args) {
        Random random=new Random();//give me random number from java
       int num= random.nextInt( 100);
        System.out.println(num);

        int num2=random.nextInt(2);//java gives new number less than 5
        System.out.println(num2);
    }
}
