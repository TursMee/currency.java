package Object;

public class Cat {
    String name;
    int age;
    String color;
    int foodAmount;
    /*
    create a method named run(),
    it will take a parameter as destination,
    it will reduce food amount by 1 for every execution,
    it will print out "Cat is running ...<west>"
     */

//overload the run method with your own preference
    public void run(String destination){
        foodAmount-=1;
        System.out.println(name+ " is running to "+destination);
        System.out.println(foodAmount);

    }
    public void run(){
        System.out.println("Overloaded run method in the Cat class");
    }
    //============================
//create a method named as setColor();
    //it will take a parameter and initialize the color of the cat
    public void setColor(String catColor){
        color=catColor;
    }
   // ======================
    //create a method that will return color of cat,name it as getColor()
    public  String getColor(){
        return color;
    }
   // ======================
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.name="Ginger";
        cat1.age=3;
        cat1.color="Orange";
        cat1.foodAmount=10;
        cat1.run("up");
        System.out.println(cat1.foodAmount);
        cat1.setColor("White");
        System.out.println(cat1.color);
        System.out.println("This is coming from getColor method===> "+cat1.getColor());
    }




}
