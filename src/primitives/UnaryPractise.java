package primitives;

public class UnaryPractise {
    public static void main(String[] args) {




        int count = 8;
        System.out.println(count--);//shows 8 it s 7
        System.out.println(count--);//shows 8 it s 7

        System.out.println(--count);//shows 8 it s 7
        count++;
        System.out.println(count++ +count++);      //shows 13 number is=8;

        int result = --count + --count + 2 -count++ *2;
        System.out.println(result);
        System.out.println(count);

        
    }
}
