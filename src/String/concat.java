package String;

public class concat {
    public static void main(String[] args) {
        String test = "Chicago";
        test = test.concat(" is the best");
        test = test.concat("in the summer");
        System.out.println(test);
        test += test.concat("Ever");
        System.out.println(test);


        String str = "just do it ";
        System.out.println(str);
        String str1 =new String(" just do it whatever it takes") ;
        System.out.println(str1);
        System.out.println(str + str1);

    }
}
