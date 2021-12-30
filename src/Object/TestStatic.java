package Object;

public class TestStatic {
    public static void main(String[] args) {
        //you can call static methods from
        //another class by using of the class
        StaticPetPractice.eat();
        StaticPetPractice pet=new StaticPetPractice();
        pet.eat();
        pet.play();
        System.out.println(pet.food);
    }
}
