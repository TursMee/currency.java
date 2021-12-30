package Array;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args){
        int[] zip={61212,91213,11214,71215};
        System.out.println(Arrays.toString(zip));// [61212, 91213, 11214, 71215]
        Arrays.sort(zip);//sorting zip from smaller to larger
        System.out.println(Arrays.toString(zip));//[11214, 61212, 71215, 91213]

        String[] colors={"violet","pink","Red","black","white","red","brown","red"};
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));//[Red, black, brown, pink, red, red,white  violet]upperCases goes first





    }
}
