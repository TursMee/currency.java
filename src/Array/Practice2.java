package Array;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] numbers={1,3,4,11,12,54};
        System.out.println(numbers[3]);//shows 11
        //numbers[6]=66; can't reassign because there we don't have index6
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
