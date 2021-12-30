package Object;

public class Phone {
    String brand;
    double cost=1000;
    String color;
    public Phone(){
        System.out.println("This is no argument constructor");
    }

    public void setColor(String newColor){
        color=newColor;
    }
    public void call(int num){
        System.out.println(num+ " is being called");
    }

}
