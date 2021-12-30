package Object;

import java.util.Random;

public class StudentClass {
    String name;
    int age=23;
    int id;
    public void setId(int number){
        id=number;
    }

    public void study(){
        System.out.println(name + " is studying "+hourCreater());
    }
    public void sleep(){
        System.out.println(name+ " is sleeping "+hourCreater()+" hours");
    }
    public void reading(){
        System.out.println(name+ " is reading "+hourCreater()+" hours");
    }
    public static int hourCreater(){
        Random random=new Random();
        return random.nextInt(12);
    }

    public static void main(String[] args) {
        StudentClass st1=new StudentClass();
        st1.name="David";
        st1.study();
        st1.reading();
        st1.sleep();
        System.out.println(hourCreater());

    }
}
