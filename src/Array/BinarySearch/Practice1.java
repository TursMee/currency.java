package Array.BinarySearch;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] numbers={4,6,10,23,1,12};
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers,1));
        System.out.println(Arrays.binarySearch(numbers,23));
        System.out.println(Arrays.binarySearch(numbers,3));//shows -2 because 3 should be btw 1 and4 in my array
        System.out.println(Arrays.binarySearch(numbers,-1));
    }
}
