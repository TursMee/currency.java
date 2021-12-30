package Object;

public class StaticPetPractice {
    String name;
    int age;
    String color;
    static double food = 20;

    public static void eat() {
        food -= 1;
        System.out.println("Food amount is now " + food);
        //to call non-static method into static method,
        //need to create an object
        StaticPetPractice pet9=new StaticPetPractice();
       // pet9.play();
    }
    public void play(){
        System.out.println("Pet is playing");
        eat();
        StaticPetPractice.eat();
        food=100;
    }

    public static void main(String[] args) {
        StaticPetPractice pet1 = new StaticPetPractice();
        pet1.eat();//shows 19
        pet1.eat();//shows 18

        StaticPetPractice pet2 = new StaticPetPractice();
        pet2.eat();//shows 17 after adding static before food on the top
        pet1.eat();//shows 16
        //=======================
        eat();//calling eat without object it shows 15

        StaticPetPractice.eat();//shows 14
        //non static method can't be call
//        play();
//        StaticPetPractice.play();

    }
}