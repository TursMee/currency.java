package Array;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
        //find the largest number from given int
        int[] arr={4,24,10,100,5,78,11,25,55};
        int large=arr[0];
        for(int a=1;a<arr.length;a++){
            if(large < arr[a]){
                large=arr[a];
            }
            }
        System.out.println(large);
        System.out.println("==================");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);//the largest number
        System.out.println(arr[0]);//the smallest number
        }

    }

