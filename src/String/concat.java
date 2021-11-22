package String;

public class concat {
    public static void main(String[] args) {
        String test = "Chicago";
        test = test.concat(" is the best");
        test = test.concat("in the summer");
        System.out.println(test);
        test += test.concat("Ever");
        System.out.println(test);


    }
}
