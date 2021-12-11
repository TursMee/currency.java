package String;

public class EqualsMethods {
    public static void main(String[] args) {
        String name1 = "David";
        String name2 = "David";
        String name3 = new String("David");
        System.out.println(name1==name3);//false because they are in different object
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));//true because they are have same values "David"
        String name4 = new String("David");
        System.out.println(name3==name4);//false because they are different object
        String name5=name3;
        System.out.println(name3==name5);

        //== check object; equals(); check values


    }

}
