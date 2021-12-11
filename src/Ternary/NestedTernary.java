package Ternary;

public class NestedTernary {
    public static void main(String[] args) {
        int num1=4, num2=5;
      String res1 =   ++num1 > num2 ? num1<num2 ? "Java " : "Selenium" : "Nested"; //it shows Nested because both condition are false
        System.out.println(res1);
        String res2 =   ++num1 >= num2 ? num1<num2 ? "Java " : "Selenium" : "Nested";
        System.out.println(res2);

        String res3 =num1 <1 ? num1<num2 ? "Java " : "Selenium" : num1<1 ? "Summer" : "Winter"; //shows "Winter"
        System.out.println(res3);

        System.out.println(1!=1? "David" : 1>2 ? "Nested first side ": 3==4 ? "second side of first" : "second side of second");//it shows second side of second

    }
}
