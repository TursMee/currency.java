package loop;

public class doWhilePractice1 {
    public static void main(String[] args) {
        //find and sum of the numbers between 10 to 20 by using do-while loop
        int a=10;
        int b=20;
        int sum=0;
        do{
            sum+=a;
            a++;

        }while(a<=b);
        System.out.println("sum of numbers between 10 and 20 "+sum);


    }
}
