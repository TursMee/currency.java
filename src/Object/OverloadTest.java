package Object;

public class OverloadTest {
    public static void main(String[] args) {
        OverloadPractice obj = new OverloadPractice();
        obj.sum("String example",4,5);
        obj.sum(new int[]{1,2,3});


        Cat cat=new Cat();
        cat.run();

        MethodPractice obj2=new MethodPractice();
        obj2.ageCalculator(1994);
    }
}