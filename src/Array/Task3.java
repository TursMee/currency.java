package Array;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr={4,24,10,100,5,78,11,25,55};
        //print out numbers greater than 10
        int[] largeNum=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>10){
                largeNum[i]=arr[i];
                //Arrays.sort(arr);

            }
            System.out.println(arr[i]);
            System.out.println(Arrays.toString(largeNum));
        }

    }
}
