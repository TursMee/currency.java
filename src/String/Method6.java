package String;

public class Method6 {
    public static void main(String[] args) {
        String name ="    Techtorial Academy      ";
        String newName = name.trim();//remove spaces on the beginning of string
        System.out.println(newName);
        System.out.println(name);

        //substring();
        String part1 = newName.substring(4);//shows from fourth index
        System.out.println(part1);

        String part2 = newName.substring(4,5);//shows from 4 index and second index is not included
        System.out.println(part2);



    }
}
